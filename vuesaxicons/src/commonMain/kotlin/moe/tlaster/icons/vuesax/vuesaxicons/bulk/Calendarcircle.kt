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

public val BulkGroup.Calendarcircle: ImageVector
    get() {
        if (_calendarcircle != null) {
            return _calendarcircle!!
        }
        _calendarcircle = Builder(name = "Calendarcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1493f, 9.4401f)
                curveTo(16.7293f, 8.4701f, 15.9393f, 7.7201f, 14.8493f, 7.3801f)
                verticalLineTo(6.5901f)
                curveTo(14.8493f, 6.1801f, 14.5093f, 5.8401f, 14.0993f, 5.8401f)
                curveTo(13.6893f, 5.8401f, 13.3493f, 6.1801f, 13.3493f, 6.5901f)
                verticalLineTo(7.1801f)
                horizontalLineTo(10.6393f)
                verticalLineTo(6.5901f)
                curveTo(10.6393f, 6.1801f, 10.2993f, 5.8401f, 9.8893f, 5.8401f)
                curveTo(9.4793f, 5.8401f, 9.1393f, 6.1801f, 9.1393f, 6.5901f)
                verticalLineTo(7.3801f)
                curveTo(8.0493f, 7.7201f, 7.2593f, 8.4701f, 6.8393f, 9.4401f)
                curveTo(6.6993f, 9.7701f, 6.9393f, 10.1501f, 7.2993f, 10.1501f)
                horizontalLineTo(16.6693f)
                curveTo(17.0493f, 10.1401f, 17.2893f, 9.7701f, 17.1493f, 9.4401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.1401f)
                curveTo(17.28f, 11.1401f, 17.5f, 11.3601f, 17.5f, 11.6401f)
                verticalLineTo(14.1701f)
                curveTo(17.5f, 16.3701f, 16.0f, 18.1701f, 13.5f, 18.1701f)
                horizontalLineTo(10.5f)
                curveTo(8.0f, 18.1701f, 6.5f, 16.3701f, 6.5f, 14.1701f)
                verticalLineTo(11.6401f)
                curveTo(6.5f, 11.3601f, 6.72f, 11.1401f, 7.0f, 11.1401f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _calendarcircle!!
    }

private var _calendarcircle: ImageVector? = null
