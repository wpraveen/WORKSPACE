define([
    "dojo/_base/declare"
], function(declare) {

    return declare([], {


        constructor: function() {

            this.skill.push("Java");
        },

        doYouKnowJava: function() {
        	
            console.log("doYouKnowJava: YES");

        },

        workOn: function() {

            console.log("Work on Java!");

        }
    });
});
