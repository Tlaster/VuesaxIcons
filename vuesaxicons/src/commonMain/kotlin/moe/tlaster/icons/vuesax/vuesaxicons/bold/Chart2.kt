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

public val BoldGroup.Chart2: ImageVector
    get() {
        if (_chart2 != null) {
            return _chart2!!
        }
        _chart2 = Builder(name = "Chart2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22.0f, 22.0f, 19.83f, 22.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(7.75f, 13.6f)
                curveTo(7.75f, 14.01f, 7.41f, 14.35f, 7.0f, 14.35f)
                curveTo(6.59f, 14.35f, 6.25f, 14.01f, 6.25f, 13.6f)
                verticalLineTo(10.4f)
                curveTo(6.25f, 9.99f, 6.59f, 9.65f, 7.0f, 9.65f)
                curveTo(7.41f, 9.65f, 7.75f, 9.99f, 7.75f, 10.4f)
                verticalLineTo(13.6f)
                close()
                moveTo(12.75f, 15.34f)
                curveTo(12.75f, 15.75f, 12.41f, 16.09f, 12.0f, 16.09f)
                curveTo(11.59f, 16.09f, 11.25f, 15.75f, 11.25f, 15.34f)
                verticalLineTo(8.66f)
                curveTo(11.25f, 8.25f, 11.59f, 7.91f, 12.0f, 7.91f)
                curveTo(12.41f, 7.91f, 12.75f, 8.25f, 12.75f, 8.66f)
                verticalLineTo(15.34f)
                close()
                moveTo(17.75f, 13.6f)
                curveTo(17.75f, 14.01f, 17.41f, 14.35f, 17.0f, 14.35f)
                curveTo(16.59f, 14.35f, 16.25f, 14.01f, 16.25f, 13.6f)
                verticalLineTo(10.4f)
                curveTo(16.25f, 9.99f, 16.59f, 9.65f, 17.0f, 9.65f)
                curveTo(17.41f, 9.65f, 17.75f, 9.99f, 17.75f, 10.4f)
                verticalLineTo(13.6f)
                close()
            }
        }
        .build()
        return _chart2!!
    }

private var _chart2: ImageVector? = null
