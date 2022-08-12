import org.jetbrains.kotlin.gradle.tasks.KotlinCompile




plugins {
    kotlin("jvm") version "1.7.10"
    id ("com.google.devtools.ksp") version "1.6.10-1.0.2"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {



    implementation("io.ktor:ktor-server-core:1.6.8")
    implementation("io.ktor:ktor-server-netty:1.6.8")
    implementation ("ch.qos.logback:logback-classic:1.2.11")

    implementation("io.ktor:ktor-client-core:1.6.8")
    implementation("io.ktor:ktor-client-cio:1.6.8")
    implementation("io.ktor:ktor-client-logging:1.6.8")
    implementation("io.ktor:ktor-client-jackson:1.6.8")

    implementation("io.ktor:ktor-client-content-negotiation:2.0.0")
    implementation("io.ktor:ktor-serialization-jackson:2.0.1")

    implementation("io.ktor:ktor-jackson:1.6.8")

    implementation ("io.insert-koin:koin-core:3.0.1")
    implementation ("io.insert-koin:koin-ktor:3.0.1")

    implementation("org.jetbrains.exposed:exposed-core:0.38.2")
    implementation("org.jetbrains.exposed:exposed-dao:0.38.2")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.38.2")

    implementation("org.postgresql:postgresql:42.3.6")

    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("io.github.microutils:kotlin-logging:1.6.26")



    implementation("com.zaxxer:HikariCP:2.7.8")

    testImplementation("org.jetbrains.kotlin:kotlin-test:1.6.8")


    testImplementation(kotlin("test"))


}

tasks.test {
    useJUnitPlatform()

}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

