var express = require('express');
var data = require('./data.js');
var app = express();

app.use(express.static('../../../../'));

app.get('/txns', function(req, res) {

	console.log(req.query);
    var lowDate = new Date(req.query.lowDate);
    var highDate = new Date(req.query.highDate);
    res.json(data.getTxns(lowDate,highDate));
});


var server = app.listen(9999, function() {
    var host = server.address().address;
    var port = server.address().port;
    console.log('Open: http://%s:%s', host, port);

});
