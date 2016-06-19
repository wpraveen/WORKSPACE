var department = require('../app/service/Departments');
var assert = require('assert');

describe('DepartmentTest', function() {

    it('department length test sync', function() {

        var departments = department.getDepartmentListSync();

        assert(Array.isArray(departments));
        assert.equal(departments.length, 2, "length should be 2");

    });

    it('department length test async', function(done) {

        department.getDepartmentList(function(deparments) {
            assert(Array.isArray(deparments));
            assert.equal(deparments.length, 3, "length should be 3");
            done();
        });

    });

});
