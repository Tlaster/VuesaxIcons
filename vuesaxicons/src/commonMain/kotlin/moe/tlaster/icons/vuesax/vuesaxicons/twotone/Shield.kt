package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4902f, 2.2301f)
                lineTo(5.5002f, 4.1101f)
                curveTo(4.3502f, 4.5401f, 3.4102f, 5.9001f, 3.4102f, 7.1201f)
                verticalLineTo(14.5501f)
                curveTo(3.4102f, 15.7301f, 4.1902f, 17.2801f, 5.1402f, 17.9901f)
                lineTo(9.4402f, 21.2001f)
                curveTo(10.8502f, 22.2601f, 13.1702f, 22.2601f, 14.5802f, 21.2001f)
                lineTo(18.8802f, 17.9901f)
                curveTo(19.8302f, 17.2801f, 20.6102f, 15.7301f, 20.6102f, 14.5501f)
                verticalLineTo(7.1201f)
                curveTo(20.6102f, 5.8901f, 19.6702f, 4.5301f, 18.5202f, 4.1001f)
                lineTo(13.5302f, 2.2301f)
                curveTo(12.6802f, 1.9201f, 11.3202f, 1.9201f, 10.4902f, 2.2301f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
