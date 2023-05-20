@file:Suppress("UnstableApiUsage")

package com.example.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.ApplicationProductFlavor
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.ProductFlavor

enum class FlavorDimension {
    ENVIRONMENT
}

enum class Flavor(val dimension: FlavorDimension, val applicationIdSuffix: String? = null) {
    PROD(FlavorDimension.ENVIRONMENT),
}

fun configureFlavors(
    commonExtension: CommonExtension<*, *, *, *>,
    flavorConfigurationBlock: ProductFlavor.(flavor: Flavor) -> Unit = {}
) {
    commonExtension.apply {

        flavorDimensions += FlavorDimension.ENVIRONMENT.name

        productFlavors {
            Flavor.values().forEach {
                create(it.name) {
                    dimension = it.dimension.name
                    flavorConfigurationBlock(this, it)
                    if (this@apply is ApplicationExtension && this is ApplicationProductFlavor) {
                        if (it.applicationIdSuffix != null) {
                            applicationIdSuffix = it.applicationIdSuffix
                        }
                    }
                }
            }
        }
    }
}
