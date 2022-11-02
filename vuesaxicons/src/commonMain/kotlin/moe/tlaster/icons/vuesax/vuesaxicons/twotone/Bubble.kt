package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5909f, 12.26f)
                curveTo(18.4242f, 12.26f, 20.7209f, 9.9632f, 20.7209f, 7.13f)
                curveTo(20.7209f, 4.2968f, 18.4242f, 2.0f, 15.5909f, 2.0f)
                curveTo(12.7577f, 2.0f, 10.4609f, 4.2968f, 10.4609f, 7.13f)
                curveTo(10.4609f, 9.9632f, 12.7577f, 12.26f, 15.5909f, 12.26f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.3593f, 19.4398f)
                curveTo(8.0603f, 19.4398f, 9.4393f, 18.0608f, 9.4393f, 16.3598f)
                curveTo(9.4393f, 14.6587f, 8.0603f, 13.2798f, 6.3593f, 13.2798f)
                curveTo(4.6582f, 13.2798f, 3.2793f, 14.6587f, 3.2793f, 16.3598f)
                curveTo(3.2793f, 18.0608f, 4.6582f, 19.4398f, 6.3593f, 19.4398f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.6205f, 21.9999f)
                curveTo(18.0344f, 21.9999f, 19.1805f, 20.8537f, 19.1805f, 19.4399f)
                curveTo(19.1805f, 18.026f, 18.0344f, 16.8799f, 16.6205f, 16.8799f)
                curveTo(15.2067f, 16.8799f, 14.0605f, 18.026f, 14.0605f, 19.4399f)
                curveTo(14.0605f, 20.8537f, 15.2067f, 21.9999f, 16.6205f, 21.9999f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null
