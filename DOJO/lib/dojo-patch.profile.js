// This function is used to determine whether or not a resource should be tagged as copy-only. See the resourceTags
// property below for more information.
function copyOnly(filename, mid) {
    var list = {
        'dojo-patch/package.json': 1,
        'dojo-patch/dojo-patch.profile': 1,
        'dojo-patch/runner-doh.profile': 1,
        'dojo-patch/util/doh/_browserRunner': 1,
        'dojo-patch/util/doh/_parseURLargs': 1,
        'dojo-patch/util/doh/runner': 1,
        'dojo-patch/runner-doh': 1
    };

    return (mid in list);
}

var profile = {
    mini: true,

    resourceTags: {
        // Files that should be copied as-is without being modified by the build system.
        copyOnly: function(filename, mid) {
            return copyOnly(filename, mid);
        },

        miniExclude: function(filename, mid) {
            return mid in {
                'dojo-patch/package.json': 1,
                'dojo-patch/dojo-patch.profile': 1,
                'dojo-patch/runner-doh.profile': 1,
                'dojo-patch/util/doh/_browserRunner': 1,
                'dojo-patch/util/doh/_parseURLargs': 1,
                'dojo-patch/util/doh/runner': 1,
                'dojo-patch/runner-doh': 1
            };
        },

        // Files that are AMD modules.
        amd: function(filename, mid) {
            return !copyOnly(filename, mid) && /\.js$/.test(filename);
        }
    }
};
