// Karma configuration
module.exports = function(config) {
    config.set({

        // Base path will be used to resolve files and exclude.
        // Base path is kept as a root. Then, test and lib files exist under it.
        basePath : '',

        // Define test framework.
        frameworks : ['jasmine'],

        // list of files / patterns to load in the browser
        // Notice, test/jasmine/js/specconfig.js defines if only local or both local and server tests should be run.
        files : ['deps/jquery/jquery-1.10.2.js', 'deps/lodash/lodash.compat-2.1.0.js', 'deps/async/async-0.2.9.js', 'src/utils.js', 'src/splittercache.js', 'src/wfsrequestparser.js', 'src/wfsconnection.js', 'test/jasmine/js/*.js', 'test/jasmine/spec/*Spec.js', {
            pattern : 'test/jasmine/data/common/*.xml',
            included : false
        }, {
            pattern : 'test/jasmine/data/karma/**/*.xml',
            included : false
        }],

        // list of files to exclude
        exclude : [],

        // test results reporter to use
        // possible values: 'dots', 'progress', 'junit'
        reporters : ['dots'],

        // web server port
        // Notice, XML-files for local karma tests may
        // contain reference to this port for localhost.
        // If port is changed, XML-files may need to be updated.
        port : 9876,

        // cli runner port
        runnerPort : 9100,

        // enable / disable colors in the output (reporters and logs)
        colors : true,

        // level of logging
        // possible values: LOG_DISABLE || LOG_ERROR || LOG_WARN || LOG_INFO || LOG_DEBUG
        logLevel : config.LOG_INFO,

        // enable / disable watching file and executing tests whenever any file changes
        autoWatch : true,

        // Start these browsers, currently available:
        // - Chrome
        // - ChromeCanary
        // - Firefox
        // - Opera
        // - Safari (only Mac)
        // - PhantomJS
        // - IE (only Windows)
        browsers : ['Chrome'],

        // If browser does not capture in given timeout [ms], kill it.
        captureTimeout : 60000,

        // Continuous Integration mode
        // if true, it capture browsers, run tests and exit
        singleRun : false

    });
};
