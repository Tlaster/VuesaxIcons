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

public val OutlineGroup.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 22.6298f)
                curveTo(11.3302f, 22.6298f, 10.6502f, 22.4798f, 10.1202f, 22.1698f)
                lineTo(4.6202f, 18.9998f)
                curveTo(2.3802f, 17.4898f, 2.2402f, 17.2598f, 2.2402f, 14.8898f)
                verticalLineTo(9.1098f)
                curveTo(2.2402f, 6.7398f, 2.3702f, 6.5098f, 4.5702f, 5.0198f)
                lineTo(10.1102f, 1.8198f)
                curveTo(11.1602f, 1.2098f, 12.8102f, 1.2098f, 13.8602f, 1.8198f)
                lineTo(19.3802f, 4.9998f)
                curveTo(21.6202f, 6.5098f, 21.7602f, 6.7398f, 21.7602f, 9.1098f)
                verticalLineTo(14.8798f)
                curveTo(21.7602f, 17.2498f, 21.6302f, 17.4798f, 19.4302f, 18.9698f)
                lineTo(13.8902f, 22.1698f)
                curveTo(13.3502f, 22.4798f, 12.6702f, 22.6298f, 12.0002f, 22.6298f)
                close()
                moveTo(12.0002f, 2.8698f)
                curveTo(11.5802f, 2.8698f, 11.1702f, 2.9498f, 10.8802f, 3.1198f)
                lineTo(5.3802f, 6.2998f)
                curveTo(3.7502f, 7.3998f, 3.7502f, 7.3998f, 3.7502f, 9.1098f)
                verticalLineTo(14.8798f)
                curveTo(3.7502f, 16.5898f, 3.7502f, 16.5898f, 5.4202f, 17.7198f)
                lineTo(10.8802f, 20.8698f)
                curveTo(11.4702f, 21.2098f, 12.5402f, 21.2098f, 13.1302f, 20.8698f)
                lineTo(18.6302f, 17.6898f)
                curveTo(20.2502f, 16.5898f, 20.2502f, 16.5898f, 20.2502f, 14.8798f)
                verticalLineTo(9.1098f)
                curveTo(20.2502f, 7.3998f, 20.2502f, 7.3998f, 18.5802f, 6.2698f)
                lineTo(13.1202f, 3.1198f)
                curveTo(12.8302f, 2.9498f, 12.4202f, 2.8698f, 12.0002f, 2.8698f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.75f)
                curveTo(9.93f, 15.75f, 8.25f, 14.07f, 8.25f, 12.0f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12.0f, 8.25f)
                curveTo(14.07f, 8.25f, 15.75f, 9.93f, 15.75f, 12.0f)
                curveTo(15.75f, 14.07f, 14.07f, 15.75f, 12.0f, 15.75f)
                close()
                moveTo(12.0f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12.0f)
                curveTo(9.75f, 13.24f, 10.76f, 14.25f, 12.0f, 14.25f)
                curveTo(13.24f, 14.25f, 14.25f, 13.24f, 14.25f, 12.0f)
                curveTo(14.25f, 10.76f, 13.24f, 9.75f, 12.0f, 9.75f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null
