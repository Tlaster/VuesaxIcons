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

public val OutlineGroup.Rowhorizontal: ImageVector
    get() {
        if (_rowhorizontal != null) {
            return _rowhorizontal!!
        }
        _rowhorizontal = Builder(name = "Rowhorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.27f, 22.75f)
                horizontalLineTo(4.23f)
                curveTo(2.22f, 22.75f, 1.25f, 21.82f, 1.25f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(1.25f, 2.18f, 2.23f, 1.25f, 4.23f, 1.25f)
                horizontalLineTo(8.27f)
                curveTo(10.28f, 1.25f, 11.25f, 2.18f, 11.25f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(11.25f, 21.82f, 10.27f, 22.75f, 8.27f, 22.75f)
                close()
                moveTo(4.23f, 2.75f)
                curveTo(2.96f, 2.75f, 2.75f, 3.09f, 2.75f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.75f, 20.91f, 2.96f, 21.25f, 4.23f, 21.25f)
                horizontalLineTo(8.27f)
                curveTo(9.54f, 21.25f, 9.75f, 20.91f, 9.75f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(9.75f, 3.09f, 9.54f, 2.75f, 8.27f, 2.75f)
                horizontalLineTo(4.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 22.75f)
                horizontalLineTo(15.73f)
                curveTo(13.72f, 22.75f, 12.75f, 21.82f, 12.75f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(12.75f, 2.18f, 13.73f, 1.25f, 15.73f, 1.25f)
                horizontalLineTo(19.77f)
                curveTo(21.78f, 1.25f, 22.75f, 2.18f, 22.75f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(22.75f, 21.82f, 21.77f, 22.75f, 19.77f, 22.75f)
                close()
                moveTo(15.73f, 2.75f)
                curveTo(14.46f, 2.75f, 14.25f, 3.09f, 14.25f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(14.25f, 20.91f, 14.46f, 21.25f, 15.73f, 21.25f)
                horizontalLineTo(19.77f)
                curveTo(21.04f, 21.25f, 21.25f, 20.91f, 21.25f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(21.25f, 3.09f, 21.04f, 2.75f, 19.77f, 2.75f)
                horizontalLineTo(15.73f)
                close()
            }
        }
        .build()
        return _rowhorizontal!!
    }

private var _rowhorizontal: ImageVector? = null
