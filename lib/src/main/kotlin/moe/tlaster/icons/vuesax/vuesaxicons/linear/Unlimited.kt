package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Unlimited: ImageVector
    get() {
        if (_unlimited != null) {
            return _unlimited!!
        }
        _unlimited = Builder(name = "Unlimited", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.18f, 9.32f)
                curveTo(9.36f, 8.19f, 8.05f, 7.45f, 6.54f, 7.45f)
                curveTo(4.03f, 7.45f, 1.99f, 9.49f, 1.99f, 12.0f)
                curveTo(1.99f, 14.51f, 4.03f, 16.55f, 6.54f, 16.55f)
                curveTo(8.23f, 16.55f, 9.8f, 15.66f, 10.67f, 14.21f)
                lineTo(12.0f, 12.0f)
                lineTo(13.32f, 9.79f)
                curveTo(14.19f, 8.34f, 15.76f, 7.45f, 17.45f, 7.45f)
                curveTo(19.96f, 7.45f, 22.0f, 9.49f, 22.0f, 12.0f)
                curveTo(22.0f, 14.51f, 19.96f, 16.55f, 17.45f, 16.55f)
                curveTo(15.95f, 16.55f, 14.64f, 15.81f, 13.81f, 14.68f)
            }
        }
        .build()
        return _unlimited!!
    }

private var _unlimited: ImageVector? = null
