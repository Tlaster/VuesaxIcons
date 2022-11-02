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

public val OutlineGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 16.3299f)
                curveTo(9.6099f, 16.3299f, 7.6699f, 14.3899f, 7.6699f, 11.9999f)
                curveTo(7.6699f, 9.6099f, 9.6099f, 7.6699f, 11.9999f, 7.6699f)
                curveTo(14.3899f, 7.6699f, 16.3299f, 9.6099f, 16.3299f, 11.9999f)
                curveTo(16.3299f, 14.3899f, 14.3899f, 16.3299f, 11.9999f, 16.3299f)
                close()
                moveTo(11.9999f, 9.1699f)
                curveTo(10.4399f, 9.1699f, 9.1699f, 10.4399f, 9.1699f, 11.9999f)
                curveTo(9.1699f, 13.5599f, 10.4399f, 14.8299f, 11.9999f, 14.8299f)
                curveTo(13.5599f, 14.8299f, 14.8299f, 13.5599f, 14.8299f, 11.9999f)
                curveTo(14.8299f, 10.4399f, 13.5599f, 9.1699f, 11.9999f, 9.1699f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 21.02f)
                curveTo(8.2401f, 21.02f, 4.6901f, 18.82f, 2.2501f, 15.0f)
                curveTo(1.1901f, 13.35f, 1.1901f, 10.66f, 2.2501f, 9.0f)
                curveTo(4.7001f, 5.18f, 8.2501f, 2.98f, 12.0001f, 2.98f)
                curveTo(15.7501f, 2.98f, 19.3001f, 5.18f, 21.7401f, 9.0f)
                curveTo(22.8001f, 10.65f, 22.8001f, 13.34f, 21.7401f, 15.0f)
                curveTo(19.3001f, 18.82f, 15.7501f, 21.02f, 12.0001f, 21.02f)
                close()
                moveTo(12.0001f, 4.48f)
                curveTo(8.7701f, 4.48f, 5.6801f, 6.42f, 3.5201f, 9.81f)
                curveTo(2.7701f, 10.98f, 2.7701f, 13.02f, 3.5201f, 14.19f)
                curveTo(5.6801f, 17.58f, 8.7701f, 19.52f, 12.0001f, 19.52f)
                curveTo(15.2301f, 19.52f, 18.3201f, 17.58f, 20.4801f, 14.19f)
                curveTo(21.2301f, 13.02f, 21.2301f, 10.98f, 20.4801f, 9.81f)
                curveTo(18.3201f, 6.42f, 15.2301f, 4.48f, 12.0001f, 4.48f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
