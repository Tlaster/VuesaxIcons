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

public val TwotoneGroup.More2: ImageVector
    get() {
        if (_more2 != null) {
            return _more2!!
        }
        _more2 = Builder(name = "More2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9998f, 9.32f)
                curveTo(13.1898f, 9.32f, 14.1598f, 8.35f, 14.1598f, 7.16f)
                curveTo(14.1598f, 5.97f, 13.1898f, 5.0f, 11.9998f, 5.0f)
                curveTo(10.8098f, 5.0f, 9.8398f, 5.97f, 9.8398f, 7.16f)
                curveTo(9.8398f, 8.35f, 10.8098f, 9.32f, 11.9998f, 9.32f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7899f, 19.0002f)
                curveTo(7.9799f, 19.0002f, 8.9499f, 18.0302f, 8.9499f, 16.8402f)
                curveTo(8.9499f, 15.6502f, 7.9799f, 14.6802f, 6.7899f, 14.6802f)
                curveTo(5.5999f, 14.6802f, 4.6299f, 15.6502f, 4.6299f, 16.8402f)
                curveTo(4.6299f, 18.0302f, 5.5899f, 19.0002f, 6.7899f, 19.0002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.2098f, 19.0002f)
                curveTo(18.3998f, 19.0002f, 19.3698f, 18.0302f, 19.3698f, 16.8402f)
                curveTo(19.3698f, 15.6502f, 18.3998f, 14.6802f, 17.2098f, 14.6802f)
                curveTo(16.0198f, 14.6802f, 15.0498f, 15.6502f, 15.0498f, 16.8402f)
                curveTo(15.0498f, 18.0302f, 16.0198f, 19.0002f, 17.2098f, 19.0002f)
                close()
            }
        }
        .build()
        return _more2!!
    }

private var _more2: ImageVector? = null
