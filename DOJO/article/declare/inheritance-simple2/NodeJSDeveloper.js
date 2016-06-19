define([
    "dojo/_base/declare",
    "./JavaScriptDeveloper"
], function(declare, Developer) {

    return declare([Developer], {

        skill: "NodeJS",
        
        constructor: function(name) {

            this.name = name;

        },

        workOn: function() {

            console.log("I work on Server side");

        }
    });
});
