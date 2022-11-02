package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Hex: ImageVector
    get() {
        if (_hex != null) {
            return _hex!!
        }
        _hex = Builder(name = "Hex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.3398f)
                horizontalLineTo(7.0f)
                lineTo(2.0f, 11.9998f)
                lineTo(7.0f, 20.6599f)
                horizontalLineTo(17.0f)
                lineTo(22.0f, 11.9998f)
                lineTo(17.0f, 3.3398f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.8696f, 14.0f)
                horizontalLineTo(7.0296f)
                lineTo(5.0996f, 17.33f)
                lineTo(7.0296f, 20.66f)
                horizontalLineTo(10.8696f)
                lineTo(12.7996f, 17.33f)
                lineTo(10.8696f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3399f, 8.0f)
                horizontalLineTo(7.0299f)
                lineTo(3.3799f, 14.33f)
                lineTo(7.0299f, 20.66f)
                horizontalLineTo(14.3399f)
                lineTo(17.9999f, 14.33f)
                lineTo(14.3399f, 8.0f)
                close()
            }
        }
        .build()
        return _hex!!
    }

private var _hex: ImageVector? = null
