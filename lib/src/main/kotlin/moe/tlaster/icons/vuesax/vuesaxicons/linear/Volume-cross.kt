package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Volume-cross`: ImageVector
    get() {
        if (`_volume-cross` != null) {
            return `_volume-cross`!!
        }
        `_volume-cross` = Builder(name = "Volume-cross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 10.1595f)
                verticalLineTo(14.1595f)
                curveTo(2.0f, 16.1595f, 3.0f, 17.1595f, 5.0f, 17.1595f)
                horizontalLineTo(6.43f)
                curveTo(6.8f, 17.1595f, 7.17f, 17.2695f, 7.49f, 17.4595f)
                lineTo(10.41f, 19.2895f)
                curveTo(12.93f, 20.8695f, 15.0f, 19.7195f, 15.0f, 16.7495f)
                verticalLineTo(7.5695f)
                curveTo(15.0f, 4.5895f, 12.93f, 3.4495f, 10.41f, 5.0295f)
                lineTo(7.49f, 6.8595f)
                curveTo(7.17f, 7.0495f, 6.8f, 7.1595f, 6.43f, 7.1595f)
                horizontalLineTo(5.0f)
                curveTo(3.0f, 7.1595f, 2.0f, 8.1595f, 2.0f, 10.1595f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 14.1194f)
                lineTo(18.04f, 10.1594f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.96f, 10.1995f)
                lineTo(18.0f, 14.1595f)
            }
        }
        .build()
        return `_volume-cross`!!
    }

private var `_volume-cross`: ImageVector? = null
