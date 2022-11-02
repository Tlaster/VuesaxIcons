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

public val TwotoneGroup.Messages: ImageVector
    get() {
        if (_messages != null) {
            return _messages!!
        }
        _messages = Builder(name = "Messages", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                curveTo(17.0f, 12.87f, 13.64f, 16.0f, 9.5f, 16.0f)
                lineTo(8.57f, 17.12f)
                lineTo(8.02f, 17.78f)
                curveTo(7.55f, 18.34f, 6.65f, 18.22f, 6.34f, 17.55f)
                lineTo(5.0f, 14.6f)
                curveTo(3.18f, 13.32f, 2.0f, 11.29f, 2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.36f, 2.0f, 9.5f, 2.0f)
                curveTo(12.52f, 2.0f, 15.13f, 3.67f, 16.3f, 6.07f)
                curveTo(16.75f, 6.96f, 17.0f, 7.95f, 17.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0003f, 12.8598f)
                curveTo(22.0003f, 15.1498f, 20.8203f, 17.1798f, 19.0003f, 18.4598f)
                lineTo(17.6603f, 21.4098f)
                curveTo(17.3503f, 22.0798f, 16.4503f, 22.2098f, 15.9803f, 21.6398f)
                lineTo(14.5003f, 19.8598f)
                curveTo(12.0803f, 19.8598f, 9.9203f, 18.7898f, 8.5703f, 17.1198f)
                lineTo(9.5003f, 15.9998f)
                curveTo(13.6403f, 15.9998f, 17.0003f, 12.8698f, 17.0003f, 8.9998f)
                curveTo(17.0003f, 7.9498f, 16.7503f, 6.9598f, 16.3003f, 6.0698f)
                curveTo(19.5703f, 6.8198f, 22.0003f, 9.5798f, 22.0003f, 12.8598f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                horizontalLineTo(12.0f)
            }
        }
        .build()
        return _messages!!
    }

private var _messages: ImageVector? = null
