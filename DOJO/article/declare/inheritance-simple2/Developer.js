define([
    "dojo/_base/declare"
], function(declare) {

    return declare([], {

        name: null,

        skill: "no skill",

        constructor: function(name) {

            this.name = name;

        },

        printSkill: function() {

            console.log("Skill: ", this.skill);

        },

        printName: function() {

            console.log("I am : ", this.name);

        },

        workOn: function() {

            console.log("Not sure!");

        }

    });
});
