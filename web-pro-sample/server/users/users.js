var users = [{
    id: 1,
    name: "praveen"
}, {
    id: 2,
    name: "anoop"
}, {
    id: 3,
    name: "annu"
}];

exports.getUsers = function() {
    return users;
}

exports.getUser = function(id) {

    for (var i = 0; i < users.length; i++) {
        if (users[i].id === Number(id)) {
            return users[i];
        }
    }
    return null;
}
