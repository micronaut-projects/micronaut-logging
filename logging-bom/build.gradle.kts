plugins {
    id("io.micronaut.build.internal.bom")
}

micronautBuild {
    binaryCompatibility {
        enabled.set(true)
        // TODO required for now. Remove after Micronaut 4 release
        baselineVersion.set("1.0.0-M5")
    }
}
