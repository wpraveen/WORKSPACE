define(['dojo/_base/declare'], function(declare) {

    return [{
            id: 1,
            name: "A1",
            accountNumber: "10",
            fullyQualifiedName: "A1",
            detailAccountType: "",
            subLevel: 0
        }, {
            id: 11,
            name: "B1",
            accountNumber: "1010",
            fullyQualifiedName: "A1:B1",
            detailAccountType: "",
            subLevel: 1,
            parentId: 1,
            type: "leaf"
        },
        {
            id: 12,
            name: "B2",
            accountNumber: "1020",
            fullyQualifiedName: "A1:B2",
            detailAccountType: "",
            subLevel: 2,
            parentId: 1

        }, {
            id: 121,
            name: "C1",
            accountNumber: "101010",
            fullyQualifiedName: "A2",
            detailAccountType: "",
            subLevel: 2,
            parentId: 12,
            type: "leaf"
        }, {
            id: 122,
            name: "C2",
            accountNumber: "101020",
            fullyQualifiedName: "A2",
            detailAccountType: "",
            subLevel: 2,
            parentId: 12,
            type: "leaf"
        }, {
            id: 2,
            name: "A2",
            accountNumber: "20",
            fullyQualifiedName: "A2",
            detailAccountType: "",
            subLevel: 0
        }, {
            id: 21,
            name: "B1",
            accountNumber: "2010",
            fullyQualifiedName: "A2:B1",
            detailAccountType: "",
            subLevel: 1,
            parentId: 2,
            type: "leaf"
        },

        {
            id: 22,
            name: "B2",
            accountNumber: "2020",
            fullyQualifiedName: "A2:B2",
            detailAccountType: "",
            subLevel: 2,
            parentId: 2,
            type: "leaf"
        }
    ];

});