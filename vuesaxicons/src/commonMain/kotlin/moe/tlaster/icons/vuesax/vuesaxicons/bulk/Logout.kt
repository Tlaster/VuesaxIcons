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

public val BulkGroup.Logout: ImageVector
    get() {
        if (_logout != null) {
            return _logout!!
        }
        _logout = Builder(name = "Logout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 7.2f)
                verticalLineTo(16.79f)
                curveTo(9.0f, 20.0f, 11.0f, 22.0f, 14.2f, 22.0f)
                horizontalLineTo(16.79f)
                curveTo(19.99f, 22.0f, 21.99f, 20.0f, 21.99f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 16.8f, 2.0f)
                horizontalLineTo(14.2f)
                curveTo(11.0f, 2.0f, 9.0f, 4.0f, 9.0f, 7.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5694f, 8.12f)
                lineTo(2.2194f, 11.47f)
                curveTo(1.9295f, 11.76f, 1.9295f, 12.24f, 2.2194f, 12.53f)
                lineTo(5.5694f, 15.88f)
                curveTo(5.8594f, 16.17f, 6.3394f, 16.17f, 6.6294f, 15.88f)
                curveTo(6.9194f, 15.59f, 6.9194f, 15.11f, 6.6294f, 14.82f)
                lineTo(4.5595f, 12.75f)
                horizontalLineTo(15.2495f)
                curveTo(15.6595f, 12.75f, 15.9995f, 12.41f, 15.9995f, 12.0f)
                curveTo(15.9995f, 11.59f, 15.6595f, 11.25f, 15.2495f, 11.25f)
                horizontalLineTo(4.5595f)
                lineTo(6.6294f, 9.18f)
                curveTo(6.7794f, 9.03f, 6.8495f, 8.84f, 6.8495f, 8.65f)
                curveTo(6.8495f, 8.46f, 6.7794f, 8.26f, 6.6294f, 8.12f)
                curveTo(6.3394f, 7.82f, 5.8695f, 7.82f, 5.5694f, 8.12f)
                close()
            }
        }
        .build()
        return _logout!!
    }

private var _logout: ImageVector? = null
