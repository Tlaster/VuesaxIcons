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

public val BulkGroup.Arrowup3: ImageVector
    get() {
        if (_arrowup3 != null) {
            return _arrowup3!!
        }
        _arrowup3 = Builder(name = "Arrowup3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3292f, 18.0f)
                horizontalLineTo(14.6692f)
                curveTo(17.9892f, 18.0f, 19.3392f, 15.65f, 17.6892f, 12.78f)
                lineTo(16.9492f, 11.5f)
                curveTo(16.7692f, 11.19f, 16.4392f, 11.0f, 16.0792f, 11.0f)
                horizontalLineTo(7.9192f)
                curveTo(7.5592f, 11.0f, 7.2292f, 11.19f, 7.0492f, 11.5f)
                lineTo(6.3092f, 12.78f)
                curveTo(4.6592f, 15.65f, 6.0092f, 18.0f, 9.3292f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7896f, 10.0001f)
                horizontalLineTo(15.2196f)
                curveTo(15.6096f, 10.0001f, 15.8496f, 9.5801f, 15.6496f, 9.2501f)
                lineTo(15.0096f, 8.1501f)
                curveTo(13.3596f, 5.2801f, 10.6396f, 5.2801f, 8.9896f, 8.1501f)
                lineTo(8.3496f, 9.2501f)
                curveTo(8.1596f, 9.5801f, 8.3996f, 10.0001f, 8.7896f, 10.0001f)
                close()
            }
        }
        .build()
        return _arrowup3!!
    }

private var _arrowup3: ImageVector? = null
