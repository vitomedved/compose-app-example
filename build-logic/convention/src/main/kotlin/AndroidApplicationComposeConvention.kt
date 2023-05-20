import com.android.build.api.dsl.ApplicationExtension
import com.example.convention.ApplicationConfig
import com.example.convention.configureAndroidCompose
import com.example.convention.configureFlavors
import com.example.convention.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

@Suppress("unused")
class AndroidApplicationComposeConvention : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {

            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                configureAndroidCompose(this)
                configureFlavors(this)
                defaultConfig.targetSdk = ApplicationConfig.TARGET_SDK_VERSION
            }
        }
    }

}
