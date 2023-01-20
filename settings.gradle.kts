rootProject.name = "payments-app-api"

pluginManagement{
    resolutionStrategy{
        eachPlugin{
            if (requested.id.id.startsWith("com.google.cloud.tools.appengine")) {
                useModule("com.google.cloud.tools:appengine-gradle-plugin:${requested.version}")
            }
        }
    }
}