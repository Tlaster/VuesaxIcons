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

public val BulkGroup.Arrowsquareright: ImageVector
    get() {
        if (_arrowsquareright != null) {
            return _arrowsquareright!!
        }
        _arrowsquareright = Builder(name = "Arrowsquareright", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.7397f, 16.2802f)
                curveTo(10.5497f, 16.2802f, 10.3597f, 16.2102f, 10.2097f, 16.0602f)
                curveTo(9.9197f, 15.7702f, 9.9197f, 15.2902f, 10.2097f, 15.0002f)
                lineTo(13.2097f, 12.0002f)
                lineTo(10.2097f, 9.0002f)
                curveTo(9.9197f, 8.7102f, 9.9197f, 8.2302f, 10.2097f, 7.9402f)
                curveTo(10.4997f, 7.6502f, 10.9797f, 7.6502f, 11.2697f, 7.9402f)
                lineTo(14.7997f, 11.4702f)
                curveTo(15.0897f, 11.7602f, 15.0897f, 12.2402f, 14.7997f, 12.5302f)
                lineTo(11.2697f, 16.0602f)
                curveTo(11.1197f, 16.2102f, 10.9297f, 16.2802f, 10.7397f, 16.2802f)
                close()
            }
        }
        .build()
        return _arrowsquareright!!
    }

private var _arrowsquareright: ImageVector? = null
