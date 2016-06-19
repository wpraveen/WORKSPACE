module.exports = function (grunt) {

    grunt.initConfig({

        uglify:{
            options: {
                mangle: true,
                compress: true,
                sourceMap:"dist/test.map",
                banner: "/*PRAVEEN KUMAR SINGH*/\n"


            },
            target:{
                src: "src/*.js",
                dest: "dist/test.min.js"
            }
        },
        jshint: {
            options: {
                jshintrc:  ".jshintrc"
            },
            target:{
                src: "src/*.js"
            }
        },
        watch: {
            scripts: {
                files: ["src/*.js"],
                tasks: ["jshint","uglify"]
            }
        },
        connect: {
            server: {
                options: {
                    port: 9001,
                    base: 'app'
                }
            }
        }
    });
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-jshint');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-contrib-connect');


    grunt.registerTask("default", ["jshint","uglify"]);
    grunt.registerTask("server", ["connect"]);
};
