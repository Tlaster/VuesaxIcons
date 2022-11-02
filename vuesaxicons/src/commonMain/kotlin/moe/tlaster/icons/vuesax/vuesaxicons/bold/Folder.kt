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

public val BoldGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0169f, 7.9917f)
                curveTo(21.4148f, 8.5583f, 20.9405f, 9.25f, 20.2482f, 9.25f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 9.25f, 2.0f, 8.8023f, 2.0f, 8.25f)
                verticalLineTo(6.42f)
                curveTo(2.0f, 3.98f, 3.98f, 2.0f, 6.42f, 2.0f)
                horizontalLineTo(8.74f)
                curveTo(10.37f, 2.0f, 10.88f, 2.53f, 11.53f, 3.4f)
                lineTo(12.93f, 5.26f)
                curveTo(13.24f, 5.67f, 13.28f, 5.72f, 13.86f, 5.72f)
                horizontalLineTo(16.65f)
                curveTo(18.4546f, 5.72f, 20.0516f, 6.6171f, 21.0169f, 7.9917f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9834f, 10.75f)
                curveTo(21.5343f, 10.75f, 21.9815f, 11.1957f, 21.9834f, 11.7466f)
                lineTo(22.0f, 16.6503f)
                curveTo(22.0f, 19.6003f, 19.6f, 22.0003f, 16.65f, 22.0003f)
                horizontalLineTo(7.35f)
                curveTo(4.4f, 22.0003f, 2.0f, 19.6003f, 2.0f, 16.6503f)
                verticalLineTo(11.7503f)
                curveTo(2.0f, 11.198f, 2.4477f, 10.7503f, 3.0f, 10.7503f)
                lineTo(20.9834f, 10.75f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null
