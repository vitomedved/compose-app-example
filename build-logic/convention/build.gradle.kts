import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "com.example.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {

    plugins {

        register("androidApplicationCompose") {
            id = "example.android.application.compose"
            implementationClass = "AndroidApplicationComposeConvention"
        }

        register("androidLibraryCompose") {
            id = "example.android.library.compose"
            implementationClass = "AndroidLibraryComposeConvention"
        }

        register("androidFeature") {
            id = "example.android.feature"
            implementationClass = "AndroidFeatureConvention"
        }

        register("androidTest") {
            id = "example.android.test"
            implementationClass = "AndroidTestConvention"
        }

        register("androidKtLint") {
            id = "example.android.ktlint"
            implementationClass = "AndroidKtLintConvention"
        }
    }
}
