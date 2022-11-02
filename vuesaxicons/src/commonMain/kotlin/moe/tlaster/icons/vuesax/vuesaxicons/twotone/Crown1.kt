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

public val TwotoneGroup.Crown1: ImageVector
    get() {
        if (_crown1 != null) {
            return _crown1!!
        }
        _crown1 = Builder(name = "Crown1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.6992f, 18.9799f)
                horizontalLineTo(7.2992f)
                curveTo(6.8792f, 18.9799f, 6.4092f, 18.6499f, 6.2692f, 18.2499f)
                lineTo(2.1292f, 6.6699f)
                curveTo(1.5392f, 5.0099f, 2.2292f, 4.4999f, 3.6492f, 5.5199f)
                lineTo(7.5492f, 8.3099f)
                curveTo(8.1992f, 8.7599f, 8.9392f, 8.5299f, 9.2192f, 7.7999f)
                lineTo(10.9792f, 3.1099f)
                curveTo(11.5392f, 1.6099f, 12.4692f, 1.6099f, 13.0292f, 3.1099f)
                lineTo(14.7892f, 7.7999f)
                curveTo(15.0692f, 8.5299f, 15.8092f, 8.7599f, 16.4492f, 8.3099f)
                lineTo(20.1092f, 5.6999f)
                curveTo(21.6692f, 4.5799f, 22.4192f, 5.1499f, 21.7792f, 6.9599f)
                lineTo(17.7392f, 18.2699f)
                curveTo(17.5892f, 18.6499f, 17.1192f, 18.9799f, 16.6992f, 18.9799f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 22.0f)
                horizontalLineTo(17.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 14.0f)
                horizontalLineTo(14.5f)
            }
        }
        .build()
        return _crown1!!
    }

private var _crown1: ImageVector? = null
