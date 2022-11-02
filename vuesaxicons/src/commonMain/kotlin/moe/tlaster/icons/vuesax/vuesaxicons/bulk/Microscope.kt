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

public val BulkGroup.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8387f, 10.9001f)
                lineTo(20.4987f, 7.1101f)
                curveTo(21.0687f, 6.7301f, 21.2187f, 5.9501f, 20.8387f, 5.3901f)
                lineTo(19.0187f, 2.6801f)
                curveTo(18.6387f, 2.1101f, 17.8587f, 1.9601f, 17.2987f, 2.3401f)
                lineTo(11.6387f, 6.1301f)
                lineTo(14.8387f, 10.9001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5197f, 10.4201f)
                lineTo(12.7597f, 11.6001f)
                lineTo(10.0897f, 13.3901f)
                lineTo(9.7397f, 13.6201f)
                lineTo(9.5797f, 13.3801f)
                lineTo(7.3397f, 10.0401f)
                lineTo(7.1797f, 9.8001f)
                lineTo(11.9597f, 6.6001f)
                lineTo(14.5197f, 10.4201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6391f, 16.02f)
                lineTo(9.5891f, 13.38f)
                lineTo(7.3491f, 10.04f)
                lineTo(3.3991f, 12.68f)
                curveTo(2.9391f, 12.99f, 2.8191f, 13.61f, 3.1291f, 14.07f)
                lineTo(4.2591f, 15.75f)
                curveTo(4.5591f, 16.21f, 5.1791f, 16.33f, 5.6391f, 16.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5594f, 21.8101f)
                curveTo(16.4594f, 21.8501f, 16.3494f, 21.8801f, 16.2494f, 21.8801f)
                curveTo(15.9594f, 21.8801f, 15.6894f, 21.7101f, 15.5594f, 21.4301f)
                lineTo(11.8294f, 13.1901f)
                lineTo(8.0494f, 21.4401f)
                curveTo(7.9194f, 21.7101f, 7.6494f, 21.8801f, 7.3594f, 21.8801f)
                curveTo(7.2594f, 21.8801f, 7.1494f, 21.8501f, 7.0494f, 21.8101f)
                curveTo(6.6794f, 21.6301f, 6.5094f, 21.1901f, 6.6794f, 20.8101f)
                lineTo(10.0894f, 13.3901f)
                lineTo(12.7594f, 11.6001f)
                lineTo(16.9294f, 20.8201f)
                curveTo(17.0994f, 21.1901f, 16.9294f, 21.6401f, 16.5594f, 21.8101f)
                close()
            }
        }
        .build()
        return _microscope!!
    }

private var _microscope: ImageVector? = null
