package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.`Path-square`: ImageVector
    get() {
        if (`_path-square` != null) {
            return `_path-square`!!
        }
        `_path-square` = Builder(name = "Path-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.7502f, 9.12f)
                lineTo(14.9002f, 7.27f)
                curveTo(14.2002f, 6.57f, 13.2402f, 6.61f, 12.7702f, 7.35f)
                lineTo(11.7402f, 8.98f)
                lineTo(15.0302f, 12.27f)
                lineTo(16.6602f, 11.24f)
                curveTo(17.3702f, 10.8f, 17.4102f, 9.77f, 16.7502f, 9.12f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.7395f, 8.9799f)
                lineTo(9.3495f, 8.8399f)
                curveTo(8.0095f, 8.7599f, 7.5495f, 9.1699f, 7.3995f, 10.4399f)
                lineTo(6.7995f, 15.5099f)
                curveTo(6.6695f, 16.5799f, 7.4395f, 17.3399f, 8.5095f, 17.2199f)
                lineTo(13.5795f, 16.6199f)
                curveTo(14.8495f, 16.4699f, 15.3095f, 16.0099f, 15.1795f, 14.6699f)
                lineTo(15.0395f, 12.2799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4902f, 16.5199f)
                lineTo(9.3402f, 14.6699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.03f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
        }
        .build()
        return `_path-square`!!
    }

private var `_path-square`: ImageVector? = null
