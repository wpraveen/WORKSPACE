define(['dojo/_base/declare'], function(declare) {

    return [{
        id: 'AS',
        name: 'I am a header',
        type: 'continent',
        population: '3.2 billion',
        type: "header",
        age: 25
    }, {
        id: 'CN',
        name: 'China',
        type: 'country',
        parent: 'AS',
        age: 26
    }, {
        id: 'Shanghai',
        name: 'Shanghai',
        type: 'city',
        parent: 'CN'
    }, {
        id: 'IN',
        name: 'India',
        type: 'country',
        parent: 'AS'
    }, {
        id: 'Calcutta',
        name: 'Calcutta',
        type: 'city',
        parent: 'IN'
    }, {
        id: 'AU',
        name: 'Australia',
        type: 'country',
        population: '21 million',
        type: "header"
    }, {
        id: 'Sydney',
        name: 'Sydney',
        type: 'city',
        parent: 'AU'
    },{
        id: 'melbourne',
        name: 'Melbourne',
        type: 'city',
        parent: 'AU'
    }];

});