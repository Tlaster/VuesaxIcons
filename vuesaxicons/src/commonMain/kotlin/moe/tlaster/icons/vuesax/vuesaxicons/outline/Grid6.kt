package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Grid6: ImageVector
    get() {
        if (_grid6 != null) {
            return _grid6!!
        }
        _grid6 = Builder(name = "Grid6", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 22.75f)
                curveTo(9.59f, 22.75f, 9.25f, 22.41f, 9.25f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(9.25f, 1.59f, 9.59f, 1.25f, 10.0f, 1.25f)
                curveTo(10.41f, 1.25f, 10.75f, 1.59f, 10.75f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(10.75f, 22.41f, 10.41f, 22.75f, 10.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 9.25f, 9.25f, 8.91f, 9.25f, 8.5f)
                curveTo(9.25f, 8.09f, 9.59f, 7.75f, 10.0f, 7.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 7.75f, 22.75f, 8.09f, 22.75f, 8.5f)
                curveTo(22.75f, 8.91f, 22.41f, 9.25f, 22.0f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 16.25f, 9.25f, 15.91f, 9.25f, 15.5f)
                curveTo(9.25f, 15.09f, 9.59f, 14.75f, 10.0f, 14.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 14.75f, 22.75f, 15.09f, 22.75f, 15.5f)
                curveTo(22.75f, 15.91f, 22.41f, 16.25f, 22.0f, 16.25f)
                close()
            }
        }
        .build()
        return _grid6!!
    }

private var _grid6: ImageVector? = null
