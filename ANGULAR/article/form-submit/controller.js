var myApp = angular.module("myApp", []);

myApp.controller("TestController", function MyController() {

    this.userInfo = {};

    this.submitForm = function(){
        console.log("Submitting form: ", this.userInfo);
    }
});
