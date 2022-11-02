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

public val TwotoneGroup.Favoritechart: ImageVector
    get() {
        if (_favoritechart != null) {
            return _favoritechart!!
        }
        _favoritechart = Builder(name = "Favoritechart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3301f, 14.4898f)
                lineTo(9.7101f, 11.3998f)
                curveTo(10.0501f, 10.9598f, 10.6801f, 10.8798f, 11.1201f, 11.2198f)
                lineTo(12.9501f, 12.6598f)
                curveTo(13.3901f, 12.9998f, 14.0201f, 12.9198f, 14.3601f, 12.4898f)
                lineTo(16.6701f, 9.5098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.4802f, 15.8199f)
                lineTo(19.7602f, 16.3899f)
                curveTo(19.9002f, 16.6699f, 20.2502f, 16.9299f, 20.5602f, 16.9899f)
                lineTo(20.9402f, 17.0499f)
                curveTo(22.0802f, 17.2399f, 22.3502f, 18.0799f, 21.5302f, 18.9099f)
                lineTo(21.1802f, 19.2599f)
                curveTo(20.9502f, 19.4999f, 20.8202f, 19.9599f, 20.8902f, 20.2799f)
                lineTo(20.9402f, 20.4899f)
                curveTo(21.2502f, 21.8699f, 20.5202f, 22.3999f, 19.3202f, 21.6799f)
                lineTo(19.0602f, 21.5299f)
                curveTo(18.7502f, 21.3499f, 18.2502f, 21.3499f, 17.9402f, 21.5299f)
                lineTo(17.6802f, 21.6799f)
                curveTo(16.4702f, 22.4099f, 15.7402f, 21.8699f, 16.0602f, 20.4899f)
                lineTo(16.1102f, 20.2799f)
                curveTo(16.1802f, 19.9599f, 16.0502f, 19.4999f, 15.8202f, 19.2599f)
                lineTo(15.4702f, 18.9099f)
                curveTo(14.6502f, 18.0799f, 14.9202f, 17.2399f, 16.0602f, 17.0499f)
                lineTo(16.4402f, 16.9899f)
                curveTo(16.7402f, 16.9399f, 17.1002f, 16.6699f, 17.2402f, 16.3899f)
                lineTo(17.5202f, 15.8199f)
                curveTo(18.0602f, 14.7299f, 18.9402f, 14.7299f, 19.4802f, 15.8199f)
                close()
            }
        }
        .build()
        return _favoritechart!!
    }

private var _favoritechart: ImageVector? = null
