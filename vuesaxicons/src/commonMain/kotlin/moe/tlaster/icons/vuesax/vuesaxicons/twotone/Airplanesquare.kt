package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Airplanesquare: ImageVector
    get() {
        if (_airplanesquare != null) {
            return _airplanesquare!!
        }
        _airplanesquare = Builder(name = "Airplanesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8595f, 19.0002f)
                lineTo(11.5395f, 17.5802f)
                curveTo(11.7895f, 17.3702f, 12.2095f, 17.3702f, 12.4695f, 17.5802f)
                lineTo(14.1395f, 19.0002f)
                curveTo(14.5295f, 19.2002f, 15.0095f, 19.0002f, 15.1495f, 18.5802f)
                lineTo(15.4695f, 17.6202f)
                curveTo(15.5495f, 17.3902f, 15.4695f, 17.0502f, 15.2995f, 16.8802f)
                lineTo(13.6595f, 15.2302f)
                curveTo(13.5395f, 15.1102f, 13.4495f, 14.8802f, 13.4495f, 14.7202f)
                verticalLineTo(12.8702f)
                curveTo(13.4495f, 12.4502f, 13.7595f, 12.2502f, 14.1495f, 12.4102f)
                lineTo(17.4995f, 13.8502f)
                curveTo(18.0495f, 14.0902f, 18.5095f, 13.7902f, 18.5095f, 13.1902f)
                verticalLineTo(12.2602f)
                curveTo(18.5095f, 11.7802f, 18.1495f, 11.2202f, 17.6995f, 11.0302f)
                lineTo(13.7595f, 9.3302f)
                curveTo(13.5895f, 9.2602f, 13.4595f, 9.0502f, 13.4595f, 8.8702f)
                verticalLineTo(6.8002f)
                curveTo(13.4595f, 6.1202f, 12.9595f, 5.3202f, 12.3595f, 5.0102f)
                curveTo(12.1395f, 4.9002f, 11.8895f, 4.9002f, 11.6695f, 5.0102f)
                curveTo(11.0595f, 5.3102f, 10.5695f, 6.1202f, 10.5695f, 6.8002f)
                verticalLineTo(8.8702f)
                curveTo(10.5695f, 9.0502f, 10.4295f, 9.2602f, 10.2695f, 9.3302f)
                lineTo(6.3295f, 11.0302f)
                curveTo(5.8895f, 11.2202f, 5.5195f, 11.7802f, 5.5195f, 12.2602f)
                verticalLineTo(13.1902f)
                curveTo(5.5195f, 13.7902f, 5.9695f, 14.0902f, 6.5295f, 13.8502f)
                lineTo(9.8795f, 12.4102f)
                curveTo(10.2595f, 12.2402f, 10.5795f, 12.4502f, 10.5795f, 12.8702f)
                verticalLineTo(14.7202f)
                curveTo(10.5795f, 14.8902f, 10.4795f, 15.1202f, 10.3695f, 15.2302f)
                lineTo(8.6995f, 16.8702f)
                curveTo(8.5295f, 17.0402f, 8.4495f, 17.3802f, 8.5295f, 17.6102f)
                lineTo(8.8495f, 18.5702f)
                curveTo(8.9895f, 19.0002f, 9.4595f, 19.2002f, 9.8595f, 19.0002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return _airplanesquare!!
    }

private var _airplanesquare: ImageVector? = null
