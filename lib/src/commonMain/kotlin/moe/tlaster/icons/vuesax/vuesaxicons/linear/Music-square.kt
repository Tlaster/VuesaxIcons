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

public val LinearGroup.`Music-square`: ImageVector
    get() {
        if (`_music-square` != null) {
            return `_music-square`!!
        }
        `_music-square` = Builder(name = "Music-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.42f, 17.11f)
                curveTo(9.2871f, 17.11f, 9.99f, 16.4071f, 9.99f, 15.54f)
                curveTo(9.99f, 14.6729f, 9.2871f, 13.97f, 8.42f, 13.97f)
                curveTo(7.5529f, 13.97f, 6.85f, 14.6729f, 6.85f, 15.54f)
                curveTo(6.85f, 16.4071f, 7.5529f, 17.11f, 8.42f, 17.11f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 14.49f)
                verticalLineTo(8.35f)
                curveTo(15.75f, 7.04f, 14.93f, 6.86f, 14.1f, 7.09f)
                lineTo(10.96f, 7.95f)
                curveTo(10.39f, 8.11f, 10.0f, 8.56f, 10.0f, 9.21f)
                verticalLineTo(10.31f)
                verticalLineTo(11.05f)
                verticalLineTo(15.55f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.18f, 16.0599f)
                curveTo(15.0471f, 16.0599f, 15.75f, 15.357f, 15.75f, 14.4899f)
                curveTo(15.75f, 13.6228f, 15.0471f, 12.9199f, 14.18f, 12.9199f)
                curveTo(13.3129f, 12.9199f, 12.61f, 13.6228f, 12.61f, 14.4899f)
                curveTo(12.61f, 15.357f, 13.3129f, 16.0599f, 14.18f, 16.0599f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.99f, 11.04f)
                lineTo(15.75f, 9.47f)
            }
        }
        .build()
        return `_music-square`!!
    }

private var `_music-square`: ImageVector? = null
