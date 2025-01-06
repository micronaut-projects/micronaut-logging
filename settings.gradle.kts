import io.micronaut.build.MicronautBuildSettingsExtension

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("io.micronaut.build.shared.settings") version "7.3.1"
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "logging-parent"

include("logging-bom")
include("test-suite")

configure<MicronautBuildSettingsExtension> {
    useStandardizedProjectNames.set(true)
}
