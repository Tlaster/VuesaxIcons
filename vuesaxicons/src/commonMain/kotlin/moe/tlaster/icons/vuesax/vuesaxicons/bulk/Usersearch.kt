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

public val BulkGroup.Usersearch: ImageVector
    get() {
        if (_usersearch != null) {
            return _usersearch!!
        }
        _usersearch = Builder(name = "Usersearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0002f, 14.5f)
                curveTo(6.9902f, 14.5f, 2.9102f, 17.86f, 2.9102f, 22.0f)
                curveTo(2.9102f, 22.28f, 3.1302f, 22.5f, 3.4102f, 22.5f)
                horizontalLineTo(20.5902f)
                curveTo(20.8702f, 22.5f, 21.0902f, 22.28f, 21.0902f, 22.0f)
                curveTo(21.0902f, 17.86f, 17.0102f, 14.5f, 12.0002f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.77f, 20.68f)
                lineTo(22.01f, 19.92f)
                curveTo(22.41f, 19.32f, 22.64f, 18.6f, 22.64f, 17.83f)
                curveTo(22.64f, 15.72f, 20.93f, 14.01f, 18.82f, 14.01f)
                curveTo(16.71f, 14.01f, 15.0f, 15.72f, 15.0f, 17.83f)
                curveTo(15.0f, 19.94f, 16.71f, 21.65f, 18.82f, 21.65f)
                curveTo(19.59f, 21.65f, 20.31f, 21.42f, 20.91f, 21.02f)
                lineTo(21.67f, 21.78f)
                curveTo(21.82f, 21.93f, 22.02f, 22.01f, 22.22f, 22.01f)
                curveTo(22.42f, 22.01f, 22.62f, 21.93f, 22.77f, 21.78f)
                curveTo(23.08f, 21.47f, 23.08f, 20.98f, 22.77f, 20.68f)
                close()
            }
        }
        .build()
        return _usersearch!!
    }

private var _usersearch: ImageVector? = null
