package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Security: ImageVector
    get() {
        if (_security != null) {
            return _security!!
        }
        _security = Builder(name = "Security", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 22.7501f)
                curveTo(11.7598f, 22.7501f, 11.5199f, 22.7201f, 11.2899f, 22.6501f)
                curveTo(6.0999f, 21.2201f, 2.3398f, 16.37f, 2.3398f, 11.11f)
                verticalLineTo(6.72f)
                curveTo(2.3398f, 5.6f, 3.1498f, 4.3901f, 4.1898f, 3.9601f)
                lineTo(9.7599f, 1.6801f)
                curveTo(11.2099f, 1.09f, 12.7998f, 1.09f, 14.2398f, 1.6801f)
                lineTo(19.8098f, 3.9601f)
                curveTo(20.8498f, 4.3901f, 21.6599f, 5.6f, 21.6599f, 6.72f)
                verticalLineTo(11.11f)
                curveTo(21.6599f, 16.36f, 17.8898f, 21.2101f, 12.7098f, 22.6501f)
                curveTo(12.4798f, 22.7201f, 12.2398f, 22.7501f, 11.9998f, 22.7501f)
                close()
                moveTo(11.9998f, 2.7501f)
                curveTo(11.4298f, 2.7501f, 10.8698f, 2.8601f, 10.3298f, 3.0801f)
                lineTo(4.7599f, 5.36f)
                curveTo(4.2799f, 5.56f, 3.8398f, 6.21f, 3.8398f, 6.73f)
                verticalLineTo(11.1201f)
                curveTo(3.8398f, 15.7101f, 7.1399f, 19.9501f, 11.6898f, 21.2101f)
                curveTo(11.8898f, 21.2701f, 12.1098f, 21.2701f, 12.3098f, 21.2101f)
                curveTo(16.8598f, 19.9501f, 20.1599f, 15.7101f, 20.1599f, 11.1201f)
                verticalLineTo(6.73f)
                curveTo(20.1599f, 6.21f, 19.7198f, 5.56f, 19.2398f, 5.36f)
                lineTo(13.6699f, 3.0801f)
                curveTo(13.1299f, 2.8601f, 12.5698f, 2.7501f, 11.9998f, 2.7501f)
                close()
            }
        }
        .build()
        return _security!!
    }

private var _security: ImageVector? = null
