package com.example.convention

import org.gradle.api.artifacts.VersionCatalog
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun VersionCatalog.library(alias: String) = this.findLibrary(alias).get()

fun DependencyHandlerScope.implementation(dependency: Any) {
    add("implementation", dependency)
}

fun DependencyHandlerScope.androidTestImplementation(dependency: Any) {
    add("androidTestImplementation", dependency)
}

fun DependencyHandlerScope.coreLibraryDesugaring(dependency: Any) {
    add("coreLibraryDesugaring", dependency)
}
