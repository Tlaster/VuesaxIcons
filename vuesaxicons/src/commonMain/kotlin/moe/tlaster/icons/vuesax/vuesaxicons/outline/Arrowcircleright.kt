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

public val OutlineGroup.Arrowcircleright: ImageVector
    get() {
        if (_arrowcircleright != null) {
            return _arrowcircleright!!
        }
        _arrowcircleright = Builder(name = "Arrowcircleright", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7397f, 16.2802f)
                curveTo(10.5497f, 16.2802f, 10.3597f, 16.2102f, 10.2097f, 16.0602f)
                curveTo(9.9197f, 15.7702f, 9.9197f, 15.2902f, 10.2097f, 15.0002f)
                lineTo(13.2097f, 12.0002f)
                lineTo(10.2097f, 9.0002f)
                curveTo(9.9197f, 8.7102f, 9.9197f, 8.2302f, 10.2097f, 7.9402f)
                curveTo(10.4997f, 7.6502f, 10.9797f, 7.6502f, 11.2697f, 7.9402f)
                lineTo(14.7997f, 11.4702f)
                curveTo(15.0897f, 11.7602f, 15.0897f, 12.2402f, 14.7997f, 12.5302f)
                lineTo(11.2697f, 16.0602f)
                curveTo(11.1197f, 16.2102f, 10.9297f, 16.2802f, 10.7397f, 16.2802f)
                close()
            }
        }
        .build()
        return _arrowcircleright!!
    }

private var _arrowcircleright: ImageVector? = null
