class BrowserDetectionGrailsPlugin {
    def version = "0.4.3.1-snapshot"
    def grailsVersion = "1.2.2 > *"

    def author = "Divick Kishore"
    def authorEmail = "divick.kishore@gmail.com"
    def title = "Browser detection"
    def description = '''\\
This plugin provides service and tag library for browser detection. You can know what is the browser, version, operating system and language specified in request headers.
'''
    def documentation = "http://grails.org/plugin/browser-detection"

	def dependsOn = [:]
	def pluginExcludes = [
			"grails-app/views/error.gsp",
			"grails-app/controllers/org/geeks/browserdetection/TestController.groovy",
			"grails-app/views/index.gsp"
	]
}
