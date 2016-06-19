define([
    './views/base-view/BaseView'
], function(BaseView) {
    'use strict';

    return {
        init: function() {
            var baseView = new BaseView();
            $('body').append(baseView.render().el);
        }
    };
});
