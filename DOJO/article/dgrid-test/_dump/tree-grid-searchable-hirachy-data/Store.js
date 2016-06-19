define([
        "dojo/_base/lang",
        "dojo/store/util/QueryResults",
        "dojo/_base/declare",
        "dojo/store/util/SimpleQueryEngine"
    ],
    function(lang, QueryResults, declare, SimpleQueryEngine) {

        return declare(null, {

            data: [],

            index: {},

            idProperty: "id",

            queryEngine: SimpleQueryEngine,

            searchedNode: null,

            constructor: function(options) {
                lang.mixin(this, options || {});
                this.setData(this.data || []);
            },

            get: function(id) {
                return this.index[id];
            },

            getIdentity: function(object) {
                return object[this.idProperty];
            },

            put: function(object, options) {
                var id = options && options.id || object[this.idProperty];
                this.index[id] = object;

                var data = this.data,
                    idProperty = this.idProperty;
                for (var i = 0, l = data.length; i < l; i++) {
                    if (data[i][idProperty] == id) {
                        data[i] = object;
                        return id;
                    }
                }
                this.data.push(object);
                return id;
            },

            add: function(object, options) {
                var id = options && options.id || object[this.idProperty];
                if (this.index[id]) {
                    throw new Error("Object already exists");
                }
                return this.put(object, options);
            },

            remove: function(id) {
                delete this.index[id];
                for (var i = 0, l = this.data.length; i < l; i++) {
                    if (this.data[i][this.idProperty] == id) {
                        this.data.splice(i, 1);
                        return;
                    }
                }
            },

         
            query: function(query, options) {
                // return QueryResults(
                //     (this.queryEngine(query, options))(this.data)
                // );


                query = query || {};
            options = options || {};
            
            if (!query.parent && !options.deep) {
                // Default to a single-level query for root items (no parent)
                query.parent = undefined;
            }
            return this.queryEngine(query, options)(this.data);

            
            },

            setData: function(data) {
                this.data = data;
                //  index our data
                this.index = {};
                for (var i = 0, l = data.length; i < l; i++) {
                    var object = data[i];
                    this.index[object[this.idProperty]] = object;
                }
            },
            getChildren: function(parent, options) {
                // return this.query(
                //     lang.mixin({}, options && options.originalQuery || null, {
                //         parent: parent.id
                //     }),
                //     options);
            return parent.child;
            },
            mayHaveChildren: function(parent) {
                return parent.type != "city";
            }
        });
    });