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

public val TwotoneGroup.Teacher: ImageVector
    get() {
        if (_teacher != null) {
            return _teacher!!
        }
        _teacher = Builder(name = "Teacher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0495f, 2.5298f)
                lineTo(4.0295f, 6.4598f)
                curveTo(2.0995f, 7.7198f, 2.0995f, 10.5398f, 4.0295f, 11.7998f)
                lineTo(10.0495f, 15.7298f)
                curveTo(11.1295f, 16.4398f, 12.9095f, 16.4398f, 13.9895f, 15.7298f)
                lineTo(19.9795f, 11.7998f)
                curveTo(21.8995f, 10.5398f, 21.8995f, 7.7298f, 19.9795f, 6.4698f)
                lineTo(13.9895f, 2.5398f)
                curveTo(12.9095f, 1.8198f, 11.1295f, 1.8198f, 10.0495f, 2.5298f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6291f, 13.0801f)
                lineTo(5.6191f, 17.7701f)
                curveTo(5.6191f, 19.0401f, 6.5991f, 20.4001f, 7.7991f, 20.8001f)
                lineTo(10.9891f, 21.8601f)
                curveTo(11.5391f, 22.0401f, 12.4491f, 22.0401f, 13.0091f, 21.8601f)
                lineTo(16.1991f, 20.8001f)
                curveTo(17.3991f, 20.4001f, 18.3791f, 19.0401f, 18.3791f, 17.7701f)
                verticalLineTo(13.1301f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4004f, 15.0f)
                verticalLineTo(9.0f)
            }
        }
        .build()
        return _teacher!!
    }

private var _teacher: ImageVector? = null
