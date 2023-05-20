package com.example.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *>,
) {
    val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

    commonExtension.apply {

        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("androidxComposeCompiler").get().toString()
        }

        @Suppress("UnstableApiUsage")
        buildFeatures {
            compose = true
        }

        dependencies {
            val composeBom = libs.library("androidx-compose-bom")
            implementation(platform(composeBom))

            implementation(libs.library("androidx-compose-runtime"))
            implementation(libs.library("androidx-compose-ui-tooling"))
            implementation(libs.library("androidx-compose-material3"))
            implementation(libs.library("androidx-compose-material3-windowSizeClass"))

            androidTestImplementation(platform(composeBom))
        }
    }
}
