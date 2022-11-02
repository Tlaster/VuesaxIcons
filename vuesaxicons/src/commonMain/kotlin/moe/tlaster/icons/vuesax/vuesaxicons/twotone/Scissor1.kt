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

public val TwotoneGroup.Scissor1: ImageVector
    get() {
        if (_scissor1 != null) {
            return _scissor1!!
        }
        _scissor1 = Builder(name = "Scissor1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 10.0f)
                curveTo(7.433f, 10.0f, 9.0f, 8.433f, 9.0f, 6.5f)
                curveTo(9.0f, 4.567f, 7.433f, 3.0f, 5.5f, 3.0f)
                curveTo(3.567f, 3.0f, 2.0f, 4.567f, 2.0f, 6.5f)
                curveTo(2.0f, 8.433f, 3.567f, 10.0f, 5.5f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 21.0f)
                curveTo(7.433f, 21.0f, 9.0f, 19.433f, 9.0f, 17.5f)
                curveTo(9.0f, 15.567f, 7.433f, 14.0f, 5.5f, 14.0f)
                curveTo(3.567f, 14.0f, 2.0f, 15.567f, 2.0f, 17.5f)
                curveTo(2.0f, 19.433f, 3.567f, 21.0f, 5.5f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0004f, 6.0f)
                lineTo(8.6504f, 15.98f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0004f, 17.97f)
                lineTo(8.6504f, 7.98f)
            }
        }
        .build()
        return _scissor1!!
    }

private var _scissor1: ImageVector? = null
