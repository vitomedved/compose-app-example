plugins {
    id("example.android.library.compose")
    id("example.android.ktlint")
}

android {
    namespace = "com.example.designsystem"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(project(":core:common"))
}
