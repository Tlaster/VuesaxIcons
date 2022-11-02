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

public val TwotoneGroup.Rotateright: ImageVector
    get() {
        if (_rotateright != null) {
            return _rotateright!!
        }
        _rotateright = Builder(name = "Rotateright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8901f, 5.0799f)
                curveTo(14.0201f, 4.8199f, 13.0601f, 4.6499f, 12.0001f, 4.6499f)
                curveTo(7.2101f, 4.6499f, 3.3301f, 8.5299f, 3.3301f, 13.3199f)
                curveTo(3.3301f, 18.1199f, 7.2101f, 21.9999f, 12.0001f, 21.9999f)
                curveTo(16.7901f, 21.9999f, 20.6701f, 18.1199f, 20.6701f, 13.3299f)
                curveTo(20.6701f, 11.5499f, 20.1301f, 9.8899f, 19.2101f, 8.5099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1302f, 5.32f)
                lineTo(13.2402f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1298f, 5.3198f)
                lineTo(12.7598f, 7.7798f)
            }
        }
        .build()
        return _rotateright!!
    }

private var _rotateright: ImageVector? = null
