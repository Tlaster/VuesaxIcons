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

public val BulkGroup.Scissor: ImageVector
    get() {
        if (_scissor != null) {
            return _scissor!!
        }
        _scissor = Builder(name = "Scissor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 10.0f)
                curveTo(7.433f, 10.0f, 9.0f, 8.433f, 9.0f, 6.5f)
                curveTo(9.0f, 4.567f, 7.433f, 3.0f, 5.5f, 3.0f)
                curveTo(3.567f, 3.0f, 2.0f, 4.567f, 2.0f, 6.5f)
                curveTo(2.0f, 8.433f, 3.567f, 10.0f, 5.5f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 21.0f)
                curveTo(7.433f, 21.0f, 9.0f, 19.433f, 9.0f, 17.5f)
                curveTo(9.0f, 15.567f, 7.433f, 14.0f, 5.5f, 14.0f)
                curveTo(3.567f, 14.0f, 2.0f, 15.567f, 2.0f, 17.5f)
                curveTo(2.0f, 19.433f, 3.567f, 21.0f, 5.5f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2491f, 11.9798f)
                lineTo(22.4491f, 6.5998f)
                curveTo(22.7791f, 6.3498f, 22.8491f, 5.8798f, 22.5991f, 5.5498f)
                curveTo(22.3491f, 5.2198f, 21.8791f, 5.1498f, 21.5491f, 5.3998f)
                lineTo(13.9991f, 11.0498f)
                lineTo(8.4491f, 6.8998f)
                curveTo(8.1191f, 6.6498f, 7.6491f, 6.7198f, 7.3991f, 7.0498f)
                curveTo(7.1491f, 7.3798f, 7.2191f, 7.8498f, 7.5491f, 8.0998f)
                lineTo(12.7491f, 11.9898f)
                lineTo(6.8491f, 16.4098f)
                curveTo(6.5191f, 16.6598f, 6.4491f, 17.1298f, 6.6991f, 17.4598f)
                curveTo(6.8491f, 17.6598f, 7.0691f, 17.7598f, 7.2991f, 17.7598f)
                curveTo(7.4591f, 17.7598f, 7.6091f, 17.7098f, 7.7491f, 17.6098f)
                lineTo(14.0091f, 12.9298f)
                lineTo(21.5591f, 18.5798f)
                curveTo(21.6891f, 18.6798f, 21.8491f, 18.7298f, 22.0091f, 18.7298f)
                curveTo(22.2391f, 18.7298f, 22.4591f, 18.6298f, 22.6091f, 18.4298f)
                curveTo(22.8591f, 18.0998f, 22.7891f, 17.6298f, 22.4591f, 17.3798f)
                lineTo(15.2491f, 11.9798f)
                close()
            }
        }
        .build()
        return _scissor!!
    }

private var _scissor: ImageVector? = null
