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

public val TwotoneGroup.Mask2: ImageVector
    get() {
        if (_mask2 != null) {
            return _mask2!!
        }
        _mask2 = Builder(name = "Mask2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9693f, 11.9998f)
                curveTo(21.9693f, 14.9398f, 20.6893f, 17.5998f, 18.6493f, 19.4098f)
                curveTo(16.8893f, 21.0098f, 14.5593f, 21.9698f, 11.9993f, 21.9698f)
                curveTo(6.4993f, 21.9698f, 2.0293f, 17.4998f, 2.0293f, 11.9998f)
                curveTo(2.0293f, 6.4998f, 6.4993f, 2.0298f, 11.9993f, 2.0298f)
                curveTo(14.5593f, 2.0298f, 16.8893f, 2.9898f, 18.6493f, 4.5898f)
                curveTo(20.6893f, 6.3998f, 21.9693f, 9.0598f, 21.9693f, 11.9998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9693f, 16.3902f)
                curveTo(11.9493f, 18.0402f, 10.7193f, 18.4402f, 9.5693f, 17.9802f)
                curveTo(7.1993f, 17.0302f, 5.5293f, 14.7102f, 5.5293f, 12.0002f)
                curveTo(5.5293f, 9.2902f, 7.1993f, 6.9702f, 9.5693f, 6.0102f)
                curveTo(10.7193f, 5.5502f, 11.9493f, 5.9602f, 11.9693f, 7.6002f)
                verticalLineTo(16.3902f)
                close()
            }
        }
        .build()
        return _mask2!!
    }

private var _mask2: ImageVector? = null
