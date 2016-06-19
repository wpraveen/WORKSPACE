require.config({

    baseUrl: "/",
    paths: {
        'jquery': '../libs/jquery/jquery',
        'underscore': '../libs/backbone/underscore',
        'backbone': '../libs/backbone/backbone',
        'text': '../libs/require/text',
        'bootstrap': '../libs/bootstrap/js/bootstrap',
        'app': './app/modules',
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
