package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Hex: ImageVector
    get() {
        if (_hex != null) {
            return _hex!!
        }
        _hex = Builder(name = "Hex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4299f, 21.4099f)
                horizontalLineTo(6.5599f)
                lineTo(1.1299f, 11.9998f)
                lineTo(6.5599f, 2.5898f)
                horizontalLineTo(17.4299f)
                lineTo(22.8599f, 11.9998f)
                lineTo(17.4299f, 21.4099f)
                close()
                moveTo(7.4299f, 19.9099f)
                horizontalLineTo(16.5599f)
                lineTo(21.1299f, 11.9998f)
                lineTo(16.5599f, 4.0898f)
                horizontalLineTo(7.4299f)
                lineTo(2.8699f, 11.9998f)
                lineTo(7.4299f, 19.9099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3102f, 21.41f)
                horizontalLineTo(6.6002f)
                lineTo(4.2402f, 17.33f)
                lineTo(6.6002f, 13.25f)
                horizontalLineTo(11.3102f)
                lineTo(13.6703f, 17.33f)
                lineTo(11.3102f, 21.41f)
                close()
                moveTo(7.4602f, 19.91f)
                horizontalLineTo(10.4402f)
                lineTo(11.9302f, 17.33f)
                lineTo(10.4402f, 14.75f)
                horizontalLineTo(7.4602f)
                lineTo(5.9703f, 17.33f)
                lineTo(7.4602f, 19.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7798f, 21.41f)
                horizontalLineTo(6.5998f)
                lineTo(2.5098f, 14.33f)
                lineTo(6.5998f, 7.25f)
                horizontalLineTo(14.7798f)
                lineTo(18.8698f, 14.33f)
                lineTo(14.7798f, 21.41f)
                close()
                moveTo(7.4698f, 19.91f)
                horizontalLineTo(13.9098f)
                lineTo(17.1298f, 14.33f)
                lineTo(13.9098f, 8.75f)
                horizontalLineTo(7.4698f)
                lineTo(4.2498f, 14.33f)
                lineTo(7.4698f, 19.91f)
                close()
            }
        }
        .build()
        return _hex!!
    }

private var _hex: ImageVector? = null
