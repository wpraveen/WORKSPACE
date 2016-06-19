var graphql = require('graphql');
var graphqlHTTP = require('express-graphql');
var express = require('express');

// Import our data set from above
var data = require('./data.json');

// Define our user type, with two string fields; `id` and `name`
var userType = new graphql.GraphQLObjectType({
    name: 'User',
    fields: {
        id: {
            type: graphql.GraphQLString
        },
        name: {
            type: graphql.GraphQLString
        }
    }
});

var userQuery = new graphql.GraphQLObjectType({
    name: 'Query',
    fields: {
        user: {
            type: userType,
            args: {
                id: {
                    type: graphql.GraphQLString
                }
            },
            resolve: function(_, args) {
                return data[args.id];
            }
        }
    }
});

var schema = new graphql.GraphQLSchema({
    query: userQuery
});

console.log('Server online!');
express().use('/graphql', graphqlHTTP({schema: schema, pretty: true,graphiql: true})).listen(3000);
