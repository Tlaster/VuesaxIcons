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

public val BrokenGroup.Home1: ImageVector
    get() {
        if (_home1 != null) {
            return _home1!!
        }
        _home1 = Builder(name = "Home1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6393f, 19.2401f)
                curveTo(20.3993f, 20.6501f, 19.0293f, 21.8101f, 17.5993f, 21.8101f)
                horizontalLineTo(6.3993f)
                curveTo(4.9593f, 21.8101f, 3.5993f, 20.6601f, 3.3593f, 19.2401f)
                lineTo(2.0293f, 11.2801f)
                curveTo(1.8593f, 10.3001f, 2.3593f, 8.9901f, 3.1393f, 8.3701f)
                lineTo(10.0693f, 2.8201f)
                curveTo(11.1293f, 1.9701f, 12.8593f, 1.9701f, 13.9293f, 2.8301f)
                lineTo(20.8593f, 8.3701f)
                curveTo(21.6293f, 8.9901f, 22.1293f, 10.3001f, 21.9693f, 11.2801f)
                lineTo(21.3493f, 15.0001f)
            }
        }
        .build()
        return _home1!!
    }

private var _home1: ImageVector? = null
