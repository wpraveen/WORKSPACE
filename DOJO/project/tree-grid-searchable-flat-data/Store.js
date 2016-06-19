define([
        "dojo/_base/declare",
        "dojo/_base/lang",
        "dojo/store/Memory",
        "dojo/store/util/QueryResults",
        "dojo/store/util/SimpleQueryEngine"
        
    ],
    function(declare, lang, Memory, QueryResults, SimpleQueryEngine) {

        //  Declare the initial store
        return declare(Memory, {

            data: [],

            originalData: [],

            searchResult: [],

            idProperty: "id",

            queryEngine: SimpleQueryEngine,

            constructor: function(options) {
                lang.mixin(this, options || {});
               // this.data = data;
            },

            setData: function(data){
                this.data = data;

            },

            getChildren: function(parent, options) {

                return this.query(
                    lang.mixin({}, options && options.originalQuery || null, {
                        parentId: parent.id
                    }),
                    options);
            },

            mayHaveChildren: function(parent) {
                return parent.type != "leaf";
            },

            query: function(query, options) {
               // this.updateStore(query, options);
                console.log("in Query fun");

                query = query || {};
                options = options || {};

                if (!query.parentId && !options.deep) {
                    // Default to a single-level query for root items (no parent)
                    query.parentId = undefined;
                }
                return this.queryEngine(query, options)(this.data);

                //return this.fetchResult(query, options);
            },

            fetchResult: function(query, options) {

                var queryToken = query.queryToken;
                console.log("queryToken: ", queryToken);

                //TODO: check diffrence in two returns of this method
                if (!queryToken) {
                    return this.queryEngine(query, options)(this.data);
                }

                this.searchResult = [];
                for (var i = 0; i < this.data.length; i++) {

                    // Check if name or accountNo statt with
                    if (this.data[i].name.indexOf(queryToken) === 0 || this.data[i].accountNumber.indexOf(queryToken) === 0) {

                        this.searchResult.push(this.data[i]);
                    }

                }

                return new QueryResults(this.searchResult);
            }
        });
    });