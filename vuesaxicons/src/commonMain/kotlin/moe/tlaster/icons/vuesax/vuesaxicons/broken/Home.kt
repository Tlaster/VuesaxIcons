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

public val BrokenGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.3593f, 19.2401f)
                curveTo(3.5993f, 20.6601f, 4.9593f, 21.8101f, 6.3993f, 21.8101f)
                horizontalLineTo(17.5993f)
                curveTo(19.0293f, 21.8101f, 20.3993f, 20.6501f, 20.6393f, 19.2401f)
                lineTo(21.9693f, 11.2801f)
                curveTo(22.1293f, 10.3001f, 21.6293f, 8.9901f, 20.8593f, 8.3701f)
                lineTo(13.9293f, 2.8301f)
                curveTo(12.8593f, 1.9701f, 11.1293f, 1.9701f, 10.0693f, 2.8201f)
                lineTo(3.1393f, 8.3701f)
                curveTo(2.3593f, 8.9901f, 1.8593f, 10.3001f, 2.0293f, 11.2801f)
                lineTo(2.7093f, 15.3701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.5f)
                curveTo(10.62f, 10.5f, 9.5f, 11.62f, 9.5f, 13.0f)
                curveTo(9.5f, 14.38f, 10.62f, 15.5f, 12.0f, 15.5f)
                curveTo(13.38f, 15.5f, 14.5f, 14.38f, 14.5f, 13.0f)
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
