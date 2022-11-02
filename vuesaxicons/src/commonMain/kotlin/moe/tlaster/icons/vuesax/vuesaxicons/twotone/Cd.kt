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

public val TwotoneGroup.Cd: ImageVector
    get() {
        if (_cd != null) {
            return _cd!!
        }
        _cd = Builder(name = "Cd", defaultWidth = 22.0.dp, defaultHeight = 22.0.dp, viewportWidth =
                22.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                curveTo(16.5228f, 21.0f, 21.0f, 16.5228f, 21.0f, 11.0f)
                curveTo(21.0f, 5.4771f, 16.5228f, 1.0f, 11.0f, 1.0f)
                curveTo(5.4771f, 1.0f, 1.0f, 5.4771f, 1.0f, 11.0f)
                curveTo(1.0f, 16.5228f, 5.4771f, 21.0f, 11.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                curveTo(12.1046f, 13.0f, 13.0f, 12.1046f, 13.0f, 11.0f)
                curveTo(13.0f, 9.8954f, 12.1046f, 9.0f, 11.0f, 9.0f)
                curveTo(9.8954f, 9.0f, 9.0f, 9.8954f, 9.0f, 11.0f)
                curveTo(9.0f, 12.1046f, 9.8954f, 13.0f, 11.0f, 13.0f)
                close()
            }
        }
        .build()
        return _cd!!
    }

private var _cd: ImageVector? = null
