define(['dojo/_base/declare'], function(declare) {

    return [{
        id: 'AS',
        name: 'Asia',
        type: 'continent',
        population: '3.2 billion'
    }, {
        id: 'CN',
        name: 'China',
        type: 'country',
        parent: 'AS'
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
        population: '21 million'
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