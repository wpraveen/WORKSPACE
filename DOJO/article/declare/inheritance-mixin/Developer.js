define([
    "dojo/_base/declare",
    "./JavaSkillMixin",
    "./JavaScriptSkillMixin"
], function(declare, JavaSkillMixin, JavaScriptSkillMixin) {

    return declare([JavaSkillMixin, JavaScriptSkillMixin], {

        name: null,

        skill: [],

        constructor: function(name) {

            this.name = name;

        },

        printSkill: function() {

            console.log("Skill: ", this.skill);

        },

        printName: function() {

            console.log("I am : ", this.name);

        }



    });
});
