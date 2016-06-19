define([
    "dojo/_base/declare"
],function(declare) {
    var privateValue = 0;

    declare("mynamespace.MyGlobalCounter", null, {

        increment: function() {
            privateValue++;
        },
        decrement: function() {
            privateValue--;
        },
        getValue: function() {
            return privateValue;
        }

    });
});