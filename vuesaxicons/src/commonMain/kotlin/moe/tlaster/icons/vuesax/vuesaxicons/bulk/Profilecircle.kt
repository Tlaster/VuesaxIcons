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

public val BulkGroup.Profilecircle: ImageVector
    get() {
        if (_profilecircle != null) {
            return _profilecircle!!
        }
        _profilecircle = Builder(name = "Profilecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.01f)
                curveTo(17.5228f, 22.01f, 22.0f, 17.5329f, 22.0f, 12.01f)
                curveTo(22.0f, 6.4872f, 17.5228f, 2.01f, 12.0f, 2.01f)
                curveTo(6.4771f, 2.01f, 2.0f, 6.4872f, 2.0f, 12.01f)
                curveTo(2.0f, 17.5329f, 6.4771f, 22.01f, 12.0f, 22.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.9399f)
                curveTo(9.93f, 6.9399f, 8.25f, 8.6199f, 8.25f, 10.6899f)
                curveTo(8.25f, 12.7199f, 9.84f, 14.3699f, 11.95f, 14.4299f)
                curveTo(11.98f, 14.4299f, 12.02f, 14.4299f, 12.04f, 14.4299f)
                curveTo(12.06f, 14.4299f, 12.09f, 14.4299f, 12.11f, 14.4299f)
                curveTo(12.12f, 14.4299f, 12.13f, 14.4299f, 12.13f, 14.4299f)
                curveTo(14.15f, 14.3599f, 15.74f, 12.7199f, 15.75f, 10.6899f)
                curveTo(15.75f, 8.6199f, 14.07f, 6.9399f, 12.0f, 6.9399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7807f, 19.36f)
                curveTo(17.0007f, 21.0f, 14.6207f, 22.01f, 12.0007f, 22.01f)
                curveTo(9.3807f, 22.01f, 7.0007f, 21.0f, 5.2207f, 19.36f)
                curveTo(5.4607f, 18.45f, 6.1107f, 17.62f, 7.0607f, 16.98f)
                curveTo(9.7907f, 15.16f, 14.2307f, 15.16f, 16.9407f, 16.98f)
                curveTo(17.9007f, 17.62f, 18.5407f, 18.45f, 18.7807f, 19.36f)
                close()
            }
        }
        .build()
        return _profilecircle!!
    }

private var _profilecircle: ImageVector? = null
