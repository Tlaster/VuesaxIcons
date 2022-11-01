package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.1001f, 19.16f)
                curveTo(19.6901f, 18.26f, 19.9101f, 17.8f, 20.3601f, 16.79f)
                curveTo(17.0401f, 15.53f, 16.5101f, 10.8f, 19.7901f, 8.99f)
                curveTo(18.7901f, 7.73f, 17.3801f, 7.0f, 16.0501f, 7.0f)
                curveTo(15.0901f, 7.0f, 14.4301f, 7.25f, 13.8401f, 7.48f)
                curveTo(13.3401f, 7.67f, 12.8901f, 7.84f, 12.3301f, 7.84f)
                curveTo(11.7301f, 7.84f, 11.2001f, 7.65f, 10.6401f, 7.45f)
                curveTo(10.0301f, 7.23f, 9.3901f, 7.0f, 8.5901f, 7.0f)
                curveTo(7.1001f, 7.0f, 5.5101f, 7.91f, 4.5001f, 9.47f)
                curveTo(3.0801f, 11.67f, 3.3301f, 15.79f, 5.6201f, 19.31f)
                curveTo(6.4401f, 20.57f, 7.5401f, 21.98f, 8.9701f, 22.0f)
                curveTo(9.5701f, 22.01f, 9.9601f, 21.83f, 10.3901f, 21.64f)
                curveTo(10.8801f, 21.42f, 11.4101f, 21.18f, 12.3401f, 21.18f)
                curveTo(13.2701f, 21.17f, 13.7901f, 21.42f, 14.2801f, 21.64f)
                curveTo(14.7001f, 21.83f, 15.0801f, 22.01f, 15.6701f, 22.0f)
                curveTo(17.1201f, 21.98f, 18.2801f, 20.42f, 19.1001f, 19.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.8404f, 2.0f)
                curveTo(16.0004f, 3.1f, 15.5504f, 4.19f, 14.9604f, 4.95f)
                curveTo(14.3304f, 5.77f, 13.2304f, 6.41f, 12.1704f, 6.37f)
                curveTo(11.9804f, 5.31f, 12.4704f, 4.22f, 13.0704f, 3.49f)
                curveTo(13.7404f, 2.69f, 14.8704f, 2.07f, 15.8404f, 2.0f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
