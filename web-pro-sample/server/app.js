var express = require('express');
var app = express();

app.use(express.static('../'));

app.get('/user', function(req, res) {
    res.send('Hello World!');
});

var server = app.listen(9999, function() {
    var host = server.address().address;
    var port = server.address().port;
    console.log('Open: http://%s:%s', host, port);

});
