var myApp = angular.module("myApp", []);

myApp.controller("TestController", function MyController() {
    this.user = {
        "name": "Praveen",
        "age": 30
    };
});
