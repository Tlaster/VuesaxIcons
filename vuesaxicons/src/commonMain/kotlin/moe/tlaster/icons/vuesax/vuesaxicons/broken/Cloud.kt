package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8496f, 9.92f)
                curveTo(16.3696f, 9.66f, 16.9396f, 9.52f, 17.5196f, 9.51f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9903f, 3.9001f)
                curveTo(7.9803f, 3.5701f, 3.6203f, 7.0301f, 5.5903f, 12.5201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2593f, 12.9299f)
                curveTo(6.7293f, 12.6599f, 6.1393f, 12.5199f, 5.5393f, 12.5199f)
                curveTo(0.8593f, 12.8499f, 0.8593f, 19.6599f, 5.5393f, 19.9899f)
                horizontalLineTo(16.6293f)
                curveTo(17.9793f, 19.9999f, 19.2793f, 19.4999f, 20.2693f, 18.5899f)
                curveTo(23.5593f, 15.7199f, 21.7993f, 9.9499f, 17.4693f, 9.3999f)
                curveTo(17.2293f, 7.9399f, 16.6893f, 6.7899f, 15.9793f, 5.9299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8398f, 9.8399f)
                curveTo(16.3598f, 9.5799f, 16.9298f, 9.4399f, 17.5098f, 9.4299f)
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
