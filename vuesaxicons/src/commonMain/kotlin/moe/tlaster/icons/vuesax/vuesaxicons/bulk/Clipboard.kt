package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.89f, 2.8799f)
                lineTo(9.2f, 2.1399f)
                curveTo(5.29f, 1.5299f, 3.48f, 2.8499f, 2.86f, 6.7599f)
                lineTo(2.12f, 11.4499f)
                curveTo(1.72f, 14.0099f, 2.14f, 15.6699f, 3.59f, 16.6799f)
                curveTo(4.35f, 17.2199f, 5.39f, 17.5799f, 6.74f, 17.7899f)
                lineTo(11.43f, 18.5299f)
                curveTo(15.34f, 19.1399f, 17.15f, 17.8199f, 17.77f, 13.9099f)
                lineTo(18.5f, 9.2199f)
                curveTo(18.62f, 8.4499f, 18.67f, 7.7599f, 18.63f, 7.1499f)
                curveTo(18.5f, 4.6499f, 17.03f, 3.3699f, 13.89f, 2.8799f)
                close()
                moveTo(8.24f, 9.3499f)
                curveTo(7.07f, 9.3499f, 6.12f, 8.3999f, 6.12f, 7.2399f)
                curveTo(6.12f, 6.0699f, 7.07f, 5.1199f, 8.24f, 5.1199f)
                curveTo(9.4f, 5.1199f, 10.35f, 6.0699f, 10.35f, 7.2399f)
                curveTo(10.35f, 8.3999f, 9.4f, 9.3499f, 8.24f, 9.3499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
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
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3491f, 7.2401f)
                curveTo(10.3491f, 8.4001f, 9.3991f, 9.3501f, 8.2391f, 9.3501f)
                curveTo(7.0691f, 9.3501f, 6.1191f, 8.4001f, 6.1191f, 7.2401f)
                curveTo(6.1191f, 6.0701f, 7.0691f, 5.1201f, 8.2391f, 5.1201f)
                curveTo(9.3991f, 5.1201f, 10.3491f, 6.0701f, 10.3491f, 7.2401f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
