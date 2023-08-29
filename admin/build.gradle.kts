plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = ApplicationConfig.id
    compileSdk = ApplicationConfig.compileSdk

    defaultConfig {
        applicationId = ApplicationConfig.id
        minSdk = ApplicationConfig.minSdk
        targetSdk = ApplicationConfig.targetSdk
        versionCode = ApplicationConfig.versionCode
        versionName = ApplicationConfig.versionName
        buildConfigField("String","BASE_URL","https://your url")
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Versions.jvmTarget
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(Libraries.core)
    implementation(Libraries.appcompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.navFragment)
    implementation(Libraries.navUi)
    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.extJunit)
    androidTestImplementation(TestLibraries.espresso)
}