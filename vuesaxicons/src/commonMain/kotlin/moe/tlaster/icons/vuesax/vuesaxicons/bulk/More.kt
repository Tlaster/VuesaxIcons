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

public val BulkGroup.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 10.6899f)
                curveTo(11.2795f, 10.6899f, 10.6895f, 11.2799f, 10.6895f, 11.9999f)
                curveTo(10.6895f, 12.7199f, 11.2795f, 13.3099f, 11.9995f, 13.3099f)
                curveTo(12.7195f, 13.3099f, 13.3095f, 12.7199f, 13.3095f, 11.9999f)
                curveTo(13.3095f, 11.2799f, 12.7195f, 10.6899f, 11.9995f, 10.6899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9995f, 10.6899f)
                curveTo(6.2794f, 10.6899f, 5.6894f, 11.2799f, 5.6894f, 11.9999f)
                curveTo(5.6894f, 12.7199f, 6.2794f, 13.3099f, 6.9995f, 13.3099f)
                curveTo(7.7194f, 13.3099f, 8.3095f, 12.7199f, 8.3095f, 11.9999f)
                curveTo(8.3095f, 11.2799f, 7.7194f, 10.6899f, 6.9995f, 10.6899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9995f, 10.6899f)
                curveTo(16.2795f, 10.6899f, 15.6895f, 11.2799f, 15.6895f, 11.9999f)
                curveTo(15.6895f, 12.7199f, 16.2795f, 13.3099f, 16.9995f, 13.3099f)
                curveTo(17.7195f, 13.3099f, 18.3095f, 12.7199f, 18.3095f, 11.9999f)
                curveTo(18.3095f, 11.2799f, 17.7195f, 10.6899f, 16.9995f, 10.6899f)
                close()
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null
