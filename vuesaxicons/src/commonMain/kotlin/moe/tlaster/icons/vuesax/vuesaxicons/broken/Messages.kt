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

public val BrokenGroup.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 2.0f)
                curveTo(12.52f, 2.0f, 15.13f, 3.67f, 16.3f, 6.07f)
                curveTo(16.75f, 6.96f, 17.0f, 7.95f, 17.0f, 9.0f)
                curveTo(17.0f, 12.87f, 13.64f, 16.0f, 9.5f, 16.0f)
                lineTo(8.57f, 17.12f)
                lineTo(8.02f, 17.78f)
                curveTo(7.55f, 18.34f, 6.65f, 18.22f, 6.34f, 17.55f)
                lineTo(5.0f, 14.6f)
                curveTo(3.18f, 13.32f, 2.0f, 11.29f, 2.0f, 9.0f)
                curveTo(2.0f, 6.73f, 3.15f, 4.72f, 4.95f, 3.44f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0003f, 12.86f)
                curveTo(22.0003f, 15.15f, 20.8203f, 17.1801f, 19.0003f, 18.4601f)
                lineTo(17.6603f, 21.41f)
                curveTo(17.3503f, 22.08f, 16.4503f, 22.2101f, 15.9803f, 21.6401f)
                lineTo(14.5003f, 19.86f)
                curveTo(12.0803f, 19.86f, 9.9203f, 18.7901f, 8.5703f, 17.1201f)
                lineTo(9.5003f, 16.0001f)
                curveTo(13.6403f, 16.0001f, 17.0003f, 12.8701f, 17.0003f, 9.0001f)
                curveTo(17.0003f, 7.9501f, 16.7503f, 6.9601f, 16.3003f, 6.0701f)
                curveTo(17.9303f, 6.4401f, 19.3403f, 7.3101f, 20.3603f, 8.5001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                horizontalLineTo(12.0f)
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null
