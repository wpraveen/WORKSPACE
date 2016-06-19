define([
    "dojo/_base/declare",
    "./Developer"
], function(declare, Developer) {

    return declare([Developer], {

        skill: "Java",

        constructor: function(name) {

            this.name = name;

        },

        workOn: function() {
        	this.inherited(arguments); 
            console.log("I work on Server side");

        }
    });
});
