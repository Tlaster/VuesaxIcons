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

public val OutlineGroup.Tether: ImageVector
    get() {
        if (_tether != null) {
            return _tether!!
        }
        _tether = Builder(name = "Tether", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9997f, 21.3999f)
                curveTo(11.0597f, 21.3999f, 10.1197f, 21.0799f, 9.4097f, 20.4299f)
                lineTo(2.4797f, 14.1399f)
                curveTo(1.2697f, 13.0399f, 0.8897f, 11.0299f, 1.6197f, 9.5699f)
                lineTo(4.0197f, 4.7499f)
                curveTo(4.6197f, 3.5499f, 6.1297f, 2.6099f, 7.4697f, 2.6099f)
                horizontalLineTo(16.5297f)
                curveTo(17.8697f, 2.6099f, 19.3797f, 3.5499f, 19.9797f, 4.7499f)
                lineTo(22.3797f, 9.5699f)
                curveTo(23.1097f, 11.0299f, 22.7297f, 13.0399f, 21.5197f, 14.1399f)
                lineTo(14.5897f, 20.4299f)
                curveTo(13.8797f, 21.0699f, 12.9397f, 21.3999f, 11.9997f, 21.3999f)
                close()
                moveTo(7.4697f, 4.0999f)
                curveTo(6.6897f, 4.0999f, 5.7097f, 4.7099f, 5.3597f, 5.4099f)
                lineTo(2.9597f, 10.2299f)
                curveTo(2.5397f, 11.0799f, 2.7797f, 12.3799f, 3.4897f, 13.0199f)
                lineTo(10.4197f, 19.3099f)
                curveTo(11.2797f, 20.0899f, 12.7297f, 20.0899f, 13.5797f, 19.3099f)
                lineTo(20.5097f, 13.0199f)
                curveTo(21.2097f, 12.3799f, 21.4597f, 11.0799f, 21.0397f, 10.2299f)
                lineTo(18.6397f, 5.4099f)
                curveTo(18.2897f, 4.7199f, 17.3097f, 4.1099f, 16.5297f, 4.1099f)
                horizontalLineTo(7.4697f)
                verticalLineTo(4.0999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.25f)
                curveTo(11.59f, 15.25f, 11.25f, 14.91f, 11.25f, 14.5f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.09f, 11.59f, 7.75f, 12.0f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 8.09f, 12.75f, 8.5f)
                verticalLineTo(14.5f)
                curveTo(12.75f, 14.91f, 12.41f, 15.25f, 12.0f, 15.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.25f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 9.25f, 7.25f, 8.91f, 7.25f, 8.5f)
                curveTo(7.25f, 8.09f, 7.59f, 7.75f, 8.0f, 7.75f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 7.75f, 16.75f, 8.09f, 16.75f, 8.5f)
                curveTo(16.75f, 8.91f, 16.41f, 9.25f, 16.0f, 9.25f)
                close()
            }
        }
        .build()
        return _tether!!
    }

private var _tether: ImageVector? = null
