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

public val TwotoneGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8703f, 5.6701f)
                lineTo(6.4503f, 7.7501f)
                lineTo(4.8903f, 5.1901f)
                curveTo(4.3203f, 4.2501f, 4.6203f, 3.0101f, 5.5603f, 2.4401f)
                curveTo(6.5003f, 1.8701f, 7.7403f, 2.1701f, 8.3103f, 3.1101f)
                lineTo(9.8703f, 5.6701f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.8191f, 9.1601f)
                lineTo(8.6591f, 11.0801f)
                curveTo(6.8191f, 12.2001f, 6.2591f, 14.4601f, 7.1491f, 16.2601f)
                lineTo(9.1991f, 20.4401f)
                curveTo(9.8591f, 21.7901f, 11.4591f, 22.2601f, 12.7391f, 21.4701f)
                lineTo(19.1691f, 17.5601f)
                curveTo(20.4591f, 16.7801f, 20.7691f, 15.1501f, 19.8791f, 13.9401f)
                lineTo(17.1091f, 10.2001f)
                curveTo(15.9091f, 8.5801f, 13.6591f, 8.0401f, 11.8191f, 9.1601f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7574f, 5.0981f)
                lineTo(5.6328f, 8.2188f)
                lineTo(7.7132f, 11.6351f)
                lineTo(12.8378f, 8.5146f)
                lineTo(10.7574f, 5.0981f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3105f, 16.8101f)
                lineTo(15.9606f, 19.5201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 18.3701f)
                lineTo(13.4f, 21.0801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8691f, 15.25f)
                lineTo(18.5191f, 17.96f)
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
