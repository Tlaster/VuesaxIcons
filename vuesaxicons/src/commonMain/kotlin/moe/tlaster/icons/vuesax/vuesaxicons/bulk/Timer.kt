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

public val BulkGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3495f, 19.68f)
                curveTo(17.7995f, 21.09f, 16.4595f, 22.0f, 14.9495f, 22.0f)
                horizontalLineTo(9.0495f)
                curveTo(7.5295f, 22.0f, 6.1995f, 21.09f, 5.6495f, 19.68f)
                curveTo(5.0995f, 18.26f, 5.4795f, 16.69f, 6.5995f, 15.67f)
                lineTo(10.6495f, 12.0f)
                horizontalLineTo(13.3595f)
                lineTo(17.3995f, 15.67f)
                curveTo(18.5195f, 16.69f, 18.8895f, 18.26f, 18.3495f, 19.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.82f, 18.14f)
                horizontalLineTo(10.18f)
                curveTo(9.8f, 18.14f, 9.5f, 17.83f, 9.5f, 17.46f)
                curveTo(9.5f, 17.08f, 9.81f, 16.78f, 10.18f, 16.78f)
                horizontalLineTo(13.82f)
                curveTo(14.2f, 16.78f, 14.5f, 17.09f, 14.5f, 17.46f)
                curveTo(14.5f, 17.83f, 14.19f, 18.14f, 13.82f, 18.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3506f, 4.32f)
                curveTo(17.8006f, 2.91f, 16.4606f, 2.0f, 14.9506f, 2.0f)
                horizontalLineTo(9.0506f)
                curveTo(7.5406f, 2.0f, 6.2007f, 2.91f, 5.6507f, 4.32f)
                curveTo(5.1107f, 5.74f, 5.4806f, 7.31f, 6.6107f, 8.33f)
                lineTo(10.6506f, 12.0f)
                horizontalLineTo(13.3606f)
                lineTo(17.4006f, 8.33f)
                curveTo(18.5206f, 7.31f, 18.8906f, 5.74f, 18.3506f, 4.32f)
                close()
                moveTo(13.8206f, 7.23f)
                horizontalLineTo(10.1806f)
                curveTo(9.8006f, 7.23f, 9.5007f, 6.92f, 9.5007f, 6.55f)
                curveTo(9.5007f, 6.18f, 9.8106f, 5.87f, 10.1806f, 5.87f)
                horizontalLineTo(13.8206f)
                curveTo(14.2006f, 5.87f, 14.5006f, 6.18f, 14.5006f, 6.55f)
                curveTo(14.5006f, 6.92f, 14.1906f, 7.23f, 13.8206f, 7.23f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
