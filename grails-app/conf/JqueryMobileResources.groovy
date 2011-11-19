modules = {

    /*
     * NOTE:
     * http://jquerymobile.com/blog/2011/11/16/announcing-jquery-mobile-1-0/#upgrade
     * Reminder: 1.0 supports jQuery core 1.6.4 only
     * Since 1.7 was just recently released and has some significant changes (and improvements), 
     * only 1.6.4 is officially >supported at this time. We plan on adding 1.7 support when 
     * we release version 1.1.
     */
    overrides {
        jquery {
            resource id:'js', url:[plugin: 'jquery-mobile', dir: 'js', file: 'jquery-1.6.4.js'], disposition: 'head'
        }
    }
    
    'jquery-mobile' {
        dependsOn 'jquery'
        resource url:[plugin: 'jquery-mobile', dir: 'css', file: 'jquery.mobile-1.0.css'], disposition: 'head'
        resource url:[plugin: 'jquery-mobile', dir: 'js', file: 'jquery.mobile-1.0.js'], disposition: 'head'
    }
}
