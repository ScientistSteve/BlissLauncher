# ProGuard/R8 rules for full minification

# Keep Hilt classes
-keep class dagger.** { *; }
-keep class javax.inject.** { *; }

# Keep Retrofit classes
-keep class retrofit2.** { *; }
-keep class okhttp3.** { *; }

# Keep Moshi classes
-keep class com.squareup.moshi.** { *; }

# Keep OkHttp classes
-keep class okhttp3.** { *; }

# Keep Compose UI classes
-keep class androidx.compose.** { *; }

# Keep AndroidX library classes
-keep class androidx.** { *; }

# Keep Kotlin classes
-keep class kotlin.** { *; }

# Keep PojavLauncher native library symbols
-keep class org.pojavlauncher.** { *; }

# Minification settings
-repackageclasses
-allowaccessmodification
