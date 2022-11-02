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

public val BulkGroup.Lovely: ImageVector
    get() {
        if (_lovely != null) {
            return _lovely!!
        }
        _lovely = Builder(name = "Lovely", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.86f, 8.0901f)
                curveTo(19.86f, 8.2401f, 19.86f, 8.3901f, 19.85f, 8.5301f)
                curveTo(18.32f, 7.9601f, 16.52f, 8.3101f, 15.32f, 9.3901f)
                curveTo(14.51f, 8.6601f, 13.46f, 8.2501f, 12.34f, 8.2501f)
                curveTo(9.88f, 8.2501f, 7.88f, 10.2601f, 7.88f, 12.7401f)
                curveTo(7.88f, 15.5701f, 9.3f, 17.6401f, 10.66f, 18.9801f)
                curveTo(10.55f, 18.9701f, 10.46f, 18.9501f, 10.38f, 18.9201f)
                curveTo(7.79f, 18.0301f, 2.0f, 14.3501f, 2.0f, 8.0901f)
                curveTo(2.0f, 5.3301f, 4.22f, 3.1001f, 6.96f, 3.1001f)
                curveTo(8.59f, 3.1001f, 10.03f, 3.8801f, 10.93f, 5.0901f)
                curveTo(11.84f, 3.8801f, 13.28f, 3.1001f, 14.9f, 3.1001f)
                curveTo(17.64f, 3.1001f, 19.86f, 5.3301f, 19.86f, 8.0901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9999f, 9.5901f)
                curveTo(16.9299f, 9.5901f, 15.9599f, 10.1101f, 15.3599f, 10.9101f)
                curveTo(14.7599f, 10.1101f, 13.7999f, 9.5901f, 12.7199f, 9.5901f)
                curveTo(10.8999f, 9.5901f, 9.4199f, 11.0701f, 9.4199f, 12.9101f)
                curveTo(9.4199f, 13.6201f, 9.5299f, 14.2701f, 9.7299f, 14.8701f)
                curveTo(10.6699f, 17.8401f, 13.5599f, 19.6101f, 14.9899f, 20.1001f)
                curveTo(15.1899f, 20.1701f, 15.5199f, 20.1701f, 15.7299f, 20.1001f)
                curveTo(17.1599f, 19.6101f, 20.0499f, 17.8401f, 20.9899f, 14.8701f)
                curveTo(21.1899f, 14.2601f, 21.2999f, 13.6101f, 21.2999f, 12.9101f)
                curveTo(21.2999f, 11.0701f, 19.8199f, 9.5901f, 17.9999f, 9.5901f)
                close()
            }
        }
        .build()
        return _lovely!!
    }

private var _lovely: ImageVector? = null
