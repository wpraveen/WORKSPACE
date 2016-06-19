define([
    "dojo/_base/declare",
    "dojo/on",
    "dojo/dom-construct",
    "dijit/_WidgetBase",
    "dijit/_TemplatedMixin",
    "dojo/text!./templates/counterView.html"
], function(declare, on, domConstruct, _WidgetBase, _TemplatedMixin, template) {

    return declare([_WidgetBase, _TemplatedMixin], {

        templateString: template,

        constructor: function(arg) {
            this.lastName = "Singh";

            console.log("in constructor");
        },

        /**
         * This method be invoked before rendering occurs, and before any dom nodes are created.
         * You can use it for
         * 1. modify the instance before rendering of template occur.
         */
        postMixInProperties: function() {
            console.log("in postMixInProperties");

            this.name = this.firstName + " " + this.lastName;
            this.inherited(arguments);
        },

        /**
         * 1. The template is fetched/read.
         * 2. nodes created
         * 3. events hooked up
         * 4. The end result is assigned to this.domNode.
         * 5. May be more usefull in behavioral widget, where in want to some extra run time dom modification.
         */
        buildRendering: function() {
            console.log("in buildRendering");
            this.inherited(arguments);
            // this.domNode = domConstruct.create("button", {
            //     innerHTML: "Push me"
            // });
        },

        /**
         * This is typically the workhorse of a custom widget. The widget has been rendered (but note that child widgets in the containerNode have not!). The widget though may not be attached to the DOM yet
         */
        postCreate: function() {
            console.log("in postCreate");


            on(this.hiBttn, "click", function() {
                console.log("hellllloooo...");
            });


        },

        startup: function() {
            console.log("in startup");
            this.inherited(arguments);



        },

        destroy: function() {
            console.log("in postCreate");

        },



        sayHi: function() {
            alert("Helloooo...");
        }

    });
});
