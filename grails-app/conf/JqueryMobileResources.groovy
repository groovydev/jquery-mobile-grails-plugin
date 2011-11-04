modules = {
    
    'jquery-mobile' {
        dependsOn 'jquery'
        resource url:[plugin: 'jquery-mobile', dir: 'css', file: 'jquery.mobile-1.0rc2.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile', dir: 'js', file: 'jquery.mobile-1.0rc2.js'], disposition: 'head'
    }
}
