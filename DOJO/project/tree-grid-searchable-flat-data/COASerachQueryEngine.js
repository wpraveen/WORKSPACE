define(["dojo/_base/array" /*=====, "../api/Store" =====*/ ], function(arrayUtil /*=====, Store =====*/ ) {

    return function(query, options) {
        switch (typeof query) {
            default: throw new Error("Can not query with a " + typeof query);
            case "object":
            case "undefined":
                var queryObject = query;
                query = function(object) {
                    // for (var key in queryObject) {
                    //     var required = queryObject[key];
                    //     if (required && required.test) {
                    //         // an object can provide a test method, which makes it work with regex
                    //         if (!required.test(object[key], object)) {
                    //             return false;
                    //         }
                    //     } else if (required != object[key]) {
                    //         return false;
                    //     }
                    // }
                    // 
                    // 

                    var queryToken = queryObject.queryToken;

                    console.log("Object: ",object);
                     console.log("queryObject: ",queryObject);
                    if (object.name.indexOf(queryToken) === 0 || object.accountNumber.indexOf(queryToken) === 0) {

                    	return true;


                    }
                    return false;
                };
                break;
            case "string":
                // named query
                if (!this[query]) {
                    throw new Error("No filter function " + query + " was found in store");
                }
                query = this[query];
                // fall through
            case "function":
                // fall through
        }

        function execute(array) {
            // execute the whole query, first we filter
            //var results = filterBySearchQuery(array); //arrayUtil.filter(array, query);
            //
            var results = arrayUtil.filter(array, query);

            // next we sort
            var sortSet = options && options.sort;
            if (sortSet) {
                results.sort(typeof sortSet == "function" ? sortSet : function(a, b) {
                    for (var sort, i = 0; sort = sortSet[i]; i++) {
                        var aValue = a[sort.attribute];
                        var bValue = b[sort.attribute];
                        // valueOf enables proper comparison of dates
                        aValue = aValue != null ? aValue.valueOf() : aValue;
                        bValue = bValue != null ? bValue.valueOf() : bValue;
                        if (aValue != bValue) {
                            return !!sort.descending == (aValue == null || aValue > bValue) ? -1 : 1;
                        }
                    }
                    return 0;
                });
            }
            // now we paginate
            if (options && (options.start || options.count)) {
                var total = results.length;
                results = results.slice(options.start || 0, (options.start || 0) + (options.count || Infinity));
                results.total = total;
            }
            return results;
        }

        // function filterBySearchQuery(array,query) {

        //     var queryToken = query.queryToken;
        //     console.log("query: ", query);

        //     if (!queryToken ) {
        //             return arrayUtil.filter(array, query);
        //         }

        //     this.searchResult = [];
        //     for (var i = 0; i < array.length; i++) {

        //         // Check if name or accountNo statt with
        //         if (array[i].name.indexOf(queryToken) === 0 || array[i].accountNumber.indexOf(queryToken) === 0) {

        //             this.searchResult.push(array[i]);
        //         }

        //     }

        //     return searchResult;

        // }

        execute.matches = query;
        return execute;
    };

});