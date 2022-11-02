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

public val TwotoneGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(15.7279f, 15.0f, 18.75f, 12.0899f, 18.75f, 8.5f)
                curveTo(18.75f, 4.9102f, 15.7279f, 2.0f, 12.0f, 2.0f)
                curveTo(8.2721f, 2.0f, 5.25f, 4.9102f, 5.25f, 8.5f)
                curveTo(5.25f, 12.0899f, 8.2721f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5197f, 13.5198f)
                lineTo(7.5098f, 20.8998f)
                curveTo(7.5098f, 21.7998f, 8.1398f, 22.2398f, 8.9198f, 21.8698f)
                lineTo(11.5998f, 20.5999f)
                curveTo(11.8198f, 20.4899f, 12.1898f, 20.4899f, 12.4098f, 20.5999f)
                lineTo(15.0998f, 21.8698f)
                curveTo(15.8698f, 22.2298f, 16.5098f, 21.7998f, 16.5098f, 20.8998f)
                verticalLineTo(13.3398f)
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
