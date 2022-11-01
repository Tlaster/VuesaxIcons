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

public val BoldGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(name = "Monitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.56f, 2.0f)
                horizontalLineTo(6.41f)
                curveTo(3.98f, 2.0f, 2.0f, 3.98f, 2.0f, 6.41f)
                verticalLineTo(12.91f)
                verticalLineTo(13.11f)
                curveTo(2.0f, 15.55f, 3.98f, 17.52f, 6.41f, 17.52f)
                horizontalLineTo(10.25f)
                curveTo(10.8f, 17.52f, 11.25f, 17.97f, 11.25f, 18.52f)
                verticalLineTo(19.49f)
                curveTo(11.25f, 20.04f, 10.8f, 20.49f, 10.25f, 20.49f)
                horizontalLineTo(7.83f)
                curveTo(7.42f, 20.49f, 7.08f, 20.83f, 7.08f, 21.24f)
                curveTo(7.08f, 21.65f, 7.41f, 22.0f, 7.83f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(16.59f, 22.0f, 16.93f, 21.66f, 16.93f, 21.25f)
                curveTo(16.93f, 20.84f, 16.59f, 20.5f, 16.18f, 20.5f)
                horizontalLineTo(13.76f)
                curveTo(13.21f, 20.5f, 12.76f, 20.05f, 12.76f, 19.5f)
                verticalLineTo(18.53f)
                curveTo(12.76f, 17.98f, 13.21f, 17.53f, 13.76f, 17.53f)
                horizontalLineTo(17.57f)
                curveTo(20.01f, 17.53f, 21.98f, 15.55f, 21.98f, 13.12f)
                verticalLineTo(12.92f)
                verticalLineTo(6.42f)
                curveTo(21.97f, 3.98f, 19.99f, 2.0f, 17.56f, 2.0f)
                close()
            }
        }
        .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
