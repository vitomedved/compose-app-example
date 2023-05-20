import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class AndroidKtLintConvention: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("org.jlleitschuh.gradle.ktlint")
        }
    }
}
