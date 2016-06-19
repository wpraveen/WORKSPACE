define([
    "jquery",
    "underscore",
    "backbone",
    "text!./templates/CounterView.html"

], function($,_,Backbone,counterViewHtml) {
	"use strict";

	var View = Backbone.View.extend({

		count: 0,


		initialize: function(){
			this.$el.append(homePageTemplate);
		},


		render: function () {
			
		}


	});

	return View;
});
