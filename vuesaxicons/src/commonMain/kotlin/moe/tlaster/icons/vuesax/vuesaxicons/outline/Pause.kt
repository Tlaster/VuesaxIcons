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

public val OutlineGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.64f, 21.75f)
                horizontalLineTo(5.01f)
                curveTo(3.15f, 21.75f, 2.25f, 20.89f, 2.25f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(2.25f, 3.11f, 3.15f, 2.25f, 5.01f, 2.25f)
                horizontalLineTo(8.64f)
                curveTo(10.5f, 2.25f, 11.4f, 3.11f, 11.4f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(11.4f, 20.89f, 10.5f, 21.75f, 8.64f, 21.75f)
                close()
                moveTo(5.01f, 3.75f)
                curveTo(3.93f, 3.75f, 3.75f, 4.02f, 3.75f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(3.75f, 19.98f, 3.92f, 20.25f, 5.01f, 20.25f)
                horizontalLineTo(8.64f)
                curveTo(9.72f, 20.25f, 9.9f, 19.98f, 9.9f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(9.9f, 4.02f, 9.73f, 3.75f, 8.64f, 3.75f)
                horizontalLineTo(5.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9896f, 21.75f)
                horizontalLineTo(15.3596f)
                curveTo(13.4996f, 21.75f, 12.5996f, 20.89f, 12.5996f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(12.5996f, 3.11f, 13.4996f, 2.25f, 15.3596f, 2.25f)
                horizontalLineTo(18.9896f)
                curveTo(20.8496f, 2.25f, 21.7496f, 3.11f, 21.7496f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(21.7496f, 20.89f, 20.8496f, 21.75f, 18.9896f, 21.75f)
                close()
                moveTo(15.3596f, 3.75f)
                curveTo(14.2796f, 3.75f, 14.0996f, 4.02f, 14.0996f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(14.0996f, 19.98f, 14.2696f, 20.25f, 15.3596f, 20.25f)
                horizontalLineTo(18.9896f)
                curveTo(20.0696f, 20.25f, 20.2496f, 19.98f, 20.2496f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(20.2496f, 4.02f, 20.0796f, 3.75f, 18.9896f, 3.75f)
                horizontalLineTo(15.3596f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
