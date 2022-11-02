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

public val BrokenGroup.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.1209f, 10.3099f)
                curveTo(15.1209f, 12.0299f, 13.7309f, 13.4299f, 12.0009f, 13.4299f)
                curveTo(10.2709f, 13.4299f, 8.8809f, 12.0399f, 8.8809f, 10.3099f)
                curveTo(8.8809f, 8.5799f, 10.2809f, 7.1899f, 12.0009f, 7.1899f)
                curveTo(12.3409f, 7.1899f, 12.6709f, 7.2399f, 12.9709f, 7.3399f)
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
        return _location!!
    }

private var _location: ImageVector? = null
