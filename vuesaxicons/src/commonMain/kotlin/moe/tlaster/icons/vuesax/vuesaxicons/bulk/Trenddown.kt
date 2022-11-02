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

public val BulkGroup.Trenddown: ImageVector
    get() {
        if (_trenddown != null) {
            return _trenddown!!
        }
        _trenddown = Builder(name = "Trenddown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8797f, 12.47f)
                curveTo(16.8797f, 12.08f, 16.5697f, 11.77f, 16.1797f, 11.77f)
                curveTo(15.7897f, 11.77f, 15.4797f, 12.08f, 15.4797f, 12.47f)
                verticalLineTo(12.65f)
                lineTo(12.7597f, 9.93f)
                curveTo(12.6097f, 9.78f, 12.4097f, 9.71f, 12.1997f, 9.73f)
                curveTo(11.9897f, 9.75f, 11.7997f, 9.86f, 11.6897f, 10.04f)
                lineTo(10.6697f, 11.56f)
                lineTo(8.3097f, 9.18f)
                curveTo(8.0397f, 8.91f, 7.5997f, 8.91f, 7.3197f, 9.18f)
                curveTo(7.0497f, 9.45f, 7.0497f, 9.89f, 7.3197f, 10.17f)
                lineTo(10.2997f, 13.15f)
                curveTo(10.4497f, 13.3f, 10.6497f, 13.37f, 10.8597f, 13.35f)
                curveTo(11.0697f, 13.33f, 11.2597f, 13.22f, 11.3697f, 13.04f)
                lineTo(12.3897f, 11.52f)
                lineTo(14.4997f, 13.63f)
                horizontalLineTo(14.3197f)
                curveTo(13.9297f, 13.63f, 13.6197f, 13.94f, 13.6197f, 14.33f)
                curveTo(13.6197f, 14.72f, 13.9297f, 15.03f, 14.3197f, 15.03f)
                horizontalLineTo(16.1797f)
                curveTo(16.2697f, 15.03f, 16.3597f, 15.01f, 16.4497f, 14.98f)
                curveTo(16.6197f, 14.91f, 16.7597f, 14.77f, 16.8297f, 14.6f)
                curveTo(16.8697f, 14.51f, 16.8797f, 14.42f, 16.8797f, 14.33f)
                verticalLineTo(12.47f)
                close()
            }
        }
        .build()
        return _trenddown!!
    }

private var _trenddown: ImageVector? = null
