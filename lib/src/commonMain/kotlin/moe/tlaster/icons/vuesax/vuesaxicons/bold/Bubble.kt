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

public val BoldGroup.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5909f, 1.75f)
                curveTo(12.6209f, 1.75f, 10.2109f, 4.16f, 10.2109f, 7.13f)
                curveTo(10.2109f, 10.1f, 12.6209f, 12.51f, 15.5909f, 12.51f)
                curveTo(18.5609f, 12.51f, 20.9709f, 10.1f, 20.9709f, 7.13f)
                curveTo(20.9709f, 4.16f, 18.5609f, 1.75f, 15.5909f, 1.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3593f, 13.0312f)
                curveTo(4.5293f, 13.0312f, 3.0293f, 14.5213f, 3.0293f, 16.3613f)
                curveTo(3.0293f, 18.2013f, 4.5193f, 19.6913f, 6.3593f, 19.6913f)
                curveTo(8.1893f, 19.6913f, 9.6893f, 18.2013f, 9.6893f, 16.3613f)
                curveTo(9.6893f, 14.5213f, 8.1893f, 13.0312f, 6.3593f, 13.0312f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6205f, 16.6211f)
                curveTo(15.0705f, 16.6211f, 13.8105f, 17.8811f, 13.8105f, 19.4311f)
                curveTo(13.8105f, 20.9811f, 15.0705f, 22.2411f, 16.6205f, 22.2411f)
                curveTo(18.1705f, 22.2411f, 19.4305f, 20.9811f, 19.4305f, 19.4311f)
                curveTo(19.4305f, 17.8811f, 18.1705f, 16.6211f, 16.6205f, 16.6211f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null
