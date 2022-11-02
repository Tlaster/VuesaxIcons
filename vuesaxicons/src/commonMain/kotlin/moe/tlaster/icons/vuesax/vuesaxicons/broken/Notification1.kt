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

public val BrokenGroup.Notification1: ImageVector
    get() {
        if (_notification1 != null) {
            return _notification1!!
        }
        _notification1 = Builder(name = "Notification1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0206f, 11.8002f)
                verticalLineTo(8.9102f)
                curveTo(18.0206f, 5.6102f, 15.3206f, 2.9102f, 12.0206f, 2.9102f)
                curveTo(8.7106f, 2.9102f, 6.0206f, 5.6002f, 6.0206f, 8.9102f)
                verticalLineTo(11.8002f)
                curveTo(6.0206f, 12.4102f, 5.7606f, 13.3402f, 5.4506f, 13.8602f)
                lineTo(4.3006f, 15.7702f)
                curveTo(3.5906f, 16.9502f, 4.0806f, 18.2602f, 5.3806f, 18.7002f)
                curveTo(9.6906f, 20.1402f, 14.3406f, 20.1402f, 18.6506f, 18.7002f)
                curveTo(19.8606f, 18.3002f, 20.3906f, 16.8702f, 19.7306f, 15.7702f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.8699f, 3.1999f)
                curveTo(13.5599f, 3.1099f, 13.2399f, 3.0399f, 12.9099f, 2.9999f)
                curveTo(11.9499f, 2.8799f, 11.0299f, 2.9499f, 10.1699f, 3.1999f)
                curveTo(10.4599f, 2.4599f, 11.1799f, 1.9399f, 12.0199f, 1.9399f)
                curveTo(12.8599f, 1.9399f, 13.5799f, 2.4599f, 13.8699f, 3.1999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0195f, 19.0601f)
                curveTo(15.0195f, 20.7101f, 13.6695f, 22.0601f, 12.0195f, 22.0601f)
                curveTo(11.1995f, 22.0601f, 10.4395f, 21.7201f, 9.8995f, 21.1801f)
                curveTo(9.3595f, 20.6401f, 9.0195f, 19.8801f, 9.0195f, 19.0601f)
            }
        }
        .build()
        return _notification1!!
    }

private var _notification1: ImageVector? = null
