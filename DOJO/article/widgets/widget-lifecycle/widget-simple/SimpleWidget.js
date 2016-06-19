/**
 * define() is a foundational AMD API.
 * It allows us to define a module and its dependencies.
 * Once dojo/query and dojo/on are loaded (which doesn't happen until their dependencies are loaded, and so on),
 * the callback function is called and module instance passed to it.
 */
define([
    "dojo/_base/declare",
    "dojo/on",
    "dijit/_WidgetBase",
    "dijit/_TemplatedMixin",
    "dojo/text!./templates/counterView.html"
], function(declare, on, _WidgetBase, _TemplatedMixin, template) {

    /**
     * dijit._WidgetBase is the base class for all widgets in dijit, and in general
     * is the base class for all dojo based widgets.
     *
     * It provide life cycle method which get called at diffrent stages
     *
     */
    return declare([_WidgetBase, _TemplatedMixin], {

        templateString: template,

        counter: 0,


        /**
         * constructor method will be called before the parameters are mixed into the widget,
         * and can be used to initialize arrays
         */
        constructor: function() {
            console.log("in constructor");
        },

        /**
         * Most used life cycle method of _WidgetBase.
         * At this stage, widget has been rendered but not attached to node.
         */
        postCreate: function() {
            console.log("in postCreate");
            this.output.innerHTML = this.counter;

        },

        /**
         * Increases counter value to one.
         */
        incCounter: function() {
            console.log("in incCounter");
            this.output.innerHTML = (++this.counter);

        },

        /**
         * Decrease counter value to one.
         */
        decrCounter: function() {
            console.log("in decrCounter");
            this.output.innerHTML = (--this.counter);

        }

    });
});
