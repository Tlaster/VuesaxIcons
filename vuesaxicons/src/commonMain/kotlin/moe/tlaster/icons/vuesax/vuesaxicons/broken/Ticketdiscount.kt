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

public val BrokenGroup.Ticketdiscount: ImageVector
    get() {
        if (_ticketdiscount != null) {
            return _ticketdiscount!!
        }
        _ticketdiscount = Builder(name = "Ticketdiscount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 5.0f, 21.0f, 4.0f, 17.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 4.0f, 2.0f, 5.0f, 2.0f, 9.0f)
                verticalLineTo(9.5f)
                curveTo(3.38f, 9.5f, 4.5f, 10.62f, 4.5f, 12.0f)
                curveTo(4.5f, 13.38f, 3.38f, 14.5f, 2.0f, 14.5f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 19.0f, 3.0f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 20.0f, 22.0f, 19.0f, 22.0f, 15.0f)
                curveTo(20.62f, 15.0f, 19.5f, 13.88f, 19.5f, 12.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6309f, 15.68f)
                lineTo(15.3609f, 8.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9945f, 14.75f)
                horizontalLineTo(15.0035f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9945f, 9.25f)
                horizontalLineTo(9.0035f)
            }
        }
        .build()
        return _ticketdiscount!!
    }

private var _ticketdiscount: ImageVector? = null
