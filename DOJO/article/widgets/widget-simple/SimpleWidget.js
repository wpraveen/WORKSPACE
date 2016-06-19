define([
    "dojo/_base/declare",
    "dojo/on",
    "dijit/_WidgetBase",
    "dijit/_TemplatedMixin"
], function(declare, on, _WidgetBase, _TemplatedMixin) {

    return declare([_WidgetBase, _TemplatedMixin], {

        templateString: "<div>Simplest Widget</div>",

        constructor: function() {
            console.log("in constructor");
        },

        postCreate: function() {
            console.log("in postCreate");
        }

    });
});
