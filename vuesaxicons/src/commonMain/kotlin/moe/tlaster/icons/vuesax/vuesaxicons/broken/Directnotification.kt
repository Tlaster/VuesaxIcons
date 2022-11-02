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

public val BrokenGroup.Directnotification: ImageVector
    get() {
        if (_directnotification != null) {
            return _directnotification!!
        }
        _directnotification = Builder(name = "Directnotification", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9805f, 13.0002f)
                horizontalLineTo(5.7705f)
                curveTo(6.5305f, 13.0002f, 7.2205f, 13.4302f, 7.5605f, 14.1102f)
                lineTo(8.4505f, 15.9002f)
                curveTo(9.0005f, 17.0002f, 10.0005f, 17.0002f, 10.2405f, 17.0002f)
                horizontalLineTo(13.7705f)
                curveTo(14.5305f, 17.0002f, 15.2205f, 16.5702f, 15.5605f, 15.8902f)
                lineTo(16.4505f, 14.1002f)
                curveTo(16.7905f, 13.4202f, 17.4805f, 12.9902f, 18.2405f, 12.9902f)
                horizontalLineTo(21.9805f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                curveTo(17.34f, 2.0f, 16.0f, 3.34f, 16.0f, 5.0f)
                curveTo(16.0f, 6.66f, 17.34f, 8.0f, 19.0f, 8.0f)
                curveTo(20.66f, 8.0f, 22.0f, 6.66f, 22.0f, 5.0f)
                curveTo(22.0f, 4.66f, 21.94f, 4.32f, 21.84f, 4.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.6895f, 19.0f)
                curveTo(3.6495f, 21.1f, 5.6494f, 22.0f, 8.9994f, 22.0f)
                horizontalLineTo(14.9995f)
                curveTo(19.9995f, 22.0f, 21.9995f, 20.0f, 21.9995f, 15.0f)
                verticalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
            }
        }
        .build()
        return _directnotification!!
    }

private var _directnotification: ImageVector? = null
