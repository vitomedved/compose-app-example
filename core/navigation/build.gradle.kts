import com.example.convention.implementation

plugins {
    id("example.android.library.compose")
    id("example.android.ktlint")
}

android {
    namespace = "com.example.core.navigation"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(libs.androidx.navigation.compose)
}
