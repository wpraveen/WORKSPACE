angular.module('todoApp').controller('todoDisplayCtrl', ["ToDoService", function(ToDoService) {

    this.todos = ToDoService.get;

    this.deleteTodo = function(index) {

        ToDoService.delete(index);
    };

    this.getTodoBackgroundClr = function(todo) {

        return todo.done ? "bg-info" : "bg-warning";
    };

}]).controller('todoAddCtrl', ["ToDoService", function(ToDoService) {

    this.addTodo = function() {

        ToDoService.add({
            author: this.author,
            content: this.content,
            done: false
        });

        this.author = "";
        this.content = "";

    }.bind(this);
}]);
