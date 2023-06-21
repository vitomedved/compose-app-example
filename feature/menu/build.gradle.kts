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
}
