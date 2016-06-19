var path = require('path');
var webpack = require('webpack');

module.exports = {
    entry: './es6/module/module-function/User.js',
    output: {
        path: __dirname,
        filename: 'bundle.js'
    },
    module: {
        loaders: [
            {
                loader: 'babel-loader',
                query: {
                  presets: 'es2015',
                }
            }
        ]
    },
    plugins: [
        // Avoid publishing files when compilation fails
        new webpack.NoErrorsPlugin()
    ],
    stats: {
        colors: true
    }
};
