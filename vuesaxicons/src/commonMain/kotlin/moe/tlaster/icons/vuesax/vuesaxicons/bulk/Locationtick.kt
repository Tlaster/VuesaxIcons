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

public val BulkGroup.Locationtick: ImageVector
    get() {
        if (_locationtick != null) {
            return _locationtick!!
        }
        _locationtick = Builder(name = "Locationtick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6207f, 8.7f)
                curveTo(19.5807f, 4.07f, 15.5407f, 2.0f, 12.0007f, 2.0f)
                curveTo(12.0007f, 2.0f, 12.0007f, 2.0f, 11.9907f, 2.0f)
                curveTo(8.4607f, 2.0f, 4.4307f, 4.07f, 3.3807f, 8.69f)
                curveTo(2.2007f, 13.85f, 5.3607f, 18.22f, 8.2207f, 20.98f)
                curveTo(9.2807f, 22.0f, 10.6407f, 22.51f, 12.0007f, 22.51f)
                curveTo(13.3607f, 22.51f, 14.7207f, 22.0f, 15.7707f, 20.98f)
                curveTo(18.6307f, 18.22f, 21.7907f, 13.86f, 20.6207f, 8.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7495f, 13.7499f)
                curveTo(10.5595f, 13.7499f, 10.3695f, 13.6799f, 10.2195f, 13.5299f)
                lineTo(8.7194f, 12.0299f)
                curveTo(8.4295f, 11.7399f, 8.4295f, 11.2599f, 8.7194f, 10.9699f)
                curveTo(9.0094f, 10.6799f, 9.4895f, 10.6799f, 9.7795f, 10.9699f)
                lineTo(10.7495f, 11.9399f)
                lineTo(14.2195f, 8.4699f)
                curveTo(14.5095f, 8.1799f, 14.9895f, 8.1799f, 15.2795f, 8.4699f)
                curveTo(15.5695f, 8.7599f, 15.5695f, 9.2399f, 15.2795f, 9.5299f)
                lineTo(11.2795f, 13.5299f)
                curveTo(11.1295f, 13.6799f, 10.9395f, 13.7499f, 10.7495f, 13.7499f)
                close()
            }
        }
        .build()
        return _locationtick!!
    }

private var _locationtick: ImageVector? = null
