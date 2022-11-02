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

public val OutlineGroup.Rowvertical: ImageVector
    get() {
        if (_rowvertical != null) {
            return _rowvertical!!
        }
        _rowvertical = Builder(name = "Rowvertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 22.75f)
                horizontalLineTo(4.1f)
                curveTo(2.18f, 22.75f, 1.25f, 21.77f, 1.25f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(1.25f, 13.72f, 2.18f, 12.75f, 4.1f, 12.75f)
                horizontalLineTo(19.9f)
                curveTo(21.82f, 12.75f, 22.75f, 13.73f, 22.75f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(22.75f, 21.77f, 21.82f, 22.75f, 19.9f, 22.75f)
                close()
                moveTo(4.1f, 14.25f)
                curveTo(3.09f, 14.25f, 2.75f, 14.46f, 2.75f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(2.75f, 21.04f, 3.09f, 21.25f, 4.1f, 21.25f)
                horizontalLineTo(19.9f)
                curveTo(20.91f, 21.25f, 21.25f, 21.04f, 21.25f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(21.25f, 14.46f, 20.91f, 14.25f, 19.9f, 14.25f)
                horizontalLineTo(4.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9f, 11.25f)
                horizontalLineTo(4.1f)
                curveTo(2.18f, 11.25f, 1.25f, 10.27f, 1.25f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(1.25f, 2.22f, 2.18f, 1.25f, 4.1f, 1.25f)
                horizontalLineTo(19.9f)
                curveTo(21.82f, 1.25f, 22.75f, 2.23f, 22.75f, 4.23f)
                verticalLineTo(8.27f)
                curveTo(22.75f, 10.27f, 21.82f, 11.25f, 19.9f, 11.25f)
                close()
                moveTo(4.1f, 2.75f)
                curveTo(3.09f, 2.75f, 2.75f, 2.96f, 2.75f, 4.23f)
                verticalLineTo(8.27f)
                curveTo(2.75f, 9.54f, 3.09f, 9.75f, 4.1f, 9.75f)
                horizontalLineTo(19.9f)
                curveTo(20.91f, 9.75f, 21.25f, 9.54f, 21.25f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(21.25f, 2.96f, 20.91f, 2.75f, 19.9f, 2.75f)
                horizontalLineTo(4.1f)
                close()
            }
        }
        .build()
        return _rowvertical!!
    }

private var _rowvertical: ImageVector? = null
