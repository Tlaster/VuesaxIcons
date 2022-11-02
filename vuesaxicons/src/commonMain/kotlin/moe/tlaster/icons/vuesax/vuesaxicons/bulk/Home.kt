package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0693f, 2.8201f)
                lineTo(3.1393f, 8.3701f)
                curveTo(2.3593f, 8.9901f, 1.8593f, 10.3001f, 2.0293f, 11.2801f)
                lineTo(3.3593f, 19.2401f)
                curveTo(3.5993f, 20.6601f, 4.9593f, 21.8101f, 6.3993f, 21.8101f)
                horizontalLineTo(17.5993f)
                curveTo(19.0293f, 21.8101f, 20.3993f, 20.6501f, 20.6393f, 19.2401f)
                lineTo(21.9693f, 11.2801f)
                curveTo(22.1293f, 10.3001f, 21.6293f, 8.9901f, 20.8593f, 8.3701f)
                lineTo(13.9293f, 2.8301f)
                curveTo(12.8593f, 1.9701f, 11.1293f, 1.9701f, 10.0693f, 2.8201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                curveTo(13.3807f, 15.5f, 14.5f, 14.3807f, 14.5f, 13.0f)
                curveTo(14.5f, 11.6193f, 13.3807f, 10.5f, 12.0f, 10.5f)
                curveTo(10.6193f, 10.5f, 9.5f, 11.6193f, 9.5f, 13.0f)
                curveTo(9.5f, 14.3807f, 10.6193f, 15.5f, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
