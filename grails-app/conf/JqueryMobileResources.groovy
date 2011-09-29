modules = {
    
    'jquery-mobile' {
        dependsOn 'jquery'
        resource url:[plugin: 'jquery-mobile', dir: 'css', file: 'jquery.mobile-1.0b3.css'], disposition: 'head', exclude:'minify'
        resource url:[plugin: 'jquery-mobile', dir: 'js', file: 'jquery.mobile-1.0b3.js'], disposition: 'head', exclude:'minify'
    }
}
