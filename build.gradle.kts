plugins {
    kotlin("jvm") version "1.6.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib", "1.6.0"))
}

tasks.withType<Test>() {
    useJUnitPlatform()
}