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

public val BrokenGroup.Locationtick: ImageVector
    get() {
        if (_locationtick != null) {
            return _locationtick!!
        }
        _locationtick = Builder(name = "Locationtick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.25f, 11.5f)
                lineTo(10.75f, 13.0f)
                lineTo(14.75f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.9809f, 4.3001f)
                curveTo(10.3509f, 0.1901f, 18.8209f, 1.6001f, 20.3809f, 8.5101f)
                curveTo(21.5309f, 13.5901f, 18.3709f, 17.8901f, 15.6009f, 20.5501f)
                curveTo(13.5909f, 22.4901f, 10.4109f, 22.4901f, 8.3909f, 20.5501f)
                curveTo(5.6309f, 17.8801f, 2.4609f, 13.5801f, 3.6209f, 8.5001f)
            }
        }
        .build()
        return _locationtick!!
    }

private var _locationtick: ImageVector? = null
