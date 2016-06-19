define([
    "dojo/_base/declare"
], function(declare) {
    var A = declare(null, {
        constructor: function() {
            console.log("In constructor A");
            var test = false;
            if (test) {
                declare.safeMixin(this, {
    save: this._save
});



            }

        },
        postCreate: function() {
                this.inherited(arguments);

                console.log("In  A: postCreate");

            },

        _save: function() {
            console.log("I am save Mixin");
        }

    });


    return declare([A], {

        constructor: function() {

             console.log("In constructor BASE");
             this.inherited(arguments);

        },

         postCreate: function() {
                this.inherited(arguments);

                console.log("In  BASE: postCreate");

            },

        save: function() {
            console.log("I am normal save");
        }
    });
});
