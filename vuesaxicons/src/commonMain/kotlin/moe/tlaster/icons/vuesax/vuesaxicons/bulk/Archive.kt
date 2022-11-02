package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 9.97f)
                verticalLineTo(19.0f)
                curveTo(19.5f, 21.0f, 19.0f, 22.0f, 16.5f, 22.0f)
                horizontalLineTo(7.5f)
                curveTo(5.0f, 22.0f, 4.5f, 21.0f, 4.5f, 19.0f)
                verticalLineTo(9.97f)
                curveTo(4.66f, 9.99f, 4.83f, 10.0f, 5.0f, 10.0f)
                horizontalLineTo(19.0f)
                curveTo(19.17f, 10.0f, 19.34f, 9.99f, 19.5f, 9.97f)
                close()
            }
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
                moveTo(13.8197f, 14.75f)
                horizontalLineTo(10.1797f)
                curveTo(9.7697f, 14.75f, 9.4297f, 14.41f, 9.4297f, 14.0f)
                curveTo(9.4297f, 13.59f, 9.7697f, 13.25f, 10.1797f, 13.25f)
                horizontalLineTo(13.8197f)
                curveTo(14.2297f, 13.25f, 14.5697f, 13.59f, 14.5697f, 14.0f)
                curveTo(14.5697f, 14.41f, 14.2297f, 14.75f, 13.8197f, 14.75f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
