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

public val BulkGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(name = "Monitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 6.41f)
                verticalLineTo(12.91f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.41f)
                curveTo(2.0f, 3.98f, 3.98f, 2.0f, 6.41f, 2.0f)
                horizontalLineTo(17.56f)
                curveTo(19.99f, 2.0f, 21.97f, 3.98f, 21.97f, 6.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.9199f)
                verticalLineTo(13.1199f)
                curveTo(2.0f, 15.5599f, 3.98f, 17.5299f, 6.41f, 17.5299f)
                horizontalLineTo(10.25f)
                curveTo(10.8f, 17.5299f, 11.25f, 17.9799f, 11.25f, 18.5299f)
                verticalLineTo(19.4999f)
                curveTo(11.25f, 20.0499f, 10.8f, 20.4999f, 10.25f, 20.4999f)
                horizontalLineTo(7.83f)
                curveTo(7.42f, 20.4999f, 7.08f, 20.8399f, 7.08f, 21.2499f)
                curveTo(7.08f, 21.6599f, 7.41f, 21.9999f, 7.83f, 21.9999f)
                horizontalLineTo(16.18f)
                curveTo(16.59f, 21.9999f, 16.93f, 21.6599f, 16.93f, 21.2499f)
                curveTo(16.93f, 20.8399f, 16.59f, 20.4999f, 16.18f, 20.4999f)
                horizontalLineTo(13.76f)
                curveTo(13.21f, 20.4999f, 12.76f, 20.0499f, 12.76f, 19.4999f)
                verticalLineTo(18.5299f)
                curveTo(12.76f, 17.9799f, 13.21f, 17.5299f, 13.76f, 17.5299f)
                horizontalLineTo(17.57f)
                curveTo(20.01f, 17.5299f, 21.98f, 15.5499f, 21.98f, 13.1199f)
                verticalLineTo(12.9199f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
