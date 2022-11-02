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

public val BulkGroup.Path2: ImageVector
    get() {
        if (_path2 != null) {
            return _path2!!
        }
        _path2 = Builder(name = "Path2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1506f, 22.0001f)
                horizontalLineTo(9.8706f)
                curveTo(8.3406f, 22.0001f, 7.2006f, 20.7601f, 7.4906f, 19.4301f)
                lineTo(8.1906f, 16.3501f)
                horizontalLineTo(15.8306f)
                lineTo(16.5306f, 19.4301f)
                curveTo(16.8506f, 20.8401f, 15.7806f, 22.0001f, 14.1506f, 22.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7692f, 13.7402f)
                lineTo(15.8292f, 16.3502f)
                horizontalLineTo(8.1892f)
                lineTo(5.2492f, 13.7402f)
                curveTo(3.5392f, 12.3402f, 3.5392f, 11.2602f, 4.8392f, 9.6102f)
                lineTo(10.0292f, 3.0402f)
                curveTo(10.3892f, 2.5902f, 10.8092f, 2.2802f, 11.2592f, 2.1202f)
                curveTo(11.7492f, 1.9502f, 12.2692f, 1.9502f, 12.7592f, 2.1202f)
                curveTo(13.2092f, 2.2802f, 13.6292f, 2.5902f, 13.9892f, 3.0402f)
                lineTo(19.1792f, 9.6102f)
                curveTo(20.4792f, 11.2602f, 20.4192f, 12.2802f, 18.7692f, 13.7402f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7598f, 2.1202f)
                verticalLineTo(6.9702f)
                curveTo(12.7598f, 7.3802f, 12.4198f, 7.7202f, 12.0098f, 7.7202f)
                curveTo(11.5998f, 7.7202f, 11.2598f, 7.3802f, 11.2598f, 6.9702f)
                verticalLineTo(2.1202f)
                curveTo(11.7498f, 1.9502f, 12.2698f, 1.9502f, 12.7598f, 2.1202f)
                close()
            }
        }
        .build()
        return _path2!!
    }

private var _path2: ImageVector? = null
