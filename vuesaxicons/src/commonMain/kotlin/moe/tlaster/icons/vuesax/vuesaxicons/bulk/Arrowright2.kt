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

public val BulkGroup.Arrowright2: ImageVector
    get() {
        if (_arrowright2 != null) {
            return _arrowright2!!
        }
        _arrowright2 = Builder(name = "Arrowright2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(18.53f, 11.4699f)
                lineTo(14.24f, 7.1799f)
                curveTo(13.95f, 6.8899f, 13.47f, 6.8899f, 13.18f, 7.1799f)
                curveTo(12.89f, 7.4699f, 12.89f, 7.9499f, 13.18f, 8.2399f)
                lineTo(16.19f, 11.2499f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 11.2499f, 5.25f, 11.5899f, 5.25f, 11.9999f)
                curveTo(5.25f, 12.4099f, 5.59f, 12.7499f, 6.0f, 12.7499f)
                horizontalLineTo(16.19f)
                lineTo(13.18f, 15.7599f)
                curveTo(12.89f, 16.0499f, 12.89f, 16.5299f, 13.18f, 16.8199f)
                curveTo(13.33f, 16.9699f, 13.52f, 17.0399f, 13.71f, 17.0399f)
                curveTo(13.9f, 17.0399f, 14.09f, 16.9699f, 14.24f, 16.8199f)
                lineTo(18.53f, 12.5299f)
                curveTo(18.67f, 12.3899f, 18.75f, 12.1999f, 18.75f, 11.9999f)
                curveTo(18.75f, 11.7999f, 18.67f, 11.6099f, 18.53f, 11.4699f)
                close()
            }
        }
        .build()
        return _arrowright2!!
    }

private var _arrowright2: ImageVector? = null
