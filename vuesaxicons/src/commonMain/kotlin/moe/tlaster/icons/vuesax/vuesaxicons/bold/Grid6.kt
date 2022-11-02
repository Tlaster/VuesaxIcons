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

public val BoldGroup.Grid6: ImageVector
    get() {
        if (_grid6 != null) {
            return _grid6!!
        }
        _grid6 = Builder(name = "Grid6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.7492f)
                horizontalLineTo(9.75f)
                verticalLineTo(1.9492f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 1.9492f, 22.0f, 4.1192f, 22.0f, 7.7492f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.25f)
                curveTo(21.95f, 19.82f, 19.79f, 21.95f, 16.19f, 21.95f)
                horizontalLineTo(9.75f)
                verticalLineTo(16.25f)
                horizontalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 1.9492f)
                verticalLineTo(21.9492f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 21.9492f, 2.0f, 19.7792f, 2.0f, 16.1392f)
                verticalLineTo(7.7592f)
                curveTo(2.0f, 4.1192f, 4.17f, 1.9492f, 7.81f, 1.9492f)
                horizontalLineTo(8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(14.75f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.25f)
                close()
            }
        }
        .build()
        return _grid6!!
    }

private var _grid6: ImageVector? = null
