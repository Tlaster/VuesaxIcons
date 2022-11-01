package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 8.83f, 21.17f, 9.82f, 19.5f, 9.97f)
                curveTo(19.34f, 9.99f, 19.17f, 10.0f, 19.0f, 10.0f)
                horizontalLineTo(5.0f)
                curveTo(4.83f, 10.0f, 4.66f, 9.99f, 4.5f, 9.97f)
                curveTo(2.83f, 9.82f, 2.0f, 8.83f, 2.0f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.0f, 3.0f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(21.0f, 2.0f, 22.0f, 3.0f, 22.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 11.25f)
                curveTo(4.95f, 11.25f, 4.5f, 11.7f, 4.5f, 12.25f)
                verticalLineTo(19.0f)
                curveTo(4.5f, 21.0f, 5.0f, 22.0f, 7.5f, 22.0f)
                horizontalLineTo(16.5f)
                curveTo(19.0f, 22.0f, 19.5f, 21.0f, 19.5f, 19.0f)
                verticalLineTo(12.25f)
                curveTo(19.5f, 11.7f, 19.05f, 11.25f, 18.5f, 11.25f)
                horizontalLineTo(5.5f)
                close()
                moveTo(13.82f, 15.75f)
                horizontalLineTo(10.18f)
                curveTo(9.77f, 15.75f, 9.43f, 15.41f, 9.43f, 15.0f)
                curveTo(9.43f, 14.59f, 9.77f, 14.25f, 10.18f, 14.25f)
                horizontalLineTo(13.82f)
                curveTo(14.23f, 14.25f, 14.57f, 14.59f, 14.57f, 15.0f)
                curveTo(14.57f, 15.41f, 14.23f, 15.75f, 13.82f, 15.75f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
