// Project-level build.gradle.kts
// Only configure repositories for dependencies here

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.8.1") // AGP stable version
        classpath(kotlin("gradle-plugin", "1.9.10"))       // Kotlin plugin
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

