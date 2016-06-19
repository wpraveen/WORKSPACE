define([
    "dojo/_base/declare",
    "dojo/dom-construct",
    "dijit/_WidgetBase",
    "dojo/parser", "dojo/ready"
], function(declare, domConstruct, _WidgetBase, parser, ready) {

    return declare([_WidgetBase], {

        counter: 0,
        constructor: function(params, srcNodeRef) {
            this.domNode = srcNodeRef;
            console.log("creating widget with params " + params + " on node " + srcNodeRef);
        },

        buildRendering: function() {
            console.log("Yooooo: ", this.domNode);
            // create the DOM for this widget
            this.domNode = domConstruct.create("button", {
                innerHTML: this.counter
            });
        },

        postCreate: function() {
            // every time the user clicks the button, increment the counter
            this.connect(this.domNode, "onclick", "increment");
        },

        increment: function() {
            this.domNode.innerHTML = ++this.counter;
        }

    });


});
