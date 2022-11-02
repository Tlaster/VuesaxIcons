package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Notificationcircle: ImageVector
    get() {
        if (_notificationcircle != null) {
            return _notificationcircle!!
        }
        _notificationcircle = Builder(name = "Notificationcircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.75f)
                curveTo(16.93f, 8.75f, 15.25f, 7.07f, 15.25f, 5.0f)
                curveTo(15.25f, 2.93f, 16.93f, 1.25f, 19.0f, 1.25f)
                curveTo(21.07f, 1.25f, 22.75f, 2.93f, 22.75f, 5.0f)
                curveTo(22.75f, 7.07f, 21.07f, 8.75f, 19.0f, 8.75f)
                close()
                moveTo(19.0f, 2.75f)
                curveTo(17.76f, 2.75f, 16.75f, 3.76f, 16.75f, 5.0f)
                curveTo(16.75f, 6.24f, 17.76f, 7.25f, 19.0f, 7.25f)
                curveTo(20.24f, 7.25f, 21.25f, 6.24f, 21.25f, 5.0f)
                curveTo(21.25f, 3.76f, 20.24f, 2.75f, 19.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(12.73f, 1.25f, 13.46f, 1.32f, 14.17f, 1.47f)
                curveTo(14.58f, 1.55f, 14.84f, 1.95f, 14.75f, 2.36f)
                curveTo(14.67f, 2.77f, 14.27f, 3.03f, 13.87f, 2.94f)
                curveTo(13.26f, 2.81f, 12.63f, 2.75f, 12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 11.38f, 21.19f, 10.76f, 21.07f, 10.16f)
                curveTo(20.99f, 9.75f, 21.25f, 9.36f, 21.66f, 9.28f)
                curveTo(22.07f, 9.19f, 22.46f, 9.46f, 22.54f, 9.87f)
                curveTo(22.68f, 10.57f, 22.75f, 11.29f, 22.75f, 12.01f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
            }
        }
        .build()
        return _notificationcircle!!
    }

private var _notificationcircle: ImageVector? = null
