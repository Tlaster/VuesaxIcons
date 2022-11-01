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

public val LinearGroup.`Key-square`: ImageVector
    get() {
        if (`_key-square` != null) {
            return `_key-square`!!
        }
        `_key-square` = Builder(name = "Key-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.28f, 13.61f)
                curveTo(15.15f, 14.74f, 13.53f, 15.09f, 12.1f, 14.64f)
                lineTo(9.51f, 17.22f)
                curveTo(9.33f, 17.41f, 8.96f, 17.53f, 8.69f, 17.49f)
                lineTo(7.49f, 17.33f)
                curveTo(7.09f, 17.28f, 6.73f, 16.9f, 6.67f, 16.51f)
                lineTo(6.51f, 15.31f)
                curveTo(6.47f, 15.05f, 6.6f, 14.68f, 6.78f, 14.49f)
                lineTo(9.36f, 11.91f)
                curveTo(8.92f, 10.48f, 9.26f, 8.86f, 10.39f, 7.73f)
                curveTo(12.01f, 6.11f, 14.65f, 6.11f, 16.28f, 7.73f)
                curveTo(17.9f, 9.34f, 17.9f, 11.98f, 16.28f, 13.61f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.45f, 16.28f)
                lineTo(9.6f, 15.42f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.3945f, 10.7f)
                horizontalLineTo(13.4035f)
            }
        }
        .build()
        return `_key-square`!!
    }

private var `_key-square`: ImageVector? = null
