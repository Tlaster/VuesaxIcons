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

public val BoldGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.36f, 7.78f)
                lineTo(4.54f, 17.28f)
                curveTo(3.93f, 17.65f, 3.11f, 17.28f, 3.03f, 16.57f)
                curveTo(3.01f, 16.38f, 3.0f, 16.19f, 3.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 5.0f, 5.0f, 3.0f, 8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(19.0f, 3.0f, 20.23f, 4.54f, 20.81f, 6.65f)
                curveTo(20.93f, 7.09f, 20.74f, 7.55f, 20.36f, 7.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9994f, 11.09f)
                verticalLineTo(16.0f)
                curveTo(20.9994f, 19.0f, 18.9994f, 21.0f, 15.9994f, 21.0f)
                horizontalLineTo(7.9994f)
                curveTo(7.0794f, 21.0f, 6.2094f, 20.75f, 5.4694f, 20.31f)
                curveTo(4.8294f, 19.94f, 4.8694f, 19.0f, 5.4994f, 18.62f)
                lineTo(19.4794f, 10.23f)
                curveTo(20.1494f, 9.83f, 20.9994f, 10.31f, 20.9994f, 11.09f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
