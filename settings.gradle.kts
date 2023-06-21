@file:Suppress("UnstableApiUsage")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { setUrl("https://developer.huawei.com/repo/") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://developer.huawei.com/repo/") }
    }
}

rootProject.name = "ComposePayground"

include(":app")

include(":core:common")
include(":core:designsystem")
include(":core:navigation")

include(":feature:huaweiscanner")
include(":feature:menu")
