define([
    "dojo/_base/declare",
    "dijit/_WidgetBase",
    "dijit/_TemplatedMixin",
    "dijit/_WidgetsInTemplateMixin",
    "dojo/on",
    "dojo/dom-construct",
    
    
    "dojo/text!./templates/counterView.html",
    "./BehavioralWidget"
], function(declare,_WidgetBase,_TemplatedMixin,_WidgetsInTemplateMixin, on, domConstruct,  template,BehavioralWidget) {

    return declare([_WidgetBase, _TemplatedMixin,_WidgetsInTemplateMixin], {

        templateString: template,

        constructor: function(arg) {

            console.log("hello");
        },
         postCreate: function() {
            console.log("in postCreate");



        },

        startup: function() {
            console.log("in startup");
            this.inherited(arguments);
        }

        

    });
});
