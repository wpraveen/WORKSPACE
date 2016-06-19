//file:///Users/psingh7/Google Drive/WORKSPACE/INTERN_TEST/node_modules/intern/client.html?config=tests/intern

define([
    'intern!bdd',
    'intern/chai!assert',
    'app/test/testApp'
], function(bdd, assert, testApp) {
    bdd.describe('the thing being tested', function() {

        bdd.it('should do bar using done', function(done) {
             //var dfd = this.async(500);
            //console.log(arguments);
            testApp.greetWithDelay(function(test) {
                assert.strictEqual(true, true);
                done();
            });
        });

        // …
    });
});
