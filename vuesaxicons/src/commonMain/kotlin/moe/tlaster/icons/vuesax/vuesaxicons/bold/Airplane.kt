package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0486f, 10.6286f)
                lineTo(15.3786f, 8.6186f)
                lineTo(14.3386f, 8.1786f)
                curveTo(14.1786f, 8.0986f, 14.0386f, 7.8886f, 14.0386f, 7.7086f)
                verticalLineTo(4.6486f)
                curveTo(14.0386f, 3.6886f, 13.3286f, 2.5486f, 12.4686f, 2.1086f)
                curveTo(12.1686f, 1.9586f, 11.8086f, 1.9586f, 11.5086f, 2.1086f)
                curveTo(10.6586f, 2.5486f, 9.9486f, 3.6986f, 9.9486f, 4.6586f)
                verticalLineTo(7.7186f)
                curveTo(9.9486f, 7.8986f, 9.8086f, 8.1086f, 9.6486f, 8.1886f)
                lineTo(3.9486f, 10.6386f)
                curveTo(3.3186f, 10.8986f, 2.8086f, 11.6886f, 2.8086f, 12.3686f)
                verticalLineTo(13.6886f)
                curveTo(2.8086f, 14.5386f, 3.4486f, 14.9586f, 4.2386f, 14.6186f)
                lineTo(9.2486f, 12.4586f)
                curveTo(9.6386f, 12.2886f, 9.9586f, 12.4986f, 9.9586f, 12.9286f)
                verticalLineTo(14.0386f)
                verticalLineTo(15.8386f)
                curveTo(9.9586f, 16.0686f, 9.8286f, 16.3986f, 9.6686f, 16.5586f)
                lineTo(7.3486f, 18.8886f)
                curveTo(7.1086f, 19.1286f, 6.9986f, 19.5986f, 7.1086f, 19.9386f)
                lineTo(7.5586f, 21.2986f)
                curveTo(7.7386f, 21.8886f, 8.4086f, 22.1686f, 8.9586f, 21.8886f)
                lineTo(11.3386f, 19.8886f)
                curveTo(11.6986f, 19.5786f, 12.2886f, 19.5786f, 12.6486f, 19.8886f)
                lineTo(15.0286f, 21.8886f)
                curveTo(15.5786f, 22.1586f, 16.2486f, 21.8886f, 16.4486f, 21.2986f)
                lineTo(16.8986f, 19.9386f)
                curveTo(17.0086f, 19.6086f, 16.8986f, 19.1286f, 16.6586f, 18.8886f)
                lineTo(14.3386f, 16.5586f)
                curveTo(14.1686f, 16.3986f, 14.0386f, 16.0686f, 14.0386f, 15.8386f)
                verticalLineTo(12.9286f)
                curveTo(14.0386f, 12.4986f, 14.3486f, 12.2986f, 14.7486f, 12.4586f)
                lineTo(19.7586f, 14.6186f)
                curveTo(20.5486f, 14.9586f, 21.1886f, 14.5386f, 21.1886f, 13.6886f)
                verticalLineTo(12.3686f)
                curveTo(21.1886f, 11.6886f, 20.6786f, 10.8986f, 20.0486f, 10.6286f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
