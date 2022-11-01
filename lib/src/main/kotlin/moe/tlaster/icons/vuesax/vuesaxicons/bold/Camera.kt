package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0002f, 6.0f)
                curveTo(17.3902f, 6.0f, 16.8302f, 5.65f, 16.5502f, 5.11f)
                lineTo(15.8302f, 3.66f)
                curveTo(15.3702f, 2.75f, 14.1702f, 2.0f, 13.1502f, 2.0f)
                horizontalLineTo(10.8602f)
                curveTo(9.8302f, 2.0f, 8.6302f, 2.75f, 8.1702f, 3.66f)
                lineTo(7.4502f, 5.11f)
                curveTo(7.1702f, 5.65f, 6.6102f, 6.0f, 6.0002f, 6.0f)
                curveTo(3.8302f, 6.0f, 2.1102f, 7.83f, 2.2502f, 9.99f)
                lineTo(2.7702f, 18.25f)
                curveTo(2.8902f, 20.31f, 4.0002f, 22.0f, 6.7602f, 22.0f)
                horizontalLineTo(17.2402f)
                curveTo(20.0002f, 22.0f, 21.1002f, 20.31f, 21.2302f, 18.25f)
                lineTo(21.7502f, 9.99f)
                curveTo(21.8902f, 7.83f, 20.1702f, 6.0f, 18.0002f, 6.0f)
                close()
                moveTo(10.5002f, 7.25f)
                horizontalLineTo(13.5002f)
                curveTo(13.9102f, 7.25f, 14.2502f, 7.59f, 14.2502f, 8.0f)
                curveTo(14.2502f, 8.41f, 13.9102f, 8.75f, 13.5002f, 8.75f)
                horizontalLineTo(10.5002f)
                curveTo(10.0902f, 8.75f, 9.7502f, 8.41f, 9.7502f, 8.0f)
                curveTo(9.7502f, 7.59f, 10.0902f, 7.25f, 10.5002f, 7.25f)
                close()
                moveTo(12.0002f, 18.12f)
                curveTo(10.1402f, 18.12f, 8.6202f, 16.61f, 8.6202f, 14.74f)
                curveTo(8.6202f, 12.87f, 10.1302f, 11.36f, 12.0002f, 11.36f)
                curveTo(13.8702f, 11.36f, 15.3802f, 12.87f, 15.3802f, 14.74f)
                curveTo(15.3802f, 16.61f, 13.8602f, 18.12f, 12.0002f, 18.12f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
