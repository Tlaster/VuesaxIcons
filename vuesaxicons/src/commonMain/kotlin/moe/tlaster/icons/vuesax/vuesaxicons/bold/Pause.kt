package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.65f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(10.65f, 3.54f, 10.08f, 3.0f, 8.64f, 3.0f)
                horizontalLineTo(5.01f)
                curveTo(3.57f, 3.0f, 3.0f, 3.54f, 3.0f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(3.0f, 20.46f, 3.57f, 21.0f, 5.01f, 21.0f)
                horizontalLineTo(8.64f)
                curveTo(10.08f, 21.0f, 10.65f, 20.46f, 10.65f, 19.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0016f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(21.0016f, 3.54f, 20.4316f, 3.0f, 18.9916f, 3.0f)
                horizontalLineTo(15.3616f)
                curveTo(13.9316f, 3.0f, 13.3516f, 3.54f, 13.3516f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(13.3516f, 20.46f, 13.9216f, 21.0f, 15.3616f, 21.0f)
                horizontalLineTo(18.9916f)
                curveTo(20.4316f, 21.0f, 21.0016f, 20.46f, 21.0016f, 19.11f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
