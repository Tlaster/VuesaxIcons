package moe.tlaster.icons.vuesax.vuesaxicons.crypto.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.TwotoneGroup

public val TwotoneGroup.Trontron: ImageVector
    get() {
        if (_trontron != null) {
            return _trontron!!
        }
        _trontron = Builder(name = "Trontron", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.6401f, 3.5899f)
                lineTo(9.3601f, 20.3899f)
                curveTo(9.7101f, 21.2799f, 10.4901f, 21.3899f, 11.0701f, 20.6399f)
                lineTo(20.4501f, 8.6999f)
                curveTo(20.7501f, 8.3199f, 20.7201f, 7.7199f, 20.3701f, 7.3799f)
                lineTo(17.2401f, 4.2499f)
                curveTo(17.1101f, 4.1199f, 16.8501f, 3.9899f, 16.6701f, 3.9699f)
                lineTo(3.7001f, 2.2299f)
                curveTo(2.7601f, 2.0999f, 2.2901f, 2.7099f, 2.6401f, 3.5899f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9998f, 20.9999f)
                lineTo(10.9998f, 9.9999f)
                lineTo(3.0098f, 2.8999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(11.0f, 10.0f)
                lineTo(20.04f, 8.19f)
            }
        }
        .build()
        return _trontron!!
    }

private var _trontron: ImageVector? = null
