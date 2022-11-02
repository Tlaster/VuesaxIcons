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

public val BulkGroup.Archiveadd: ImageVector
    get() {
        if (_archiveadd != null) {
            return _archiveadd!!
        }
        _archiveadd = Builder(name = "Archiveadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8203f, 2.0f)
                horizontalLineTo(7.1803f)
                curveTo(5.0503f, 2.0f, 3.3203f, 3.74f, 3.3203f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.3203f, 21.75f, 4.6103f, 22.51f, 6.1903f, 21.64f)
                lineTo(11.0703f, 18.93f)
                curveTo(11.5903f, 18.64f, 12.4303f, 18.64f, 12.9403f, 18.93f)
                lineTo(17.8203f, 21.64f)
                curveTo(19.4003f, 22.52f, 20.6903f, 21.76f, 20.6903f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.6803f, 3.74f, 18.9503f, 2.0f, 16.8203f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 9.9f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.21f)
                curveTo(12.75f, 7.8f, 12.41f, 7.46f, 12.0f, 7.46f)
                curveTo(11.59f, 7.46f, 11.25f, 7.8f, 11.25f, 8.21f)
                verticalLineTo(9.9f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 9.9f, 8.75f, 10.24f, 8.75f, 10.65f)
                curveTo(8.75f, 11.06f, 9.09f, 11.4f, 9.5f, 11.4f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.21f)
                curveTo(11.25f, 13.62f, 11.59f, 13.96f, 12.0f, 13.96f)
                curveTo(12.41f, 13.96f, 12.75f, 13.62f, 12.75f, 13.21f)
                verticalLineTo(11.4f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 11.4f, 15.25f, 11.06f, 15.25f, 10.65f)
                curveTo(15.25f, 10.24f, 14.91f, 9.9f, 14.5f, 9.9f)
                close()
            }
        }
        .build()
        return _archiveadd!!
    }

private var _archiveadd: ImageVector? = null
