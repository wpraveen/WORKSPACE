describe('Namespace', function() {
    it("calls anonymous spy on event", function() {
        var eventer = _.extend({}, Backbone.Events),
            spy = sinon.spy();
        // Set up the spy.
        eventer.on("foo", spy);
        expect(spy.called).to.be.false;
        // Fire event.
        eventer.trigger("foo", 42);
        // Check number of calls.
        expect(spy.calledOnce).to.be.true;
        expect(spy.callCount).to.equal(1);
        // Check calling arguments.
        expect(spy.firstCall.args[0]).to.equal(42);
        expect(spy.calledWith(42)).to.be.true;
    });


    it("calls spy wrapper on function", function() {
        var divide = function(a, b) {
                return a / b;
            },
            divAndSpy = sinon.spy(divide);

        //First runt the method and see if values are coming properly.    
        expect(divAndSpy(4, 2)).to.equal(2);


        // Now, once we are done with value, see if things are called as we were expected.
        sinon.assert.calledOnce(divAndSpy);
        sinon.assert.calledWith(divAndSpy, 4, 2);
        

        expect(divAndSpy.returned(2)).to.be.true;
    });
});
