import com.google.samples.apps.nowinandroid.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.buildscript
import org.gradle.kotlin.dsl.exclude
import org.gradle.kotlin.dsl.repositories

/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class RootConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
//                apply("com.android.application")
//                apply("com.android.library")
//                apply("com.android.test")
//                apply("androidx.baselineprofile")
//                apply("org.jetbrains.kotlin.jvm")
//                apply("org.jetbrains.kotlin.plugin.serialization")
//                apply("com.dropbox.dependency-guard")
//                apply("com.google.firebase.crashlytics")
//                apply("com.google.firebase.firebase-perf")
//                apply("com.google.gms.google-services")
//                apply("com.google.dagger.hilt.android")
//                apply("com.google.devtools.ksp")
//                apply("io.github.takahirom.roborazzi")
//                apply("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
//                apply("androidx.room")
            }
        }
    }
}