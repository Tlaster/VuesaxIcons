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

public val BulkGroup.Arrowup2: ImageVector
    get() {
        if (_arrowup2 != null) {
            return _arrowup2!!
        }
        _arrowup2 = Builder(name = "Arrowup2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.4807f, 10.7702f)
                lineTo(11.6907f, 15.8202f)
                horizontalLineTo(6.0807f)
                curveTo(5.1207f, 15.8202f, 4.6407f, 14.6602f, 5.3207f, 13.9802f)
                lineTo(10.5007f, 8.8002f)
                curveTo(11.3307f, 7.9702f, 12.6807f, 7.9702f, 13.5107f, 8.8002f)
                lineTo(15.4807f, 10.7702f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9195f, 15.82f)
                horizontalLineTo(11.6895f)
                lineTo(15.4795f, 10.77f)
                lineTo(18.6895f, 13.98f)
                curveTo(19.3595f, 14.66f, 18.8795f, 15.82f, 17.9195f, 15.82f)
                close()
            }
        }
        .build()
        return _arrowup2!!
    }

private var _arrowup2: ImageVector? = null
