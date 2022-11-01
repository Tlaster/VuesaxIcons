package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Headphone: ImageVector
    get() {
        if (_headphone != null) {
            return _headphone!!
        }
        _headphone = Builder(name = "Headphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4601f, 18.49f)
                verticalLineTo(15.57f)
                curveTo(5.4601f, 14.6f, 6.22f, 13.73f, 7.3f, 13.73f)
                curveTo(8.2701f, 13.73f, 9.14f, 14.49f, 9.14f, 15.57f)
                verticalLineTo(18.38f)
                curveTo(9.14f, 20.33f, 7.5201f, 21.9501f, 5.57f, 21.9501f)
                curveTo(3.62f, 21.9501f, 2.0001f, 20.32f, 2.0001f, 18.38f)
                verticalLineTo(12.22f)
                curveTo(1.8901f, 6.6f, 6.33f, 2.0501f, 11.95f, 2.0501f)
                curveTo(17.57f, 2.0501f, 22.0f, 6.6f, 22.0f, 12.11f)
                verticalLineTo(18.2701f)
                curveTo(22.0f, 20.2201f, 20.38f, 21.84f, 18.43f, 21.84f)
                curveTo(16.48f, 21.84f, 14.86f, 20.2201f, 14.86f, 18.2701f)
                verticalLineTo(15.46f)
                curveTo(14.86f, 14.49f, 15.62f, 13.62f, 16.7f, 13.62f)
                curveTo(17.67f, 13.62f, 18.54f, 14.38f, 18.54f, 15.46f)
                verticalLineTo(18.49f)
            }
        }
        .build()
        return _headphone!!
    }

private var _headphone: ImageVector? = null
