package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Chart21: ImageVector
    get() {
        if (_chart21 != null) {
            return _chart21!!
        }
        _chart21 = Builder(name = "Chart21", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(9.91f, 16.19f)
                curveTo(9.91f, 16.83f, 9.39f, 17.35f, 8.74f, 17.35f)
                curveTo(8.1f, 17.35f, 7.58f, 16.83f, 7.58f, 16.19f)
                verticalLineTo(12.93f)
                curveTo(7.58f, 12.29f, 8.1f, 11.77f, 8.74f, 11.77f)
                curveTo(9.39f, 11.77f, 9.91f, 12.29f, 9.91f, 12.93f)
                verticalLineTo(16.19f)
                close()
                moveTo(16.42f, 16.19f)
                curveTo(16.42f, 16.83f, 15.9f, 17.35f, 15.26f, 17.35f)
                curveTo(14.61f, 17.35f, 14.09f, 16.83f, 14.09f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(14.09f, 7.17f, 14.61f, 6.65f, 15.26f, 6.65f)
                curveTo(15.9f, 6.65f, 16.42f, 7.17f, 16.42f, 7.81f)
                verticalLineTo(16.19f)
                close()
            }
        }
        .build()
        return _chart21!!
    }

private var _chart21: ImageVector? = null
