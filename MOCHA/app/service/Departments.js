module.exports = {

    getDepartmentListSync: function() {

        return ["ECE", "CS"];
    },
    getDepartmentList: function(callback) {

        setTimeout(function() {
            callback(["ECE", "CS", "BT"]);
        }, 50);
    }
};
