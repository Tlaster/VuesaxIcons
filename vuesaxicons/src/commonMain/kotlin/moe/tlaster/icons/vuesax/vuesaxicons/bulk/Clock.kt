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

public val BulkGroup.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                curveTo(5.5f, 8.41f, 8.41f, 5.5f, 12.0f, 5.5f)
                curveTo(15.59f, 5.5f, 18.5f, 8.41f, 18.5f, 12.0f)
                curveTo(18.5f, 14.08f, 17.52f, 15.94f, 16.0f, 17.13f)
                horizontalLineTo(15.99f)
                curveTo(14.89f, 17.99f, 13.51f, 18.5f, 12.0f, 18.5f)
                curveTo(10.51f, 18.5f, 9.14f, 18.0f, 8.04f, 17.15f)
                horizontalLineTo(8.03f)
                curveTo(6.49f, 15.96f, 5.5f, 14.1f, 5.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0293f, 17.1499f)
                horizontalLineTo(8.0393f)
                curveTo(9.1393f, 17.9999f, 10.5093f, 18.4999f, 11.9993f, 18.4999f)
                curveTo(13.5093f, 18.4999f, 14.8893f, 17.9899f, 15.9893f, 17.1299f)
                horizontalLineTo(15.9993f)
                lineTo(15.4893f, 19.5999f)
                curveTo(14.9993f, 21.4999f, 13.8993f, 21.9999f, 12.5493f, 21.9999f)
                horizontalLineTo(11.4593f)
                curveTo(10.1093f, 21.9999f, 8.9993f, 21.4999f, 8.5193f, 19.5899f)
                lineTo(8.0293f, 17.1499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0293f, 6.85f)
                horizontalLineTo(8.0393f)
                curveTo(9.1393f, 6.0f, 10.5093f, 5.5f, 11.9993f, 5.5f)
                curveTo(13.5093f, 5.5f, 14.8893f, 6.01f, 15.9893f, 6.87f)
                horizontalLineTo(15.9993f)
                lineTo(15.4893f, 4.4f)
                curveTo(14.9993f, 2.5f, 13.8993f, 2.0f, 12.5493f, 2.0f)
                horizontalLineTo(11.4593f)
                curveTo(10.1093f, 2.0f, 8.9993f, 2.5f, 8.5193f, 4.41f)
                lineTo(8.0293f, 6.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4f, 14.5999f)
                curveTo(13.21f, 14.5999f, 13.02f, 14.5299f, 12.87f, 14.3799f)
                lineTo(11.47f, 12.9799f)
                curveTo(11.33f, 12.8399f, 11.25f, 12.6499f, 11.25f, 12.4499f)
                verticalLineTo(9.6599f)
                curveTo(11.25f, 9.2499f, 11.59f, 8.9099f, 12.0f, 8.9099f)
                curveTo(12.41f, 8.9099f, 12.75f, 9.2499f, 12.75f, 9.6599f)
                verticalLineTo(12.1399f)
                lineTo(13.93f, 13.3199f)
                curveTo(14.22f, 13.6099f, 14.22f, 14.0899f, 13.93f, 14.3799f)
                curveTo(13.78f, 14.5299f, 13.59f, 14.5999f, 13.4f, 14.5999f)
                close()
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null
