define([
    "jquery",
    "underscore",
    "backbone",
    "text!./templates/HelloView.html"

], function($,_,Backbone,helloView) {
	"use strict";

	var View = Backbone.View.extend({
        className: 'container',

		initialize: function(){
			
		},

		render: function() {
			this.$el.append(helloView);
			return this;
		}

	});

	return View;
});
