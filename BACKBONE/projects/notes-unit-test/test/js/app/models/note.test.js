describe("App.Models.Note", function() {
    it("has default values", function() {
        // Create empty note model.
        var model = new App.Models.Note();
        expect(model).to.be.ok;
        expect(model.get("title")).to.equal("");
        expect(model.get("text")).to.equal("*Edit your note!*");
        expect(model.get("createdAt")).to.be.a("Date");
    });



    describe('description', function() {
        it("has a single note");
        it("can delete a note");
        it("can create a second note");
    });
});
