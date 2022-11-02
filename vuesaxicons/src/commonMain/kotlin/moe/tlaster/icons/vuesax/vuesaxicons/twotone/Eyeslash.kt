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

public val TwotoneGroup.Eyeslash: ImageVector
    get() {
        if (_eyeslash != null) {
            return _eyeslash!!
        }
        _eyeslash = Builder(name = "Eyeslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5299f, 9.4699f)
                lineTo(9.4699f, 14.5299f)
                curveTo(8.8199f, 13.8799f, 8.4199f, 12.9899f, 8.4199f, 11.9999f)
                curveTo(8.4199f, 10.0199f, 10.0199f, 8.4199f, 11.9999f, 8.4199f)
                curveTo(12.9899f, 8.4199f, 13.8799f, 8.8199f, 14.5299f, 9.4699f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8198f, 5.77f)
                curveTo(16.0698f, 4.45f, 14.0698f, 3.73f, 11.9998f, 3.73f)
                curveTo(8.4698f, 3.73f, 5.1798f, 5.81f, 2.8898f, 9.41f)
                curveTo(1.9898f, 10.82f, 1.9898f, 13.19f, 2.8898f, 14.6f)
                curveTo(3.6798f, 15.84f, 4.5998f, 16.91f, 5.5998f, 17.77f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4199f, 19.5302f)
                curveTo(9.5599f, 20.0102f, 10.7699f, 20.2702f, 11.9999f, 20.2702f)
                curveTo(15.5299f, 20.2702f, 18.8199f, 18.1902f, 21.1099f, 14.5902f)
                curveTo(22.0099f, 13.1802f, 22.0099f, 10.8102f, 21.1099f, 9.4002f)
                curveTo(20.7799f, 8.8802f, 20.4199f, 8.3902f, 20.0499f, 7.9302f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5095f, 12.7002f)
                curveTo(15.2495f, 14.1102f, 14.0995f, 15.2602f, 12.6895f, 15.5202f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.47f, 14.5298f)
                lineTo(2.0f, 21.9998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9993f, 2.0f)
                lineTo(14.5293f, 9.47f)
            }
        }
        .build()
        return _eyeslash!!
    }

private var _eyeslash: ImageVector? = null
