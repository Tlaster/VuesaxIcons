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

public val BoldGroup.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = Builder(name = "Flash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9105f, 10.7209f)
                horizontalLineTo(14.8205f)
                verticalLineTo(3.5209f)
                curveTo(14.8205f, 1.8409f, 13.9105f, 1.5009f, 12.8005f, 2.7609f)
                lineTo(12.0005f, 3.6709f)
                lineTo(5.2305f, 11.3709f)
                curveTo(4.3005f, 12.4209f, 4.6905f, 13.2809f, 6.0905f, 13.2809f)
                horizontalLineTo(9.1805f)
                verticalLineTo(20.4809f)
                curveTo(9.1805f, 22.1609f, 10.0905f, 22.5009f, 11.2005f, 21.2409f)
                lineTo(12.0005f, 20.3309f)
                lineTo(18.7705f, 12.6309f)
                curveTo(19.7005f, 11.5809f, 19.3105f, 10.7209f, 17.9105f, 10.7209f)
                close()
            }
        }
        .build()
        return _flash!!
    }

private var _flash: ImageVector? = null
