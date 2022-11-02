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

public val OutlineGroup.Grid3: ImageVector
    get() {
        if (_grid3 != null) {
            return _grid3!!
        }
        _grid3 = Builder(name = "Grid3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12.0f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 10.25f, 1.25f, 9.91f, 1.25f, 9.5f)
                curveTo(1.25f, 9.09f, 1.59f, 8.75f, 2.0f, 8.75f)
                horizontalLineTo(12.0f)
                curveTo(12.41f, 8.75f, 12.75f, 9.09f, 12.75f, 9.5f)
                curveTo(12.75f, 9.91f, 12.41f, 10.25f, 12.0f, 10.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.25f)
                horizontalLineTo(12.0f)
                curveTo(11.59f, 15.25f, 11.25f, 14.91f, 11.25f, 14.5f)
                curveTo(11.25f, 14.09f, 11.59f, 13.75f, 12.0f, 13.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 13.75f, 22.75f, 14.09f, 22.75f, 14.5f)
                curveTo(22.75f, 14.91f, 22.41f, 15.25f, 22.0f, 15.25f)
                close()
            }
        }
        .build()
        return _grid3!!
    }

private var _grid3: ImageVector? = null
