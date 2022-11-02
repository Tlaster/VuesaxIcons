package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val BulkGroup.Bluetoothcircle: ImageVector
    get() {
        if (_bluetoothcircle != null) {
            return _bluetoothcircle!!
        }
        _bluetoothcircle = Builder(name = "Bluetoothcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.1186f, 6.0022f)
                curveTo(12.6993f, 5.7243f, 13.2667f, 6.0177f, 13.61f, 6.3038f)
                lineTo(15.668f, 8.0221f)
                curveTo(15.6685f, 8.0226f, 15.669f, 8.023f, 15.6696f, 8.0234f)
                curveTo(16.3049f, 8.5507f, 16.3362f, 9.4852f, 15.7137f, 10.0455f)
                lineTo(13.5767f, 12.0049f)
                lineTo(15.7137f, 13.9644f)
                curveTo(16.3362f, 14.5247f, 16.3049f, 15.4591f, 15.6696f, 15.9864f)
                curveTo(15.6691f, 15.9869f, 15.6685f, 15.9873f, 15.668f, 15.9877f)
                lineTo(13.6105f, 17.7056f)
                lineTo(13.6089f, 17.707f)
                curveTo(13.2656f, 17.992f, 12.7036f, 18.276f, 12.1282f, 18.0067f)
                curveTo(11.5513f, 17.7367f, 11.4099f, 17.121f, 11.4099f, 16.6699f)
                verticalLineTo(13.9918f)
                lineTo(9.0967f, 16.1127f)
                curveTo(8.7914f, 16.3927f, 8.317f, 16.3721f, 8.0371f, 16.0668f)
                curveTo(7.7571f, 15.7615f, 7.7777f, 15.2871f, 8.083f, 15.0071f)
                lineTo(11.3572f, 12.0049f)
                lineTo(8.083f, 9.0027f)
                curveTo(7.7777f, 8.7228f, 7.7571f, 8.2484f, 8.0371f, 7.9431f)
                curveTo(8.317f, 7.6378f, 8.7914f, 7.6172f, 9.0967f, 7.8971f)
                lineTo(11.4099f, 10.0181f)
                verticalLineTo(7.3399f)
                curveTo(11.4099f, 6.897f, 11.5439f, 6.2772f, 12.1186f, 6.0022f)
                close()
                moveTo(12.9099f, 13.4286f)
                lineTo(14.5698f, 14.9506f)
                lineTo(12.9099f, 16.3366f)
                verticalLineTo(13.4286f)
                close()
                moveTo(12.9099f, 10.5813f)
                verticalLineTo(7.6733f)
                lineTo(14.5698f, 9.0593f)
                lineTo(12.9099f, 10.5813f)
                close()
            }
        }
        .build()
        return _bluetoothcircle!!
    }

private var _bluetoothcircle: ImageVector? = null
