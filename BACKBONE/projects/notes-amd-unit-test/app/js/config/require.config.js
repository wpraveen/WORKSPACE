require.config({

    baseUrl: "/",
    paths: {
        'jquery': '../../../libs/jquery',
        'underscore': '../../../libs/underscore',
        'backbone': '../../../libs/backbone',
        'bootstrap': '../../../libs/bootstrap/js/bootstrap',
        'app': 'app/js/',
    },
    shim: {
        'underscore': {
            exports: '_'
        },
        'backbone': {
            deps: [
                'underscore',
                'jquery'
            ],
            exports: 'Backbone'
        },
        'bootstrap': {
            deps: [
                'jquery'
            ]
        }
    }
});

