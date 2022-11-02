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

public val BulkGroup.Hearttick: ImageVector
    get() {
        if (_hearttick != null) {
            return _hearttick!!
        }
        _hearttick = Builder(name = "Hearttick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2004f, 12.3999f)
                curveTo(14.5504f, 12.3999f, 12.4004f, 14.5499f, 12.4004f, 17.1999f)
                curveTo(12.4004f, 18.0999f, 12.6504f, 18.9499f, 13.1004f, 19.6699f)
                curveTo(13.9304f, 21.0599f, 15.4504f, 21.9999f, 17.2004f, 21.9999f)
                curveTo(18.9504f, 21.9999f, 20.4804f, 21.0599f, 21.3004f, 19.6699f)
                curveTo(21.7404f, 18.9499f, 22.0004f, 18.0999f, 22.0004f, 17.1999f)
                curveTo(22.0004f, 14.5499f, 19.8504f, 12.3999f, 17.2004f, 12.3999f)
                close()
                moveTo(19.5804f, 16.5699f)
                lineTo(17.0204f, 18.9299f)
                curveTo(16.8804f, 19.0599f, 16.6904f, 19.1299f, 16.5104f, 19.1299f)
                curveTo(16.3204f, 19.1299f, 16.1304f, 19.0599f, 15.9804f, 18.9099f)
                lineTo(14.8004f, 17.7299f)
                curveTo(14.5104f, 17.4399f, 14.5104f, 16.9599f, 14.8004f, 16.6699f)
                curveTo(15.0904f, 16.3799f, 15.5704f, 16.3799f, 15.8604f, 16.6699f)
                lineTo(16.5304f, 17.3399f)
                lineTo(18.5604f, 15.4599f)
                curveTo(18.8604f, 15.1799f, 19.3404f, 15.1999f, 19.6204f, 15.4999f)
                curveTo(19.9004f, 15.8099f, 19.8804f, 16.2899f, 19.5804f, 16.5699f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.6901f)
                curveTo(22.0f, 9.8801f, 21.81f, 10.9801f, 21.48f, 12.0001f)
                curveTo(21.27f, 12.6701f, 21.0f, 13.3101f, 20.68f, 13.9001f)
                curveTo(19.8f, 12.9701f, 18.57f, 12.4001f, 17.2f, 12.4001f)
                curveTo(14.55f, 12.4001f, 12.4f, 14.5501f, 12.4f, 17.2001f)
                curveTo(12.4f, 18.4301f, 12.87f, 19.5501f, 13.63f, 20.4001f)
                curveTo(13.26f, 20.5701f, 12.92f, 20.7101f, 12.62f, 20.8101f)
                curveTo(12.28f, 20.9301f, 11.72f, 20.9301f, 11.38f, 20.8101f)
                curveTo(8.97f, 19.9901f, 4.1f, 17.0001f, 2.52f, 12.0001f)
                curveTo(2.19f, 10.9801f, 2.0f, 9.8801f, 2.0f, 8.6901f)
                curveTo(2.0f, 5.6001f, 4.49f, 3.1001f, 7.56f, 3.1001f)
                curveTo(9.37f, 3.1001f, 10.99f, 3.9801f, 12.0f, 5.3301f)
                curveTo(13.01f, 3.9801f, 14.63f, 3.1001f, 16.44f, 3.1001f)
                curveTo(19.51f, 3.1001f, 22.0f, 5.6001f, 22.0f, 8.6901f)
                close()
            }
        }
        .build()
        return _hearttick!!
    }

private var _hearttick: ImageVector? = null
