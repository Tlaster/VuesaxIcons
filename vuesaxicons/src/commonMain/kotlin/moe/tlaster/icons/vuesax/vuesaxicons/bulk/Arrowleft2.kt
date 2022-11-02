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

public val BulkGroup.Arrowleft2: ImageVector
    get() {
        if (_arrowleft2 != null) {
            return _arrowleft2!!
        }
        _arrowleft2 = Builder(name = "Arrowleft2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.81f, 2.0f)
                horizontalLineTo(16.18f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(22.0f, 19.82f, 19.83f, 21.99f, 16.19f, 21.99f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22.0f, 2.0f, 19.83f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.47f, 11.4699f)
                lineTo(9.76f, 7.1799f)
                curveTo(10.05f, 6.8899f, 10.53f, 6.8899f, 10.82f, 7.1799f)
                curveTo(11.11f, 7.4699f, 11.11f, 7.9499f, 10.82f, 8.2399f)
                lineTo(7.81f, 11.2499f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 11.2499f, 18.75f, 11.5899f, 18.75f, 11.9999f)
                curveTo(18.75f, 12.4099f, 18.41f, 12.7499f, 18.0f, 12.7499f)
                horizontalLineTo(7.81f)
                lineTo(10.82f, 15.7599f)
                curveTo(11.11f, 16.0499f, 11.11f, 16.5299f, 10.82f, 16.8199f)
                curveTo(10.67f, 16.9699f, 10.48f, 17.0399f, 10.29f, 17.0399f)
                curveTo(10.1f, 17.0399f, 9.91f, 16.9699f, 9.76f, 16.8199f)
                lineTo(5.47f, 12.5299f)
                curveTo(5.33f, 12.3899f, 5.25f, 12.1999f, 5.25f, 11.9999f)
                curveTo(5.25f, 11.7999f, 5.33f, 11.6099f, 5.47f, 11.4699f)
                close()
            }
        }
        .build()
        return _arrowleft2!!
    }

private var _arrowleft2: ImageVector? = null
