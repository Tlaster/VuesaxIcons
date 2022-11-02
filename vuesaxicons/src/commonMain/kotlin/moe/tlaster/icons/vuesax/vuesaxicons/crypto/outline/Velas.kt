package moe.tlaster.icons.vuesax.vuesaxicons.crypto.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.OutlineGroup

public val OutlineGroup.Velas: ImageVector
    get() {
        if (_velas != null) {
            return _velas!!
        }
        _velas = Builder(name = "Velas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.7798f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 3.7798f, 1.25f, 3.4398f, 1.25f, 3.0298f)
                curveTo(1.25f, 2.6198f, 1.59f, 2.2798f, 2.0f, 2.2798f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 2.2798f, 22.75f, 2.6198f, 22.75f, 3.0298f)
                curveTo(22.75f, 3.4398f, 22.41f, 3.7798f, 22.0f, 3.7798f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9997f, 21.7199f)
                curveTo(11.3597f, 21.7199f, 10.7797f, 21.3999f, 10.4297f, 20.8699f)
                lineTo(2.4697f, 8.4799f)
                curveTo(2.0997f, 7.9099f, 2.0796f, 7.1799f, 2.3997f, 6.5799f)
                curveTo(2.7297f, 5.9799f, 3.3497f, 5.6099f, 4.0297f, 5.6099f)
                horizontalLineTo(19.9597f)
                curveTo(20.6397f, 5.6099f, 21.2697f, 5.9799f, 21.5897f, 6.5799f)
                curveTo(21.9197f, 7.1799f, 21.8896f, 7.9099f, 21.5196f, 8.4799f)
                lineTo(13.5597f, 20.8699f)
                curveTo(13.2197f, 21.3999f, 12.6397f, 21.7199f, 11.9997f, 21.7199f)
                close()
                moveTo(4.0397f, 7.1099f)
                curveTo(3.8497f, 7.1099f, 3.7497f, 7.2399f, 3.7197f, 7.2999f)
                curveTo(3.6897f, 7.3599f, 3.6297f, 7.5099f, 3.7297f, 7.6699f)
                lineTo(11.6897f, 20.0599f)
                curveTo(11.7797f, 20.1999f, 11.9196f, 20.2299f, 11.9896f, 20.2299f)
                curveTo(12.0596f, 20.2299f, 12.1997f, 20.2099f, 12.2897f, 20.0599f)
                lineTo(20.2497f, 7.6699f)
                curveTo(20.3497f, 7.5099f, 20.2897f, 7.3599f, 20.2597f, 7.2999f)
                curveTo(20.2297f, 7.2399f, 20.1397f, 7.1099f, 19.9397f, 7.1099f)
                horizontalLineTo(4.0397f)
                close()
            }
        }
        .build()
        return _velas!!
    }

private var _velas: ImageVector? = null
