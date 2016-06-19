module.exports = {
    entry: ["./src/"],
    output: {
        filename: '[name].js',
        path: __dirname + '/dist'
    },

    module: {
        preLoaders: [{
            test: /\.js$/,
            exclude: /node_modules/,
            loader: "jshint-loader"
        }],
        loaders: [{
            test: /\.es6$/,
            exclude: /node_modules/,
            loader: "babel-loader"
        }]
    },

    resolve: {
        extensions: ["",".js", ".es6"]
    }

}
