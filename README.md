# Rx-ValidateBy-KT

Rx-ValidateBy-KT contains helper functions for RxJava `Flowable` and `Observable` types, to validate them into a single observable boolean.

``` kotlin
validateBy(observableBool1, observableBool2, observableBool3)
    .subscribeBy { isEnabled ->
        // do something with enabled flag
    }.addTo(disposables)
```

## Why?

It's useful when you want to combine multiple boolean streams together and get a "true" or a "false" (where "true" means all provided booleans are true).

## Using RxValidateBy-KT

In order to use RxValidateBy-KT, you need to add `jitpack` to your project root `build.gradle.kts`
(or `build.gradle`):

``` kotlin
// build.gradle.kts
allprojects {
    repositories {
        // ...
        maven { setUrl("https://jitpack.io") }
    }
    // ...
}
```

or

``` groovy
// build.gradle
allprojects {
    repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
    // ...
}
```

In newer projects, you need to also update the `settings.gradle` file's `dependencyResolutionManagement` block:

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }  // <--
        jcenter() // Warning: this repository is going to shut down soon
    }
}
```


and then, add the dependency to your module's `build.gradle.kts` (or `build.gradle`):

``` kotlin
// build.gradle.kts
implementation("com.github.Zhuinden:rx-validateby-kt:2.1.1")
```

or

``` groovy
// build.gradle
implementation 'com.github.Zhuinden:rx-validateby-kt:2.1.1'
```

## License

    Copyright 2020 Gabor Varadi

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
