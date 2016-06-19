define([
    "dojo/_base/declare"
], function(declare) {

    return declare([], {

        constructor: function() {

            this.skill.push("JavaScript");
        },

        doYouKnowJavaScript: function() {
            
            console.log("doYouKnow JavaScript: YES");

        },

        workOn: function() {

            this.inherited(arguments);
            console.log("Work on JavaScript!");

        }
    });
});
