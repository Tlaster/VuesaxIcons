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

public val TwotoneGroup.Batteryempty1: ImageVector
    get() {
        if (_batteryempty1 != null) {
            return _batteryempty1!!
        }
        _batteryempty1 = Builder(name = "Batteryempty1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 19.0f, 2.0f, 18.0f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.0f, 3.0f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(17.0f, 5.0f, 18.0f, 6.0f, 18.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 18.0f, 17.0f, 19.0f, 13.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 9.5f)
                curveTo(22.0f, 9.5f, 22.0f, 10.0f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 14.0f, 22.0f, 14.5f, 20.5f, 14.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3809f, 10.0f)
                curveTo(6.7109f, 11.31f, 6.7109f, 12.69f, 6.3809f, 14.0f)
            }
        }
        .build()
        return _batteryempty1!!
    }

private var _batteryempty1: ImageVector? = null
