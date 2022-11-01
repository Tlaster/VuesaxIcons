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

public val BoldGroup.Frame1: ImageVector
    get() {
        if (_frame1 != null) {
            return _frame1!!
        }
        _frame1 = Builder(name = "Frame1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(11.0f, 2.6f, 10.36f, 2.0f, 8.77f, 2.0f)
                horizontalLineTo(4.73f)
                curveTo(3.14f, 2.0f, 2.5f, 2.6f, 2.5f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.5f, 21.4f, 3.14f, 22.0f, 4.73f, 22.0f)
                horizontalLineTo(8.77f)
                curveTo(10.36f, 22.0f, 11.0f, 21.4f, 11.0f, 19.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 19.64f)
                verticalLineTo(15.36f)
                curveTo(21.5f, 14.06f, 20.5f, 13.0f, 19.27f, 13.0f)
                horizontalLineTo(15.23f)
                curveTo(14.0f, 13.0f, 13.0f, 14.06f, 13.0f, 15.36f)
                verticalLineTo(19.64f)
                curveTo(13.0f, 20.94f, 14.0f, 22.0f, 15.23f, 22.0f)
                horizontalLineTo(19.27f)
                curveTo(20.5f, 22.0f, 21.5f, 20.94f, 21.5f, 19.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 8.64f)
                verticalLineTo(4.36f)
                curveTo(21.5f, 3.06f, 20.5f, 2.0f, 19.27f, 2.0f)
                horizontalLineTo(15.23f)
                curveTo(14.0f, 2.0f, 13.0f, 3.06f, 13.0f, 4.36f)
                verticalLineTo(8.64f)
                curveTo(13.0f, 9.94f, 14.0f, 11.0f, 15.23f, 11.0f)
                horizontalLineTo(19.27f)
                curveTo(20.5f, 11.0f, 21.5f, 9.94f, 21.5f, 8.64f)
                close()
            }
        }
        .build()
        return _frame1!!
    }

private var _frame1: ImageVector? = null
