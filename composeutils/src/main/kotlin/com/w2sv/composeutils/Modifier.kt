package com.w2sv.composeutils

import androidx.compose.ui.Modifier

/**
 * Taken from https://github.com/ZacSweers/CatchUp/blob/382ff4114383c60ad3769ccb0aac6256b0e2b274/libraries/base-ui/src/main/kotlin/catchup/base/ui/Modifiers.kt#L7.
 */
inline fun Modifier.thenIf(
    condition: Boolean,
    onFalse: Modifier.() -> Modifier = { this },
    onTrue: Modifier.() -> Modifier = { this },
): Modifier =
    if (condition) {
        onTrue()
    } else {
        onFalse()
    }

inline fun Modifier.thenIf(
    condition: Boolean,
    onTrue: Modifier.() -> Modifier,
): Modifier =
    thenIf(condition = condition, onFalse = { this }, onTrue = onTrue)