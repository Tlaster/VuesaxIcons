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

public val TwotoneGroup.Edit2: ImageVector
    get() {
        if (_edit2 != null) {
            return _edit2!!
        }
        _edit2 = Builder(name = "Edit2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2594f, 3.6002f)
                lineTo(5.0494f, 12.2902f)
                curveTo(4.7394f, 12.6202f, 4.4394f, 13.2702f, 4.3794f, 13.7202f)
                lineTo(4.0094f, 16.9602f)
                curveTo(3.8794f, 18.1302f, 4.7194f, 18.9302f, 5.8794f, 18.7302f)
                lineTo(9.0994f, 18.1802f)
                curveTo(9.5494f, 18.1002f, 10.1794f, 17.7702f, 10.4894f, 17.4302f)
                lineTo(18.6994f, 8.7402f)
                curveTo(20.1194f, 7.2402f, 20.7594f, 5.5302f, 18.5494f, 3.4402f)
                curveTo(16.3494f, 1.3702f, 14.6794f, 2.1002f, 13.2594f, 3.6002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8906f, 5.0498f)
                curveTo(12.3206f, 7.8098f, 14.5606f, 9.9198f, 17.3406f, 10.1998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                horizontalLineTo(21.0f)
            }
        }
        .build()
        return _edit2!!
    }

private var _edit2: ImageVector? = null
