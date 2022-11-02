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

public val TwotoneGroup.Directnotification: ImageVector
    get() {
        if (_directnotification != null) {
            return _directnotification!!
        }
        _directnotification = Builder(name = "Directnotification", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveTo(20.6569f, 8.0f, 22.0f, 6.6568f, 22.0f, 5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                curveTo(17.3431f, 2.0f, 16.0f, 3.3431f, 16.0f, 5.0f)
                curveTo(16.0f, 6.6568f, 17.3431f, 8.0f, 19.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(10.0f)
            }
        }
        .build()
        return _directnotification!!
    }

private var _directnotification: ImageVector? = null
