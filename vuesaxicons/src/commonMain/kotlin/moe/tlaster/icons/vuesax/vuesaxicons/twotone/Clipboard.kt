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

public val TwotoneGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.63f, 7.1501f)
                curveTo(18.67f, 7.7601f, 18.62f, 8.4501f, 18.5f, 9.2201f)
                lineTo(17.77f, 13.9101f)
                curveTo(17.15f, 17.8201f, 15.34f, 19.1401f, 11.43f, 18.5301f)
                lineTo(6.74f, 17.7901f)
                curveTo(5.39f, 17.5801f, 4.35f, 17.2201f, 3.59f, 16.6801f)
                curveTo(2.14f, 15.6701f, 1.72f, 14.0101f, 2.12f, 11.4501f)
                lineTo(2.86f, 6.7601f)
                curveTo(3.48f, 2.8501f, 5.29f, 1.5301f, 9.2f, 2.1401f)
                lineTo(13.89f, 2.8801f)
                curveTo(17.03f, 3.3701f, 18.5f, 4.6501f, 18.63f, 7.1501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4998f, 13.4699f)
                lineTo(18.9998f, 17.9799f)
                curveTo(17.7498f, 21.7399f, 15.7498f, 22.7399f, 11.9898f, 21.4899f)
                lineTo(7.4798f, 19.9899f)
                curveTo(5.2098f, 19.2399f, 3.9498f, 18.1999f, 3.5898f, 16.6799f)
                curveTo(4.3498f, 17.2199f, 5.3898f, 17.5799f, 6.7398f, 17.7899f)
                lineTo(11.4298f, 18.5299f)
                curveTo(15.3398f, 19.1399f, 17.1498f, 17.8199f, 17.7698f, 13.9099f)
                lineTo(18.4998f, 9.2199f)
                curveTo(18.6198f, 8.4499f, 18.6698f, 7.7599f, 18.6298f, 7.1499f)
                curveTo(21.0198f, 8.4199f, 21.5398f, 10.3399f, 20.4998f, 13.4699f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.24f, 8.98f)
                curveTo(9.201f, 8.98f, 9.98f, 8.201f, 9.98f, 7.24f)
                curveTo(9.98f, 6.279f, 9.201f, 5.5f, 8.24f, 5.5f)
                curveTo(7.279f, 5.5f, 6.5f, 6.279f, 6.5f, 7.24f)
                curveTo(6.5f, 8.201f, 7.279f, 8.98f, 8.24f, 8.98f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
