package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Hearttick: ImageVector
    get() {
        if (_hearttick != null) {
            return _hearttick!!
        }
        _hearttick = Builder(name = "Hearttick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 17.2f)
                curveTo(22.0f, 18.1f, 21.75f, 18.95f, 21.3f, 19.67f)
                curveTo(20.47f, 21.06f, 18.95f, 22.0f, 17.2f, 22.0f)
                curveTo(15.45f, 22.0f, 13.92f, 21.06f, 13.1f, 19.67f)
                curveTo(12.66f, 18.95f, 12.4f, 18.1f, 12.4f, 17.2f)
                curveTo(12.4f, 14.55f, 14.55f, 12.4f, 17.2f, 12.4f)
                curveTo(19.85f, 12.4f, 22.0f, 14.55f, 22.0f, 17.2f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.3301f, 17.2f)
                lineTo(16.5101f, 18.38f)
                lineTo(19.0701f, 16.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.69f)
                curveTo(22.0f, 10.66f, 21.49f, 12.4f, 20.69f, 13.91f)
                curveTo(19.81f, 12.98f, 18.57f, 12.4f, 17.2f, 12.4f)
                curveTo(14.55f, 12.4f, 12.4f, 14.55f, 12.4f, 17.2f)
                curveTo(12.4f, 18.43f, 12.87f, 19.55f, 13.63f, 20.4f)
                curveTo(13.26f, 20.57f, 12.92f, 20.71f, 12.62f, 20.81f)
                curveTo(12.28f, 20.93f, 11.72f, 20.93f, 11.38f, 20.81f)
                curveTo(8.48f, 19.82f, 2.0f, 15.69f, 2.0f, 8.69f)
                curveTo(2.0f, 5.6f, 4.49f, 3.1f, 7.56f, 3.1f)
                curveTo(9.37f, 3.1f, 10.99f, 3.98f, 12.0f, 5.33f)
                curveTo(13.01f, 3.98f, 14.63f, 3.1f, 16.44f, 3.1f)
                curveTo(19.51f, 3.1f, 22.0f, 5.6f, 22.0f, 8.69f)
                close()
            }
        }
        .build()
        return _hearttick!!
    }

private var _hearttick: ImageVector? = null
