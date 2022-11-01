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

public val BoldGroup.Backsquare: ImageVector
    get() {
        if (_backsquare != null) {
            return _backsquare!!
        }
        _backsquare = Builder(name = "Backsquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.92f, 16.13f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 16.13f, 8.25f, 15.79f, 8.25f, 15.38f)
                curveTo(8.25f, 14.97f, 8.59f, 14.63f, 9.0f, 14.63f)
                horizontalLineTo(13.92f)
                curveTo(15.2f, 14.63f, 16.25f, 13.59f, 16.25f, 12.3f)
                curveTo(16.25f, 11.01f, 15.21f, 9.97f, 13.92f, 9.97f)
                horizontalLineTo(8.85f)
                lineTo(9.11f, 10.23f)
                curveTo(9.4f, 10.53f, 9.4f, 11.0f, 9.1f, 11.3f)
                curveTo(8.95f, 11.45f, 8.76f, 11.52f, 8.57f, 11.52f)
                curveTo(8.38f, 11.52f, 8.19f, 11.45f, 8.04f, 11.3f)
                lineTo(6.47f, 9.72f)
                curveTo(6.18f, 9.43f, 6.18f, 8.95f, 6.47f, 8.66f)
                lineTo(8.04f, 7.09f)
                curveTo(8.33f, 6.8f, 8.81f, 6.8f, 9.1f, 7.09f)
                curveTo(9.39f, 7.38f, 9.39f, 7.86f, 9.1f, 8.15f)
                lineTo(8.77f, 8.48f)
                horizontalLineTo(13.92f)
                curveTo(16.03f, 8.48f, 17.75f, 10.2f, 17.75f, 12.31f)
                curveTo(17.75f, 14.42f, 16.03f, 16.13f, 13.92f, 16.13f)
                close()
            }
        }
        .build()
        return _backsquare!!
    }

private var _backsquare: ImageVector? = null
