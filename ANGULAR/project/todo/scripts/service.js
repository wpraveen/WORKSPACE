angular.module('todoApp').factory('ToDoService', [function() {

    var todos = [];

    return {

        get: function() {
            return todos;
        },
        add: function(todo) {
            todos.push(todo);
        },
        delete: function(index) {
            todos.splice(index,1);
        }
    };
}]);
