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

public val BulkGroup.Arrowleft: ImageVector
    get() {
        if (_arrowleft != null) {
            return _arrowleft!!
        }
        _arrowleft = Builder(name = "Arrowleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4995f, 11.2499f)
                horizontalLineTo(10.3095f)
                lineTo(12.0295f, 9.5299f)
                curveTo(12.3195f, 9.2399f, 12.3195f, 8.7599f, 12.0295f, 8.4699f)
                curveTo(11.7395f, 8.1799f, 11.2595f, 8.1799f, 10.9695f, 8.4699f)
                lineTo(7.9694f, 11.4699f)
                curveTo(7.6795f, 11.7599f, 7.6795f, 12.2399f, 7.9694f, 12.5299f)
                lineTo(10.9695f, 15.5299f)
                curveTo(11.1195f, 15.6799f, 11.3095f, 15.7499f, 11.4995f, 15.7499f)
                curveTo(11.6895f, 15.7499f, 11.8795f, 15.6799f, 12.0295f, 15.5299f)
                curveTo(12.3195f, 15.2399f, 12.3195f, 14.7599f, 12.0295f, 14.4699f)
                lineTo(10.3095f, 12.7499f)
                horizontalLineTo(15.4995f)
                curveTo(15.9095f, 12.7499f, 16.2495f, 12.4099f, 16.2495f, 11.9999f)
                curveTo(16.2495f, 11.5899f, 15.9095f, 11.2499f, 15.4995f, 11.2499f)
                close()
            }
        }
        .build()
        return _arrowleft!!
    }

private var _arrowleft: ImageVector? = null
