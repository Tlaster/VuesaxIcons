package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5909f, 12.26f)
                curveTo(18.4209f, 12.26f, 20.7209f, 9.96f, 20.7209f, 7.13f)
                curveTo(20.7209f, 4.3f, 18.4209f, 2.0f, 15.5909f, 2.0f)
                curveTo(12.7609f, 2.0f, 10.4609f, 4.3f, 10.4609f, 7.13f)
                curveTo(10.4609f, 8.43f, 10.9409f, 9.61f, 11.7409f, 10.51f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.2793f, 16.36f)
                curveTo(3.2793f, 18.06f, 4.6593f, 19.44f, 6.3593f, 19.44f)
                curveTo(8.0593f, 19.44f, 9.4393f, 18.06f, 9.4393f, 16.36f)
                curveTo(9.4393f, 14.66f, 8.0593f, 13.28f, 6.3593f, 13.28f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
