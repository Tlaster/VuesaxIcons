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

public val TwotoneGroup.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.1099f)
                verticalLineTo(14.8799f)
                curveTo(3.0f, 16.9999f, 3.0f, 16.9999f, 5.0f, 18.3499f)
                lineTo(10.5f, 21.5299f)
                curveTo(11.33f, 22.0099f, 12.68f, 22.0099f, 13.5f, 21.5299f)
                lineTo(19.0f, 18.3499f)
                curveTo(21.0f, 16.9999f, 21.0f, 16.9999f, 21.0f, 14.8899f)
                verticalLineTo(9.1099f)
                curveTo(21.0f, 6.9999f, 21.0f, 6.9999f, 19.0f, 5.6499f)
                lineTo(13.5f, 2.4699f)
                curveTo(12.68f, 1.9899f, 11.33f, 1.9899f, 10.5f, 2.4699f)
                lineTo(5.0f, 5.6499f)
                curveTo(3.0f, 6.9999f, 3.0f, 6.9999f, 3.0f, 9.1099f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null
