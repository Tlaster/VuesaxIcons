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

public val BulkGroup.Archivebook: ImageVector
    get() {
        if (_archivebook != null) {
            return _archivebook!!
        }
        _archivebook = Builder(name = "Archivebook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(21.0f, 20.0f, 19.5f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(4.5f, 22.0f, 3.0f, 20.0f, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.0f, 4.5f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(19.5f, 2.0f, 21.0f, 4.0f, 21.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 2.0f)
                verticalLineTo(9.86f)
                curveTo(15.5f, 10.3f, 14.98f, 10.52f, 14.66f, 10.23f)
                lineTo(12.34f, 8.09f)
                curveTo(12.15f, 7.91f, 11.85f, 7.91f, 11.66f, 8.09f)
                lineTo(9.34f, 10.23f)
                curveTo(9.02f, 10.53f, 8.5f, 10.3f, 8.5f, 9.86f)
                verticalLineTo(2.0f)
                horizontalLineTo(15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 14.75f)
                horizontalLineTo(13.25f)
                curveTo(12.84f, 14.75f, 12.5f, 14.41f, 12.5f, 14.0f)
                curveTo(12.5f, 13.59f, 12.84f, 13.25f, 13.25f, 13.25f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 13.25f, 18.25f, 13.59f, 18.25f, 14.0f)
                curveTo(18.25f, 14.41f, 17.91f, 14.75f, 17.5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 18.75f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 18.75f, 8.25f, 18.41f, 8.25f, 18.0f)
                curveTo(8.25f, 17.59f, 8.59f, 17.25f, 9.0f, 17.25f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 17.25f, 18.25f, 17.59f, 18.25f, 18.0f)
                curveTo(18.25f, 18.41f, 17.91f, 18.75f, 17.5f, 18.75f)
                close()
            }
        }
        .build()
        return _archivebook!!
    }

private var _archivebook: ImageVector? = null
