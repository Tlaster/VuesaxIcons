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

public val LinearGroup.`Video-slash`: ImageVector
    get() {
        if (`_video-slash` != null) {
            return `_video-slash`!!
        }
        `_video-slash` = Builder(name = "Video-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.63f, 7.5801f)
                curveTo(16.63f, 7.5801f, 16.66f, 6.6301f, 16.63f, 6.3201f)
                curveTo(16.46f, 4.2801f, 15.13f, 3.5801f, 12.52f, 3.5801f)
                horizontalLineTo(6.21f)
                curveTo(3.05f, 3.5801f, 2.0f, 4.6301f, 2.0f, 7.7901f)
                verticalLineTo(16.2101f)
                curveTo(2.0f, 17.4701f, 2.38f, 18.7401f, 3.37f, 19.5501f)
                lineTo(4.0f, 20.0001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.74f, 10.95f)
                verticalLineTo(16.21f)
                curveTo(16.74f, 19.37f, 15.69f, 20.42f, 12.53f, 20.42f)
                horizontalLineTo(7.26f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 6.74f)
                verticalLineTo(15.81f)
                curveTo(22.0f, 17.48f, 20.88f, 18.06f, 19.52f, 17.1f)
                lineTo(16.74f, 15.15f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.02f, 2.1899f)
                lineTo(2.02f, 22.1899f)
            }
        }
        .build()
        return `_video-slash`!!
    }

private var `_video-slash`: ImageVector? = null
