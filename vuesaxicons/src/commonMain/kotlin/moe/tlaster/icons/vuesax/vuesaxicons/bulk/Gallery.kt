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

public val BulkGroup.Gallery: ImageVector
    get() {
        if (_gallery != null) {
            return _gallery!!
        }
        _gallery = Builder(name = "Gallery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(13.9f)
                lineTo(20.37f, 12.5f)
                curveTo(19.59f, 11.83f, 18.33f, 11.83f, 17.55f, 12.5f)
                lineTo(13.39f, 16.07f)
                curveTo(12.61f, 16.74f, 11.35f, 16.74f, 10.57f, 16.07f)
                lineTo(10.23f, 15.79f)
                curveTo(9.52f, 15.17f, 8.39f, 15.11f, 7.59f, 15.65f)
                lineTo(2.67f, 18.95f)
                lineTo(2.56f, 19.03f)
                curveTo(2.19f, 18.23f, 2.0f, 17.28f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9991f, 10.3801f)
                curveTo(10.3136f, 10.3801f, 11.3791f, 9.3146f, 11.3791f, 8.0001f)
                curveTo(11.3791f, 6.6857f, 10.3136f, 5.6201f, 8.9991f, 5.6201f)
                curveTo(7.6847f, 5.6201f, 6.6191f, 6.6857f, 6.6191f, 8.0001f)
                curveTo(6.6191f, 9.3146f, 7.6847f, 10.3801f, 8.9991f, 10.3801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0005f, 13.9001f)
                verticalLineTo(16.1901f)
                curveTo(22.0005f, 19.8301f, 19.8305f, 22.0001f, 16.1905f, 22.0001f)
                horizontalLineTo(7.8106f)
                curveTo(5.2606f, 22.0001f, 3.4206f, 20.9301f, 2.5605f, 19.0301f)
                lineTo(2.6706f, 18.9501f)
                lineTo(7.5905f, 15.6501f)
                curveTo(8.3905f, 15.1101f, 9.5205f, 15.1701f, 10.2305f, 15.7901f)
                lineTo(10.5705f, 16.0701f)
                curveTo(11.3505f, 16.7401f, 12.6105f, 16.7401f, 13.3905f, 16.0701f)
                lineTo(17.5505f, 12.5001f)
                curveTo(18.3305f, 11.8301f, 19.5905f, 11.8301f, 20.3705f, 12.5001f)
                lineTo(22.0005f, 13.9001f)
                close()
            }
        }
        .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null
