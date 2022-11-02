package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Videoslash: ImageVector
    get() {
        if (_videoslash != null) {
            return _videoslash!!
        }
        _videoslash = Builder(name = "Videoslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.1499f)
                verticalLineTo(16.2099f)
                curveTo(2.0f, 17.4699f, 2.38f, 18.7399f, 3.37f, 19.5499f)
                lineTo(4.0f, 19.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.63f, 7.5801f)
                curveTo(16.63f, 7.5801f, 16.66f, 6.6301f, 16.63f, 6.3201f)
                curveTo(16.46f, 4.2801f, 15.13f, 3.5801f, 12.52f, 3.5801f)
                horizontalLineTo(6.21f)
                curveTo(3.05f, 3.5801f, 2.0f, 4.6301f, 2.0f, 7.7901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.7398f, 10.95f)
                verticalLineTo(16.21f)
                curveTo(16.7398f, 19.37f, 15.6898f, 20.42f, 12.5298f, 20.42f)
                horizontalLineTo(7.2598f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0002f, 6.74f)
                verticalLineTo(15.81f)
                curveTo(22.0002f, 17.48f, 20.8802f, 18.06f, 19.5202f, 17.1f)
                lineTo(16.7402f, 15.15f)
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
