define([
    "jquery",
    "underscore",
    "backbone",
    "text!./templates/BaseView.html"

], function($,_,Backbone,baseView) {
	"use strict";

	var View = Backbone.View.extend({
        className: 'container',

        events: {
        	"click #nav-dash" : "onDashBoardLinkClick"

        },

		initialize: function(){
			
		},

		render: function() {
			this.$el.append(baseView);
			return this;
		},

		onDashBoardLinkClick: function () {
			alert("You have click on Dashboard");
		}

	});

	return View;
});
