plugins {
    id("com.android.application") version "8.0.0"
    kotlin("android") version "1.8.0"
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.blisslauncher"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(kotlin("stdlib"))
}
