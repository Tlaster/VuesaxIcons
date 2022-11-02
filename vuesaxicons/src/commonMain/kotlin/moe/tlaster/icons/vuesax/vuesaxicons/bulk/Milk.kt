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

public val BulkGroup.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 20.65f, 16.65f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(7.35f, 22.0f, 6.0f, 20.65f, 6.0f, 19.0f)
                verticalLineTo(13.98f)
                lineTo(9.89f, 14.0f)
                curveTo(10.62f, 14.0f, 11.34f, 14.17f, 12.0f, 14.5f)
                curveTo(12.66f, 14.83f, 13.38f, 15.0f, 14.12f, 15.0f)
                horizontalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 10.8299f)
                verticalLineTo(14.9999f)
                horizontalLineTo(14.12f)
                curveTo(13.38f, 14.9999f, 12.66f, 14.8299f, 12.0f, 14.4999f)
                curveTo(11.34f, 14.1699f, 10.62f, 13.9999f, 9.89f, 13.9999f)
                lineTo(6.0f, 13.9799f)
                verticalLineTo(10.8299f)
                curveTo(6.0f, 10.3699f, 6.26f, 9.7399f, 6.59f, 9.4099f)
                lineTo(8.71f, 7.2899f)
                curveTo(8.89f, 7.1099f, 9.0f, 6.8499f, 9.0f, 6.5899f)
                verticalLineTo(4.9099f)
                curveTo(9.16f, 4.9699f, 9.32f, 4.9999f, 9.5f, 4.9999f)
                horizontalLineTo(14.5f)
                curveTo(14.68f, 4.9999f, 14.84f, 4.9699f, 15.0f, 4.9099f)
                verticalLineTo(6.5899f)
                curveTo(15.0f, 6.8499f, 15.11f, 7.1099f, 15.29f, 7.2899f)
                lineTo(17.41f, 9.4099f)
                curveTo(17.74f, 9.7399f, 18.0f, 10.3699f, 18.0f, 10.8299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 2.0f, 8.0f, 2.67f, 8.0f, 3.5f)
                curveTo(8.0f, 4.15f, 8.42f, 4.71f, 9.0f, 4.91f)
                curveTo(9.16f, 4.97f, 9.32f, 5.0f, 9.5f, 5.0f)
                horizontalLineTo(14.5f)
                curveTo(14.68f, 5.0f, 14.84f, 4.97f, 15.0f, 4.91f)
                curveTo(15.58f, 4.71f, 16.0f, 4.15f, 16.0f, 3.5f)
                curveTo(16.0f, 2.67f, 15.33f, 2.0f, 14.5f, 2.0f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
