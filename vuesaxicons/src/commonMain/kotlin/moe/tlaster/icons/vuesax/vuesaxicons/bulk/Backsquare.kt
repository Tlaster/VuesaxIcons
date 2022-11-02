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

public val BulkGroup.Backsquare: ImageVector
    get() {
        if (_backsquare != null) {
            return _backsquare!!
        }
        _backsquare = Builder(name = "Backsquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.82f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.82f, 4.17f, 21.99f, 7.81f, 21.99f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 21.99f, 21.99f, 19.82f, 21.99f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9195f, 8.4801f)
                horizontalLineTo(8.7695f)
                lineTo(9.0995f, 8.1501f)
                curveTo(9.3895f, 7.8601f, 9.3895f, 7.3801f, 9.0995f, 7.0901f)
                curveTo(8.8095f, 6.8001f, 8.3294f, 6.8001f, 8.0394f, 7.0901f)
                lineTo(6.4694f, 8.6601f)
                curveTo(6.1795f, 8.9501f, 6.1795f, 9.4301f, 6.4694f, 9.7201f)
                lineTo(8.0394f, 11.2901f)
                curveTo(8.1895f, 11.4401f, 8.3794f, 11.5101f, 8.5695f, 11.5101f)
                curveTo(8.7594f, 11.5101f, 8.9494f, 11.4401f, 9.0995f, 11.2901f)
                curveTo(9.3895f, 11.0001f, 9.3895f, 10.5201f, 9.0995f, 10.2301f)
                lineTo(8.8394f, 9.9701f)
                horizontalLineTo(13.9195f)
                curveTo(15.1995f, 9.9701f, 16.2495f, 11.0101f, 16.2495f, 12.3001f)
                curveTo(16.2495f, 13.5901f, 15.2094f, 14.6301f, 13.9195f, 14.6301f)
                horizontalLineTo(8.9994f)
                curveTo(8.5894f, 14.6301f, 8.2494f, 14.9701f, 8.2494f, 15.3801f)
                curveTo(8.2494f, 15.7901f, 8.5894f, 16.1301f, 8.9994f, 16.1301f)
                horizontalLineTo(13.9195f)
                curveTo(16.0295f, 16.1301f, 17.7495f, 14.4101f, 17.7495f, 12.3001f)
                curveTo(17.7495f, 10.1901f, 16.0295f, 8.4801f, 13.9195f, 8.4801f)
                close()
            }
        }
        .build()
        return _backsquare!!
    }

private var _backsquare: ImageVector? = null
