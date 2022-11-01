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

public val BulkGroup.Nemxem: ImageVector
    get() {
        if (_nemxem != null) {
            return _nemxem!!
        }
        _nemxem = Builder(name = "Nemxem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3596f, 18.4901f)
                curveTo(16.3496f, 18.5001f, 16.3496f, 18.5101f, 16.3496f, 18.5101f)
                curveTo(15.1596f, 19.7701f, 13.7296f, 20.9601f, 11.9996f, 22.0001f)
                curveTo(11.9996f, 22.0001f, 3.1596f, 17.5801f, 2.0996f, 7.0801f)
                curveTo(5.2096f, 17.1501f, 11.9996f, 10.0001f, 11.9996f, 10.0001f)
                curveTo(18.7596f, 12.9001f, 16.5196f, 18.1401f, 16.3596f, 18.4901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3597f, 18.4898f)
                curveTo(16.5197f, 18.1398f, 18.7598f, 12.8998f, 11.9998f, 9.9998f)
                curveTo(10.9998f, 3.9998f, 16.0698f, 2.9398f, 16.0698f, 2.9398f)
                lineTo(16.6597f, 2.8198f)
                horizontalLineTo(16.6697f)
                curveTo(18.4097f, 3.2298f, 20.1998f, 3.9198f, 21.9998f, 4.9998f)
                curveTo(21.9998f, 4.9998f, 21.9997f, 12.4998f, 16.3597f, 18.4898f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.66f, 2.8198f)
                lineTo(16.07f, 2.9398f)
                curveTo(16.07f, 2.9398f, 11.0f, 3.9998f, 12.0f, 9.9998f)
                curveTo(12.0f, 9.9998f, 5.21f, 17.1498f, 2.1f, 7.0798f)
                verticalLineTo(7.0698f)
                curveTo(2.04f, 6.4098f, 2.0f, 5.7098f, 2.0f, 4.9998f)
                curveTo(2.0f, 4.9998f, 8.72f, 0.9698f, 16.66f, 2.8198f)
                close()
            }
        }
        .build()
        return _nemxem!!
    }

private var _nemxem: ImageVector? = null
