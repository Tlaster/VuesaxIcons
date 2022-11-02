package moe.tlaster.icons.vuesax.vuesaxicons.crypto.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.OutlineGroup

public val OutlineGroup.Celsius: ImageVector
    get() {
        if (_celsius != null) {
            return _celsius!!
        }
        _celsius = Builder(name = "Celsius", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9996f, 18.1901f)
                curveTo(8.5896f, 18.1901f, 5.8096f, 15.4101f, 5.8096f, 12.0001f)
                curveTo(5.8096f, 8.5901f, 8.5896f, 5.8101f, 11.9996f, 5.8101f)
                curveTo(13.3496f, 5.8101f, 14.6396f, 6.2401f, 15.7196f, 7.0501f)
                curveTo(16.0496f, 7.3001f, 16.1196f, 7.7701f, 15.8696f, 8.1001f)
                curveTo(15.6196f, 8.4301f, 15.1496f, 8.5001f, 14.8196f, 8.2501f)
                curveTo(13.9996f, 7.6301f, 13.0296f, 7.3101f, 11.9996f, 7.3101f)
                curveTo(9.4196f, 7.3101f, 7.3096f, 9.4101f, 7.3096f, 12.0001f)
                curveTo(7.3096f, 14.5901f, 9.4096f, 16.6901f, 11.9996f, 16.6901f)
                curveTo(13.4796f, 16.6901f, 14.8396f, 16.0101f, 15.7396f, 14.8301f)
                curveTo(15.9896f, 14.5001f, 16.4596f, 14.4401f, 16.7896f, 14.6901f)
                curveTo(17.1196f, 14.9401f, 17.1796f, 15.4101f, 16.9296f, 15.7401f)
                curveTo(15.7496f, 17.2901f, 13.9496f, 18.1901f, 11.9996f, 18.1901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 12.09f)
                curveTo(16.36f, 12.09f, 15.5f, 11.23f, 15.5f, 10.17f)
                curveTo(15.5f, 9.11f, 16.36f, 8.25f, 17.42f, 8.25f)
                curveTo(18.48f, 8.25f, 19.34f, 9.11f, 19.34f, 10.17f)
                curveTo(19.34f, 11.23f, 18.48f, 12.09f, 17.42f, 12.09f)
                close()
                moveTo(17.42f, 9.75f)
                curveTo(17.19f, 9.75f, 17.0f, 9.94f, 17.0f, 10.17f)
                curveTo(17.0f, 10.4f, 17.19f, 10.59f, 17.42f, 10.59f)
                curveTo(17.65f, 10.59f, 17.84f, 10.4f, 17.84f, 10.17f)
                curveTo(17.84f, 9.94f, 17.65f, 9.75f, 17.42f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
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
        }
        .build()
        return _celsius!!
    }

private var _celsius: ImageVector? = null
