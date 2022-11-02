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

public val BulkGroup.Arrowdown1: ImageVector
    get() {
        if (_arrowdown1 != null) {
            return _arrowdown1!!
        }
        _arrowdown1 = Builder(name = "Arrowdown1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.4807f, 13.2302f)
                lineTo(11.6907f, 8.1802f)
                horizontalLineTo(6.0807f)
                curveTo(5.1207f, 8.1802f, 4.6407f, 9.3402f, 5.3207f, 10.0202f)
                lineTo(10.5007f, 15.2002f)
                curveTo(11.3307f, 16.0302f, 12.6807f, 16.0302f, 13.5107f, 15.2002f)
                lineTo(15.4807f, 13.2302f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9195f, 8.1802f)
                horizontalLineTo(11.6895f)
                lineTo(15.4795f, 13.2302f)
                lineTo(18.6895f, 10.0202f)
                curveTo(19.3595f, 9.3402f, 18.8795f, 8.1802f, 17.9195f, 8.1802f)
                close()
            }
        }
        .build()
        return _arrowdown1!!
    }

private var _arrowdown1: ImageVector? = null
