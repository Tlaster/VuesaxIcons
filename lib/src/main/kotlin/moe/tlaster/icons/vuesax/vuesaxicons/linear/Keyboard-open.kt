package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Keyboard-open`: ImageVector
    get() {
        if (`_keyboard-open` != null) {
            return `_keyboard-open`!!
        }
        `_keyboard-open` = Builder(name = "Keyboard-open", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.26f, 2.0f)
                horizontalLineTo(16.73f)
                curveTo(17.38f, 2.0f, 17.96f, 2.02f, 18.48f, 2.09f)
                curveTo(21.25f, 2.4f, 22.0f, 3.7f, 22.0f, 7.26f)
                verticalLineTo(13.58f)
                curveTo(22.0f, 17.14f, 21.25f, 18.44f, 18.48f, 18.75f)
                curveTo(17.96f, 18.82f, 17.39f, 18.84f, 16.73f, 18.84f)
                horizontalLineTo(7.26f)
                curveTo(6.61f, 18.84f, 6.03f, 18.82f, 5.51f, 18.75f)
                curveTo(2.74f, 18.44f, 1.99f, 17.14f, 1.99f, 13.58f)
                verticalLineTo(7.26f)
                curveTo(1.99f, 3.7f, 2.74f, 2.4f, 5.51f, 2.09f)
                curveTo(6.03f, 2.02f, 6.61f, 2.0f, 7.26f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.58f, 8.3201f)
                horizontalLineTo(17.2599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.74f, 14.11f)
                horizontalLineTo(6.76f)
                horizontalLineTo(17.27f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1947f, 8.3f)
                horizontalLineTo(7.2037f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4945f, 8.3f)
                horizontalLineTo(10.5035f)
            }
        }
        .build()
        return `_keyboard-open`!!
    }

private var `_keyboard-open`: ImageVector? = null
