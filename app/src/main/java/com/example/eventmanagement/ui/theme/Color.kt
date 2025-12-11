package com.example.eventmanagement.ui.theme

import androidx.compose.ui.graphics.Color

// ============================================
// 🌸✨ TEMA AESTHETIC - Harmonious Purple & Pink
// Warna-warna yang sudah diatur agar tidak tabrakan
// Dengan kontras yang tepat dan kombinasi yang eye-pleasing
// ============================================

// ═══════════════════════════════════════════
// 🎨 PRIMARY COLORS (Warna Utama)
// ═══════════════════════════════════════════
val PrimaryPurple = Color(0xFF7C4DFF)       // Soft Vivid Purple - untuk header & primary buttons
val PrimaryPurpleDark = Color(0xFF651FFF)   // Deep Purple - untuk pressed state
val PrimaryPurpleLight = Color(0xFFB388FF)  // Light Purple - untuk hover/disabled state

val PrimaryPink = Color(0xFFFF4081)         // Vibrant Pink - untuk accent & FAB
val PrimaryPinkDark = Color(0xFFF50057)     // Deep Pink - untuk pressed state
val PrimaryPinkLight = Color(0xFFFF80AB)    // Light Pink - untuk hover/disabled state

// ═══════════════════════════════════════════
// 🌈 BACKGROUND COLORS (Latar Belakang)
// ═══════════════════════════════════════════
val BackgroundPrimary = Color(0xFFFAF7FD)   // Very soft purple tint - background utama
val BackgroundSecondary = Color(0xFFF3E5F5) // Lavender mist - untuk sections
val SurfaceColor = Color(0xFFFFFFFF)        // Pure white - untuk cards
val SurfaceVariant = Color(0xFFFFF8FD)      // Soft pink-purple tint - untuk elevated cards

// ═══════════════════════════════════════════
// 📊 STATUS COLORS (Untuk Event Status)
// Setiap status punya warna yang distinct & harmonis
// ═══════════════════════════════════════════
val StatusUpcoming = Color(0xFF7C4DFF)      // Purple - untuk event yang akan datang
val StatusUpcomingBg = Color(0xFFEDE7F6)    // Purple ultra light background

val StatusOngoing = Color(0xFFFF4081)       // Pink - untuk event berlangsung
val StatusOngoingBg = Color(0xFFFCE4EC)     // Pink ultra light background

val StatusCompleted = Color(0xFF00BFA5)     // Teal - untuk event selesai (beda dari purple-pink)
val StatusCompletedBg = Color(0xFFE0F2F1)   // Teal ultra light background

val StatusCancelled = Color(0xFFB0BEC5)     // Cool Grey - untuk event dibatalkan
val StatusCancelledBg = Color(0xFFECEFF1)   // Grey ultra light background

// ═══════════════════════════════════════════
// 🎯 ACTION COLORS (Untuk Buttons & Actions)
// ═══════════════════════════════════════════
val ActionCreate = Color(0xFFFF4081)        // Pink - untuk tombol "Buat"
val ActionView = Color(0xFF7C4DFF)          // Purple - untuk tombol "Lihat"
val ActionEdit = Color(0xFFFFAB00)          // Amber - untuk edit (warm contrast)
val ActionDelete = Color(0xFFFF5252)        // Red accent - untuk delete

// ═══════════════════════════════════════════
// 📈 STATISTICS COLORS (Untuk Cards Statistik)
// Gradasi yang harmonis dari purple ke pink
// ═══════════════════════════════════════════
val StatTotal = Color(0xFF7C4DFF)           // Primary Purple
val StatUpcoming = Color(0xFF9575CD)        // Medium Purple
val StatOngoing = Color(0xFFFF4081)         // Primary Pink
val StatCompleted = Color(0xFFB388FF)       // Light Purple

// Background untuk stat cards (lebih soft)
val StatTotalBg = Color(0xFFEDE7F6)
val StatUpcomingBg = Color(0xFFD1C4E9)
val StatOngoingBg = Color(0xFFFCE4EC)
val StatCompletedBg = Color(0xFFE1BEE7)

// ═══════════════════════════════════════════
// 🎨 SEMANTIC COLORS (Success, Warning, Error, Info)
// ═══════════════════════════════════════════
val SuccessGreen = Color(0xFF00C853)        // Bright Green - success feedback
val SuccessBg = Color(0xFFE8F5E9)           // Green light bg

val WarningAmber = Color(0xFFFFAB00)        // Amber - warning feedback
val WarningBg = Color(0xFFFFF8E1)           // Amber light bg

val ErrorRed = Color(0xFFFF5252)            // Red accent - error feedback
val ErrorBg = Color(0xFFFFEBEE)             // Red light bg

val InfoBlue = Color(0xFF448AFF)            // Blue accent - info (berbeda dari purple)
val InfoBg = Color(0xFFE3F2FD)              // Blue light bg

// ═══════════════════════════════════════════
// 📝 TEXT COLORS (Untuk Typography)
// ═══════════════════════════════════════════
val TextPrimary = Color(0xFF1A1A1A)         // Almost black - untuk body text
val TextSecondary = Color(0xFF666666)       // Medium grey - untuk secondary text
val TextTertiary = Color(0xFF999999)        // Light grey - untuk hints/placeholders
val TextDisabled = Color(0xFFCCCCCC)        // Very light grey - untuk disabled text

val TextOnPurple = Color(0xFFFFFFFF)        // White - text di atas purple
val TextOnPink = Color(0xFFFFFFFF)          // White - text di atas pink
val TextOnLight = Color(0xFF1A1A1A)         // Dark - text di atas background terang

// ═══════════════════════════════════════════
// 🖼️ DIVIDER & BORDER COLORS
// ═══════════════════════════════════════════
val DividerLight = Color(0xFFE0E0E0)        // Light grey divider
val DividerMedium = Color(0xFFBDBDBD)       // Medium grey divider
val BorderLight = Color(0xFFEEEEEE)         // Light border untuk cards
val BorderAccent = Color(0xFFB388FF)        // Purple light untuk focused borders

// ═══════════════════════════════════════════
// 🌟 SPECIAL EFFECTS (Untuk Shadows & Overlays)
// ═══════════════════════════════════════════
val OverlayDark = Color(0x66000000)         // Black 40% - untuk bottom sheets/modals
val OverlayLight = Color(0x33FFFFFF)        // White 20% - untuk glass effect
val ShadowColor = Color(0x1A000000)         // Black 10% - untuk elevation shadows

// ═══════════════════════════════════════════
// 🎪 GRADIENT COLORS (Untuk Decorative Elements)
// ═══════════════════════════════════════════
val GradientStart = Color(0xFF7C4DFF)       // Purple - gradient start
val GradientMiddle = Color(0xFFB388FF)      // Light Purple - gradient middle
val GradientEnd = Color(0xFFFF4081)         // Pink - gradient end

// Untuk gradient yang lebih soft
val GradientSoftStart = Color(0xFFEDE7F6)
val GradientSoftEnd = Color(0xFFFCE4EC)

// ═══════════════════════════════════════════
// 🎨 MATERIAL DESIGN DEFAULTS (Compatibility)
// ═══════════════════════════════════════════
val Purple80 = Color(0xFFEDE7F6)            // Light purple untuk dark theme
val PurpleGrey80 = Color(0xFFF3E5F5)        // Very light purple grey
val Pink80 = Color(0xFFFCE4EC)              // Light pink untuk dark theme
val Purple40 = Color(0xFF651FFF)            // Deep purple
val PurpleGrey40 = Color(0xFF4A148C)        // Very deep purple
val Pink40 = Color(0xFFF50057)              // Deep pink

// ═══════════════════════════════════════════
// 🎯 THEME SPECIFIC COLORS
// ═══════════════════════════════════════════
val PrimaryLight = PrimaryPurple            // Untuk light theme primary
val SecondaryLight = PrimaryPurpleLight     // Untuk light theme secondary
val BackgroundLight = BackgroundPrimary     // Untuk light theme background
val CardBackground = SurfaceColor           // Untuk cards