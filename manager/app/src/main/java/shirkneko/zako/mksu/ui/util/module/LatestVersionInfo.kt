package shirkneko.zako.mksu.ui.util.module

data class LatestVersionInfo(
    val versionCode : Int = 0,
    val downloadUrl : String = "",
    val changelog : String = "",
    val versionName: String = ""
)
