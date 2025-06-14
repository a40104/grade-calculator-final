plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
}

tasks.test {
    useJUnitPlatform()
}