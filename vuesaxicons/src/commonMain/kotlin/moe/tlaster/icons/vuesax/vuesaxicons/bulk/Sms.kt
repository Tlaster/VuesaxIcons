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

public val BulkGroup.Sms: ImageVector
    get() {
        if (_sms != null) {
            return _sms!!
        }
        _sms = Builder(name = "Sms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 19.0f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.0f, 4.0f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 3.5f, 22.0f, 5.0f, 22.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 19.0f, 20.0f, 20.5f, 17.0f, 20.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0008f, 12.87f)
                curveTo(11.1608f, 12.87f, 10.3108f, 12.61f, 9.6608f, 12.08f)
                lineTo(6.5307f, 9.58f)
                curveTo(6.2108f, 9.32f, 6.1508f, 8.85f, 6.4108f, 8.53f)
                curveTo(6.6708f, 8.21f, 7.1408f, 8.15f, 7.4608f, 8.41f)
                lineTo(10.5908f, 10.91f)
                curveTo(11.3508f, 11.52f, 12.6407f, 11.52f, 13.4007f, 10.91f)
                lineTo(16.5308f, 8.41f)
                curveTo(16.8508f, 8.15f, 17.3308f, 8.2f, 17.5808f, 8.53f)
                curveTo(17.8408f, 8.85f, 17.7908f, 9.33f, 17.4608f, 9.58f)
                lineTo(14.3308f, 12.08f)
                curveTo(13.6908f, 12.61f, 12.8408f, 12.87f, 12.0008f, 12.87f)
                close()
            }
        }
        .build()
        return _sms!!
    }

private var _sms: ImageVector? = null
