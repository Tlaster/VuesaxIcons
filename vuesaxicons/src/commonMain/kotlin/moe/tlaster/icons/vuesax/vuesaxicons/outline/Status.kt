package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Status: ImageVector
    get() {
        if (_status != null) {
            return _status!!
        }
        _status = Builder(name = "Status", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9898f, 22.5501f)
                curveTo(9.9398f, 22.5501f, 9.8898f, 22.5501f, 9.8398f, 22.5301f)
                curveTo(6.0098f, 21.7501f, 2.8998f, 18.9301f, 1.7398f, 15.1901f)
                curveTo(1.6198f, 14.7901f, 1.8398f, 14.3701f, 2.2298f, 14.2501f)
                curveTo(2.6298f, 14.1301f, 3.0498f, 14.3501f, 3.1698f, 14.7401f)
                curveTo(4.1698f, 17.9601f, 6.8398f, 20.3801f, 10.1398f, 21.0501f)
                curveTo(10.5498f, 21.1301f, 10.8098f, 21.5301f, 10.7198f, 21.9401f)
                curveTo(10.6498f, 22.3001f, 10.3298f, 22.5501f, 9.9898f, 22.5501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9502f, 11.73f)
                curveTo(21.5702f, 11.73f, 21.2402f, 11.44f, 21.2002f, 11.06f)
                curveTo(20.7202f, 6.32f, 16.7602f, 2.75f, 12.0002f, 2.75f)
                curveTo(7.2302f, 2.75f, 3.2802f, 6.32f, 2.8002f, 11.05f)
                curveTo(2.7602f, 11.46f, 2.4002f, 11.77f, 1.9802f, 11.72f)
                curveTo(1.5702f, 11.68f, 1.2702f, 11.31f, 1.3102f, 10.9f)
                curveTo(1.8702f, 5.4f, 6.4702f, 1.25f, 12.0002f, 1.25f)
                curveTo(17.5402f, 1.25f, 22.1402f, 5.4f, 22.6902f, 10.9f)
                curveTo(22.7302f, 11.31f, 22.4302f, 11.68f, 22.0202f, 11.72f)
                curveTo(22.0002f, 11.73f, 21.9702f, 11.73f, 21.9502f, 11.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0101f, 22.5498f)
                curveTo(13.6601f, 22.5498f, 13.3501f, 22.3098f, 13.2801f, 21.9498f)
                curveTo(13.2001f, 21.5398f, 13.4601f, 21.1498f, 13.8601f, 21.0698f)
                curveTo(17.1401f, 20.3998f, 19.8101f, 17.9998f, 20.8201f, 14.7998f)
                curveTo(20.9401f, 14.3998f, 21.3701f, 14.1798f, 21.7601f, 14.3098f)
                curveTo(22.1601f, 14.4298f, 22.3701f, 14.8598f, 22.2501f, 15.2498f)
                curveTo(21.0701f, 18.9698f, 17.9701f, 21.7598f, 14.1601f, 22.5398f)
                curveTo(14.1101f, 22.5398f, 14.0601f, 22.5498f, 14.0101f, 22.5498f)
                close()
            }
        }
        .build()
        return _status!!
    }

private var _status: ImageVector? = null
