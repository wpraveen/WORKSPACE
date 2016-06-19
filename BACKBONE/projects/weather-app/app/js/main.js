define([
    "jquery",
    'backbone',
    "./views/base-view/BaseView"
], function($, Backbone, BaseView) {
    'use strict';
    var main = {
        start: function() {
            var baseView = new BaseView();
            $("#page-container").html(baseView.render().el);
        }
    };

    return main;



});
