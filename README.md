This repo demonstrates how Gradle and IntelliJ don't handle test classes that have no direct tests and only Nested test
classes.

To reproduce the issue, either run the [`ExampleTest`](src/test/kotlin/au/com/skater901/ExampleTest.kt) through
IntelliJ, or run the following command: `./gradlew test --tests "au.com.skater901.ExampleTest"`

This will result in an error where Gradle doesn't find any tests. If you instead run
`./gradlew test --tests "au.com.skater901.ExampleTest*"` then it will work.