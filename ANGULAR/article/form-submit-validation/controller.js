var myApp = angular.module("myApp", []);

myApp.controller("TestController", function MyController() {

    this.name;
    this.age;

    this.submitForm = function(){
        console.log("Submitting form: ", this.user);
    }
});
