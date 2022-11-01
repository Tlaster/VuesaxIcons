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

public val LinearGroup.`Play-circle`: ImageVector
    get() {
        if (`_play-circle` != null) {
            return `_play-circle`!!
        }
        `_play-circle` = Builder(name = "Play-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.97f, 22.0f)
                curveTo(17.4928f, 22.0f, 21.97f, 17.5228f, 21.97f, 12.0f)
                curveTo(21.97f, 6.4771f, 17.4928f, 2.0f, 11.97f, 2.0f)
                curveTo(6.4471f, 2.0f, 1.97f, 6.4771f, 1.97f, 12.0f)
                curveTo(1.97f, 17.5228f, 6.4471f, 22.0f, 11.97f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.74f, 12.2299f)
                verticalLineTo(10.5599f)
                curveTo(8.74f, 8.4799f, 10.21f, 7.6299f, 12.01f, 8.6699f)
                lineTo(13.46f, 9.5099f)
                lineTo(14.91f, 10.3499f)
                curveTo(16.71f, 11.3899f, 16.71f, 13.0899f, 14.91f, 14.1299f)
                lineTo(13.46f, 14.9699f)
                lineTo(12.01f, 15.8099f)
                curveTo(10.21f, 16.8499f, 8.74f, 15.9999f, 8.74f, 13.9199f)
                verticalLineTo(12.2299f)
                close()
            }
        }
        .build()
        return `_play-circle`!!
    }

private var `_play-circle`: ImageVector? = null
