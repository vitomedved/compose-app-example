import com.android.build.gradle.LibraryExtension
import com.example.convention.implementation
import com.example.convention.library
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.project

@Suppress("unused")
class AndroidFeatureConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("example.android.library.compose")
            }
            extensions.configure<LibraryExtension> {
                defaultConfig {
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
            }

            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

            dependencies {
                implementation(project(":core:common"))
                implementation(project(":core:designsystem"))
                implementation(project(":core:navigation"))

                implementation(libs.library("androidx.lifecycle.runtimeCompose"))
                implementation(libs.library("androidx.lifecycle.viewModelCompose"))
                implementation(libs.library("kotlinx.coroutines.android"))
                implementation(libs.library("androidx.navigation.compose"))
            }
        }
    }
}
