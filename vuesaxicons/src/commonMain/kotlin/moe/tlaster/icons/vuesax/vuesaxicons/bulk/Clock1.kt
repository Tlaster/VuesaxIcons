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

public val BulkGroup.Clock1: ImageVector
    get() {
        if (_clock1 != null) {
            return _clock1!!
        }
        _clock1 = Builder(name = "Clock1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.7106f, 15.93f)
                curveTo(15.5806f, 15.93f, 15.4506f, 15.9f, 15.3306f, 15.82f)
                lineTo(12.2306f, 13.97f)
                curveTo(11.4606f, 13.51f, 10.8906f, 12.5f, 10.8906f, 11.61f)
                verticalLineTo(7.51f)
                curveTo(10.8906f, 7.1f, 11.2306f, 6.76f, 11.6406f, 6.76f)
                curveTo(12.0506f, 6.76f, 12.3906f, 7.1f, 12.3906f, 7.51f)
                verticalLineTo(11.61f)
                curveTo(12.3906f, 11.97f, 12.6906f, 12.5f, 13.0006f, 12.68f)
                lineTo(16.1006f, 14.53f)
                curveTo(16.4606f, 14.74f, 16.5706f, 15.2f, 16.3606f, 15.56f)
                curveTo(16.2106f, 15.8f, 15.9606f, 15.93f, 15.7106f, 15.93f)
                close()
            }
        }
        .build()
        return _clock1!!
    }

private var _clock1: ImageVector? = null
