window.hello = function() {
    return "Hello World";
};

describe('Trying the heloo world test', function() {

    describe('chai', function() {
        it("should be equal using 'expect'", function() {
            expect(hello()).to.equal("Hello World");
        });
    });

});
