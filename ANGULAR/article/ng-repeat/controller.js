var myApp = angular.module("myApp", []);

myApp.controller("TestController", function MyController() {
    this.users = [{
        name: "praveen",
        age: 30
    }, {
        name: "Anoop",
        age: 29
    }, {
        name: "Annu",
        age: 29
    }];
});
