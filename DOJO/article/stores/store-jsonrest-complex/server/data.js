exports.getTxns = function(lowDate, highDate) {
var txns = [];
     for (var i = 0; i < 4; i++) {
     	var targetDate = new Date(data[i].date);
     	console.log("targetDate: ", targetDate.getTime());
     	console.log("lowDate: ", lowDate.getTime());
     	console.log("highDate: ", highDate.getTime());
     	console.log("opss: ", (targetDate.getTime() >= lowDate.getTime() && targetDate.getTime() <= highDate.getTime()));
         if (targetDate.getTime() >= lowDate.getTime() && targetDate.getTime() <= highDate.getTime()) {
             txns.push(data[i]);
         }
     }
    return txns;
};


var data = [{
    "txnId": 120,
    "txnTypeId": 7,
    "txnType": "Payment",
    "amount": "-1675.52",
    "homeAmount": "0.00",
    "currencyType": {
        "isoCode": "USD",
        "displayName": "United States Dollar",
        "symbol": "$"
    },
    "date": "2015-05-12",
    "memo": "",
    "isVoided": false,
    "editSequence": 0,
    "referenceNumber": "",
    "nameId": 3,
    "name": "Cool Cars",
    "dueDate": "2015-05-22",
    "taxAmount": "0.00",
    "taxableTotal": "-1675.52",
    "openBalance": "0.00",
    "homeOpenBalance": "0.00",
    "toBePrinted": false,
    "toBeSent": false,
    "deliveryAddress": "",
    "customVal1": "",
    "customVal2": "",
    "customVal3": "",
    "status": "applied",
    "recentlyPaidDate": "2015-04-12",
    "aging": 26,
    "accountId": "4",
    "customFields": []
}, {
    "txnId": 128,
    "txnTypeId": 7,
    "txnType": "Payment",
    "amount": "-387.00",
    "homeAmount": "0.00",
    "currencyType": {
        "isoCode": "USD",
        "displayName": "United States Dollar",
        "symbol": "$"
    },
    "date": "2015-05-14",
    "memo": "",
    "isVoided": false,
    "editSequence": 0,
    "referenceNumber": "",
    "nameId": 8,
    "name": "Freeman Sporting Goods:0969 Ocean View Road",
    "dueDate": "2015-05-24",
    "taxAmount": "0.00",
    "taxableTotal": "-387.00",
    "openBalance": "0.00",
    "homeOpenBalance": "0.00",
    "toBePrinted": false,
    "toBeSent": false,
    "deliveryAddress": "",
    "customVal1": "",
    "customVal2": "",
    "customVal3": "",
    "status": "applied",
    "recentlyPaidDate": "2015-04-12",
    "aging": 26,
    "accountId": "4",
    "customFields": []
}, {
    "txnId": 129,
    "txnTypeId": 4,
    "txnType": "Invoice",
    "amount": "477.50",
    "homeAmount": "0.00",
    "currencyType": {
        "isoCode": "USD",
        "displayName": "United States Dollar",
        "symbol": "$"
    },
    "date": "2015-05-25",
    "memo": "",
    "isVoided": false,
    "editSequence": 0,
    "referenceNumber": "1036",
    "nameId": 8,
    "name": "Freeman Sporting Goods:0969 Ocean View Road",
    "dueDate": "2015-05-25",
    "taxAmount": "0.00",
    "taxableTotal": "477.50",
    "openBalance": "477.50",
    "homeOpenBalance": "477.50",
    "toBePrinted": true,
    "toBeSent": false,
    "deliveryAddress": "Sporting_goods@intuit.com",
    "customVal1": "105",
    "customVal2": "",
    "customVal3": "",
    "status": "open",
    "accountId": "84",
    "splitTxn": true,
    "customFields": []
}, {
    "txnId": 130,
    "txnTypeId": 4,
    "txnType": "Invoice",
    "amount": "362.07",
    "homeAmount": "0.00",
    "currencyType": {
        "isoCode": "USD",
        "displayName": "United States Dollar",
        "symbol": "$"
    },
    "date": "2015-05-07",
    "memo": "",
    "isVoided": false,
    "editSequence": 0,
    "referenceNumber": "1037",
    "nameId": 24,
    "name": "Sonnenschein Family Store",
    "dueDate": "2015-05-17",
    "taxAmount": "26.82",
    "taxableTotal": "335.25",
    "openBalance": "362.07",
    "homeOpenBalance": "362.07",
    "toBePrinted": true,
    "toBeSent": false,
    "deliveryAddress": "Familiystore@intuit.com",
    "customVal1": "102",
    "customVal2": "",
    "customVal3": "",
    "status": "open",
    "accountId": "84",
    "splitTxn": true,
    "customFields": []
//	},{
//     "txnId": 119,
//     "txnTypeId": 4,
//     "txnType": "Invoice",
//     "amount": "314.28",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-12",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "1035",
//     "nameId": 17,
//     "name": "Mark Cho",
//     "dueDate": "2015-05-12",
//     "taxAmount": "23.28",
//     "taxableTotal": "291.00",
//     "openBalance": "314.28",
//     "homeOpenBalance": "314.28",
//     "toBePrinted": true,
//     "toBeSent": false,
//     "deliveryAddress": "Mark@Cho.com",
//     "customVal1": "104",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "open",
//     "accountId": "84",
//     "splitTxn": true,
//     "customFields": []
// }, {
//     "txnId": 106,
//     "txnTypeId": 4,
//     "txnType": "Invoice",
//     "amount": "78.60",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-11",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "1034",
//     "nameId": 21,
//     "name": "Rondonuwu Fruit and Vegi",
//     "dueDate": "2015-05-11",
//     "taxAmount": "3.60",
//     "taxableTotal": "75.00",
//     "openBalance": "78.60",
//     "homeOpenBalance": "78.60",
//     "toBePrinted": true,
//     "toBeSent": false,
//     "deliveryAddress": "Tony@Rondonuwu.com",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "open",
//     "accountId": "84",
//     "splitTxn": true,
//     "customFields": []
// }, {
//     "txnId": 98,
//     "txnTypeId": 7,
//     "txnType": "Payment",
//     "amount": "-81.00",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-11",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "",
//     "nameId": 26,
//     "name": "Travis Waldron",
//     "dueDate": "2015-04-11",
//     "taxAmount": "0.00",
//     "taxableTotal": "-81.00",
//     "openBalance": "0.00",
//     "homeOpenBalance": "0.00",
//     "toBePrinted": false,
//     "toBeSent": false,
//     "deliveryAddress": "",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "applied",
//     "recentlyPaidDate": "2015-04-11",
//     "aging": 27,
//     "accountId": "4",
//     "customFields": []
// }, {
//     "txnId": 101,
//     "txnTypeId": 7,
//     "txnType": "Payment",
//     "amount": "-220.00",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-11",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "",
//     "nameId": 1,
//     "name": "Amy&#x27;s Bird Sanctuary",
//     "dueDate": "2015-04-11",
//     "taxAmount": "0.00",
//     "taxableTotal": "-220.00",
//     "openBalance": "0.00",
//     "homeOpenBalance": "0.00",
//     "paymentMethodId": 2,
//     "paymentMethodName": "Check",
//     "toBePrinted": false,
//     "toBeSent": false,
//     "deliveryAddress": "",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "applied",
//     "recentlyPaidDate": "2015-04-11",
//     "aging": 27,
//     "accountId": "4",
//     "customFields": []
// }, {
//     "txnId": 103,
//     "txnTypeId": 4,
//     "txnType": "Invoice",
//     "amount": "629.10",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-11",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 1,
//     "referenceNumber": "1033",
//     "nameId": 10,
//     "name": "Geeta Kalapatapu",
//     "dueDate": "2015-05-11",
//     "taxAmount": "46.60",
//     "taxableTotal": "582.50",
//     "openBalance": "629.10",
//     "homeOpenBalance": "629.10",
//     "toBePrinted": true,
//     "toBeSent": false,
//     "deliveryAddress": "Geeta@Kalapatapu.com",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "open",
//     "accountId": "84",
//     "splitTxn": true,
//     "customFields": []
// }, {
//     "txnId": 38,
//     "txnTypeId": 32,
//     "txnType": "Sales Receipt",
//     "amount": "78.75",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-10",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "1011",
//     "nameId": 15,
//     "name": "Pye&#x27;s Cakes",
//     "taxAmount": "0.00",
//     "taxableTotal": "78.75",
//     "openBalance": "0.00",
//     "homeOpenBalance": "0.00",
//     "paymentMethodId": 1,
//     "paymentMethodName": "Cash",
//     "toBePrinted": false,
//     "toBeSent": false,
//     "deliveryAddress": "karen@pye.com",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "paid",
//     "accountId": "4",
//     "splitTxn": true,
//     "customFields": []
// }, {
//     "txnId": 66,
//     "txnTypeId": 34,
//     "txnType": "Refund",
//     "amount": "-87.50",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-10",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "1020",
//     "nameId": 15,
//     "name": "Pye&#x27;s Cakes",
//     "taxAmount": "0.00",
//     "taxableTotal": "-87.50",
//     "openBalance": "0.00",
//     "homeOpenBalance": "0.00",
//     "paymentMethodId": 2,
//     "paymentMethodName": "Check",
//     "toBePrinted": false,
//     "toBeSent": false,
//     "deliveryAddress": "pyescakes@intuit.com",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "paid",
//     "accountId": "35",
//     "customFields": []
// }, {
//     "txnId": 33,
//     "txnTypeId": 7,
//     "txnType": "Payment",
//     "amount": "-50.00",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-10",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 1,
//     "referenceNumber": "",
//     "nameId": 9,
//     "name": "Freeman Sporting Goods:55 Twin Lane",
//     "dueDate": "2015-04-10",
//     "taxAmount": "0.00",
//     "taxableTotal": "-50.00",
//     "openBalance": "0.00",
//     "homeOpenBalance": "0.00",
//     "paymentMethodId": 2,
//     "paymentMethodName": "Check",
//     "toBePrinted": false,
//     "toBeSent": false,
//     "deliveryAddress": "",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "applied",
//     "recentlyPaidDate": "2015-04-10",
//     "aging": 28,
//     "accountId": "35",
//     "customFields": []
// }, {
//     "txnId": 34,
//     "txnTypeId": 4,
//     "txnType": "Invoice",
//     "amount": "375.00",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-10",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "1010",
//     "nameId": 29,
//     "name": "Weiskopf Consulting",
//     "dueDate": "2015-05-10",
//     "taxAmount": "0.00",
//     "taxableTotal": "375.00",
//     "openBalance": "375.00",
//     "homeOpenBalance": "375.00",
//     "toBePrinted": false,
//     "toBeSent": true,
//     "deliveryAddress": "Consulting@intuit.com",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "open",
//     "accountId": "84",
//     "customFields": []
// }, {
//     "txnId": 65,
//     "txnTypeId": 4,
//     "txnType": "Invoice",
//     "amount": "80.00",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-10",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 1,
//     "referenceNumber": "1019",
//     "nameId": 25,
//     "name": "Sushi by Katsuyuki",
//     "dueDate": "2015-05-10",
//     "taxAmount": "0.00",
//     "taxableTotal": "80.00",
//     "openBalance": "80.00",
//     "homeOpenBalance": "80.00",
//     "toBePrinted": true,
//     "toBeSent": false,
//     "deliveryAddress": "Sushi@intuit.com",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "open",
//     "accountId": "84",
//     "customFields": []
// }, {
//     "txnId": 69,
//     "txnTypeId": 4,
//     "txnType": "Invoice",
//     "amount": "70.00",
//     "homeAmount": "0.00",
//     "currencyType": {
//         "isoCode": "USD",
//         "displayName": "United States Dollar",
//         "symbol": "$"
//     },
//     "date": "2015-04-10",
//     "memo": "",
//     "isVoided": false,
//     "editSequence": 0,
//     "referenceNumber": "1023",
//     "nameId": 20,
//     "name": "Red Rock Diner",
//     "dueDate": "2015-05-10",
//     "taxAmount": "0.00",
//     "taxableTotal": "70.00",
//     "openBalance": "70.00",
//     "homeOpenBalance": "70.00",
//     "toBePrinted": true,
//     "toBeSent": false,
//     "deliveryAddress": "qbwebsamplecompany@yahoo.com",
//     "customVal1": "",
//     "customVal2": "",
//     "customVal3": "",
//     "status": "open",
//     "accountId": "84",
//     "customFields": []
 }];
