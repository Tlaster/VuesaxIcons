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

public val BulkGroup.Folderconnection: ImageVector
    get() {
        if (_folderconnection != null) {
            return _folderconnection!!
        }
        _folderconnection = Builder(name = "Folderconnection", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.75f, 21.0f)
                curveTo(18.75f, 21.41f, 18.41f, 21.75f, 18.0f, 21.75f)
                horizontalLineTo(14.0f)
                curveTo(13.95f, 21.75f, 13.91f, 21.73f, 13.86f, 21.72f)
                curveTo(13.57f, 22.47f, 12.85f, 23.0f, 12.0f, 23.0f)
                curveTo(11.15f, 23.0f, 10.43f, 22.47f, 10.14f, 21.72f)
                curveTo(10.09f, 21.73f, 10.05f, 21.75f, 10.0f, 21.75f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 21.75f, 5.25f, 21.41f, 5.25f, 21.0f)
                curveTo(5.25f, 20.59f, 5.59f, 20.25f, 6.0f, 20.25f)
                horizontalLineTo(10.0f)
                curveTo(10.05f, 20.25f, 10.09f, 20.27f, 10.14f, 20.28f)
                curveTo(10.34f, 19.76f, 10.76f, 19.34f, 11.28f, 19.14f)
                curveTo(11.27f, 19.09f, 11.25f, 19.05f, 11.25f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.0f)
                curveTo(12.75f, 19.05f, 12.73f, 19.09f, 12.72f, 19.14f)
                curveTo(13.24f, 19.34f, 13.66f, 19.76f, 13.86f, 20.28f)
                curveTo(13.91f, 20.27f, 13.95f, 20.25f, 14.0f, 20.25f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 20.25f, 18.75f, 20.59f, 18.75f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.3f)
                verticalLineTo(12.5f)
                curveTo(19.0f, 15.3f, 18.3f, 16.0f, 15.5f, 16.0f)
                horizontalLineTo(8.5f)
                curveTo(5.7f, 16.0f, 5.0f, 15.3f, 5.0f, 12.5f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 2.7f, 5.7f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(9.55f)
                curveTo(10.6f, 2.0f, 10.83f, 2.31f, 11.23f, 2.84f)
                lineTo(12.28f, 4.24f)
                curveTo(12.55f, 4.59f, 12.7f, 4.8f, 13.4f, 4.8f)
                horizontalLineTo(15.5f)
                curveTo(18.3f, 4.8f, 19.0f, 5.5f, 19.0f, 8.3f)
                close()
            }
        }
        .build()
        return _folderconnection!!
    }

private var _folderconnection: ImageVector? = null
