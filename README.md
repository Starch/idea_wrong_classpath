# idea_wrong_classpath

Self-contained example of a classpath problem occuring in IDE in a gradle multiprojects.

Here the `project-tests` project depends on modules:
* `project1` (that depends on `log4j-1.2.14`)
* `project2` (that depends on `log4j-1.2.17`)

The `ClasspathTest` junit checks that only one of `log4j` jars is present in test classpath.

When ran in Intellij 15 with junit runner, `ClasspathTest` fails, because both `log4j` jars are present in the classpath.

When ran with `gradle test`, `ClasspathTest` succeeds, as gradle takes only the more recent jar.
