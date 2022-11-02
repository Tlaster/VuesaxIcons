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

public val LinearGroup.Airpod: ImageVector
    get() {
        if (_airpod != null) {
            return _airpod!!
        }
        _airpod = Builder(name = "Airpod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.6201f, 15.75f)
                verticalLineTo(8.25f)
                curveTo(2.6201f, 7.48f, 2.6501f, 6.79f, 2.7301f, 6.18f)
                curveTo(3.1001f, 2.89f, 4.6501f, 2.0f, 8.8801f, 2.0f)
                horizontalLineTo(15.1301f)
                curveTo(19.3501f, 2.0f, 20.9101f, 2.89f, 21.2701f, 6.18f)
                curveTo(21.3601f, 6.79f, 21.3801f, 7.48f, 21.3801f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(21.3801f, 16.52f, 21.3501f, 17.21f, 21.2701f, 17.83f)
                curveTo(20.9001f, 21.11f, 19.3501f, 22.0f, 15.1201f, 22.0f)
                horizontalLineTo(8.8801f)
                curveTo(4.6601f, 22.0f, 3.1001f, 21.11f, 2.7401f, 17.83f)
                curveTo(2.6501f, 17.21f, 2.6201f, 16.52f, 2.6201f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.2299f, 8.92f)
                horizontalLineTo(17.1299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.87f, 8.92f)
                horizontalLineTo(2.77f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1301f, 8.92f)
                curveTo(17.1301f, 10.05f, 16.2101f, 10.97f, 15.0801f, 10.97f)
                horizontalLineTo(8.9201f)
                curveTo(8.3601f, 10.97f, 7.8401f, 10.74f, 7.4701f, 10.36f)
                curveTo(7.1001f, 10.0f, 6.8701f, 9.49f, 6.8701f, 8.92f)
                curveTo(6.8701f, 7.79f, 7.7901f, 6.87f, 8.9201f, 6.87f)
                horizontalLineTo(15.0701f)
                curveTo(15.6301f, 6.87f, 16.1501f, 7.1f, 16.5201f, 7.48f)
                curveTo(16.9001f, 7.85f, 17.1301f, 8.36f, 17.1301f, 8.92f)
                close()
            }
        }
        .build()
        return _airpod!!
    }

private var _airpod: ImageVector? = null
