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

public val BoldGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 22.0f, 6.25f, 21.66f, 6.25f, 21.25f)
                curveTo(6.25f, 20.84f, 6.59f, 20.5f, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 20.5f, 17.75f, 20.84f, 17.75f, 21.25f)
                curveTo(17.75f, 21.66f, 17.41f, 22.0f, 17.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3502f, 5.5191f)
                lineTo(16.3502f, 8.3791f)
                curveTo(15.8202f, 8.7591f, 15.0602f, 8.5291f, 14.8302f, 7.9191f)
                lineTo(12.9402f, 2.8791f)
                curveTo(12.6202f, 2.0091f, 11.3902f, 2.0091f, 11.0702f, 2.8791f)
                lineTo(9.1702f, 7.9091f)
                curveTo(8.9402f, 8.5291f, 8.1902f, 8.7591f, 7.6602f, 8.3691f)
                lineTo(3.6602f, 5.5091f)
                curveTo(2.8602f, 4.9491f, 1.8002f, 5.7391f, 2.1302f, 6.6691f)
                lineTo(6.2902f, 18.3191f)
                curveTo(6.4302f, 18.7191f, 6.8102f, 18.9791f, 7.2302f, 18.9791f)
                horizontalLineTo(16.7602f)
                curveTo(17.1802f, 18.9791f, 17.5602f, 18.7091f, 17.7002f, 18.3191f)
                lineTo(21.8602f, 6.6691f)
                curveTo(22.2002f, 5.7391f, 21.1402f, 4.9491f, 20.3502f, 5.5191f)
                close()
                moveTo(14.5002f, 14.7491f)
                horizontalLineTo(9.5002f)
                curveTo(9.0902f, 14.7491f, 8.7502f, 14.4091f, 8.7502f, 13.9991f)
                curveTo(8.7502f, 13.5891f, 9.0902f, 13.2491f, 9.5002f, 13.2491f)
                horizontalLineTo(14.5002f)
                curveTo(14.9102f, 13.2491f, 15.2502f, 13.5891f, 15.2502f, 13.9991f)
                curveTo(15.2502f, 14.4091f, 14.9102f, 14.7491f, 14.5002f, 14.7491f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
