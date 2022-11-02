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

public val BrokenGroup.Box1: ImageVector
    get() {
        if (_box1 != null) {
            return _box1!!
        }
        _box1 = Builder(name = "Box1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1699f, 7.4399f)
                lineTo(11.9999f, 12.5499f)
                lineTo(20.7699f, 7.4699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.3906f, 13.2501f)
                verticalLineTo(14.8301f)
                curveTo(2.3906f, 16.2101f, 3.3806f, 17.8901f, 4.5906f, 18.5601f)
                lineTo(9.9306f, 21.5301f)
                curveTo(11.0706f, 22.1601f, 12.9406f, 22.1601f, 14.0806f, 21.5301f)
                lineTo(19.4206f, 18.5601f)
                curveTo(20.6306f, 17.8901f, 21.6206f, 16.2101f, 21.6206f, 14.8301f)
                verticalLineTo(9.1701f)
                curveTo(21.6206f, 7.7901f, 20.6306f, 6.1101f, 19.4206f, 5.4401f)
                lineTo(14.0806f, 2.4701f)
                curveTo(12.9406f, 1.8401f, 11.0706f, 1.8401f, 9.9306f, 2.4701f)
                lineTo(4.5906f, 5.4401f)
                curveTo(3.3806f, 6.1101f, 2.3906f, 7.7901f, 2.3906f, 9.1701f)
            }
        }
        .build()
        return _box1!!
    }

private var _box1: ImageVector? = null
