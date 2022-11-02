package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 8.3398f)
                verticalLineTo(15.6598f)
                curveTo(2.0f, 17.1598f, 3.63f, 18.0998f, 4.93f, 17.3498f)
                lineTo(8.1f, 15.5198f)
                lineTo(11.27f, 13.6898f)
                lineTo(11.76f, 13.4098f)
                verticalLineTo(10.5898f)
                lineTo(11.27f, 10.3098f)
                lineTo(8.1f, 8.4798f)
                lineTo(4.93f, 6.6498f)
                curveTo(3.63f, 5.8998f, 2.0f, 6.8398f, 2.0f, 8.3398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7598f, 8.3398f)
                verticalLineTo(15.6598f)
                curveTo(11.7598f, 17.1598f, 13.3897f, 18.0998f, 14.6797f, 17.3498f)
                lineTo(17.8597f, 15.5198f)
                lineTo(21.0298f, 13.6898f)
                curveTo(22.3198f, 12.9398f, 22.3198f, 11.0598f, 21.0298f, 10.3098f)
                lineTo(17.8597f, 8.4798f)
                lineTo(14.6797f, 6.6498f)
                curveTo(13.3897f, 5.8998f, 11.7598f, 6.8398f, 11.7598f, 8.3398f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
