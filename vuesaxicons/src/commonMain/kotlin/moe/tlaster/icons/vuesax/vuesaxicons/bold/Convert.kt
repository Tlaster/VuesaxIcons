package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Convert: ImageVector
    get() {
        if (_convert != null) {
            return _convert!!
        }
        _convert = Builder(name = "Convert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0312f, 2.0313f)
                curveTo(10.0813f, 2.0313f, 8.2612f, 2.5912f, 6.7312f, 3.5512f)
                lineTo(13.5913f, 10.4213f)
                lineTo(13.6013f, 7.6813f)
                curveTo(13.6013f, 7.2712f, 13.9413f, 6.9313f, 14.3513f, 6.9313f)
                curveTo(14.7713f, 6.9313f, 15.1013f, 7.2712f, 15.1013f, 7.6813f)
                lineTo(15.0913f, 12.2312f)
                curveTo(15.0913f, 12.5413f, 14.9012f, 12.8113f, 14.6213f, 12.9213f)
                curveTo(14.5312f, 12.9613f, 14.4313f, 12.9812f, 14.3413f, 12.9812f)
                curveTo(14.1413f, 12.9812f, 13.9513f, 12.9013f, 13.8113f, 12.7613f)
                lineTo(5.6213f, 4.5613f)
                curveTo(5.5813f, 4.5212f, 5.5512f, 4.4812f, 5.5212f, 4.4412f)
                curveTo(3.3812f, 6.2813f, 2.0313f, 9.0013f, 2.0313f, 12.0312f)
                curveTo(2.0313f, 17.5513f, 6.5113f, 22.0312f, 12.0312f, 22.0312f)
                curveTo(13.9812f, 22.0312f, 15.8013f, 21.4712f, 17.3313f, 20.5112f)
                lineTo(10.4713f, 13.6413f)
                lineTo(10.4613f, 16.3812f)
                curveTo(10.4613f, 16.7912f, 10.1213f, 17.1312f, 9.7113f, 17.1312f)
                curveTo(9.2913f, 17.1312f, 8.9613f, 16.7912f, 8.9613f, 16.3812f)
                lineTo(8.9712f, 11.8313f)
                curveTo(8.9712f, 11.5212f, 9.1613f, 11.2513f, 9.4412f, 11.1413f)
                curveTo(9.7113f, 11.0213f, 10.0413f, 11.0813f, 10.2513f, 11.3013f)
                lineTo(18.4412f, 19.5012f)
                curveTo(18.4813f, 19.5413f, 18.5112f, 19.5812f, 18.5413f, 19.6213f)
                curveTo(20.6812f, 17.7812f, 22.0312f, 15.0612f, 22.0312f, 12.0312f)
                curveTo(22.0312f, 6.5113f, 17.5513f, 2.0313f, 12.0312f, 2.0313f)
                close()
            }
        }
        .build()
        return _convert!!
    }

private var _convert: ImageVector? = null
