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

public val TwotoneGroup.Shieldslash: ImageVector
    get() {
        if (_shieldslash != null) {
            return _shieldslash!!
        }
        _shieldslash = Builder(name = "Shieldslash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8398f, 20.0201f)
                lineTo(9.4298f, 21.2101f)
                curveTo(10.8398f, 22.2701f, 13.1598f, 22.2701f, 14.5698f, 21.2101f)
                lineTo(18.8698f, 18.0001f)
                curveTo(19.8198f, 17.2901f, 20.5998f, 15.7401f, 20.5998f, 14.5601f)
                verticalLineTo(7.1201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9802f, 4.3401f)
                curveTo(18.8302f, 4.2501f, 18.6702f, 4.1701f, 18.5102f, 4.1001f)
                lineTo(13.5202f, 2.2301f)
                curveTo(12.6902f, 1.9201f, 11.3302f, 1.9201f, 10.5002f, 2.2301f)
                lineTo(5.5002f, 4.1101f)
                curveTo(4.3502f, 4.5401f, 3.4102f, 5.9001f, 3.4102f, 7.1201f)
                verticalLineTo(14.5501f)
                curveTo(3.4102f, 15.7301f, 4.1902f, 17.2801f, 5.1402f, 17.9901f)
                lineTo(5.3402f, 18.1401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _shieldslash!!
    }

private var _shieldslash: ImageVector? = null
