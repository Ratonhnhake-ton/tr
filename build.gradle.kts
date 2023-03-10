plugins {
    java
    id("org.springframework.boot") version "3.0.2"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "com.ind"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    // TODO This should go away. Use RestTemplate instead
    implementation("com.squareup.okhttp:okhttp:2.7.5")

    implementation("org.springframework.boot:spring-boot-starter-security:3.0.3")
    implementation("org.springframework.security:spring-security-jwt:1.1.1.RELEASE")
    implementation("com.nimbusds:nimbus-jose-jwt:9.31")

    implementation("org.slf4j:slf4j-api:2.0.6")
    testImplementation("org.slf4j:slf4j-log4j12:2.0.6")

    implementation("org.apache.solr:solr-solrj:9.1.1")

    implementation("org.mongodb:mongodb-driver-sync:4.8.1")
    implementation("org.springframework.data:spring-data-mongodb:4.0.2")

    implementation("org.postgresql:postgresql:42.2.15")
    implementation("org.liquibase:liquibase-core:4.19.0")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")

    implementation("org.json:json:20220924")
    implementation("com.fasterxml.jackson.core:jackson-core:2.14.2")

    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
