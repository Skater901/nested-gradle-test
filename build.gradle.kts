plugins {
    kotlin("jvm") version "2.1.20"
}

group = "au.com.skater901"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()

    filter {
        excludeTestsMatching("*ITCase")
    }
}

kotlin {
    jvmToolchain(21)
}