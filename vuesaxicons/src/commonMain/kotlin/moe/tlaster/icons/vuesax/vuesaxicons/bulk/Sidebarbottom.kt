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

public val BulkGroup.Sidebarbottom: ImageVector
    get() {
        if (_sidebarbottom != null) {
            return _sidebarbottom!!
        }
        _sidebarbottom = Builder(name = "Sidebarbottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2.0f, 16.39f, 2.01f, 16.59f, 2.02f, 16.78f)
                curveTo(2.1f, 18.01f, 2.45f, 19.05f, 3.05f, 19.87f)
                curveTo(3.34f, 20.29f, 3.71f, 20.66f, 4.13f, 20.95f)
                curveTo(5.08f, 21.64f, 6.32f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.19f)
                curveTo(19.63f, 22.0f, 21.76f, 20.06f, 21.97f, 16.78f)
                curveTo(21.99f, 16.59f, 22.0f, 16.39f, 22.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 6.32f, 21.64f, 5.08f, 20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.2798f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.1898f)
                curveTo(2.0f, 16.3898f, 2.01f, 16.5898f, 2.02f, 16.7798f)
                horizontalLineTo(21.97f)
                curveTo(21.99f, 16.5898f, 22.0f, 16.3898f, 22.0f, 16.1898f)
                verticalLineTo(15.2798f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6895f, 9.0299f)
                curveTo(8.6895f, 9.2199f, 8.7594f, 9.4099f, 8.9094f, 9.5599f)
                lineTo(11.4695f, 12.1199f)
                curveTo(11.7595f, 12.4099f, 12.2395f, 12.4099f, 12.5295f, 12.1199f)
                lineTo(15.0895f, 9.5599f)
                curveTo(15.3795f, 9.2699f, 15.3795f, 8.7899f, 15.0895f, 8.4999f)
                curveTo(14.7995f, 8.2099f, 14.3195f, 8.2099f, 14.0295f, 8.4999f)
                lineTo(11.9995f, 10.5199f)
                lineTo(9.9694f, 8.4999f)
                curveTo(9.6795f, 8.1999f, 9.1994f, 8.1999f, 8.9094f, 8.4999f)
                curveTo(8.7594f, 8.6399f, 8.6895f, 8.8299f, 8.6895f, 9.0299f)
                close()
            }
        }
        .build()
        return _sidebarbottom!!
    }

private var _sidebarbottom: ImageVector? = null
