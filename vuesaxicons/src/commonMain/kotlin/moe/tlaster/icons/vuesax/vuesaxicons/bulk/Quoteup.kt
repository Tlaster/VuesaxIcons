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

public val BulkGroup.Quoteup: ImageVector
    get() {
        if (_quoteup != null) {
            return _quoteup!!
        }
        _quoteup = Builder(name = "Quoteup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0903f, 11.63f)
                horizontalLineTo(3.4003f)
                curveTo(3.4803f, 6.96f, 4.4003f, 6.19f, 7.2703f, 4.49f)
                curveTo(7.6003f, 4.29f, 7.7102f, 3.87f, 7.5103f, 3.53f)
                curveTo(7.3102f, 3.2f, 6.8902f, 3.09f, 6.5502f, 3.29f)
                curveTo(3.1702f, 5.29f, 1.9902f, 6.51f, 1.9902f, 12.33f)
                verticalLineTo(17.72f)
                curveTo(1.9902f, 19.43f, 3.3803f, 20.81f, 5.0803f, 20.81f)
                horizontalLineTo(8.0803f)
                curveTo(9.8403f, 20.81f, 11.1702f, 19.48f, 11.1702f, 17.72f)
                verticalLineTo(14.72f)
                curveTo(11.1802f, 12.96f, 9.8503f, 11.63f, 8.0903f, 11.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9105f, 11.63f)
                horizontalLineTo(14.2205f)
                curveTo(14.3005f, 6.96f, 15.2206f, 6.19f, 18.0906f, 4.49f)
                curveTo(18.4206f, 4.29f, 18.5306f, 3.87f, 18.3306f, 3.53f)
                curveTo(18.1306f, 3.2f, 17.7105f, 3.09f, 17.3705f, 3.29f)
                curveTo(13.9905f, 5.29f, 12.8105f, 6.51f, 12.8105f, 12.33f)
                verticalLineTo(17.72f)
                curveTo(12.8105f, 19.43f, 14.2006f, 20.81f, 15.9006f, 20.81f)
                horizontalLineTo(18.9006f)
                curveTo(20.6606f, 20.81f, 21.9905f, 19.48f, 21.9905f, 17.72f)
                verticalLineTo(14.72f)
                curveTo(22.0005f, 12.96f, 20.6705f, 11.63f, 18.9105f, 11.63f)
                close()
            }
        }
        .build()
        return _quoteup!!
    }

private var _quoteup: ImageVector? = null
