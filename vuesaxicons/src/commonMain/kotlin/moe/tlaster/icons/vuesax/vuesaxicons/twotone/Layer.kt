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

public val TwotoneGroup.Layer: ImageVector
    get() {
        if (_layer != null) {
            return _layer!!
        }
        _layer = Builder(name = "Layer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0095f, 2.9198f)
                lineTo(18.9095f, 5.5398f)
                curveTo(20.6095f, 6.2898f, 20.6095f, 7.5298f, 18.9095f, 8.2798f)
                lineTo(13.0095f, 10.8998f)
                curveTo(12.3395f, 11.1998f, 11.2395f, 11.1998f, 10.5695f, 10.8998f)
                lineTo(4.6695f, 8.2798f)
                curveTo(2.9695f, 7.5298f, 2.9695f, 6.2898f, 4.6695f, 5.5398f)
                lineTo(10.5695f, 2.9198f)
                curveTo(11.2395f, 2.6198f, 12.3395f, 2.6198f, 13.0095f, 2.9198f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.0f)
                curveTo(3.0f, 11.84f, 3.63f, 12.81f, 4.4f, 13.15f)
                lineTo(11.19f, 16.17f)
                curveTo(11.71f, 16.4f, 12.3f, 16.4f, 12.81f, 16.17f)
                lineTo(19.6f, 13.15f)
                curveTo(20.37f, 12.81f, 21.0f, 11.84f, 21.0f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                curveTo(3.0f, 16.93f, 3.55f, 17.77f, 4.4f, 18.15f)
                lineTo(11.19f, 21.17f)
                curveTo(11.71f, 21.4f, 12.3f, 21.4f, 12.81f, 21.17f)
                lineTo(19.6f, 18.15f)
                curveTo(20.45f, 17.77f, 21.0f, 16.93f, 21.0f, 16.0f)
            }
        }
        .build()
        return _layer!!
    }

private var _layer: ImageVector? = null
