plugins {
    id("io.micronaut.build.internal.bom")
}

// Remove once 1.0.0 is released
micronautBuild {
    binaryCompatibility {
        enabled.set(false)
    }
}
