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

public val TwotoneGroup.`Html-3`: ImageVector
    get() {
        if (`_html-3` != null) {
            return `_html-3`!!
        }
        `_html-3` = Builder(name = "Html-3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1201f, 2.0f)
                horizontalLineTo(19.8901f)
                curveTo(20.4901f, 2.0f, 20.9501f, 2.52f, 20.8801f, 3.11f)
                lineTo(19.0801f, 19.33f)
                curveTo(19.0401f, 19.73f, 18.7501f, 20.07f, 18.3601f, 20.18f)
                lineTo(12.2801f, 21.92f)
                curveTo(12.1001f, 21.97f, 11.9101f, 21.97f, 11.7301f, 21.92f)
                lineTo(5.6501f, 20.18f)
                curveTo(5.2601f, 20.07f, 4.9801f, 19.73f, 4.9301f, 19.33f)
                lineTo(3.1301f, 3.11f)
                curveTo(3.0601f, 2.52f, 3.5201f, 2.0f, 4.1201f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 6.98f)
                lineTo(16.5f, 7.0f)
                lineTo(15.5f, 16.0f)
                lineTo(12.0f, 17.0f)
                lineTo(8.5f, 16.0f)
                lineTo(8.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(16.06f)
            }
        }
        .build()
        return `_html-3`!!
    }

private var `_html-3`: ImageVector? = null
