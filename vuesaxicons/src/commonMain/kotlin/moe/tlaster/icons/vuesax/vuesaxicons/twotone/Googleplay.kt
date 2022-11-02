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

public val TwotoneGroup.Googleplay: ImageVector
    get() {
        if (_googleplay != null) {
            return _googleplay!!
        }
        _googleplay = Builder(name = "Googleplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.92f, 8.8002f)
                lineTo(13.7f, 12.0202f)
                lineTo(4.12f, 21.6003f)
                lineTo(3.54f, 21.8903f)
                curveTo(2.83f, 22.2403f, 2.0f, 21.7303f, 2.0f, 20.9303f)
                verticalLineTo(3.0703f)
                curveTo(2.0f, 2.2703f, 2.83f, 1.7602f, 3.55f, 2.1102f)
                lineTo(16.92f, 8.8002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3995f, 12.9503f)
                lineTo(16.8795f, 15.2103f)
                lineTo(13.6895f, 12.0203f)
                lineTo(16.9095f, 8.8003f)
                lineTo(21.3995f, 11.0503f)
                curveTo(22.1895f, 11.4403f, 22.1895f, 12.5603f, 21.3995f, 12.9503f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8901f, 15.21f)
                lineTo(4.1201f, 21.6f)
                lineTo(13.7001f, 12.02f)
                lineTo(16.8901f, 15.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.6998f, 12.0201f)
                lineTo(4.0898f, 2.4102f)
            }
        }
        .build()
        return _googleplay!!
    }

private var _googleplay: ImageVector? = null
