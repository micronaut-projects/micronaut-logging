import io.micronaut.build.MicronautBuildSettingsExtension

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("io.micronaut.build.shared.settings") version "6.3.5"
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "logging-parent"

include("logging-bom")

configure<MicronautBuildSettingsExtension> {
    addSnapshotRepository()
    useStandardizedProjectNames.set(true)
}
