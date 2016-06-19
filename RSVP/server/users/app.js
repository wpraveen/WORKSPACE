var express = require('express');
var users = require('./users.js');
var app = express();

app.use(express.static('../../'));

app.get('/user', function(req, res) {

	console.log(req.query);
    res.json(users.getUsers());
});

app.get('/user/:id', function(req, res) {
	console.log("req.params.id: ", req.params.id);
    res.json(users.getUser(req.params.id));
});


app.post('/user', function(req, res) {
	console.log("POST: Data: ", req.body);
    //res.json(users.getUser(req.params.id));
});

app.put('/user/:id', function(req, res) {
	console.log("PUT: Data: ", req.params.id);
    //res.json(users.getUser(req.params.id));
});

var server = app.listen(9999, function() {
    var host = server.address().address;
    var port = server.address().port;
    console.log('Open: http://%s:%s', host, port);

});
