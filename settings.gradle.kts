import io.micronaut.build.MicronautBuildSettingsExtension

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("io.micronaut.build.shared.settings") version "6.5.5"
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "logging-parent"

include("logging-bom")

configure<MicronautBuildSettingsExtension> {
    useStandardizedProjectNames.set(true)
}
