package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                curveTo(3.9f, 10.0f, 3.0f, 10.9f, 3.0f, 12.0f)
                curveTo(3.0f, 13.1f, 3.9f, 14.0f, 5.0f, 14.0f)
                curveTo(6.1f, 14.0f, 7.0f, 13.1f, 7.0f, 12.0f)
                curveTo(7.0f, 10.9f, 6.1f, 10.0f, 5.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveTo(17.9f, 10.0f, 17.0f, 10.9f, 17.0f, 12.0f)
                curveTo(17.0f, 13.1f, 17.9f, 14.0f, 19.0f, 14.0f)
                curveTo(20.1f, 14.0f, 21.0f, 13.1f, 21.0f, 12.0f)
                curveTo(21.0f, 10.9f, 20.1f, 10.0f, 19.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 13.1f, 10.9f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1f, 14.0f, 14.0f, 13.1f, 14.0f, 12.0f)
                curveTo(14.0f, 10.9f, 13.1f, 10.0f, 12.0f, 10.0f)
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null
