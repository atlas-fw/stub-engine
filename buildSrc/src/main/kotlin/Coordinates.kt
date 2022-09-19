object Coordinates {
    const val NAME = "stub-generator"
    const val DESC = "Generator library utilized for atlas-gradle's stub classes creation."
    const val VENDOR = "xtrm"

    const val GIT_HOST = "github.com"
    const val REPO_ID = "atlas-fw/$NAME"

    const val GROUP = "me.xtrm.atlas"
    const val VERSION = "0.0.1"
}

object Pom {
    val licenses = arrayOf(
        License("ISC License", "https://opensource.org/licenses/ISC")
    )
    val developers = arrayOf(
        Developer("xtrm")
    )
}

data class License(val name: String, val url: String, val distribution: String = "repo")
data class Developer(val id: String, val name: String = id)
