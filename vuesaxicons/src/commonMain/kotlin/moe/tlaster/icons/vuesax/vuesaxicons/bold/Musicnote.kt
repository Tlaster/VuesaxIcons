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

public val BoldGroup.Musicnote: ImageVector
    get() {
        if (_musicnote != null) {
            return _musicnote!!
        }
        _musicnote = Builder(name = "Musicnote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7188f, 6.2788f)
                verticalLineTo(7.4488f)
                curveTo(21.7188f, 8.4288f, 21.3288f, 9.2688f, 20.6388f, 9.7588f)
                curveTo(20.2087f, 10.0788f, 19.6787f, 10.2288f, 19.1287f, 10.2288f)
                curveTo(18.7887f, 10.2288f, 18.4488f, 10.1788f, 18.0988f, 10.0588f)
                lineTo(12.7188f, 8.2688f)
                verticalLineTo(17.9988f)
                curveTo(12.7188f, 20.6188f, 10.5887f, 22.7488f, 7.9688f, 22.7488f)
                curveTo(5.3488f, 22.7488f, 3.2188f, 20.6188f, 3.2188f, 17.9988f)
                curveTo(3.2188f, 15.3788f, 5.3488f, 13.2488f, 7.9688f, 13.2488f)
                curveTo(9.2288f, 13.2488f, 10.3688f, 13.7488f, 11.2188f, 14.5488f)
                verticalLineTo(3.9988f)
                curveTo(11.2188f, 3.0288f, 11.6188f, 2.1888f, 12.3088f, 1.6888f)
                curveTo(12.9987f, 1.1988f, 13.9187f, 1.0888f, 14.8387f, 1.3888f)
                lineTo(19.2588f, 2.8688f)
                curveTo(20.6188f, 3.3188f, 21.7188f, 4.8488f, 21.7188f, 6.2788f)
                close()
            }
        }
        .build()
        return _musicnote!!
    }

private var _musicnote: ImageVector? = null
