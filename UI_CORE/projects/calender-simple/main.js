var jan1 = new Date("Jan 11, 2015");


var oneDayTime = 24 * 60 * 60 * 1000;

var tempDate = new Date(jan1);
var today = new Date();

var thisMonthFirstDate = new Date(today.getFullYear(), today.getMonth(), 1);
var nextMonthFirstDate = new Date(today.getFullYear(), today.getMonth() + 1, 1);

var thisMonthLastDate = new Date(nextMonthFirstDate - oneDayTime);


var frameDeltaDaysStart = (thisMonthFirstDate.getDay() === 0 ? 6 : thisMonthFirstDate.getDay() - 1);
var firstDateOfMonthFrame = new Date(thisMonthFirstDate.getTime() - (frameDeltaDaysStart * oneDayTime));


var frameDeltaDaysEnd = (thisMonthLastDate.getDay() === 0 ? 0 : (7 - thisMonthLastDate.getDay()));
var thisMonthLastDateOfMonthFrame = new Date(thisMonthLastDate.getTime() + (frameDeltaDaysEnd * oneDayTime));


console.log("thisMonthFirstDate: ", thisMonthFirstDate);
console.log("thisMonthLastDate: ", thisMonthLastDate);
console.log("firstDateOfMonthFrame: ", firstDateOfMonthFrame);
console.log("thisMonthLastDateMonthFrame: ", thisMonthLastDateOfMonthFrame);


var calTemplate = "<table>";

var tempDate = new Date(firstDateOfMonthFrame);
calTemplate += "<tr><th>MON</th><th>TUE</th><th>WED</th><th>THUS</th><th>FRI</th><th>SAT</th><th>SUN</th></tr>";


var inCal = false;
for (var i = 0; i < 5; i++) {

    calTemplate += "<tr>";

    for (var j = 0; j < 7; j++) {
        if (tempDate.getDate() === 1) {
            inCal = (!inCal);
        }

        if(inCal){
            calTemplate += "<td>" + tempDate.getDate() + "</td>";
        }else{
            calTemplate += "<td style='color:#a7a7a7'>" + tempDate.getDate() + "</td>";
        }

        tempDate = incrementDate(tempDate);

    }

    calTemplate += "</tr>"
}


calTemplate += "</table>";

document.getElementById("calView").innerHTML = calTemplate;

function incrementDate(date) {
    return new Date(date.getTime() + oneDayTime);
}