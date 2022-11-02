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

public val BulkGroup.Path: ImageVector
    get() {
        if (_path != null) {
            return _path!!
        }
        _path = Builder(name = "Path", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0205f, 10.6999f)
                lineTo(17.2205f, 12.4699f)
                lineTo(11.5605f, 6.8099f)
                lineTo(13.3205f, 4.0099f)
                curveTo(14.1405f, 2.7199f, 15.7805f, 2.6599f, 16.9905f, 3.8599f)
                lineTo(20.1705f, 7.0399f)
                curveTo(21.3005f, 8.1699f, 21.2305f, 9.9299f, 20.0205f, 10.6999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.7103f, 19.95f)
                lineTo(6.0003f, 20.98f)
                curveTo(5.4003f, 21.05f, 4.8603f, 20.96f, 4.4103f, 20.74f)
                curveTo(3.9203f, 20.5f, 3.5403f, 20.12f, 3.3003f, 19.63f)
                curveTo(3.0803f, 19.18f, 3.0003f, 18.64f, 3.0603f, 18.05f)
                lineTo(4.1003f, 9.33f)
                curveTo(4.3503f, 7.15f, 5.1603f, 6.44f, 7.4603f, 6.57f)
                lineTo(11.5803f, 6.82f)
                lineTo(17.2403f, 12.48f)
                lineTo(17.4803f, 16.6f)
                curveTo(17.6903f, 18.9f, 16.9003f, 19.7f, 14.7103f, 19.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9791f, 17.1502f)
                lineTo(4.3991f, 20.7302f)
                curveTo(3.9091f, 20.4902f, 3.5291f, 20.1102f, 3.2891f, 19.6202f)
                lineTo(6.8791f, 16.0302f)
                curveTo(7.1891f, 15.7302f, 7.6891f, 15.7302f, 7.9891f, 16.0302f)
                curveTo(8.2991f, 16.3502f, 8.2991f, 16.8402f, 7.9791f, 17.1502f)
                close()
            }
        }
        .build()
        return _path!!
    }

private var _path: ImageVector? = null
