package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = Builder(name = "Next", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3098f, 20.0899f)
                curveTo(5.7397f, 20.0899f, 5.1798f, 19.9399f, 4.6598f, 19.6399f)
                curveTo(3.6198f, 19.0399f, 3.0098f, 17.9799f, 3.0098f, 16.7799f)
                verticalLineTo(7.2099f)
                curveTo(3.0098f, 6.0199f, 3.6298f, 4.9499f, 4.6598f, 4.3499f)
                curveTo(5.6998f, 3.7499f, 6.9297f, 3.7499f, 7.9598f, 4.3499f)
                lineTo(16.2498f, 9.1299f)
                curveTo(17.2798f, 9.7299f, 17.8997f, 10.7999f, 17.8997f, 11.9899f)
                curveTo(17.8997f, 13.1799f, 17.2798f, 14.2499f, 16.2498f, 14.8499f)
                lineTo(7.9598f, 19.6299f)
                curveTo(7.4398f, 19.9399f, 6.8797f, 20.0899f, 6.3098f, 20.0899f)
                close()
                moveTo(6.3098f, 5.4099f)
                curveTo(5.9998f, 5.4099f, 5.6898f, 5.4899f, 5.4098f, 5.6499f)
                curveTo(4.8498f, 5.9799f, 4.5098f, 6.5599f, 4.5098f, 7.2099f)
                verticalLineTo(16.7799f)
                curveTo(4.5098f, 17.4299f, 4.8498f, 18.0099f, 5.4098f, 18.3399f)
                curveTo(5.9698f, 18.6599f, 6.6498f, 18.6699f, 7.2098f, 18.3399f)
                lineTo(15.4998f, 13.5599f)
                curveTo(16.0598f, 13.2299f, 16.3997f, 12.6499f, 16.3997f, 11.9999f)
                curveTo(16.3997f, 11.3499f, 16.0598f, 10.7699f, 15.4998f, 10.4399f)
                lineTo(7.2098f, 5.6599f)
                curveTo(6.9297f, 5.4999f, 6.6198f, 5.4099f, 6.3098f, 5.4099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2402f, 18.9303f)
                curveTo(19.8302f, 18.9303f, 19.4902f, 18.5903f, 19.4902f, 18.1803f)
                verticalLineTo(5.8203f)
                curveTo(19.4902f, 5.4103f, 19.8302f, 5.0703f, 20.2402f, 5.0703f)
                curveTo(20.6502f, 5.0703f, 20.9902f, 5.4103f, 20.9902f, 5.8203f)
                verticalLineTo(18.1803f)
                curveTo(20.9902f, 18.5903f, 20.6602f, 18.9303f, 20.2402f, 18.9303f)
                close()
            }
        }
        .build()
        return _next!!
    }

private var _next: ImageVector? = null
