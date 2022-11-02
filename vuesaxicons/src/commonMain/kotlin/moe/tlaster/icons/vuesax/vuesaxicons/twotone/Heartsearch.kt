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

public val TwotoneGroup.Heartsearch: ImageVector
    get() {
        if (_heartsearch != null) {
            return _heartsearch!!
        }
        _heartsearch = Builder(name = "Heartsearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.49f, 12.0001f)
                curveTo(21.81f, 10.9801f, 22.0f, 9.8801f, 22.0f, 8.6901f)
                curveTo(22.0f, 5.6001f, 19.51f, 3.1001f, 16.44f, 3.1001f)
                curveTo(14.62f, 3.1001f, 13.01f, 3.9801f, 12.0f, 5.3401f)
                curveTo(10.99f, 3.9801f, 9.37f, 3.1001f, 7.56f, 3.1001f)
                curveTo(4.49f, 3.1001f, 2.0f, 5.6001f, 2.0f, 8.6901f)
                curveTo(2.0f, 15.6901f, 8.48f, 19.8201f, 11.38f, 20.8201f)
                curveTo(11.55f, 20.8801f, 11.77f, 20.9101f, 12.0f, 20.9101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7391f, 21.0001f)
                curveTo(19.5064f, 21.0001f, 20.9391f, 19.5674f, 20.9391f, 17.8001f)
                curveTo(20.9391f, 16.0328f, 19.5064f, 14.6001f, 17.7391f, 14.6001f)
                curveTo(15.9717f, 14.6001f, 14.5391f, 16.0328f, 14.5391f, 17.8001f)
                curveTo(14.5391f, 19.5674f, 15.9717f, 21.0001f, 17.7391f, 21.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5391f, 21.6001f)
                lineTo(20.5391f, 20.6001f)
            }
        }
        .build()
        return _heartsearch!!
    }

private var _heartsearch: ImageVector? = null
