package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.49f, 9.5997f)
                lineTo(5.6f, 16.7696f)
                curveTo(4.9f, 17.1896f, 4.0f, 16.6896f, 4.0f, 15.8696f)
                verticalLineTo(7.8696f)
                curveTo(4.0f, 4.3797f, 7.77f, 2.1997f, 10.8f, 3.9397f)
                lineTo(15.39f, 6.5796f)
                lineTo(17.48f, 7.7797f)
                curveTo(18.17f, 8.1896f, 18.18f, 9.1896f, 17.49f, 9.5997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0888f, 15.4606f)
                lineTo(14.0388f, 17.8006f)
                lineTo(9.9988f, 20.1306f)
                curveTo(8.5488f, 20.9606f, 6.9088f, 20.7906f, 5.7188f, 19.9506f)
                curveTo(5.1388f, 19.5506f, 5.2088f, 18.6606f, 5.8188f, 18.3006f)
                lineTo(18.5288f, 10.6806f)
                curveTo(19.1288f, 10.3206f, 19.9188f, 10.6606f, 20.0288f, 11.3506f)
                curveTo(20.2788f, 12.9006f, 19.6388f, 14.5706f, 18.0888f, 15.4606f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
