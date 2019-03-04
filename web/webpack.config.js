const HtmlWebpackPlugin = require('html-webpack-plugin');
const path = require('path');

module.exports = {
    entry: {
        'pageA':'./pageA/entry.js'
    },
    output: {
        publicPath:"/",
        path: path.resolve(__dirname , "../src/main/resources/static"),
        filename: 'dist/js/[chunkhash].js'
    },
    plugins: [
        new HtmlWebpackPlugin({
            template: "./tmpl.html",
            filename: '../templates/pageA.html',
            r:require('./pageA/r.js') || ""
        })
    ]
};
