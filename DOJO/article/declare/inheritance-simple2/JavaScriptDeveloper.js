define([
    "dojo/_base/declare",
    "./Developer"
], function(declare, Developer) {

    return declare([Developer], {

        skill: "JavaScript",
        
        constructor: function(name) {

            this.name = name;

        },

        workOn: function() {

            console.log("I work on client side");

            this.inherited(arguments);

        }
    });
});
