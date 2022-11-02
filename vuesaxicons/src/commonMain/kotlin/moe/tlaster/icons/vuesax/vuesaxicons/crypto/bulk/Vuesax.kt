package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BulkGroup

public val BulkGroup.Vuesax: ImageVector
    get() {
        if (_vuesax != null) {
            return _vuesax!!
        }
        _vuesax = Builder(name = "Vuesax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 22.7501f)
                curveTo(11.7498f, 22.7501f, 11.5098f, 22.6201f, 11.3698f, 22.4101f)
                lineTo(2.3298f, 8.4101f)
                curveTo(2.1098f, 8.0601f, 2.2098f, 7.6001f, 2.5498f, 7.3701f)
                curveTo(2.8998f, 7.1501f, 3.3598f, 7.2401f, 3.5898f, 7.5901f)
                lineTo(11.9898f, 20.6101f)
                lineTo(20.3598f, 7.5901f)
                curveTo(20.5798f, 7.2401f, 21.0498f, 7.1401f, 21.3998f, 7.3601f)
                curveTo(21.7498f, 7.5801f, 21.8498f, 8.0501f, 21.6298f, 8.4001f)
                lineTo(12.6298f, 22.4001f)
                curveTo(12.4898f, 22.6201f, 12.2598f, 22.7501f, 11.9998f, 22.7501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9197f, 4.0f)
                horizontalLineTo(5.7397f)
                curveTo(5.9097f, 4.0f, 6.0597f, 4.08f, 6.1597f, 4.22f)
                lineTo(11.5997f, 12.37f)
                curveTo(11.7997f, 12.67f, 12.2297f, 12.67f, 12.4297f, 12.37f)
                lineTo(17.8697f, 4.22f)
                curveTo(17.9597f, 4.08f, 18.1197f, 4.0f, 18.2897f, 4.0f)
                horizontalLineTo(20.1097f)
                curveTo(20.5097f, 4.0f, 20.7397f, 4.44f, 20.5297f, 4.77f)
                lineTo(12.4497f, 17.35f)
                curveTo(12.2497f, 17.66f, 11.8097f, 17.66f, 11.6097f, 17.35f)
                lineTo(3.5297f, 4.77f)
                curveTo(3.2797f, 4.44f, 3.5198f, 4.0f, 3.9197f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                lineTo(11.58f, 8.38f)
                curveTo(11.78f, 8.68f, 12.21f, 8.68f, 12.41f, 8.38f)
                lineTo(16.0f, 3.0f)
                lineTo(13.2f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.8f)
                verticalLineTo(4.0f)
                lineTo(8.0f, 3.0f)
                close()
            }
        }
        .build()
        return _vuesax!!
    }

private var _vuesax: ImageVector? = null
