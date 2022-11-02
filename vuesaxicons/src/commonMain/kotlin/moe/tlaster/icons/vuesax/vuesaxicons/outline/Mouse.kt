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

public val OutlineGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(7.45f, 22.75f, 3.75f, 19.05f, 3.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(3.75f, 4.95f, 7.45f, 1.25f, 12.0f, 1.25f)
                curveTo(16.55f, 1.25f, 20.25f, 4.95f, 20.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(20.25f, 19.05f, 16.55f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.28f, 2.75f, 5.25f, 5.78f, 5.25f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(5.25f, 18.22f, 8.28f, 21.25f, 12.0f, 21.25f)
                curveTo(15.72f, 21.25f, 18.75f, 18.22f, 18.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(18.75f, 5.78f, 15.72f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.75f)
                curveTo(10.76f, 11.75f, 9.75f, 10.74f, 9.75f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(9.75f, 6.26f, 10.76f, 5.25f, 12.0f, 5.25f)
                curveTo(13.24f, 5.25f, 14.25f, 6.26f, 14.25f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(14.25f, 10.74f, 13.24f, 11.75f, 12.0f, 11.75f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(11.59f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(11.25f, 9.91f, 11.59f, 10.25f, 12.0f, 10.25f)
                curveTo(12.41f, 10.25f, 12.75f, 9.91f, 12.75f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(12.75f, 7.09f, 12.41f, 6.75f, 12.0f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.75f)
                curveTo(11.59f, 6.75f, 11.25f, 6.41f, 11.25f, 6.0f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12.0f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2.0f)
                verticalLineTo(6.0f)
                curveTo(12.75f, 6.41f, 12.41f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
