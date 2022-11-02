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

public val BulkGroup.Clipboardtick: ImageVector
    get() {
        if (_clipboardtick != null) {
            return _clipboardtick!!
        }
        _clipboardtick = Builder(name = "Clipboardtick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2391f, 3.6499f)
                horizontalLineTo(7.7591f)
                curveTo(5.2891f, 3.6499f, 3.2891f, 5.6599f, 3.2891f, 8.1199f)
                verticalLineTo(17.5299f)
                curveTo(3.2891f, 19.9899f, 5.2991f, 21.9999f, 7.7591f, 21.9999f)
                horizontalLineTo(16.2291f)
                curveTo(18.6991f, 21.9999f, 20.6991f, 19.9899f, 20.6991f, 17.5299f)
                verticalLineTo(8.1199f)
                curveTo(20.7091f, 5.6499f, 18.6991f, 3.6499f, 16.2391f, 3.6499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3498f, 2.0f)
                horizontalLineTo(9.6498f)
                curveTo(8.6098f, 2.0f, 7.7598f, 2.84f, 7.7598f, 3.88f)
                verticalLineTo(4.82f)
                curveTo(7.7598f, 5.86f, 8.5998f, 6.7f, 9.6398f, 6.7f)
                horizontalLineTo(14.3498f)
                curveTo(15.3898f, 6.7f, 16.2298f, 5.86f, 16.2298f, 4.82f)
                verticalLineTo(3.88f)
                curveTo(16.2398f, 2.84f, 15.3898f, 2.0f, 14.3498f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.81f, 16.9501f)
                curveTo(10.62f, 16.9501f, 10.43f, 16.8801f, 10.28f, 16.7301f)
                lineTo(8.78f, 15.2301f)
                curveTo(8.49f, 14.9401f, 8.49f, 14.4601f, 8.78f, 14.1701f)
                curveTo(9.07f, 13.8801f, 9.55f, 13.8801f, 9.84f, 14.1701f)
                lineTo(10.81f, 15.1401f)
                lineTo(14.28f, 11.6701f)
                curveTo(14.57f, 11.3801f, 15.05f, 11.3801f, 15.34f, 11.6701f)
                curveTo(15.63f, 11.9601f, 15.63f, 12.4401f, 15.34f, 12.7301f)
                lineTo(11.34f, 16.7301f)
                curveTo(11.2f, 16.8801f, 11.0f, 16.9501f, 10.81f, 16.9501f)
                close()
            }
        }
        .build()
        return _clipboardtick!!
    }

private var _clipboardtick: ImageVector? = null
