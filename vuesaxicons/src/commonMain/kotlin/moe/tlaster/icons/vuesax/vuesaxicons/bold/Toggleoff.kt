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

public val BoldGroup.Toggleoff: ImageVector
    get() {
        if (_toggleoff != null) {
            return _toggleoff!!
        }
        _toggleoff = Builder(name = "Toggleoff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.65f, 3.8594f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 3.8594f, 2.0f, 5.1094f, 2.0f, 9.2094f)
                verticalLineTo(14.7894f)
                curveTo(2.0f, 18.8894f, 3.25f, 20.1394f, 7.35f, 20.1394f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 20.1394f, 22.0f, 18.8894f, 22.0f, 14.7894f)
                verticalLineTo(9.2094f)
                curveTo(22.0f, 5.1094f, 20.75f, 3.8594f, 16.65f, 3.8594f)
                close()
                moveTo(14.09f, 13.1194f)
                curveTo(14.09f, 15.3694f, 13.04f, 16.4194f, 10.79f, 16.4194f)
                horizontalLineTo(8.56f)
                curveTo(6.31f, 16.4194f, 5.26f, 15.3694f, 5.26f, 13.1194f)
                verticalLineTo(10.8894f)
                curveTo(5.26f, 8.6394f, 6.31f, 7.5894f, 8.56f, 7.5894f)
                horizontalLineTo(10.79f)
                curveTo(13.04f, 7.5894f, 14.09f, 8.6394f, 14.09f, 10.8894f)
                verticalLineTo(13.1194f)
                close()
            }
        }
        .build()
        return _toggleoff!!
    }

private var _toggleoff: ImageVector? = null
