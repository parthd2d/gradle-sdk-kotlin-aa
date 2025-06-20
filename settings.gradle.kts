pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }

    resolutionStrategy{
        eachPlugin {
            if (requested.id.id == "com.browserstack.gradle-sdk") {
                useModule("com.browserstack:gradle-sdk:1.1.2")
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AppiumKotlin"
//include(":app")
