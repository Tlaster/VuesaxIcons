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

public val BrokenGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 8.3399f)
                verticalLineTo(15.6599f)
                curveTo(2.0f, 17.1599f, 3.63f, 18.0999f, 4.93f, 17.3499f)
                lineTo(8.1f, 15.5299f)
                lineTo(11.27f, 13.7f)
                curveTo(11.47f, 13.58f, 11.63f, 13.45f, 11.76f, 13.29f)
                verticalLineTo(10.73f)
                curveTo(11.63f, 10.57f, 11.47f, 10.44f, 11.27f, 10.32f)
                lineTo(8.1f, 8.4899f)
                lineTo(4.93f, 6.67f)
                curveTo(3.63f, 5.9f, 2.0f, 6.8399f, 2.0f, 8.3399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.68f, 6.6501f)
                curveTo(13.38f, 5.9001f, 11.75f, 6.8401f, 11.75f, 8.3401f)
                verticalLineTo(15.6601f)
                curveTo(11.75f, 17.1601f, 13.38f, 18.1001f, 14.68f, 17.3501f)
                lineTo(17.85f, 15.5301f)
                lineTo(21.02f, 13.7001f)
                curveTo(22.32f, 12.9501f, 22.32f, 11.0801f, 21.02f, 10.3201f)
                lineTo(18.84f, 9.0601f)
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
