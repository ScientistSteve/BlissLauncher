plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.blisslauncher"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    flavorDimensions("abi")
    productFlavors {
        create("arm") {
            dimension = "abi"
            abi = listOf("arm64-v8a", "armeabi-v7a")
        }
    }
}

dependencies {
    implementation(platform("com.google.dagger:hilt-android-bom:2.40"))
    implementation("com.google.dagger:hilt-android")
    kapt("com.google.dagger:hilt-android-compiler")
    implementation("androidx.compose.ui:ui:1.1.0")
    implementation("androidx.compose.material:material:1.1.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.1.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.1.0")
}

kapt {
    correctErrorTypes = true
}