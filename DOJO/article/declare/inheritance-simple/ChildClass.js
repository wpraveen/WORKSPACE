define([
    "dojo/_base/declare"
], function(declare) {

    var A = declare(null, {

        constructor: function() {
            console.log("In constructor A");
        },
        m1: function() {
             this.inherited(arguments);

             /*
              * We can optionally provide the name of method + argumnet overide array also 
              */
             //this.inherited("m1",arguments,[1,2,3]);
            console.log("In A -> m1");
        },
        m2: function() {
            console.log("In A -> m2");
        }

    });

    var B = declare(null, {

        constructor: function() {

            console.log("In constructor B");
        },
        m1: function() {
            console.log("In B -> m1");
        },
        m2: function() {
            console.log("In B -> m2");
        }

    });

    var C = declare(null, {

        constructor: function() {
            console.log("In constructor C");
        },

        m1: function() {
            //  this.inherited(arguments);
            console.log("In C -> m1");
        }

    });

    /**
     * A VERY IMPORTANT POINT TO UNDESRATND
     *
     * Only the first class passed for multiple inheritance is a true superclass.
     * The rest are mixins, and are mixed into the child class to produce
     *  the inheritance chain we need. On a practical level,
     *  this means that the instanceofoperator cannot be used for mixins,
     *  only for base classes. Instead, use the isInstanceOf() function.
     *
     * so if you want to overide, parent class method, you have two ways
     * 1. provide the new method in mixin class.
     * 2. provide the new method in child class.
     */

    return declare([B, C, A], {

        constructor: function() {

            this.m1();
            this.m2();

            console.log("Check who am i!!")
            /**
             * The first class com ein pattern: declare([B,A,C]
             * will give true value down.
             */

            console.log(this instanceof A);
            console.log(this instanceof B);
            console.log(this instanceof C);

        }
    });
});