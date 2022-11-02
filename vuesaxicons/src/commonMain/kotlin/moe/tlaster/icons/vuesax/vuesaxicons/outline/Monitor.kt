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

public val OutlineGroup.Monitor: ImageVector
    get() {
        if (_monitor != null) {
            return _monitor!!
        }
        _monitor = Builder(name = "Monitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.56f, 17.97f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 17.97f, 1.25f, 16.76f, 1.25f, 12.78f)
                verticalLineTo(6.44f)
                curveTo(1.25f, 2.46f, 2.46f, 1.25f, 6.44f, 1.25f)
                horizontalLineTo(17.55f)
                curveTo(21.53f, 1.25f, 22.74f, 2.46f, 22.74f, 6.44f)
                verticalLineTo(12.77f)
                curveTo(22.75f, 16.76f, 21.54f, 17.97f, 17.56f, 17.97f)
                close()
                moveTo(6.44f, 2.75f)
                curveTo(3.3f, 2.75f, 2.75f, 3.3f, 2.75f, 6.44f)
                verticalLineTo(12.77f)
                curveTo(2.75f, 15.91f, 3.3f, 16.46f, 6.44f, 16.46f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 16.46f, 21.24f, 15.91f, 21.24f, 12.77f)
                verticalLineTo(6.44f)
                curveTo(21.24f, 3.3f, 20.69f, 2.75f, 17.55f, 2.75f)
                horizontalLineTo(6.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22.0f)
                verticalLineTo(17.22f)
                curveTo(11.25f, 16.81f, 11.59f, 16.47f, 12.0f, 16.47f)
                curveTo(12.41f, 16.47f, 12.75f, 16.81f, 12.75f, 17.22f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 13.75f, 1.25f, 13.41f, 1.25f, 13.0f)
                curveTo(1.25f, 12.59f, 1.59f, 12.25f, 2.0f, 12.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 12.25f, 22.75f, 12.59f, 22.75f, 13.0f)
                curveTo(22.75f, 13.41f, 22.41f, 13.75f, 22.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 22.75f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 22.75f, 6.75f, 22.41f, 6.75f, 22.0f)
                curveTo(6.75f, 21.59f, 7.09f, 21.25f, 7.5f, 21.25f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 21.25f, 17.25f, 21.59f, 17.25f, 22.0f)
                curveTo(17.25f, 22.41f, 16.91f, 22.75f, 16.5f, 22.75f)
                close()
            }
        }
        .build()
        return _monitor!!
    }

private var _monitor: ImageVector? = null
