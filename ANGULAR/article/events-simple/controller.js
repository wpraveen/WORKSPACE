var myApp = angular.module("myApp", []);

myApp.controller("TestController", function MyController() {
    this.sayhello = function(){
    	alert("Helloo bu angualr");
    }
});
