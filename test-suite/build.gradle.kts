plugins {
    `java-library`
}

repositories {
    mavenCentral()
}
dependencies {
    implementation(libs.managed.log4j)
    implementation(libs.managed.logback.access)
    implementation(libs.managed.logback.classic)
    implementation(libs.managed.logback.core)
    implementation(libs.managed.slf4j.api)
    implementation(libs.managed.slf4j.simple)
    implementation(libs.managed.slf4j.nop)
    implementation(libs.managed.slf4j.log4j12)
    implementation(libs.managed.slf4j.reload4j)
    implementation(libs.managed.slf4j.ext)
    implementation(libs.managed.slf4j.jcl.over.slf4j)
    implementation(libs.managed.slf4j.log4j.over.slf4j)
    implementation(libs.managed.slf4j.jul.to.slf4j)
    implementation(libs.managed.slf4j.osgi.over.slf4j)
}
