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

public val OutlineGroup.Directup: ImageVector
    get() {
        if (_directup != null) {
            return _directup!!
        }
        _directup = Builder(name = "Directup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1198f, 21.75f)
                curveTo(17.5198f, 21.75f, 16.9098f, 21.61f, 16.3298f, 21.32f)
                lineTo(13.0898f, 19.7f)
                curveTo(12.4098f, 19.36f, 11.5898f, 19.36f, 10.8998f, 19.7f)
                lineTo(7.6599f, 21.32f)
                curveTo(6.0999f, 22.1f, 4.2998f, 21.8f, 3.0798f, 20.55f)
                curveTo(1.8599f, 19.3f, 1.5898f, 17.5f, 2.4098f, 15.95f)
                lineTo(8.5098f, 4.36f)
                curveTo(9.1898f, 3.06f, 10.5298f, 2.25f, 11.9998f, 2.25f)
                curveTo(13.4698f, 2.25f, 14.8098f, 3.06f, 15.4898f, 4.36f)
                lineTo(21.5898f, 15.95f)
                curveTo(22.3998f, 17.5f, 22.1398f, 19.3f, 20.9198f, 20.55f)
                curveTo(20.1498f, 21.34f, 19.1498f, 21.75f, 18.1198f, 21.75f)
                close()
                moveTo(11.9998f, 17.94f)
                curveTo(12.6098f, 17.94f, 13.2098f, 18.08f, 13.7598f, 18.35f)
                lineTo(16.9998f, 19.97f)
                curveTo(18.1698f, 20.56f, 19.2398f, 20.11f, 19.8398f, 19.49f)
                curveTo(20.4398f, 18.87f, 20.8698f, 17.8f, 20.2598f, 16.64f)
                lineTo(14.1598f, 5.05f)
                curveTo(13.7298f, 4.24f, 12.9198f, 3.75f, 11.9998f, 3.75f)
                curveTo(11.0798f, 3.75f, 10.2698f, 4.24f, 9.8399f, 5.06f)
                lineTo(3.7399f, 16.65f)
                curveTo(3.1298f, 17.81f, 3.5498f, 18.89f, 4.1599f, 19.5f)
                curveTo(4.7698f, 20.11f, 5.8299f, 20.56f, 6.9998f, 19.98f)
                lineTo(10.2398f, 18.36f)
                curveTo(10.7898f, 18.08f, 11.3898f, 17.94f, 11.9998f, 17.94f)
                close()
            }
        }
        .build()
        return _directup!!
    }

private var _directup: ImageVector? = null
