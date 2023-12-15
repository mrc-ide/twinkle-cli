import io.gitlab.arturbosch.detekt.Detekt

plugins {
    kotlin("jvm") version "1.9.21"
    application
    id("io.gitlab.arturbosch.detekt") version "1.23.3"
}

group = "twinklecli"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.ajalt.clikt:clikt:4.2.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.3")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "twinklecli.MainKt"
}

detekt {
    buildUponDefaultConfig = true
    config = files("$projectDir/config/detekt.yml")
}