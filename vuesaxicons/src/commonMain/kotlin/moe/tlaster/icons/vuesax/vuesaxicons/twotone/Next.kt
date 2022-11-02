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

public val TwotoneGroup.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = Builder(name = "Next", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7598f, 7.22f)
                verticalLineTo(16.7901f)
                curveTo(3.7598f, 18.7501f, 5.8898f, 19.98f, 7.5897f, 19.0f)
                lineTo(11.7397f, 16.61f)
                lineTo(15.8898f, 14.21f)
                curveTo(17.5898f, 13.23f, 17.5898f, 10.78f, 15.8898f, 9.8f)
                lineTo(11.7397f, 7.4f)
                lineTo(7.5897f, 5.0101f)
                curveTo(5.8898f, 4.0301f, 3.7598f, 5.2501f, 3.7598f, 7.22f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2402f, 18.1798f)
                verticalLineTo(5.8198f)
            }
        }
        .build()
        return _next!!
    }

private var _next: ImageVector? = null
