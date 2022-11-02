package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4604f, 22.7501f)
                curveTo(12.2904f, 22.7501f, 12.1204f, 22.7501f, 11.9504f, 22.7401f)
                curveTo(6.3504f, 22.4901f, 1.6704f, 17.9801f, 1.2804f, 12.4801f)
                curveTo(0.9404f, 7.7601f, 3.6704f, 3.3501f, 8.0704f, 1.5001f)
                curveTo(9.3204f, 0.9801f, 9.9804f, 1.3801f, 10.2604f, 1.6701f)
                curveTo(10.5404f, 1.9501f, 10.9304f, 2.6001f, 10.4104f, 3.7901f)
                curveTo(9.9504f, 4.8501f, 9.7204f, 5.9801f, 9.7304f, 7.1401f)
                curveTo(9.7504f, 11.5701f, 13.4304f, 15.3301f, 17.9204f, 15.5101f)
                curveTo(18.5704f, 15.5401f, 19.2104f, 15.4901f, 19.8304f, 15.3801f)
                curveTo(21.1504f, 15.1401f, 21.7004f, 15.6701f, 21.9104f, 16.0101f)
                curveTo(22.1204f, 16.3501f, 22.3604f, 17.0801f, 21.5604f, 18.1601f)
                curveTo(19.4404f, 21.0601f, 16.0704f, 22.7501f, 12.4604f, 22.7501f)
                close()
                moveTo(2.7704f, 12.3701f)
                curveTo(3.1104f, 17.1301f, 7.1704f, 21.0301f, 12.0104f, 21.2401f)
                curveTo(15.3004f, 21.4001f, 18.4204f, 19.9001f, 20.3404f, 17.2801f)
                curveTo(20.4904f, 17.0701f, 20.5604f, 16.9201f, 20.5904f, 16.8401f)
                curveTo(20.5004f, 16.8301f, 20.3404f, 16.8201f, 20.0904f, 16.8701f)
                curveTo(19.3604f, 17.0001f, 18.6004f, 17.0501f, 17.8504f, 17.0201f)
                curveTo(12.5704f, 16.8101f, 8.2504f, 12.3801f, 8.2204f, 7.1601f)
                curveTo(8.2204f, 5.7801f, 8.4904f, 4.4501f, 9.0404f, 3.2001f)
                curveTo(9.1404f, 2.9801f, 9.1604f, 2.8301f, 9.1704f, 2.7501f)
                curveTo(9.0804f, 2.7501f, 8.9204f, 2.7701f, 8.6604f, 2.8801f)
                curveTo(4.8504f, 4.4801f, 2.4904f, 8.3001f, 2.7704f, 12.3701f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
