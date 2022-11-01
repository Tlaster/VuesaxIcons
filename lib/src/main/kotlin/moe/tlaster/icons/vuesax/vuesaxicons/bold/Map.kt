package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6291f, 3.5697f)
                curveTo(7.8085f, 3.4718f, 7.9991f, 3.6224f, 7.9991f, 3.8267f)
                verticalLineTo(17.3825f)
                curveTo(7.9991f, 17.6058f, 7.8467f, 17.7946f, 7.6493f, 17.8988f)
                curveTo(7.6425f, 17.9024f, 7.6358f, 17.906f, 7.6291f, 17.9097f)
                lineTo(5.2791f, 19.2497f)
                curveTo(3.6391f, 20.1897f, 2.2891f, 19.4097f, 2.2891f, 17.5097f)
                verticalLineTo(7.7797f)
                curveTo(2.2891f, 7.1497f, 2.7391f, 6.3697f, 3.2991f, 6.0497f)
                lineTo(7.6291f, 3.5697f)
                verticalLineTo(3.5697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7219f, 6.1029f)
                curveTo(14.8922f, 6.1873f, 15.0f, 6.3609f, 15.0f, 6.551f)
                verticalLineTo(19.7041f)
                curveTo(15.0f, 20.0726f, 14.615f, 20.3145f, 14.283f, 20.1546f)
                lineTo(10.033f, 18.107f)
                curveTo(9.86f, 18.0236f, 9.75f, 17.8485f, 9.75f, 17.6565f)
                verticalLineTo(4.4462f)
                curveTo(9.75f, 4.0753f, 10.1396f, 3.8335f, 10.4719f, 3.9981f)
                lineTo(14.7219f, 6.1029f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.4901f)
                verticalLineTo(16.2201f)
                curveTo(22.0f, 16.8501f, 21.55f, 17.6301f, 20.99f, 17.9501f)
                lineTo(17.4986f, 19.951f)
                curveTo(17.1653f, 20.1421f, 16.75f, 19.9014f, 16.75f, 19.5172f)
                verticalLineTo(6.3304f)
                curveTo(16.75f, 6.1509f, 16.8462f, 5.9851f, 17.0021f, 5.8962f)
                lineTo(19.01f, 4.7501f)
                curveTo(20.65f, 3.8101f, 22.0f, 4.5901f, 22.0f, 6.4901f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
