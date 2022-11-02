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

public val BoldGroup.Courthouse: ImageVector
    get() {
        if (_courthouse != null) {
            return _courthouse!!
        }
        _courthouse = Builder(name = "Courthouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.2512f)
                horizontalLineTo(20.75f)
                verticalLineTo(11.0012f)
                curveTo(20.75f, 8.5812f, 19.42f, 7.2512f, 17.0f, 7.2512f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.0212f)
                curveTo(13.33f, 6.1612f, 13.91f, 6.2412f, 14.5f, 6.2412f)
                curveTo(15.44f, 6.2412f, 16.38f, 6.0612f, 17.28f, 5.7012f)
                curveTo(17.56f, 5.5912f, 17.75f, 5.3112f, 17.75f, 5.0012f)
                verticalLineTo(2.0012f)
                curveTo(17.75f, 1.7512f, 17.63f, 1.5212f, 17.42f, 1.3812f)
                curveTo(17.21f, 1.2412f, 16.95f, 1.2112f, 16.72f, 1.3012f)
                curveTo(15.29f, 1.8712f, 13.71f, 1.8712f, 12.28f, 1.3012f)
                curveTo(12.05f, 1.2112f, 11.79f, 1.2412f, 11.58f, 1.3812f)
                curveTo(11.37f, 1.5212f, 11.25f, 1.7512f, 11.25f, 2.0012f)
                verticalLineTo(5.0012f)
                verticalLineTo(7.2512f)
                horizontalLineTo(7.0f)
                curveTo(4.58f, 7.2512f, 3.25f, 8.5812f, 3.25f, 11.0012f)
                verticalLineTo(21.2512f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.2512f, 1.25f, 21.5912f, 1.25f, 22.0012f)
                curveTo(1.25f, 22.4112f, 1.59f, 22.7512f, 2.0f, 22.7512f)
                horizontalLineTo(4.0f)
                horizontalLineTo(20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 22.7512f, 22.75f, 22.4112f, 22.75f, 22.0012f)
                curveTo(22.75f, 21.5912f, 22.41f, 21.2512f, 22.0f, 21.2512f)
                close()
                moveTo(7.24f, 21.2512f)
                horizontalLineTo(4.75f)
                verticalLineTo(12.7512f)
                horizontalLineTo(7.24f)
                verticalLineTo(21.2512f)
                close()
                moveTo(11.24f, 21.2512f)
                horizontalLineTo(8.74f)
                verticalLineTo(12.7512f)
                horizontalLineTo(11.24f)
                verticalLineTo(21.2512f)
                close()
                moveTo(15.24f, 21.2512f)
                horizontalLineTo(12.74f)
                verticalLineTo(12.7512f)
                horizontalLineTo(15.24f)
                verticalLineTo(21.2512f)
                close()
                moveTo(19.25f, 21.2512f)
                horizontalLineTo(16.74f)
                verticalLineTo(12.7512f)
                horizontalLineTo(19.25f)
                verticalLineTo(21.2512f)
                close()
            }
        }
        .build()
        return _courthouse!!
    }

private var _courthouse: ImageVector? = null
