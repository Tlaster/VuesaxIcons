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

public val OutlineGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5002f, 15.4502f)
                curveTo(7.3702f, 15.4502f, 7.2402f, 15.4202f, 7.1202f, 15.3502f)
                lineTo(2.6202f, 12.7502f)
                curveTo(2.3902f, 12.6202f, 2.2402f, 12.3702f, 2.2402f, 12.1002f)
                verticalLineTo(6.9002f)
                curveTo(2.2402f, 6.6302f, 2.3802f, 6.3802f, 2.6202f, 6.2502f)
                lineTo(7.1202f, 3.6502f)
                curveTo(7.3502f, 3.5202f, 7.6402f, 3.5202f, 7.8702f, 3.6502f)
                lineTo(12.3702f, 6.2502f)
                curveTo(12.6002f, 6.3802f, 12.7502f, 6.6302f, 12.7502f, 6.9002f)
                verticalLineTo(8.4702f)
                curveTo(12.7502f, 8.8802f, 12.4102f, 9.2202f, 12.0002f, 9.2202f)
                curveTo(11.5902f, 9.2202f, 11.2502f, 8.8802f, 11.2502f, 8.4702f)
                verticalLineTo(7.3302f)
                lineTo(7.5002f, 5.1602f)
                lineTo(3.7502f, 7.3302f)
                verticalLineTo(11.6602f)
                lineTo(7.5002f, 13.8302f)
                lineTo(11.6202f, 11.4502f)
                curveTo(11.9802f, 11.2402f, 12.4402f, 11.3702f, 12.6402f, 11.7202f)
                curveTo(12.8502f, 12.0802f, 12.7202f, 12.5402f, 12.3702f, 12.7402f)
                lineTo(7.8702f, 15.3402f)
                curveTo(7.7602f, 15.4102f, 7.6302f, 15.4502f, 7.5002f, 15.4502f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5002f, 20.6399f)
                curveTo(16.3702f, 20.6399f, 16.2402f, 20.6099f, 16.1202f, 20.5399f)
                lineTo(11.6202f, 17.9399f)
                curveTo(11.3902f, 17.8099f, 11.2402f, 17.5599f, 11.2402f, 17.2899f)
                verticalLineTo(15.6399f)
                curveTo(11.2402f, 15.2299f, 11.5802f, 14.8899f, 11.9902f, 14.8899f)
                curveTo(12.4002f, 14.8899f, 12.7402f, 15.2299f, 12.7402f, 15.6399f)
                verticalLineTo(16.8599f)
                lineTo(16.4902f, 19.0299f)
                lineTo(20.2402f, 16.8599f)
                verticalLineTo(12.5299f)
                lineTo(16.4902f, 10.3599f)
                lineTo(12.3702f, 12.7399f)
                curveTo(12.0102f, 12.9499f, 11.5502f, 12.8199f, 11.3502f, 12.4699f)
                curveTo(11.1402f, 12.1099f, 11.2702f, 11.6499f, 11.6202f, 11.4499f)
                lineTo(16.1202f, 8.8499f)
                curveTo(16.3502f, 8.7199f, 16.6402f, 8.7199f, 16.8702f, 8.8499f)
                lineTo(21.3702f, 11.4499f)
                curveTo(21.6002f, 11.5799f, 21.7502f, 11.8299f, 21.7502f, 12.0999f)
                verticalLineTo(17.2999f)
                curveTo(21.7502f, 17.5699f, 21.6102f, 17.8199f, 21.3702f, 17.9499f)
                lineTo(16.8702f, 20.5499f)
                curveTo(16.7602f, 20.6099f, 16.6302f, 20.6399f, 16.5002f, 20.6399f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null
