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

public val TwotoneGroup.Starslash: ImageVector
    get() {
        if (_starslash != null) {
            return _starslash!!
        }
        _starslash = Builder(name = "Starslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.2809f, 18.6501f)
                lineTo(5.8509f, 16.1801f)
                curveTo(5.9809f, 15.6001f, 5.7509f, 14.7901f, 5.3309f, 14.3701f)
                lineTo(2.8509f, 11.8901f)
                curveTo(1.3909f, 10.4301f, 1.8609f, 8.9501f, 3.9009f, 8.6101f)
                lineTo(7.0909f, 8.0801f)
                curveTo(7.6209f, 7.9901f, 8.2609f, 7.5201f, 8.5009f, 7.0301f)
                lineTo(10.2609f, 3.5101f)
                curveTo(11.2109f, 1.6001f, 12.7709f, 1.6001f, 13.7309f, 3.5101f)
                lineTo(15.4909f, 7.0301f)
                curveTo(15.6009f, 7.2601f, 15.8109f, 7.4801f, 16.0409f, 7.6701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0995f, 8.6099f)
                curveTo(22.1395f, 8.9499f, 22.6195f, 10.4299f, 21.1495f, 11.8899f)
                lineTo(18.6695f, 14.3699f)
                curveTo(18.2495f, 14.7899f, 18.0195f, 15.5999f, 18.1495f, 16.1799f)
                lineTo(18.8595f, 19.2499f)
                curveTo(19.4195f, 21.6799f, 18.1295f, 22.6199f, 15.9795f, 21.3499f)
                lineTo(12.9895f, 19.5799f)
                curveTo(12.4495f, 19.2599f, 11.5595f, 19.2599f, 11.0095f, 19.5799f)
                lineTo(8.0195f, 21.3499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _starslash!!
    }

private var _starslash: ImageVector? = null
