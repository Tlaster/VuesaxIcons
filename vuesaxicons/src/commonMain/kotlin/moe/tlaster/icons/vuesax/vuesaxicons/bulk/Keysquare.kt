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

public val BulkGroup.Keysquare: ImageVector
    get() {
        if (_keysquare != null) {
            return _keysquare!!
        }
        _keysquare = Builder(name = "Keysquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.8897f, 8.1101f)
                curveTo(14.4097f, 6.6401f, 12.0097f, 6.6401f, 10.5397f, 8.1101f)
                curveTo(9.5097f, 9.1301f, 9.1997f, 10.6101f, 9.5997f, 11.9101f)
                lineTo(7.2497f, 14.2601f)
                curveTo(7.0897f, 14.4301f, 6.9697f, 14.7601f, 7.0097f, 15.0001f)
                lineTo(7.1597f, 16.0901f)
                curveTo(7.2097f, 16.4501f, 7.5497f, 16.7901f, 7.9097f, 16.8401f)
                lineTo(8.9997f, 17.0001f)
                curveTo(9.2397f, 17.0301f, 9.5697f, 16.9301f, 9.7397f, 16.7501f)
                lineTo(10.1497f, 16.3401f)
                curveTo(10.2497f, 16.2501f, 10.2497f, 16.0901f, 10.1497f, 15.9901f)
                lineTo(9.1797f, 15.0201f)
                curveTo(9.0397f, 14.8801f, 9.0397f, 14.6401f, 9.1797f, 14.4901f)
                curveTo(9.3197f, 14.3501f, 9.5597f, 14.3501f, 9.7097f, 14.4901f)
                lineTo(10.6797f, 15.4601f)
                curveTo(10.7697f, 15.5501f, 10.9297f, 15.5501f, 11.0297f, 15.4601f)
                lineTo(12.0897f, 14.4101f)
                curveTo(13.3797f, 14.8101f, 14.8597f, 14.5001f, 15.8897f, 13.4801f)
                curveTo(17.3697f, 11.9901f, 17.3697f, 9.5901f, 15.8897f, 8.1101f)
                close()
                moveTo(13.2497f, 12.0001f)
                curveTo(12.5597f, 12.0001f, 11.9997f, 11.4401f, 11.9997f, 10.7501f)
                curveTo(11.9997f, 10.0601f, 12.5597f, 9.5001f, 13.2497f, 9.5001f)
                curveTo(13.9397f, 9.5001f, 14.4997f, 10.0601f, 14.4997f, 10.7501f)
                curveTo(14.4997f, 11.4401f, 13.9397f, 12.0001f, 13.2497f, 12.0001f)
                close()
            }
        }
        .build()
        return _keysquare!!
    }

private var _keysquare: ImageVector? = null
