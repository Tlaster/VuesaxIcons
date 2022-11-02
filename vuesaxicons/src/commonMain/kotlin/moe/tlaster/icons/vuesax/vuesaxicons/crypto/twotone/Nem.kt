package moe.tlaster.icons.vuesax.vuesaxicons.crypto.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.TwotoneGroup

public val TwotoneGroup.Nem: ImageVector
    get() {
        if (_nem != null) {
            return _nem!!
        }
        _nem = Builder(name = "Nem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.0002f)
                curveTo(2.0f, 5.0002f, 12.0f, -0.9998f, 22.0f, 5.0002f)
                curveTo(22.0f, 5.0002f, 22.0f, 16.0002f, 12.0f, 22.0002f)
                curveTo(12.0f, 22.0002f, 2.0f, 17.0002f, 2.0f, 5.0002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0996f, 7.0701f)
                curveTo(5.2096f, 17.1501f, 11.9996f, 10.0001f, 11.9996f, 10.0001f)
                curveTo(10.9996f, 4.0001f, 16.0696f, 2.9401f, 16.0696f, 2.9401f)
                lineTo(16.6596f, 2.8301f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.35f, 18.51f)
                curveTo(16.35f, 18.51f, 19.0f, 13.0f, 12.0f, 10.0f)
            }
        }
        .build()
        return _nem!!
    }

private var _nem: ImageVector? = null
