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

public val BoldGroup.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.33f, 17.0f)
                horizontalLineTo(10.66f)
                curveTo(10.25f, 17.0f, 9.91f, 16.66f, 9.91f, 16.25f)
                curveTo(9.91f, 15.84f, 10.25f, 15.5f, 10.66f, 15.5f)
                horizontalLineTo(13.33f)
                curveTo(13.74f, 15.5f, 14.08f, 15.84f, 14.08f, 16.25f)
                curveTo(14.08f, 16.66f, 13.75f, 17.0f, 13.33f, 17.0f)
                close()
                moveTo(16.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12.0f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12.0f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16.0f, 12.75f)
                close()
                moveTo(18.0f, 8.5f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 8.5f, 5.25f, 8.16f, 5.25f, 7.75f)
                curveTo(5.25f, 7.34f, 5.59f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 7.0f, 18.75f, 7.34f, 18.75f, 7.75f)
                curveTo(18.75f, 8.16f, 18.41f, 8.5f, 18.0f, 8.5f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
