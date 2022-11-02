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

public val BulkGroup.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.81f, 2.0f)
                horizontalLineTo(16.18f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(22.0f, 19.82f, 19.83f, 21.99f, 16.19f, 21.99f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22.0f, 2.0f, 19.83f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9195f, 8.9801f)
                horizontalLineTo(8.7695f)
                lineTo(9.0995f, 8.6501f)
                curveTo(9.3895f, 8.3601f, 9.3895f, 7.8801f, 9.0995f, 7.5901f)
                curveTo(8.8095f, 7.3001f, 8.3294f, 7.3001f, 8.0394f, 7.5901f)
                lineTo(6.4694f, 9.1601f)
                curveTo(6.1795f, 9.4501f, 6.1795f, 9.9301f, 6.4694f, 10.2201f)
                lineTo(8.0394f, 11.7901f)
                curveTo(8.1895f, 11.9401f, 8.3794f, 12.0101f, 8.5695f, 12.0101f)
                curveTo(8.7594f, 12.0101f, 8.9494f, 11.9401f, 9.0995f, 11.7901f)
                curveTo(9.3895f, 11.5001f, 9.3895f, 11.0201f, 9.0995f, 10.7301f)
                lineTo(8.8394f, 10.4701f)
                horizontalLineTo(13.9195f)
                curveTo(15.1995f, 10.4701f, 16.2495f, 11.5101f, 16.2495f, 12.8001f)
                curveTo(16.2495f, 14.0901f, 15.2095f, 15.1301f, 13.9195f, 15.1301f)
                horizontalLineTo(8.9994f)
                curveTo(8.5894f, 15.1301f, 8.2494f, 15.4701f, 8.2494f, 15.8801f)
                curveTo(8.2494f, 16.2901f, 8.5894f, 16.6301f, 8.9994f, 16.6301f)
                horizontalLineTo(13.9195f)
                curveTo(16.0295f, 16.6301f, 17.7495f, 14.9101f, 17.7495f, 12.8001f)
                curveTo(17.7495f, 10.6901f, 16.0295f, 8.9801f, 13.9195f, 8.9801f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
