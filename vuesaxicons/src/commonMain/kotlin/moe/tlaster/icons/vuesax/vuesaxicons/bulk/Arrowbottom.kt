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

public val BulkGroup.Arrowbottom: ImageVector
    get() {
        if (_arrowbottom != null) {
            return _arrowbottom!!
        }
        _arrowbottom = Builder(name = "Arrowbottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3292f, 6.0f)
                horizontalLineTo(14.6692f)
                curveTo(17.9892f, 6.0f, 19.3392f, 8.35f, 17.6892f, 11.22f)
                lineTo(16.9492f, 12.5f)
                curveTo(16.7692f, 12.81f, 16.4392f, 13.0f, 16.0792f, 13.0f)
                horizontalLineTo(7.9192f)
                curveTo(7.5592f, 13.0f, 7.2292f, 12.81f, 7.0492f, 12.5f)
                lineTo(6.3092f, 11.22f)
                curveTo(4.6592f, 8.35f, 6.0092f, 6.0f, 9.3292f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7896f, 14.0f)
                horizontalLineTo(15.2196f)
                curveTo(15.6096f, 14.0f, 15.8496f, 14.42f, 15.6496f, 14.75f)
                lineTo(15.0096f, 15.85f)
                curveTo(13.3596f, 18.72f, 10.6396f, 18.72f, 8.9896f, 15.85f)
                lineTo(8.3496f, 14.75f)
                curveTo(8.1596f, 14.42f, 8.3996f, 14.0f, 8.7896f, 14.0f)
                close()
            }
        }
        .build()
        return _arrowbottom!!
    }

private var _arrowbottom: ImageVector? = null
