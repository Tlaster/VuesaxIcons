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

public val OutlineGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0004f, 22.7599f)
                curveTo(10.9104f, 22.7599f, 9.8304f, 22.4399f, 8.9804f, 21.8099f)
                lineTo(4.6804f, 18.5999f)
                curveTo(3.5404f, 17.7499f, 2.6504f, 15.9699f, 2.6504f, 14.5599f)
                verticalLineTo(7.1199f)
                curveTo(2.6504f, 5.5799f, 3.7804f, 3.9399f, 5.2304f, 3.3999f)
                lineTo(10.2204f, 1.5299f)
                curveTo(11.2104f, 1.1599f, 12.7704f, 1.1599f, 13.7604f, 1.5299f)
                lineTo(18.7504f, 3.3999f)
                curveTo(20.2004f, 3.9399f, 21.3304f, 5.5799f, 21.3304f, 7.1199f)
                verticalLineTo(14.5499f)
                curveTo(21.3304f, 15.9699f, 20.4404f, 17.7399f, 19.3004f, 18.5899f)
                lineTo(15.0004f, 21.7999f)
                curveTo(14.1704f, 22.4399f, 13.0904f, 22.7599f, 12.0004f, 22.7599f)
                close()
                moveTo(10.7504f, 2.9399f)
                lineTo(5.7604f, 4.8099f)
                curveTo(4.9104f, 5.1299f, 4.1604f, 6.2099f, 4.1604f, 7.1299f)
                verticalLineTo(14.5599f)
                curveTo(4.1604f, 15.5099f, 4.8304f, 16.8399f, 5.5804f, 17.3999f)
                lineTo(9.8804f, 20.6099f)
                curveTo(11.0304f, 21.4699f, 12.9704f, 21.4699f, 14.1304f, 20.6099f)
                lineTo(18.4304f, 17.3999f)
                curveTo(19.1904f, 16.8299f, 19.8504f, 15.5099f, 19.8504f, 14.5599f)
                verticalLineTo(7.1199f)
                curveTo(19.8504f, 6.2099f, 19.1004f, 5.1299f, 18.2504f, 4.7999f)
                lineTo(13.2604f, 2.9299f)
                curveTo(12.5804f, 2.6899f, 11.4204f, 2.6899f, 10.7504f, 2.9399f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
