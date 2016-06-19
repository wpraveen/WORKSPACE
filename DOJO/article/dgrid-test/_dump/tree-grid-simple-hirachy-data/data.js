// example sample data and code
define([
        "dojo/_base/declare",
        "dojo/_base/lang",
        "dojo/_base/Deferred",
        "dojo/store/Memory",
        "dojo/store/Observable",
        "dojo/store/util/QueryResults"
    ],
    function(declare, lang, Deferred, Memory, Observable, QueryResults) {

        return declare(null, {
            store: null,

            constructor: function(address) {
                this.createStore();
            },

            createStore: function() {

                this.store = new Observable(new Memory({
                    data: this.getData(),
                    getChildren: function(parent, options) {
                        // Support persisting the original query via options.originalQuery
                        // so that child levels will filter the same way as the root level
                        //          return this.query(
                        //              lang.mixin({}, options && options.originalQuery || null,
                        //                  { parent: parent.id }),
                        //              options);

                        return parent.child;
                    },
                    mayHaveChildren: function(parent) {
                        return parent.type != "city";
                    }

                }));

            },

            getData: function() {

                return [{
                    name: 'Asia',
                    type: 'continent',
                     type: "header",
                    child: [{
                        id: 'CN',
                        name: 'China',
                        type: 'country',
                        child: [{
                            id: 'Shanghai',
                            name: 'Shanghai',
                            type: 'city'
                        }]
                    }, {
                        id: 'IN',
                        name: 'India',
                        type: 'country',
                        parent: 'AS',
                        child: [{
                            id: 'Calcutta',
                            name: 'Calcutta',
                            type: 'city',
                        }]
                    }]
                }, {
                    id: 'Nairobi',
                    name: 'Nairobi',
                    type: 'city'
                }, {
                    id: 'Khartoum',
                    name: 'Khartoum',
                    type: 'city'
                }];

            }

        });
    });