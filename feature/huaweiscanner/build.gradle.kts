@file:Suppress("DSL_SCOPE_VIOLATION") // TODO remove when fixed (AGP 8): https://youtrack.jetbrains.com/issue/KTIJ-19369

import com.example.convention.implementation

plugins {
    id("example.android.feature")
    id("example.android.ktlint")
    id(libs.plugins.huawei.agConnect.get().pluginId)
}

android {
    namespace = "com.example.feature.huaweiscanner"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(libs.huawei.scanPlus)
}
