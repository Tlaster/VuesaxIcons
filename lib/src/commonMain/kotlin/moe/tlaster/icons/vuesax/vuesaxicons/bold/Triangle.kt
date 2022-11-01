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

public val BoldGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2497f, 3.8986f)
                verticalLineTo(12.9186f)
                curveTo(11.2497f, 13.2486f, 11.0897f, 13.5486f, 10.8197f, 13.7386f)
                lineTo(3.6097f, 18.7886f)
                curveTo(3.0197f, 19.1986f, 2.1797f, 18.8786f, 2.0497f, 18.1686f)
                curveTo(1.8997f, 17.3086f, 2.0997f, 16.2986f, 2.6997f, 15.2086f)
                lineTo(5.8197f, 9.5986f)
                lineTo(8.7597f, 4.3086f)
                curveTo(8.9897f, 3.8986f, 9.2397f, 3.5386f, 9.4997f, 3.2286f)
                curveTo(10.0997f, 2.5286f, 11.2497f, 2.9786f, 11.2497f, 3.8986f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.39f, 18.7886f)
                lineTo(13.18f, 13.7386f)
                curveTo(12.91f, 13.5486f, 12.75f, 13.2486f, 12.75f, 12.9186f)
                verticalLineTo(3.8986f)
                curveTo(12.75f, 2.9786f, 13.9f, 2.5286f, 14.5f, 3.2286f)
                curveTo(14.76f, 3.5386f, 15.01f, 3.8986f, 15.24f, 4.3086f)
                lineTo(18.18f, 9.5986f)
                lineTo(21.3f, 15.2086f)
                curveTo(21.9f, 16.2986f, 22.1f, 17.3086f, 21.95f, 18.1686f)
                curveTo(21.82f, 18.8786f, 20.98f, 19.1986f, 20.39f, 18.7886f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2602f, 19.14f)
                lineTo(11.4102f, 15.04f)
                curveTo(11.7402f, 14.82f, 12.2802f, 14.82f, 12.6102f, 15.04f)
                lineTo(18.7602f, 19.14f)
                curveTo(20.3902f, 20.23f, 20.1202f, 21.12f, 18.1602f, 21.12f)
                horizontalLineTo(5.8502f)
                curveTo(3.9002f, 21.11f, 3.6302f, 20.22f, 5.2602f, 19.14f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
