# stub-engine [![Build][badge-github-ci]][project-gradle-ci] [![Maven Central][badge-mvnc]][project-mvnc]

Generator library utilized for [atlas-gradle][atlas-gradle]'s stub classes creation.

# importing

you can import [stub-engine][project-url] from [maven central][mvnc] just by adding it to your dependencies:

## gradle

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("me.xtrm.atlas:stub-engine.xml:0.0.1")
}
```

## maven

```xml
<dependency>
    <groupId>me.xtrm.atlas</groupId>
    <artifactId>stub-engine</artifactId>
    <version>0.0.1</version>
</dependency>
```

# troubleshooting

if you ever encounter any problem **related to this project**, you can [open an issue][new-issue] describing what the
problem is. please, be as precise as you can, so that we can help you asap. we are most likely to close the issue if it
is not related to our work.

# contributing

you can contribute by [forking the repository][fork], making your changes and [creating a new pull request][new-pr]
describing what you changed, why and how.

# licensing

this project is under the [ISC license][project-license].


<!-- Links -->

[jvm]: https://adoptium.net "adoptium website"

[kotlin]: https://kotlinlang.org "kotlin website"

[rust]: https://rust-lang.org "rust website"

[mvnc]: https://repo1.maven.org/maven2/ "maven central website"

<!-- Project Links -->

[project-url]: https://github.com/atlas-fw/stub-engine "project github repository"

[fork]: https://github.com/atlas-fw/stub-engine/fork "fork this repository"

[new-pr]: https://github.com/atlas-fw/stub-engine/pulls/new "create a new pull request"

[new-issue]: https://github.com/atlas-fw/stub-engine/issues/new "create a new issue"

[project-mvnc]: https://maven-badges.herokuapp.com/maven-central/me.xtrm.atlas/stub-engine "maven central repository"

[project-gradle-ci]: https://github.com/atlas-fw/stub-engine/actions/workflows/gradle-ci.yml "gradle ci workflow"

[project-license]: https://github.com/atlas-fw/stub-engine/blob/trunk/LICENSE "LICENSE source file"

[atlas-gradle]: https://github.com/atlas-fw/atlas-gradle "atlas-gradle github repo"

<!-- Badges -->

[badge-mvnc]: https://maven-badges.herokuapp.com/maven-central/me.xtrm.atlas/stub-engine/badge.svg "maven central badge"

[badge-github-ci]: https://github.com/atlas-fw/stub-engine/actions/workflows/build.yml/badge.svg?branch=trunk "github actions badge"
