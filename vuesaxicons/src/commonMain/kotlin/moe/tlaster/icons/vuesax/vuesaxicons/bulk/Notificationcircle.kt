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

public val BulkGroup.Notificationcircle: ImageVector
    get() {
        if (_notificationcircle != null) {
            return _notificationcircle!!
        }
        _notificationcircle = Builder(name = "Notificationcircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveTo(20.6569f, 8.0f, 22.0f, 6.6568f, 22.0f, 5.0f)
                curveTo(22.0f, 3.3431f, 20.6569f, 2.0f, 19.0f, 2.0f)
                curveTo(17.3431f, 2.0f, 16.0f, 3.3431f, 16.0f, 5.0f)
                curveTo(16.0f, 6.6568f, 17.3431f, 8.0f, 19.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 9.5f)
                curveTo(16.52f, 9.5f, 14.5f, 7.48f, 14.5f, 5.0f)
                curveTo(14.5f, 4.09f, 14.77f, 3.25f, 15.24f, 2.55f)
                curveTo(14.22f, 2.2f, 13.13f, 2.0f, 12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f)
                curveTo(17.51f, 22.0f, 22.0f, 17.51f, 22.0f, 12.0f)
                curveTo(22.0f, 10.87f, 21.8f, 9.78f, 21.45f, 8.76f)
                curveTo(20.75f, 9.23f, 19.91f, 9.5f, 19.0f, 9.5f)
                close()
            }
        }
        .build()
        return _notificationcircle!!
    }

private var _notificationcircle: ImageVector? = null
