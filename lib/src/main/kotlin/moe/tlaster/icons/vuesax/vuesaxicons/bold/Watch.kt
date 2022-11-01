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

public val BoldGroup.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 3.75f, 7.25f, 3.41f, 7.25f, 3.0f)
                curveTo(7.25f, 2.59f, 7.59f, 2.25f, 8.0f, 2.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 2.25f, 16.75f, 2.59f, 16.75f, 3.0f)
                curveTo(16.75f, 3.41f, 16.41f, 3.75f, 16.0f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 21.75f, 7.25f, 21.41f, 7.25f, 21.0f)
                curveTo(7.25f, 20.59f, 7.59f, 20.25f, 8.0f, 20.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 20.25f, 16.75f, 20.59f, 16.75f, 21.0f)
                curveTo(16.75f, 21.41f, 16.41f, 21.75f, 16.0f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 5.0f)
                horizontalLineTo(8.5f)
                curveTo(6.17f, 5.0f, 5.0f, 6.17f, 5.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(5.0f, 17.83f, 6.17f, 19.0f, 8.5f, 19.0f)
                horizontalLineTo(15.5f)
                curveTo(17.83f, 19.0f, 19.0f, 17.83f, 19.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(19.0f, 6.17f, 17.83f, 5.0f, 15.5f, 5.0f)
                close()
                moveTo(14.5f, 13.25f)
                horizontalLineTo(11.5f)
                curveTo(11.09f, 13.25f, 10.75f, 12.91f, 10.75f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(10.75f, 9.09f, 11.09f, 8.75f, 11.5f, 8.75f)
                curveTo(11.91f, 8.75f, 12.25f, 9.09f, 12.25f, 9.5f)
                verticalLineTo(11.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 11.75f, 15.25f, 12.09f, 15.25f, 12.5f)
                curveTo(15.25f, 12.91f, 14.91f, 13.25f, 14.5f, 13.25f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
