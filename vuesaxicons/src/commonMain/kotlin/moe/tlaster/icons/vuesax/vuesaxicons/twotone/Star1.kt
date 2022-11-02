package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Star1: ImageVector
    get() {
        if (_star1 != null) {
            return _star1!!
        }
        _star1 = Builder(name = "Star1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.7309f, 3.5101f)
                lineTo(15.4909f, 7.0301f)
                curveTo(15.7309f, 7.5201f, 16.3709f, 7.9901f, 16.9109f, 8.0801f)
                lineTo(20.1009f, 8.6101f)
                curveTo(22.1409f, 8.9501f, 22.6209f, 10.4301f, 21.1509f, 11.8901f)
                lineTo(18.6709f, 14.3701f)
                curveTo(18.2509f, 14.7901f, 18.0209f, 15.6001f, 18.1509f, 16.1801f)
                lineTo(18.8609f, 19.2501f)
                curveTo(19.4209f, 21.6801f, 18.1309f, 22.6201f, 15.9809f, 21.3501f)
                lineTo(12.9909f, 19.5801f)
                curveTo(12.4509f, 19.2601f, 11.5609f, 19.2601f, 11.0109f, 19.5801f)
                lineTo(8.0209f, 21.3501f)
                curveTo(5.8809f, 22.6201f, 4.5809f, 21.6701f, 5.1409f, 19.2501f)
                lineTo(5.8509f, 16.1801f)
                curveTo(5.9809f, 15.6001f, 5.7509f, 14.7901f, 5.3309f, 14.3701f)
                lineTo(2.8509f, 11.8901f)
                curveTo(1.3909f, 10.4301f, 1.8609f, 8.9501f, 3.9009f, 8.6101f)
                lineTo(7.0909f, 8.0801f)
                curveTo(7.6209f, 7.9901f, 8.2609f, 7.5201f, 8.5009f, 7.0301f)
                lineTo(10.2609f, 3.5101f)
                curveTo(11.2209f, 1.6001f, 12.7809f, 1.6001f, 13.7309f, 3.5101f)
                close()
            }
        }
        .build()
        return _star1!!
    }

private var _star1: ImageVector? = null
