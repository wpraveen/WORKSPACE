define([
    "dojo/_base/declare",
    "dojo/Deferred"
], function(declare, Deferred) {


    function asyncProcess() {
        var deferred = new Deferred();

        setTimeout(function() {
            console.log("Timeout over");
            deferred.resolve({
                msg: "I am resolved :)"
            });
        }, 2000);

        return deferred;
    }

    return declare(null, {

        constructor: function() {
            console.log("In constructor");
            var deferred = asyncProcess();

            setTimeout(function() {
                deferred.progress("Still working!!");
                //deferred.resolve("I am pre-resolved :[");
                //deferred.reject("I am rejected :(");
            }, 1000);

            deferred.promise.then(function(data) {
                    console.log(data);
                }, function(err) {
                    console.log(err);
                },
                function(progress) {
                    console.log(progress);
                });

            console.log("Out of constructor");
        }
    });
});
