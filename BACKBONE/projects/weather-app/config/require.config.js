require.config({

    paths: {
        'jquery': '../libs/jquery',
        'underscore': '../libs/underscore',
        'backbone': '../libs/backbone',
        'text': '../libs/require/text',
        'bootstrap': '../libs/bootstrap/js/bootstrap',
        'app': '../app/js/'
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

