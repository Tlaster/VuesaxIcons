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

public val BulkGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0007f, 19.0001f)
                curveTo(9.0007f, 19.8401f, 9.1307f, 20.6601f, 9.3707f, 21.4201f)
                curveTo(5.5307f, 20.0901f, 2.6307f, 16.5601f, 2.3307f, 12.4301f)
                curveTo(2.0307f, 8.0401f, 4.5607f, 3.9401f, 8.6507f, 2.2201f)
                curveTo(9.7107f, 1.7801f, 10.2507f, 2.1001f, 10.4807f, 2.3301f)
                curveTo(10.7007f, 2.5501f, 11.0107f, 3.0801f, 10.5707f, 4.0901f)
                curveTo(10.1207f, 5.1301f, 9.9007f, 6.2301f, 9.9007f, 7.3701f)
                curveTo(9.9107f, 9.4101f, 10.7107f, 11.3001f, 12.0107f, 12.7501f)
                curveTo(10.1807f, 14.2101f, 9.0007f, 16.4701f, 9.0007f, 19.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.21f, 17.72f)
                curveTo(19.23f, 20.41f, 16.09f, 21.99f, 12.74f, 21.99f)
                curveTo(12.58f, 21.99f, 12.42f, 21.98f, 12.26f, 21.97f)
                curveTo(11.26f, 21.93f, 10.29f, 21.74f, 9.37f, 21.42f)
                curveTo(9.13f, 20.66f, 9.0f, 19.84f, 9.0f, 19.0f)
                curveTo(9.0f, 16.47f, 10.18f, 14.21f, 12.01f, 12.75f)
                curveTo(13.48f, 14.4f, 15.59f, 15.47f, 17.92f, 15.57f)
                curveTo(18.55f, 15.6f, 19.18f, 15.55f, 19.8f, 15.44f)
                curveTo(20.92f, 15.24f, 21.37f, 15.66f, 21.53f, 15.93f)
                curveTo(21.7f, 16.2f, 21.88f, 16.79f, 21.21f, 17.72f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
