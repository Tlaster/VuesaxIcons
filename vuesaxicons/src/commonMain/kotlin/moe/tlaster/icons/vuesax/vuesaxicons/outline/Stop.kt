package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7f, 21.75f)
                horizontalLineTo(9.3f)
                curveTo(4.36f, 21.75f, 2.25f, 19.64f, 2.25f, 14.7f)
                verticalLineTo(9.3f)
                curveTo(2.25f, 4.36f, 4.36f, 2.25f, 9.3f, 2.25f)
                horizontalLineTo(14.7f)
                curveTo(19.64f, 2.25f, 21.75f, 4.36f, 21.75f, 9.3f)
                verticalLineTo(14.7f)
                curveTo(21.75f, 19.64f, 19.64f, 21.75f, 14.7f, 21.75f)
                close()
                moveTo(9.3f, 3.75f)
                curveTo(5.2f, 3.75f, 3.75f, 5.2f, 3.75f, 9.3f)
                verticalLineTo(14.7f)
                curveTo(3.75f, 18.8f, 5.2f, 20.25f, 9.3f, 20.25f)
                horizontalLineTo(14.7f)
                curveTo(18.8f, 20.25f, 20.25f, 18.8f, 20.25f, 14.7f)
                verticalLineTo(9.3f)
                curveTo(20.25f, 5.2f, 18.8f, 3.75f, 14.7f, 3.75f)
                horizontalLineTo(9.3f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
