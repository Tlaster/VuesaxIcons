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

public val BulkGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7602f, 22.0f)
                horizontalLineTo(17.2402f)
                curveTo(20.0002f, 22.0f, 21.1002f, 20.31f, 21.2302f, 18.25f)
                lineTo(21.7502f, 9.99f)
                curveTo(21.8902f, 7.83f, 20.1702f, 6.0f, 18.0002f, 6.0f)
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
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 8.75f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.75f, 9.75f, 8.41f, 9.75f, 8.0f)
                curveTo(9.75f, 7.59f, 10.09f, 7.25f, 10.5f, 7.25f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 7.25f, 14.25f, 7.59f, 14.25f, 8.0f)
                curveTo(14.25f, 8.41f, 13.91f, 8.75f, 13.5f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9991f, 18.1301f)
                curveTo(13.8659f, 18.1301f, 15.3791f, 16.6168f, 15.3791f, 14.7501f)
                curveTo(15.3791f, 12.8834f, 13.8659f, 11.3701f, 11.9991f, 11.3701f)
                curveTo(10.1324f, 11.3701f, 8.6191f, 12.8834f, 8.6191f, 14.7501f)
                curveTo(8.6191f, 16.6168f, 10.1324f, 18.1301f, 11.9991f, 18.1301f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
