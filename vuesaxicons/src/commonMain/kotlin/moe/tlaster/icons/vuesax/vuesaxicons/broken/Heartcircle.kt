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

public val BrokenGroup.Heartcircle: ImageVector
    get() {
        if (_heartcircle != null) {
            return _heartcircle!!
        }
        _heartcircle = Builder(name = "Heartcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.3296f, 17.45f)
                curveTo(12.1496f, 17.51f, 11.8396f, 17.51f, 11.6596f, 17.45f)
                curveTo(10.0996f, 16.92f, 6.5996f, 14.69f, 6.5996f, 10.91f)
                curveTo(6.5996f, 9.24f, 7.9396f, 7.89f, 9.5996f, 7.89f)
                curveTo(10.5796f, 7.89f, 11.4496f, 8.36f, 11.9996f, 9.1f)
                curveTo(12.5396f, 8.37f, 13.4196f, 7.89f, 14.3996f, 7.89f)
                curveTo(16.0596f, 7.89f, 17.3996f, 9.24f, 17.3996f, 10.91f)
                curveTo(17.3996f, 14.69f, 13.8996f, 16.92f, 12.3296f, 17.45f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _heartcircle!!
    }

private var _heartcircle: ImageVector? = null
