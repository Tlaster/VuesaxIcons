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

public val BulkGroup.Send1: ImageVector
    get() {
        if (_send1 != null) {
            return _send1!!
        }
        _send1 = Builder(name = "Send1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.4992f, 22.8002f)
                horizontalLineTo(3.4992f)
                curveTo(3.0992f, 22.8002f, 2.6992f, 22.5002f, 2.6992f, 22.0002f)
                curveTo(2.6992f, 21.5002f, 2.9992f, 21.2002f, 3.4992f, 21.2002f)
                horizontalLineTo(20.4992f)
                curveTo(20.8992f, 21.2002f, 21.2992f, 21.5002f, 21.2992f, 22.0002f)
                curveTo(21.2992f, 22.5002f, 20.8992f, 22.8002f, 20.4992f, 22.8002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9984f, 18.2004f)
                curveTo(18.7984f, 18.2004f, 18.5984f, 18.1004f, 18.4984f, 18.0004f)
                lineTo(4.4984f, 4.0004f)
                curveTo(4.1984f, 3.7004f, 4.1984f, 3.3004f, 4.4984f, 3.0004f)
                curveTo(4.7984f, 2.7004f, 5.2984f, 2.7004f, 5.5984f, 3.0004f)
                lineTo(19.5984f, 17.0004f)
                curveTo(19.8984f, 17.3004f, 19.8984f, 17.8004f, 19.5984f, 18.1004f)
                curveTo(19.3984f, 18.2004f, 19.1984f, 18.2004f, 18.9984f, 18.2004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9992f, 14.5002f)
                curveTo(4.5992f, 14.5002f, 4.1992f, 14.2002f, 4.1992f, 13.7002f)
                verticalLineTo(3.5002f)
                curveTo(4.1992f, 3.1002f, 4.4992f, 2.7002f, 4.9992f, 2.7002f)
                horizontalLineTo(15.2992f)
                curveTo(15.6992f, 2.7002f, 16.0992f, 3.0002f, 16.0992f, 3.5002f)
                curveTo(16.0992f, 4.0002f, 15.7992f, 4.3002f, 15.2992f, 4.3002f)
                horizontalLineTo(5.7992f)
                verticalLineTo(13.8002f)
                curveTo(5.7992f, 14.2002f, 5.3992f, 14.5002f, 4.9992f, 14.5002f)
                close()
            }
        }
        .build()
        return _send1!!
    }

private var _send1: ImageVector? = null
