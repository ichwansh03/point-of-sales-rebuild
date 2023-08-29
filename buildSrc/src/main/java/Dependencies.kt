object ApplicationConfig {
    const val id = "com.ichwan.rebuildpos"
    const val idUser = "com.ichwan.rebuildpos.user"

    const val compileSdk = 34
    const val minSdk = 24
    const val targetSdk = 34

    const val versionCode = 1
    const val versionName = "1.0"
}

object Versions {
    val jvmTarget = "1.8"
    val navVersion = "2.7.1"
    val core = "1.10.1"
    val appCompat = "1.6.1"
    val material = "1.9.0"
    val constraintLayout = "2.1.4"
    val retrofit = "2.7.0"
    val room = "2.2.3"
    val junit = "4.13.2"
    val extjunit = "1.1.5"
    val espressoCore = "3.5.1"
}

object Libraries {
    val core = "androidx.core:core-ktx:${Versions.core}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val material = "com.google.android.material:material:${Versions.material}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    val navFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
    val navUi = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
}

object TestLibraries {
    val junit = "junit:junit:${Versions.junit}"

    val extJunit = "androidx.test.ext:junit:${Versions.extjunit}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}