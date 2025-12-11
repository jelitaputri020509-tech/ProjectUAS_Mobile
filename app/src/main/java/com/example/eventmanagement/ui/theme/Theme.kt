package com.example.eventmanagement.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// ═══════════════════════════════════════════
// 🌙 DARK COLOR SCHEME (Optional, tidak dipakai)
// ═══════════════════════════════════════════
private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Color(0xFF1C1B1F),
    surface = Color(0xFF2B2930),
    onPrimary = Color(0xFF3C1B5F),
    onSecondary = Color(0xFF332D41),
    onTertiary = Color(0xFF4A2532),
    onBackground = Color(0xFFE6E1E5),
    onSurface = Color(0xFFE6E1E5)
)

// ═══════════════════════════════════════════
// ☀️ LIGHT COLOR SCHEME (Aesthetic Purple-Pink)
// ═══════════════════════════════════════════
private val LightColorScheme = lightColorScheme(
    // Primary colors (Purple)
    primary = PrimaryPurple,                    // 0xFF7C4DFF - Main purple
    onPrimary = TextOnPurple,                   // White text on purple
    primaryContainer = PrimaryPurpleLight,       // Light purple untuk container
    onPrimaryContainer = PrimaryPurpleDark,      // Dark purple text on light container

    // Secondary colors (Pink)
    secondary = PrimaryPink,                     // 0xFFFF4081 - Main pink
    onSecondary = TextOnPink,                    // White text on pink
    secondaryContainer = PrimaryPinkLight,       // Light pink untuk container
    onSecondaryContainer = PrimaryPinkDark,      // Dark pink text on light container

    // Tertiary colors (Teal untuk variasi)
    tertiary = StatusCompleted,                  // 0xFF00BFA5 - Teal
    onTertiary = Color.White,
    tertiaryContainer = StatusCompletedBg,
    onTertiaryContainer = StatusCompleted,

    // Background colors
    background = BackgroundPrimary,              // 0xFFFAF7FD - Soft purple tint
    onBackground = TextPrimary,                  // 0xFF1A1A1A - Dark text

    // Surface colors (untuk cards, dialogs, dll)
    surface = SurfaceColor,                      // 0xFFFFFFFF - Pure white
    onSurface = TextPrimary,                     // Dark text on white
    surfaceVariant = SurfaceVariant,             // 0xFFFFF8FD - Soft tint
    onSurfaceVariant = TextSecondary,            // Grey text

    // Outline colors (untuk borders)
    outline = BorderLight,                       // 0xFFEEEEEE
    outlineVariant = DividerLight,               // 0xFFE0E0E0

    // Error colors
    error = ErrorRed,                            // 0xFFFF5252
    onError = Color.White,
    errorContainer = ErrorBg,                    // 0xFFFFEBEE
    onErrorContainer = ErrorRed,

    // Additional colors
    inverseSurface = Color(0xFF313033),
    inverseOnSurface = Color(0xFFF4EFF4),
    inversePrimary = Purple80,

    // Scrim untuk overlays
    scrim = OverlayDark                          // 0x66000000
)

// ═══════════════════════════════════════════
// 🎨 MAIN THEME COMPOSABLE
// ═══════════════════════════════════════════
@Composable
fun EventManagementTheme(
    darkTheme: Boolean = false,  // PAKSA LIGHT THEME (false = selalu light)
    content: @Composable () -> Unit
) {
    // SELALU GUNAKAN LIGHT THEME
    val colorScheme = LightColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window

            // Set status bar color ke primary purple
            window.statusBarColor = PrimaryPurple.toArgb()

            // Set navigation bar color (optional, sesuaikan dengan design)
            window.navigationBarColor = BackgroundPrimary.toArgb()

            val windowInsetsController = WindowCompat.getInsetsController(window, view)

            // Status bar icons: false = white icons (karena bg purple gelap)
            windowInsetsController.isAppearanceLightStatusBars = false

            // Navigation bar icons: true = dark icons (karena bg terang)
            windowInsetsController.isAppearanceLightNavigationBars = true
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}