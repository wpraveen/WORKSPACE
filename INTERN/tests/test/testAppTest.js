//file:///Users/psingh7/Google Drive/WORKSPACE/INTERN_TEST/node_modules/intern/client.html?config=tests/intern

define([
 'intern!object',
 'intern/chai!assert',
 'app/test/testApp'
], function(registerSuite, assert, testApp) {
    registerSuite({
        name: 'testApp',

        "greetWithDelay Test": function() {
            var dfd = this.async(500);
            console.log(arguments);
            testApp.greetWithDelay(function(test) {
                assert.strictEqual(true, true);
                dfd.resolve();
            });

        }
    });
});
