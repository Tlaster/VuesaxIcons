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

public val TwotoneGroup.Videoslash: ImageVector
    get() {
        if (_videoslash != null) {
            return _videoslash!!
        }
        _videoslash = Builder(name = "Videoslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.63f, 7.5801f)
                curveTo(16.63f, 7.5801f, 16.66f, 6.6301f, 16.63f, 6.3201f)
                curveTo(16.46f, 4.2801f, 15.13f, 3.5801f, 12.52f, 3.5801f)
                horizontalLineTo(6.21f)
                curveTo(3.05f, 3.5801f, 2.0f, 4.6301f, 2.0f, 7.7901f)
                verticalLineTo(16.2101f)
                curveTo(2.0f, 17.4701f, 2.38f, 18.7401f, 3.37f, 19.5501f)
                lineTo(4.0f, 20.0001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.7398f, 10.9502f)
                verticalLineTo(16.2102f)
                curveTo(16.7398f, 19.3702f, 15.6898f, 20.4202f, 12.5298f, 20.4202f)
                horizontalLineTo(7.2598f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0002f, 6.7402f)
                verticalLineTo(15.8102f)
                curveTo(22.0002f, 17.4802f, 20.8802f, 18.0602f, 19.5202f, 17.1002f)
                lineTo(16.7402f, 15.1502f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0195f, 2.1899f)
                lineTo(2.0195f, 22.1899f)
            }
        }
        .build()
        return _videoslash!!
    }

private var _videoslash: ImageVector? = null
