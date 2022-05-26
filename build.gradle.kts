import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    kotlin("jvm") version "1.6.10"
    java

    application
}

group = "de.spurkomet"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://mvnrepository.com/artifact/org.processing/coreimplementation")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.processing:core:3.3.7")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application {
    mainClass.set("Main")
}