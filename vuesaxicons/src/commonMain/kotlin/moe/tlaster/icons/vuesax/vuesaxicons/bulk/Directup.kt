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

public val BulkGroup.Directup: ImageVector
    get() {
        if (_directup != null) {
            return _directup!!
        }
        _directup = Builder(name = "Directup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0192f, 21.2902f)
                lineTo(13.5392f, 19.5502f)
                curveTo(12.5692f, 19.0702f, 11.4392f, 19.0702f, 10.4692f, 19.5502f)
                lineTo(6.9892f, 21.2902f)
                curveTo(3.9992f, 22.7802f, 0.8492f, 19.5702f, 2.4092f, 16.6202f)
                lineTo(3.2292f, 15.0802f)
                curveTo(3.3392f, 14.8702f, 3.5192f, 14.7002f, 3.7392f, 14.6002f)
                lineTo(16.3792f, 8.9002f)
                curveTo(16.8992f, 8.6702f, 17.5092f, 8.8802f, 17.7692f, 9.3802f)
                lineTo(21.5792f, 16.6202f)
                curveTo(23.1392f, 19.5702f, 19.9992f, 22.7802f, 17.0192f, 21.2902f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.6004f, 7.69f)
                lineTo(7.3204f, 11.42f)
                curveTo(6.3905f, 11.84f, 5.4504f, 10.84f, 5.9304f, 9.94f)
                lineTo(8.9705f, 4.17f)
                curveTo(10.2604f, 1.72f, 13.7604f, 1.72f, 15.0504f, 4.17f)
                lineTo(16.1204f, 6.21f)
                curveTo(16.4004f, 6.76f, 16.1604f, 7.44f, 15.6004f, 7.69f)
                close()
            }
        }
        .build()
        return _directup!!
    }

private var _directup: ImageVector? = null
