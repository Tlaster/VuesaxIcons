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

public val BoldGroup.Pausecircle: ImageVector
    get() {
        if (_pausecircle != null) {
            return _pausecircle!!
        }
        _pausecircle = Builder(name = "Pausecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9688f, 2.0f)
                curveTo(6.4488f, 2.0f, 1.9688f, 6.48f, 1.9688f, 12.0f)
                curveTo(1.9688f, 17.52f, 6.4488f, 22.0f, 11.9688f, 22.0f)
                curveTo(17.4888f, 22.0f, 21.9688f, 17.52f, 21.9688f, 12.0f)
                curveTo(21.9688f, 6.48f, 17.4988f, 2.0f, 11.9688f, 2.0f)
                close()
                moveTo(10.7188f, 15.03f)
                curveTo(10.7188f, 15.51f, 10.5188f, 15.7f, 10.0087f, 15.7f)
                horizontalLineTo(8.7087f)
                curveTo(8.1987f, 15.7f, 7.9988f, 15.51f, 7.9988f, 15.03f)
                verticalLineTo(8.97f)
                curveTo(7.9988f, 8.49f, 8.1987f, 8.3f, 8.7087f, 8.3f)
                horizontalLineTo(9.9987f)
                curveTo(10.5087f, 8.3f, 10.7087f, 8.49f, 10.7087f, 8.97f)
                verticalLineTo(15.03f)
                horizontalLineTo(10.7188f)
                close()
                moveTo(15.9987f, 15.03f)
                curveTo(15.9987f, 15.51f, 15.7987f, 15.7f, 15.2887f, 15.7f)
                horizontalLineTo(13.9987f)
                curveTo(13.4887f, 15.7f, 13.2887f, 15.51f, 13.2887f, 15.03f)
                verticalLineTo(8.97f)
                curveTo(13.2887f, 8.49f, 13.4887f, 8.3f, 13.9987f, 8.3f)
                horizontalLineTo(15.2887f)
                curveTo(15.7987f, 8.3f, 15.9987f, 8.49f, 15.9987f, 8.97f)
                verticalLineTo(15.03f)
                close()
            }
        }
        .build()
        return _pausecircle!!
    }

private var _pausecircle: ImageVector? = null
