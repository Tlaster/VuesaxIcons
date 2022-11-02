package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Hearttick: ImageVector
    get() {
        if (_hearttick != null) {
            return _hearttick!!
        }
        _hearttick = Builder(name = "Hearttick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0004f, 17.1999f)
                curveTo(22.0004f, 18.0999f, 21.7504f, 18.9499f, 21.3004f, 19.6699f)
                curveTo(20.4704f, 21.0599f, 18.9504f, 21.9999f, 17.2004f, 21.9999f)
                curveTo(15.4504f, 21.9999f, 13.9204f, 21.0599f, 13.1004f, 19.6699f)
                curveTo(12.6604f, 18.9499f, 12.4004f, 18.0999f, 12.4004f, 17.1999f)
                curveTo(12.4004f, 14.5499f, 14.5504f, 12.3999f, 17.2004f, 12.3999f)
                curveTo(19.8504f, 12.3999f, 22.0004f, 14.5499f, 22.0004f, 17.1999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.3301f, 17.2f)
                lineTo(16.5101f, 18.38f)
                lineTo(19.0701f, 16.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.6901f)
                curveTo(22.0f, 10.6601f, 21.49f, 12.4001f, 20.69f, 13.9101f)
                curveTo(19.81f, 12.9801f, 18.57f, 12.4001f, 17.2f, 12.4001f)
                curveTo(14.55f, 12.4001f, 12.4f, 14.5501f, 12.4f, 17.2001f)
                curveTo(12.4f, 18.4301f, 12.87f, 19.5501f, 13.63f, 20.4001f)
                curveTo(13.26f, 20.5701f, 12.92f, 20.7101f, 12.62f, 20.8101f)
                curveTo(12.28f, 20.9301f, 11.72f, 20.9301f, 11.38f, 20.8101f)
                curveTo(8.48f, 19.8201f, 2.0f, 15.6901f, 2.0f, 8.6901f)
                curveTo(2.0f, 5.6001f, 4.49f, 3.1001f, 7.56f, 3.1001f)
                curveTo(9.37f, 3.1001f, 10.99f, 3.9801f, 12.0f, 5.3301f)
                curveTo(13.01f, 3.9801f, 14.63f, 3.1001f, 16.44f, 3.1001f)
                curveTo(19.51f, 3.1001f, 22.0f, 5.6001f, 22.0f, 8.6901f)
                close()
            }
        }
        .build()
        return _hearttick!!
    }

private var _hearttick: ImageVector? = null
