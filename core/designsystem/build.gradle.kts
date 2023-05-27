plugins {
    id("masterblaster.android.library.compose")
    id("masterblaster.android.ktlint")
}

android {
    namespace = "com.example.designsystem"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
}
