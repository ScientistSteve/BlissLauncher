sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Versions : Screen("versions")
    object Mods : Screen("mods")
    object Settings : Screen("settings")
    object Profile : Screen("profile")
    object VersionDetail : Screen("version_detail")
    object ModDetail : Screen("mod_detail")
}
