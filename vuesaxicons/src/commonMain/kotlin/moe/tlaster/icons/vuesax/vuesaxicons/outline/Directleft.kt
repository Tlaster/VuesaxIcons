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

public val OutlineGroup.Directleft: ImageVector
    get() {
        if (_directleft != null) {
            return _directleft!!
        }
        _directleft = Builder(name = "Directleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.81f, 22.0599f)
                curveTo(17.18f, 22.0599f, 16.55f, 21.9099f, 15.95f, 21.5899f)
                lineTo(4.36f, 15.4899f)
                curveTo(3.06f, 14.8099f, 2.25f, 13.4699f, 2.25f, 11.9999f)
                curveTo(2.25f, 10.5299f, 3.06f, 9.1899f, 4.36f, 8.5099f)
                lineTo(15.95f, 2.4099f)
                curveTo(17.5f, 1.5999f, 19.3f, 1.8599f, 20.55f, 3.0799f)
                curveTo(21.8f, 4.2999f, 22.1f, 6.0999f, 21.32f, 7.6599f)
                lineTo(19.7f, 10.8999f)
                curveTo(19.36f, 11.5799f, 19.36f, 12.3999f, 19.7f, 13.0899f)
                lineTo(21.32f, 16.3299f)
                curveTo(22.1f, 17.8899f, 21.8f, 19.6899f, 20.55f, 20.9099f)
                curveTo(19.78f, 21.6699f, 18.81f, 22.0599f, 17.81f, 22.0599f)
                close()
                moveTo(17.8f, 3.4399f)
                curveTo(17.44f, 3.4399f, 17.05f, 3.5299f, 16.65f, 3.7399f)
                lineTo(5.06f, 9.8399f)
                curveTo(4.24f, 10.2699f, 3.75f, 11.0799f, 3.75f, 11.9999f)
                curveTo(3.75f, 12.9199f, 4.24f, 13.7299f, 5.06f, 14.1599f)
                lineTo(16.65f, 20.2599f)
                curveTo(17.81f, 20.8699f, 18.89f, 20.4499f, 19.5f, 19.8399f)
                curveTo(20.12f, 19.2399f, 20.56f, 18.1699f, 19.98f, 16.9999f)
                lineTo(18.36f, 13.7599f)
                curveTo(17.81f, 12.6499f, 17.81f, 11.3399f, 18.36f, 10.2299f)
                lineTo(19.98f, 6.9899f)
                curveTo(20.57f, 5.8199f, 20.12f, 4.7499f, 19.5f, 4.1499f)
                curveTo(19.1f, 3.7599f, 18.5f, 3.4399f, 17.8f, 3.4399f)
                close()
            }
        }
        .build()
        return _directleft!!
    }

private var _directleft: ImageVector? = null
