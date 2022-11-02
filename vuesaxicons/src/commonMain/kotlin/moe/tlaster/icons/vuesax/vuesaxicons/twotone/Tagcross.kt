package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Tagcross: ImageVector
    get() {
        if (_tagcross != null) {
            return _tagcross!!
        }
        _tagcross = Builder(name = "Tagcross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.2797f, 20.25f)
                horizontalLineTo(16.9997f)
                curveTo(19.7597f, 20.25f, 21.9997f, 18.01f, 21.9997f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(21.9997f, 5.99f, 19.7597f, 3.75f, 16.9997f, 3.75f)
                horizontalLineTo(10.2797f)
                curveTo(8.8697f, 3.75f, 7.5297f, 4.34f, 6.5797f, 5.39f)
                lineTo(3.0497f, 9.27f)
                curveTo(1.6397f, 10.82f, 1.6397f, 13.18f, 3.0497f, 14.73f)
                lineTo(6.5797f, 18.61f)
                curveTo(7.5297f, 19.66f, 8.8697f, 20.25f, 10.2797f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0005f, 14.4703f)
                lineTo(11.0605f, 9.5303f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0605f, 14.4703f)
                lineTo(16.0005f, 9.5303f)
            }
        }
        .build()
        return _tagcross!!
    }

private var _tagcross: ImageVector? = null
