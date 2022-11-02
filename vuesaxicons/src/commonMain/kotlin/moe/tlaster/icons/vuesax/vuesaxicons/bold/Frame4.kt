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

public val BoldGroup.Frame4: ImageVector
    get() {
        if (_frame4 != null) {
            return _frame4!!
        }
        _frame4 = Builder(name = "Frame4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.02f, 4.6211f)
                horizontalLineTo(6.98f)
                curveTo(5.39f, 4.6211f, 4.75f, 5.2211f, 4.75f, 6.7411f)
                verticalLineTo(18.6211f)
                horizontalLineTo(10.25f)
                verticalLineTo(6.7411f)
                curveTo(10.24f, 5.2211f, 9.6f, 4.6211f, 8.02f, 4.6211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.52f, 9.6211f)
                horizontalLineTo(15.48f)
                curveTo(13.89f, 9.6211f, 13.25f, 10.2311f, 13.25f, 11.7411f)
                verticalLineTo(18.6211f)
                horizontalLineTo(18.75f)
                verticalLineTo(11.7411f)
                curveTo(18.75f, 10.2311f, 18.1f, 9.6211f, 16.52f, 9.6211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 17.8789f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 17.8789f, 22.0f, 18.2189f, 22.0f, 18.6289f)
                curveTo(22.0f, 19.0389f, 21.66f, 19.3789f, 21.25f, 19.3789f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 19.3789f, 2.0f, 19.0389f, 2.0f, 18.6189f)
                curveTo(2.0f, 18.1989f, 2.34f, 17.8789f, 2.75f, 17.8789f)
                close()
            }
        }
        .build()
        return _frame4!!
    }

private var _frame4: ImageVector? = null
