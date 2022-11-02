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

public val OutlineGroup.Heartcircle: ImageVector
    get() {
        if (_heartcircle != null) {
            return _heartcircle!!
        }
        _heartcircle = Builder(name = "Heartcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9994f, 18.2501f)
                curveTo(11.7894f, 18.2501f, 11.5894f, 18.2201f, 11.4194f, 18.1601f)
                curveTo(9.2694f, 17.4301f, 5.8594f, 14.8101f, 5.8594f, 10.9101f)
                curveTo(5.8594f, 8.8301f, 7.5394f, 7.1401f, 9.6094f, 7.1401f)
                curveTo(10.5094f, 7.1401f, 11.3394f, 7.4501f, 12.0094f, 8.0101f)
                curveTo(12.6794f, 7.4501f, 13.5194f, 7.1401f, 14.3994f, 7.1401f)
                curveTo(16.4694f, 7.1401f, 18.1494f, 8.8301f, 18.1494f, 10.9101f)
                curveTo(18.1494f, 14.8001f, 14.7394f, 17.4201f, 12.5794f, 18.1601f)
                curveTo(12.4094f, 18.2201f, 12.1994f, 18.2501f, 11.9994f, 18.2501f)
                close()
                moveTo(9.5994f, 8.6501f)
                curveTo(8.3594f, 8.6501f, 7.3494f, 9.6701f, 7.3494f, 10.9201f)
                curveTo(7.3494f, 14.4101f, 10.7194f, 16.3501f, 11.8994f, 16.7501f)
                curveTo(11.9394f, 16.7601f, 12.0394f, 16.7601f, 12.0794f, 16.7501f)
                curveTo(13.2594f, 16.3501f, 16.6294f, 14.4101f, 16.6294f, 10.9201f)
                curveTo(16.6294f, 9.6701f, 15.6194f, 8.6501f, 14.3794f, 8.6501f)
                curveTo(13.6794f, 8.6501f, 13.0094f, 8.9901f, 12.5894f, 9.5601f)
                curveTo(12.3094f, 9.9401f, 11.6694f, 9.9401f, 11.3894f, 9.5601f)
                curveTo(10.9694f, 8.9801f, 10.3194f, 8.6501f, 9.5994f, 8.6501f)
                close()
            }
        }
        .build()
        return _heartcircle!!
    }

private var _heartcircle: ImageVector? = null
