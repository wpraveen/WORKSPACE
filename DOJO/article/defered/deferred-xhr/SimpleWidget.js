define([
    "dojo/_base/declare",
    "dojo/Deferred",
    "dojo/request"
], function(declare, Deferred, request) {

    return declare(null, {


        constructor: function() {

            // I have used self and not .bind(this) for clarity.
            var self = this;

            request("http://localhost:8888/login_1.json").then(function(user) {
                self.showGreatings(user);
            }).then(function() {
                return request("http://localhost:8888/topproducts.json");
            }).then(function(products) {
                self.showProducts(products);
            }).then(function(data) {
                return request("http://localhost:8888/dealOfTheDay.json");
            }).then(function(dealOfTheDay) {
                self.showDealOfTheDay(dealOfTheDay);
            },function(err) {
                console.log("We got one error: ", err);
            }).then(function(data) {
                return request("http://localhost:8888/feedback.json");
            }).then(function(purchasedProduct) {
                self.showFeedback(purchasedProduct);
            });

        },

        showGreatings: function(user) {

            console.log("Grreatings: ", user);

        },

        showProducts: function(products) {
            console.log("showing products: ", products);
        },

        showDealOfTheDay: function(dealOfTheDay) {
            console.log("showing deal of the days: ", dealOfTheDay);
        },

        showFeedback: function(purchasedProduct) {
            console.log("Ask feedback for: ", purchasedProduct);
        }
    });
});
