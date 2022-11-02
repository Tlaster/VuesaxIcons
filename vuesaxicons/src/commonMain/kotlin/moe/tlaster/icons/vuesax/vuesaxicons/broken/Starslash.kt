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

public val BrokenGroup.Starslash: ImageVector
    get() {
        if (_starslash != null) {
            return _starslash!!
        }
        _starslash = Builder(name = "Starslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0502f, 7.67f)
                curveTo(15.8102f, 7.49f, 15.6102f, 7.26f, 15.5002f, 7.03f)
                lineTo(13.7402f, 3.51f)
                curveTo(12.7902f, 1.6f, 11.2302f, 1.6f, 10.2702f, 3.51f)
                lineTo(8.5002f, 7.03f)
                curveTo(8.3802f, 7.28f, 8.1602f, 7.51f, 7.9102f, 7.7f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.2809f, 18.65f)
                lineTo(5.8509f, 16.18f)
                curveTo(5.9809f, 15.6f, 5.7509f, 14.79f, 5.3309f, 14.37f)
                lineTo(2.8509f, 11.89f)
                curveTo(1.3909f, 10.43f, 1.8609f, 8.95f, 3.9009f, 8.61f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0995f, 8.61f)
                curveTo(22.1395f, 8.95f, 22.6195f, 10.43f, 21.1495f, 11.89f)
                lineTo(18.6695f, 14.37f)
                curveTo(18.2495f, 14.79f, 18.0195f, 15.6f, 18.1495f, 16.18f)
                lineTo(18.8595f, 19.25f)
                curveTo(19.4195f, 21.68f, 18.1295f, 22.62f, 15.9795f, 21.35f)
                lineTo(12.9895f, 19.58f)
                curveTo(12.4495f, 19.26f, 11.5595f, 19.26f, 11.0095f, 19.58f)
                lineTo(8.0195f, 21.35f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _starslash!!
    }

private var _starslash: ImageVector? = null
