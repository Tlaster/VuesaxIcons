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

public val BulkGroup.Xrp: ImageVector
    get() {
        if (_xrp != null) {
            return _xrp!!
        }
        _xrp = Builder(name = "Xrp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4604f, 2.0f)
                horizontalLineTo(4.0504f)
                curveTo(3.1204f, 2.0f, 2.6504f, 3.13f, 3.3104f, 3.79f)
                lineTo(9.0404f, 9.52f)
                curveTo(10.6804f, 11.16f, 13.3304f, 11.16f, 14.9704f, 9.52f)
                lineTo(20.7004f, 3.79f)
                curveTo(21.3504f, 3.13f, 20.8804f, 2.0f, 19.9504f, 2.0f)
                horizontalLineTo(18.5404f)
                curveTo(17.7104f, 2.0f, 16.9104f, 2.33f, 16.3204f, 2.92f)
                lineTo(12.7404f, 6.5f)
                curveTo(12.3304f, 6.91f, 11.6704f, 6.91f, 11.2604f, 6.5f)
                lineTo(7.6804f, 2.92f)
                curveTo(7.0904f, 2.33f, 6.2904f, 2.0f, 5.4604f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4604f, 21.9702f)
                horizontalLineTo(4.0504f)
                curveTo(3.1204f, 21.9702f, 2.6504f, 20.8402f, 3.3104f, 20.1802f)
                lineTo(9.0404f, 14.4502f)
                curveTo(10.6804f, 12.8102f, 13.3304f, 12.8102f, 14.9704f, 14.4502f)
                lineTo(20.7004f, 20.1802f)
                curveTo(21.3604f, 20.8402f, 20.8904f, 21.9702f, 19.9604f, 21.9702f)
                horizontalLineTo(18.5504f)
                curveTo(17.7204f, 21.9702f, 16.9204f, 21.6402f, 16.3304f, 21.0502f)
                lineTo(12.7504f, 17.4702f)
                curveTo(12.3404f, 17.0602f, 11.6804f, 17.0602f, 11.2704f, 17.4702f)
                lineTo(7.6904f, 21.0502f)
                curveTo(7.0904f, 21.6402f, 6.2904f, 21.9702f, 5.4604f, 21.9702f)
                close()
            }
        }
        .build()
        return _xrp!!
    }

private var _xrp: ImageVector? = null
