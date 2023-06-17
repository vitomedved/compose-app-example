import com.example.convention.implementation

plugins {
    id("example.android.feature")
    id("example.android.ktlint")
}

android {
    namespace = "com.example.feature.menu"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:navigation"))
}
