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

public val OutlineGroup.Mask: ImageVector
    get() {
        if (_mask != null) {
            return _mask!!
        }
        _mask = Builder(name = "Mask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9993f, 22.7198f)
                curveTo(6.0893f, 22.7198f, 1.2793f, 17.9098f, 1.2793f, 11.9998f)
                curveTo(1.2793f, 6.0898f, 6.0893f, 1.2798f, 11.9993f, 1.2798f)
                curveTo(14.6493f, 1.2798f, 17.1893f, 2.2598f, 19.1493f, 4.0298f)
                curveTo(21.4193f, 6.0398f, 22.7193f, 8.9498f, 22.7193f, 11.9998f)
                curveTo(22.7193f, 15.0498f, 21.4193f, 17.9598f, 19.1393f, 19.9798f)
                curveTo(17.1893f, 21.7498f, 14.6493f, 22.7198f, 11.9993f, 22.7198f)
                close()
                moveTo(11.9993f, 2.7798f)
                curveTo(6.9093f, 2.7798f, 2.7793f, 6.9198f, 2.7793f, 11.9998f)
                curveTo(2.7793f, 17.0798f, 6.9193f, 21.2198f, 11.9993f, 21.2198f)
                curveTo(14.2793f, 21.2198f, 16.4593f, 20.3798f, 18.1493f, 18.8498f)
                curveTo(20.1093f, 17.1098f, 21.2293f, 14.6198f, 21.2293f, 11.9898f)
                curveTo(21.2293f, 9.3598f, 20.1093f, 6.8698f, 18.1593f, 5.1398f)
                curveTo(16.4593f, 3.6198f, 14.2793f, 2.7798f, 11.9993f, 2.7798f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4393f, 18.9099f)
                curveTo(10.0693f, 18.9099f, 9.6793f, 18.8299f, 9.2993f, 18.6799f)
                curveTo(6.5593f, 17.5799f, 4.7793f, 14.9499f, 4.7793f, 11.9999f)
                curveTo(4.7793f, 9.0499f, 6.5493f, 6.4199f, 9.2993f, 5.3199f)
                curveTo(10.1693f, 4.9699f, 11.0493f, 5.0199f, 11.7093f, 5.4599f)
                curveTo(12.3493f, 5.8899f, 12.7093f, 6.6499f, 12.7293f, 7.5999f)
                verticalLineTo(16.3899f)
                verticalLineTo(16.3999f)
                curveTo(12.7193f, 17.3499f, 12.3593f, 18.1199f, 11.7093f, 18.5399f)
                curveTo(11.3393f, 18.7899f, 10.8993f, 18.9099f, 10.4393f, 18.9099f)
                close()
                moveTo(10.4393f, 6.5899f)
                curveTo(10.2593f, 6.5899f, 10.0593f, 6.6299f, 9.8593f, 6.7099f)
                curveTo(7.6793f, 7.5799f, 6.2793f, 9.6599f, 6.2793f, 11.9999f)
                curveTo(6.2793f, 14.3399f, 7.6793f, 16.4199f, 9.8593f, 17.2899f)
                curveTo(10.2593f, 17.4499f, 10.6393f, 17.4499f, 10.8793f, 17.2999f)
                curveTo(11.1593f, 17.1099f, 11.2193f, 16.6999f, 11.2293f, 16.3899f)
                verticalLineTo(7.6099f)
                curveTo(11.2293f, 7.3099f, 11.1593f, 6.8899f, 10.8793f, 6.6999f)
                curveTo(10.7593f, 6.6299f, 10.6093f, 6.5899f, 10.4393f, 6.5899f)
                close()
            }
        }
        .build()
        return _mask!!
    }

private var _mask: ImageVector? = null
