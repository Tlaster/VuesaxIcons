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

public val BrokenGroup.Notificationcircle: ImageVector
    get() {
        if (_notificationcircle != null) {
            return _notificationcircle!!
        }
        _notificationcircle = Builder(name = "Notificationcircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0195f, 16.3998f)
                curveTo(4.6395f, 19.7198f, 8.0495f, 21.9998f, 11.9995f, 21.9998f)
                curveTo(17.5195f, 21.9998f, 21.9995f, 17.5198f, 21.9995f, 11.9998f)
                curveTo(21.9995f, 11.3198f, 21.9295f, 10.6498f, 21.7995f, 10.0098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.02f, 2.2f)
                curveTo(13.36f, 2.07f, 12.69f, 2.0f, 12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                curveTo(17.34f, 2.0f, 16.0f, 3.34f, 16.0f, 5.0f)
                curveTo(16.0f, 6.66f, 17.34f, 8.0f, 19.0f, 8.0f)
                curveTo(20.66f, 8.0f, 22.0f, 6.66f, 22.0f, 5.0f)
                curveTo(22.0f, 4.64f, 21.94f, 4.3f, 21.82f, 3.99f)
            }
        }
        .build()
        return _notificationcircle!!
    }

private var _notificationcircle: ImageVector? = null
