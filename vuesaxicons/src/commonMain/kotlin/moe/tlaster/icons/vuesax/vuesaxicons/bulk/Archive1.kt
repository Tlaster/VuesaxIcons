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

public val BulkGroup.Archive1: ImageVector
    get() {
        if (_archive1 != null) {
            return _archive1!!
        }
        _archive1 = Builder(name = "Archive1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8203f, 2.0f)
                horizontalLineTo(7.1803f)
                curveTo(5.0503f, 2.0f, 3.3203f, 3.74f, 3.3203f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.3203f, 21.75f, 4.6103f, 22.51f, 6.1903f, 21.64f)
                lineTo(11.0703f, 18.93f)
                curveTo(11.5903f, 18.64f, 12.4303f, 18.64f, 12.9403f, 18.93f)
                lineTo(17.8203f, 21.64f)
                curveTo(19.4003f, 22.52f, 20.6903f, 21.76f, 20.6903f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.6803f, 3.74f, 18.9503f, 2.0f, 16.8203f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0007f, 10.2801f)
                curveTo(10.9807f, 10.2801f, 9.9607f, 10.1001f, 8.9907f, 9.75f)
                curveTo(8.6007f, 9.6101f, 8.4007f, 9.18f, 8.5407f, 8.79f)
                curveTo(8.6907f, 8.4001f, 9.1207f, 8.2001f, 9.5107f, 8.34f)
                curveTo(11.1207f, 8.92f, 12.8907f, 8.92f, 14.5007f, 8.34f)
                curveTo(14.8907f, 8.2001f, 15.3207f, 8.4001f, 15.4607f, 8.79f)
                curveTo(15.6007f, 9.18f, 15.4007f, 9.6101f, 15.0107f, 9.75f)
                curveTo(14.0407f, 10.1001f, 13.0207f, 10.2801f, 12.0007f, 10.2801f)
                close()
            }
        }
        .build()
        return _archive1!!
    }

private var _archive1: ImageVector? = null
