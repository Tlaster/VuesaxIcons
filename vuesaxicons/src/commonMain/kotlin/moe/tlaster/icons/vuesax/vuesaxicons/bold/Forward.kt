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

public val BoldGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.3403f)
                verticalLineTo(15.6603f)
                curveTo(2.0f, 17.1603f, 3.63f, 18.1003f, 4.93f, 17.3503f)
                lineTo(8.1f, 15.5203f)
                lineTo(11.27f, 13.6903f)
                lineTo(11.76f, 13.4103f)
                verticalLineTo(10.5903f)
                lineTo(11.27f, 10.3103f)
                lineTo(8.1f, 8.4803f)
                lineTo(4.93f, 6.6503f)
                curveTo(3.63f, 5.9003f, 2.0f, 6.8403f, 2.0f, 8.3403f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7617f, 8.3403f)
                verticalLineTo(15.6603f)
                curveTo(11.7617f, 17.1603f, 13.3917f, 18.1003f, 14.6817f, 17.3503f)
                lineTo(17.8617f, 15.5203f)
                lineTo(21.0317f, 13.6903f)
                curveTo(22.3217f, 12.9403f, 22.3217f, 11.0603f, 21.0317f, 10.3103f)
                lineTo(17.8617f, 8.4803f)
                lineTo(14.6817f, 6.6503f)
                curveTo(13.3917f, 5.9003f, 11.7617f, 6.8403f, 11.7617f, 8.3403f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
