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

public val OutlineGroup.Headphone: ImageVector
    get() {
        if (_headphone != null) {
            return _headphone!!
        }
        _headphone = Builder(name = "Headphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5697f, 22.7001f)
                curveTo(3.2297f, 22.7001f, 1.2497f, 20.72f, 1.2497f, 18.38f)
                verticalLineTo(12.22f)
                curveTo(1.1997f, 9.3f, 2.2797f, 6.55f, 4.2997f, 4.49f)
                curveTo(6.3197f, 2.44f, 9.0297f, 1.3001f, 11.9497f, 1.3001f)
                curveTo(17.9097f, 1.3001f, 22.7497f, 6.1501f, 22.7497f, 12.1f)
                verticalLineTo(18.26f)
                curveTo(22.7497f, 20.64f, 20.8097f, 22.58f, 18.4297f, 22.58f)
                curveTo(16.0897f, 22.58f, 14.1097f, 20.6f, 14.1097f, 18.26f)
                verticalLineTo(15.45f)
                curveTo(14.1097f, 14.0f, 15.2497f, 12.86f, 16.6997f, 12.86f)
                curveTo(18.1497f, 12.86f, 19.2897f, 14.0f, 19.2897f, 15.45f)
                verticalLineTo(18.48f)
                curveTo(19.2897f, 18.89f, 18.9497f, 19.23f, 18.5397f, 19.23f)
                curveTo(18.1297f, 19.23f, 17.7897f, 18.89f, 17.7897f, 18.48f)
                verticalLineTo(15.45f)
                curveTo(17.7897f, 14.77f, 17.2397f, 14.36f, 16.6997f, 14.36f)
                curveTo(16.0197f, 14.36f, 15.6097f, 14.91f, 15.6097f, 15.45f)
                verticalLineTo(18.26f)
                curveTo(15.6097f, 19.7901f, 16.8997f, 21.08f, 18.4297f, 21.08f)
                curveTo(19.9597f, 21.08f, 21.2497f, 19.7901f, 21.2497f, 18.26f)
                verticalLineTo(12.1f)
                curveTo(21.2497f, 6.97f, 17.0797f, 2.8001f, 11.9497f, 2.8001f)
                curveTo(9.4397f, 2.8001f, 7.1097f, 3.7701f, 5.3697f, 5.5401f)
                curveTo(3.6297f, 7.3101f, 2.6997f, 9.68f, 2.7497f, 12.2f)
                verticalLineTo(18.38f)
                curveTo(2.7497f, 19.91f, 4.0397f, 21.2001f, 5.5697f, 21.2001f)
                curveTo(7.0997f, 21.2001f, 8.3897f, 19.91f, 8.3897f, 18.38f)
                verticalLineTo(15.57f)
                curveTo(8.3897f, 14.89f, 7.8397f, 14.48f, 7.2997f, 14.48f)
                curveTo(6.6197f, 14.48f, 6.2097f, 15.03f, 6.2097f, 15.57f)
                verticalLineTo(18.49f)
                curveTo(6.2097f, 18.9f, 5.8697f, 19.24f, 5.4597f, 19.24f)
                curveTo(5.0497f, 19.24f, 4.7097f, 18.9f, 4.7097f, 18.49f)
                verticalLineTo(15.57f)
                curveTo(4.7097f, 14.12f, 5.8497f, 12.98f, 7.2997f, 12.98f)
                curveTo(8.7497f, 12.98f, 9.8897f, 14.12f, 9.8897f, 15.57f)
                verticalLineTo(18.38f)
                curveTo(9.8897f, 20.72f, 7.9097f, 22.7001f, 5.5697f, 22.7001f)
                close()
            }
        }
        .build()
        return _headphone!!
    }

private var _headphone: ImageVector? = null
