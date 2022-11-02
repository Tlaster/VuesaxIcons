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

public val BulkGroup.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6191f, 8.45f)
                curveTo(19.5691f, 3.83f, 15.5391f, 1.75f, 11.9991f, 1.75f)
                curveTo(11.9991f, 1.75f, 11.9991f, 1.75f, 11.9891f, 1.75f)
                curveTo(8.4591f, 1.75f, 4.4191f, 3.82f, 3.3691f, 8.44f)
                curveTo(2.1991f, 13.6f, 5.3591f, 17.97f, 8.2191f, 20.72f)
                curveTo(9.2791f, 21.74f, 10.6391f, 22.25f, 11.9991f, 22.25f)
                curveTo(13.3591f, 22.25f, 14.7191f, 21.74f, 15.7691f, 20.72f)
                curveTo(18.6291f, 17.97f, 21.7891f, 13.61f, 20.6191f, 8.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9996f, 13.4602f)
                curveTo(13.7393f, 13.4602f, 15.1496f, 12.0499f, 15.1496f, 10.3102f)
                curveTo(15.1496f, 8.5705f, 13.7393f, 7.1602f, 11.9996f, 7.1602f)
                curveTo(10.2599f, 7.1602f, 8.8496f, 8.5705f, 8.8496f, 10.3102f)
                curveTo(8.8496f, 12.0499f, 10.2599f, 13.4602f, 11.9996f, 13.4602f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
