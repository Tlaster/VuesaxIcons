package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Play-cricle`: ImageVector
    get() {
        if (`_play-cricle` != null) {
            return `_play-cricle`!!
        }
        `_play-cricle` = Builder(name = "Play-cricle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0701f, 19.0699f)
                curveTo(22.9801f, 15.1599f, 22.9801f, 8.8299f, 19.0701f, 4.9299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9301f, 4.9299f)
                curveTo(1.0201f, 8.8399f, 1.0201f, 15.1699f, 4.9301f, 19.0699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7f, 21.4099f)
                curveTo(9.7699f, 21.7799f, 10.8799f, 21.96f, 11.9999f, 21.96f)
                curveTo(13.1199f, 21.95f, 14.2299f, 21.7799f, 15.2999f, 21.4099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7f, 2.5901f)
                curveTo(9.7699f, 2.2201f, 10.8799f, 2.04f, 11.9999f, 2.04f)
                curveTo(13.1199f, 2.04f, 14.2299f, 2.2201f, 15.2999f, 2.5901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.74f, 12.0001f)
                verticalLineTo(10.3302f)
                curveTo(8.74f, 8.2502f, 10.21f, 7.4001f, 12.01f, 8.4401f)
                lineTo(13.46f, 9.2802f)
                lineTo(14.91f, 10.1201f)
                curveTo(16.71f, 11.1601f, 16.71f, 12.8602f, 14.91f, 13.9002f)
                lineTo(13.46f, 14.7401f)
                lineTo(12.01f, 15.5802f)
                curveTo(10.21f, 16.6202f, 8.74f, 15.7701f, 8.74f, 13.6901f)
                verticalLineTo(12.0001f)
                close()
            }
        }
        .build()
        return `_play-cricle`!!
    }

private var `_play-cricle`: ImageVector? = null
