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

public val TwotoneGroup.Securitytime: ImageVector
    get() {
        if (_securitytime != null) {
            return _securitytime!!
        }
        _securitytime = Builder(name = "Securitytime", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4901f, 2.2301f)
                lineTo(5.5002f, 4.1001f)
                curveTo(4.3502f, 4.5301f, 3.4102f, 5.8901f, 3.4102f, 7.1201f)
                verticalLineTo(14.5501f)
                curveTo(3.4102f, 15.7301f, 4.1902f, 17.2801f, 5.1402f, 17.9901f)
                lineTo(9.4402f, 21.2001f)
                curveTo(10.8502f, 22.2601f, 13.1701f, 22.2601f, 14.5801f, 21.2001f)
                lineTo(18.8802f, 17.9901f)
                curveTo(19.8302f, 17.2801f, 20.6101f, 15.7301f, 20.6101f, 14.5501f)
                verticalLineTo(7.1201f)
                curveTo(20.6101f, 5.8901f, 19.6701f, 4.5301f, 18.5201f, 4.1001f)
                lineTo(13.5302f, 2.2301f)
                curveTo(12.6802f, 1.9201f, 11.3201f, 1.9201f, 10.4901f, 2.2301f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                curveTo(14.2091f, 15.5f, 16.0f, 13.7091f, 16.0f, 11.5f)
                curveTo(16.0f, 9.2909f, 14.2091f, 7.5f, 12.0f, 7.5f)
                curveTo(9.7909f, 7.5f, 8.0f, 9.2909f, 8.0f, 11.5f)
                curveTo(8.0f, 13.7091f, 9.7909f, 15.5f, 12.0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.25f, 10.25f)
                verticalLineTo(11.18f)
                curveTo(12.25f, 11.53f, 12.07f, 11.86f, 11.76f, 12.04f)
                lineTo(11.0f, 12.5f)
            }
        }
        .build()
        return _securitytime!!
    }

private var _securitytime: ImageVector? = null
