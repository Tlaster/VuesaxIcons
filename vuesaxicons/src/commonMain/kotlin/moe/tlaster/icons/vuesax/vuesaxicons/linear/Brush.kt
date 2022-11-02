package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.81f, 3.9401f)
                curveTo(20.27f, 7.7801f, 16.41f, 13.0001f, 13.18f, 15.5901f)
                lineTo(11.21f, 17.1701f)
                curveTo(10.96f, 17.3501f, 10.71f, 17.5101f, 10.43f, 17.6201f)
                curveTo(10.43f, 17.4401f, 10.42f, 17.2401f, 10.39f, 17.0501f)
                curveTo(10.28f, 16.2101f, 9.9f, 15.4301f, 9.23f, 14.7601f)
                curveTo(8.55f, 14.0801f, 7.72f, 13.6801f, 6.87f, 13.5701f)
                curveTo(6.67f, 13.5601f, 6.47f, 13.5401f, 6.27f, 13.5601f)
                curveTo(6.38f, 13.2501f, 6.55f, 12.9601f, 6.76f, 12.7201f)
                lineTo(8.32f, 10.7501f)
                curveTo(10.9f, 7.5201f, 16.14f, 3.6401f, 19.97f, 2.1101f)
                curveTo(20.56f, 1.8901f, 21.13f, 2.0501f, 21.49f, 2.4201f)
                curveTo(21.87f, 2.7901f, 22.05f, 3.3601f, 21.81f, 3.9401f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.43f, 17.6201f)
                curveTo(10.43f, 18.7201f, 10.01f, 19.77f, 9.22f, 20.57f)
                curveTo(8.61f, 21.18f, 7.78f, 21.6001f, 6.79f, 21.7301f)
                lineTo(4.33f, 22.0001f)
                curveTo(2.99f, 22.1501f, 1.84f, 21.01f, 2.0f, 19.65f)
                lineTo(2.27f, 17.1901f)
                curveTo(2.51f, 15.0001f, 4.34f, 13.6001f, 6.28f, 13.5601f)
                curveTo(6.48f, 13.5501f, 6.69f, 13.56f, 6.88f, 13.57f)
                curveTo(7.73f, 13.68f, 8.56f, 14.0701f, 9.24f, 14.7601f)
                curveTo(9.91f, 15.4301f, 10.29f, 16.21f, 10.4f, 17.05f)
                curveTo(10.41f, 17.24f, 10.43f, 17.4301f, 10.43f, 17.6201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.24f, 14.47f)
                curveTo(14.24f, 11.86f, 12.12f, 9.74f, 9.51f, 9.74f)
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
