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

public val BoldGroup.Arrowright: ImageVector
    get() {
        if (_arrowright != null) {
            return _arrowright!!
        }
        _arrowright = Builder(name = "Arrowright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.53f, 12.53f)
                lineTo(14.24f, 16.82f)
                curveTo(14.09f, 16.97f, 13.9f, 17.04f, 13.71f, 17.04f)
                curveTo(13.52f, 17.04f, 13.33f, 16.97f, 13.18f, 16.82f)
                curveTo(12.89f, 16.53f, 12.89f, 16.05f, 13.18f, 15.76f)
                lineTo(16.19f, 12.75f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 12.75f, 5.25f, 12.41f, 5.25f, 12.0f)
                curveTo(5.25f, 11.59f, 5.59f, 11.25f, 6.0f, 11.25f)
                horizontalLineTo(16.19f)
                lineTo(13.18f, 8.24f)
                curveTo(12.89f, 7.95f, 12.89f, 7.47f, 13.18f, 7.18f)
                curveTo(13.47f, 6.89f, 13.95f, 6.89f, 14.24f, 7.18f)
                lineTo(18.53f, 11.47f)
                curveTo(18.67f, 11.61f, 18.75f, 11.8f, 18.75f, 12.0f)
                curveTo(18.75f, 12.2f, 18.67f, 12.39f, 18.53f, 12.53f)
                close()
            }
        }
        .build()
        return _arrowright!!
    }

private var _arrowright: ImageVector? = null
