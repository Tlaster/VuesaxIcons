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

public val OutlineGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0691f, 21.9802f)
                curveTo(10.6591f, 21.9802f, 9.2391f, 21.4402f, 8.1691f, 20.3702f)
                lineTo(3.6391f, 15.8402f)
                curveTo(2.5391f, 14.7402f, 1.9591f, 13.2202f, 2.0291f, 11.6702f)
                lineTo(2.2691f, 6.6702f)
                curveTo(2.3791f, 4.2802f, 4.2691f, 2.3902f, 6.6691f, 2.2702f)
                lineTo(11.6691f, 2.0302f)
                curveTo(13.2191f, 1.9702f, 14.7391f, 2.5402f, 15.8391f, 3.6402f)
                lineTo(20.3691f, 8.1702f)
                curveTo(22.5191f, 10.3202f, 22.5191f, 13.8302f, 20.3691f, 15.9802f)
                lineTo(15.9791f, 20.3702f)
                curveTo(14.8991f, 21.4402f, 13.4891f, 21.9802f, 12.0691f, 21.9802f)
                close()
                moveTo(4.6991f, 14.7702f)
                lineTo(9.2291f, 19.3002f)
                curveTo(9.9891f, 20.0602f, 10.9991f, 20.4802f, 12.0691f, 20.4802f)
                curveTo(13.1391f, 20.4802f, 14.1491f, 20.0602f, 14.9091f, 19.3002f)
                lineTo(19.2991f, 14.9102f)
                curveTo(20.0591f, 14.1502f, 20.4791f, 13.1402f, 20.4791f, 12.0702f)
                curveTo(20.4791f, 11.0002f, 20.0591f, 9.9902f, 19.2991f, 9.2302f)
                lineTo(14.7691f, 4.7002f)
                curveTo(13.9691f, 3.9002f, 12.8591f, 3.4702f, 11.7391f, 3.5302f)
                lineTo(6.7391f, 3.7702f)
                curveTo(5.1091f, 3.8402f, 3.8391f, 5.1102f, 3.7591f, 6.7302f)
                lineTo(3.5191f, 11.7302f)
                curveTo(3.4691f, 12.8602f, 3.8991f, 13.9702f, 4.6991f, 14.7702f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 12.75f)
                curveTo(7.71f, 12.75f, 6.25f, 11.29f, 6.25f, 9.5f)
                curveTo(6.25f, 7.71f, 7.71f, 6.25f, 9.5f, 6.25f)
                curveTo(11.29f, 6.25f, 12.75f, 7.71f, 12.75f, 9.5f)
                curveTo(12.75f, 11.29f, 11.29f, 12.75f, 9.5f, 12.75f)
                close()
                moveTo(9.5f, 7.75f)
                curveTo(8.54f, 7.75f, 7.75f, 8.54f, 7.75f, 9.5f)
                curveTo(7.75f, 10.46f, 8.54f, 11.25f, 9.5f, 11.25f)
                curveTo(10.46f, 11.25f, 11.25f, 10.46f, 11.25f, 9.5f)
                curveTo(11.25f, 8.54f, 10.46f, 7.75f, 9.5f, 7.75f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
