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

public val BulkGroup.Musicnote: ImageVector
    get() {
        if (_musicnote != null) {
            return _musicnote!!
        }
        _musicnote = Builder(name = "Musicnote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2605f, 2.8702f)
                lineTo(14.8405f, 1.4002f)
                curveTo(13.9205f, 1.0902f, 12.9905f, 1.2002f, 12.3105f, 1.7002f)
                curveTo(11.6205f, 2.2002f, 11.2305f, 3.0402f, 11.2305f, 4.0102f)
                verticalLineTo(7.7802f)
                lineTo(18.1105f, 10.0702f)
                curveTo(18.4505f, 10.1902f, 18.8005f, 10.2402f, 19.1305f, 10.2402f)
                curveTo(19.6905f, 10.2402f, 20.2105f, 10.0802f, 20.6405f, 9.7702f)
                curveTo(21.3305f, 9.2702f, 21.7205f, 8.4302f, 21.7205f, 7.4602f)
                verticalLineTo(6.2802f)
                curveTo(21.7205f, 4.8502f, 20.6205f, 3.3202f, 19.2605f, 2.8702f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7207f, 8.27f)
                verticalLineTo(18.0f)
                curveTo(12.7207f, 20.62f, 10.5907f, 22.75f, 7.9707f, 22.75f)
                curveTo(5.3507f, 22.75f, 3.2207f, 20.62f, 3.2207f, 18.0f)
                curveTo(3.2207f, 15.38f, 5.3507f, 13.25f, 7.9707f, 13.25f)
                curveTo(9.2307f, 13.25f, 10.3707f, 13.75f, 11.2207f, 14.55f)
                verticalLineTo(7.77f)
                lineTo(12.7207f, 8.27f)
                close()
            }
        }
        .build()
        return _musicnote!!
    }

private var _musicnote: ImageVector? = null
