var numbers = [0,1, 2, 3, 4, 5, 6, 7, 8];

function filterOddNosSync(numbers) {

    return numbers.filter(function(item) {
        return item % 2;
    });
}

function filterOddNos(numbers, callback) {

    setTimeout(function() {

    	if(numbers.indexOf(0) > -1){
    		var error = new Error("No Zeros are allowed.");
    	}
    	
        var oddNos = numbers.filter(function(item) {
            return item % 2;
        });

        callback(error, oddNos);

    }, 1000);
}

var oddNums = filterOddNos(numbers, function(error, data) {
	if(error){
		throw error;
	}
    console.log(data);
});
