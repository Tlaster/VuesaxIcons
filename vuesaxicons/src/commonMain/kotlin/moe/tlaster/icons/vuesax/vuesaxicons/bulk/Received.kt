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

public val BulkGroup.Received: ImageVector
    get() {
        if (_received != null) {
            return _received!!
        }
        _received = Builder(name = "Received", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9984f, 18.1998f)
                curveTo(4.7984f, 18.1998f, 4.5984f, 18.0998f, 4.4984f, 17.9998f)
                curveTo(4.1984f, 17.6998f, 4.1984f, 17.1998f, 4.4984f, 16.8998f)
                lineTo(18.4984f, 2.8998f)
                curveTo(18.7984f, 2.5998f, 19.2984f, 2.5998f, 19.5984f, 2.8998f)
                curveTo(19.8984f, 3.1998f, 19.8984f, 3.6998f, 19.5984f, 3.9998f)
                lineTo(5.5984f, 17.9998f)
                curveTo(5.3984f, 18.1998f, 5.1984f, 18.1998f, 4.9984f, 18.1998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2992f, 18.1999f)
                horizontalLineTo(4.9992f)
                curveTo(4.5992f, 18.1999f, 4.1992f, 17.8999f, 4.1992f, 17.3999f)
                verticalLineTo(7.1999f)
                curveTo(4.1992f, 6.7999f, 4.4992f, 6.3999f, 4.9992f, 6.3999f)
                curveTo(5.4992f, 6.3999f, 5.7992f, 6.6999f, 5.7992f, 7.1999f)
                verticalLineTo(16.6999f)
                horizontalLineTo(15.2992f)
                curveTo(15.6992f, 16.6999f, 16.0992f, 16.9999f, 16.0992f, 17.4999f)
                curveTo(16.0992f, 17.9999f, 15.6992f, 18.1999f, 15.2992f, 18.1999f)
                close()
            }
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
        }
        .build()
        return _received!!
    }

private var _received: ImageVector? = null
