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
            id = "masterblaster.android.application.compose"
            implementationClass = "AndroidApplicationComposeConvention"
        }

        register("androidLibraryCompose") {
            id = "masterblaster.android.library.compose"
            implementationClass = "AndroidLibraryComposeConvention"
        }

        register("androidFeature") {
            id = "masterblaster.android.feature"
            implementationClass = "AndroidFeatureConvention"
        }

        register("androidTest") {
            id = "masterblaster.android.test"
            implementationClass = "AndroidTestConvention"
        }

        register("androidKtLint") {
            id = "masterblaster.android.ktlint"
            implementationClass = "AndroidKtLintConvention"
        }
    }
}
