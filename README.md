Minimal example to reproduce an IntelliJ IDEA bug when adding a custom source set to the jar output of a project
dependency.

Possibly related to:
* https://youtrack.jetbrains.com/issue/IDEA-261509/Gradle-When-a-project-depends-on-another-project-IDEA-will-only-recognize-the-main-sourceSet-of-the-dependent-project

In order to reproduce:

1. Clone and import this project into IntelliJ IDEA
2. Run tests using gradle. Either by running `./gradlew test`, or by configuring IntelliJ IDEA to copmile and run tests using gradle 
(Settings -> Build, Execution, Deployment -> Build Tools -> Gradle, set "Build and run using" and "Run tests using" to "Gradle") 

   The project should compile and tests should pass.
3. Configure IntelliJ IDEA to compile and run tests using IntelliJ (Settings -> Build, Execution, Deployment -> Build Tools -> Gradle, set "Build and run using" and "Run tests using" to "IntelliJ IDEA")

   Note the compiler error in CustomSourceSetTest, due to the missing class `org.example.ClassInCustomSourceSet` 


