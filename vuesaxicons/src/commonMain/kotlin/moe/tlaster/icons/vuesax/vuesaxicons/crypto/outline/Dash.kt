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

public val OutlineGroup.Dash: ImageVector
    get() {
        if (_dash != null) {
            return _dash!!
        }
        _dash = Builder(name = "Dash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5003f, 21.25f)
                horizontalLineTo(3.9403f)
                curveTo(3.7103f, 21.25f, 3.4903f, 21.14f, 3.3503f, 20.96f)
                curveTo(3.2103f, 20.78f, 3.1603f, 20.54f, 3.2103f, 20.32f)
                lineTo(4.2703f, 16.07f)
                curveTo(4.3503f, 15.74f, 4.6503f, 15.5f, 5.0003f, 15.5f)
                horizontalLineTo(12.4403f)
                curveTo(15.3403f, 15.5f, 17.0003f, 13.84f, 17.0003f, 10.94f)
                verticalLineTo(10.75f)
                curveTo(17.0003f, 9.15f, 16.3503f, 8.5f, 14.7503f, 8.5f)
                horizontalLineTo(6.0603f)
                curveTo(5.8303f, 8.5f, 5.6103f, 8.39f, 5.4703f, 8.21f)
                curveTo(5.3303f, 8.03f, 5.2803f, 7.79f, 5.3303f, 7.57f)
                lineTo(6.3903f, 3.32f)
                curveTo(6.4703f, 2.99f, 6.7703f, 2.75f, 7.1203f, 2.75f)
                horizontalLineTo(16.0003f)
                curveTo(20.1603f, 2.75f, 22.7503f, 5.34f, 22.7503f, 9.5f)
                verticalLineTo(12.0f)
                curveTo(22.7503f, 17.71f, 19.2103f, 21.25f, 13.5003f, 21.25f)
                close()
                moveTo(4.9003f, 19.75f)
                horizontalLineTo(13.5003f)
                curveTo(18.3503f, 19.75f, 21.2503f, 16.85f, 21.2503f, 12.0f)
                verticalLineTo(9.5f)
                curveTo(21.2503f, 6.16f, 19.3403f, 4.25f, 16.0003f, 4.25f)
                horizontalLineTo(7.7103f)
                lineTo(7.0203f, 7.0f)
                horizontalLineTo(14.7503f)
                curveTo(17.1703f, 7.0f, 18.5003f, 8.33f, 18.5003f, 10.75f)
                verticalLineTo(10.94f)
                curveTo(18.5003f, 14.68f, 16.1803f, 17.0f, 12.4403f, 17.0f)
                horizontalLineTo(5.5903f)
                lineTo(4.9003f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1899f, 14.2498f)
                horizontalLineTo(1.9999f)
                curveTo(1.7699f, 14.2498f, 1.5499f, 14.1398f, 1.4099f, 13.9598f)
                curveTo(1.2699f, 13.7798f, 1.2199f, 13.5398f, 1.2699f, 13.3198f)
                lineTo(1.6399f, 11.8398f)
                curveTo(1.9499f, 10.6098f, 3.0399f, 9.7598f, 4.3099f, 9.7598f)
                horizontalLineTo(11.4999f)
                curveTo(11.7299f, 9.7598f, 11.9499f, 9.8698f, 12.0899f, 10.0498f)
                curveTo(12.2299f, 10.2298f, 12.2799f, 10.4698f, 12.2299f, 10.6898f)
                lineTo(11.8599f, 12.1698f)
                curveTo(11.5499f, 13.3898f, 10.4499f, 14.2498f, 9.1899f, 14.2498f)
                close()
                moveTo(2.9599f, 12.7498f)
                horizontalLineTo(9.1899f)
                curveTo(9.7599f, 12.7498f, 10.2599f, 12.3598f, 10.3999f, 11.7998f)
                lineTo(10.5399f, 11.2498f)
                horizontalLineTo(4.3099f)
                curveTo(3.7399f, 11.2498f, 3.2399f, 11.6398f, 3.0999f, 12.1998f)
                lineTo(2.9599f, 12.7498f)
                close()
            }
        }
        .build()
        return _dash!!
    }

private var _dash: ImageVector? = null
