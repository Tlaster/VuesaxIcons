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

public val BoldGroup.Pathsquare: ImageVector
    get() {
        if (_pathsquare != null) {
            return _pathsquare!!
        }
        _pathsquare = Builder(name = "Pathsquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.66f, 11.25f)
                lineTo(15.04f, 12.27f)
                lineTo(15.18f, 14.67f)
                curveTo(15.31f, 16.01f, 14.85f, 16.47f, 13.58f, 16.62f)
                lineTo(8.51f, 17.22f)
                verticalLineTo(17.22f)
                curveTo(8.2318f, 17.2579f, 8.1373f, 16.9427f, 8.3359f, 16.7441f)
                lineTo(9.88f, 15.2f)
                curveTo(10.17f, 14.91f, 10.17f, 14.43f, 9.88f, 14.14f)
                curveTo(9.58f, 13.85f, 9.11f, 13.85f, 8.81f, 14.14f)
                lineTo(7.2748f, 15.683f)
                curveTo(7.077f, 15.8818f, 6.7621f, 15.7879f, 6.8f, 15.51f)
                verticalLineTo(15.51f)
                lineTo(7.39f, 10.44f)
                curveTo(7.55f, 9.17f, 8.01f, 8.76f, 9.35f, 8.84f)
                lineTo(11.74f, 8.98f)
                lineTo(12.77f, 7.35f)
                curveTo(13.24f, 6.61f, 14.2f, 6.57f, 14.9f, 7.27f)
                lineTo(16.75f, 9.12f)
                curveTo(17.41f, 9.77f, 17.37f, 10.8f, 16.66f, 11.25f)
                close()
            }
        }
        .build()
        return _pathsquare!!
    }

private var _pathsquare: ImageVector? = null
