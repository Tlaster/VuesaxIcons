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

public val BulkGroup.Sidebartop: ImageVector
    get() {
        if (_sidebartop != null) {
            return _sidebartop!!
        }
        _sidebartop = Builder(name = "Sidebartop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.81f, 22.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22.0f, 22.0f, 19.83f, 22.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 7.61f, 21.99f, 7.41f, 21.98f, 7.22f)
                curveTo(21.9f, 5.99f, 21.55f, 4.95f, 20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2.0f, 16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.37f, 2.0f, 2.24f, 3.94f, 2.03f, 7.22f)
                curveTo(2.01f, 7.41f, 2.0f, 7.61f, 2.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2.0f, 17.68f, 2.36f, 18.92f, 3.05f, 19.87f)
                curveTo(3.34f, 20.29f, 3.71f, 20.66f, 4.13f, 20.95f)
                curveTo(5.08f, 21.64f, 6.32f, 22.0f, 7.81f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.7202f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.8102f)
                curveTo(22.0f, 7.6102f, 21.99f, 7.4102f, 21.98f, 7.2202f)
                horizontalLineTo(2.03f)
                curveTo(2.01f, 7.4102f, 2.0f, 7.6102f, 2.0f, 7.8102f)
                verticalLineTo(8.7202f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3109f, 14.9701f)
                curveTo(15.3109f, 14.7801f, 15.2409f, 14.5901f, 15.0909f, 14.4401f)
                lineTo(12.5309f, 11.8801f)
                curveTo(12.2409f, 11.5901f, 11.7609f, 11.5901f, 11.4709f, 11.8801f)
                lineTo(8.9109f, 14.4401f)
                curveTo(8.6209f, 14.7301f, 8.6209f, 15.2101f, 8.9109f, 15.5001f)
                curveTo(9.2009f, 15.7901f, 9.6809f, 15.7901f, 9.9709f, 15.5001f)
                lineTo(12.0009f, 13.4801f)
                lineTo(14.0309f, 15.5101f)
                curveTo(14.3209f, 15.8001f, 14.8009f, 15.8001f, 15.0909f, 15.5101f)
                curveTo(15.2409f, 15.3601f, 15.3109f, 15.1701f, 15.3109f, 14.9701f)
                close()
            }
        }
        .build()
        return _sidebartop!!
    }

private var _sidebartop: ImageVector? = null
