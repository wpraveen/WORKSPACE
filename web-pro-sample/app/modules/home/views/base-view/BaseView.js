define([
    "jquery",
    "underscore",
    "backbone",
    "text!./templates/BaseView.html"

], function($,_,Backbone,baseViewHtml) {
	"use strict";

	var View = Backbone.View.extend({
		id: "baseView",

		initialize: function(){
			console.log("baseViewHtml: ", baseViewHtml);
			this.$el.append(baseViewHtml);
		},

		events: {
			"click #nav-dash": "onNavDashClick"
		},

		onNavDashClick: function (e) {
			debugger;
		}


	});

	return View;
});
