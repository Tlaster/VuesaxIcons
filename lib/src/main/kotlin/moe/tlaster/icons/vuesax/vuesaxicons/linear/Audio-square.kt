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

public val LinearGroup.`Audio-square`: ImageVector
    get() {
        if (`_audio-square` != null) {
            return `_audio-square`!!
        }
        `_audio-square` = Builder(name = "Audio-square", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.62f, 17.3f)
                curveTo(10.7908f, 17.3f, 11.74f, 16.3509f, 11.74f, 15.1801f)
                curveTo(11.74f, 14.0092f, 10.7908f, 13.0601f, 9.62f, 13.0601f)
                curveTo(8.4492f, 13.0601f, 7.5f, 14.0092f, 7.5f, 15.1801f)
                curveTo(7.5f, 16.3509f, 8.4492f, 17.3f, 9.62f, 17.3f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.74f, 15.18f)
                verticalLineTo(7.77f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.13f, 6.7701f)
                lineTo(15.47f, 7.5501f)
                curveTo(16.04f, 7.7401f, 16.5f, 8.3801f, 16.5f, 8.9801f)
                verticalLineTo(9.6f)
                curveTo(16.5f, 10.4101f, 15.87f, 10.8601f, 15.11f, 10.6001f)
                lineTo(12.77f, 9.8201f)
                curveTo(12.2f, 9.6301f, 11.74f, 8.9901f, 11.74f, 8.3901f)
                verticalLineTo(7.7701f)
                curveTo(11.74f, 6.9701f, 12.36f, 6.5101f, 13.13f, 6.7701f)
                close()
            }
        }
        .build()
        return `_audio-square`!!
    }

private var `_audio-square`: ImageVector? = null
