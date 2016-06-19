define([
	'jquery',
	'bootstrap'
],function($,bootstrap){

	return {
		init: function(){
			$('#page-container').append("<div class='container'><h1>In home</h1><br><div id='hiPlaceholder'></div></div>");
		},
		sayHi: function () {
				
			$("#hiPlaceholder").html('<div class="alert"><button type="button" class="close" data-dismiss="alert">&times;</button> Hello....</div>');	

			
		}
	};
});
