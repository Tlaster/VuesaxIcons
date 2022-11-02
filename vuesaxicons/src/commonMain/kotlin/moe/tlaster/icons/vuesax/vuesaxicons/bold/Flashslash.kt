package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Flashslash: ImageVector
    get() {
        if (_flashslash != null) {
            return _flashslash!!
        }
        _flashslash = Builder(name = "Flashslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7709f, 2.2289f)
                curveTo(21.4709f, 1.9289f, 20.9809f, 1.9289f, 20.6809f, 2.2289f)
                lineTo(2.2309f, 20.6889f)
                curveTo(1.9309f, 20.9889f, 1.9309f, 21.4789f, 2.2309f, 21.7789f)
                curveTo(2.3809f, 21.9189f, 2.5709f, 21.9989f, 2.7709f, 21.9989f)
                curveTo(2.9709f, 21.9989f, 3.1609f, 21.9189f, 3.3109f, 21.7689f)
                lineTo(21.7709f, 3.3089f)
                curveTo(22.0809f, 3.0089f, 22.0809f, 2.5289f, 21.7709f, 2.2289f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8205f, 3.5209f)
                verticalLineTo(9.1809f)
                lineTo(9.1805f, 14.8209f)
                verticalLineTo(13.2809f)
                horizontalLineTo(6.0905f)
                curveTo(4.6905f, 13.2809f, 4.3005f, 12.4209f, 5.2305f, 11.3709f)
                lineTo(12.0005f, 3.6709f)
                lineTo(12.8005f, 2.7609f)
                curveTo(13.9105f, 1.5009f, 14.8205f, 1.8409f, 14.8205f, 3.5209f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7697f, 12.6287f)
                lineTo(11.9997f, 20.3287f)
                lineTo(11.1997f, 21.2387f)
                curveTo(10.0897f, 22.4987f, 9.1797f, 22.1587f, 9.1797f, 20.4787f)
                verticalLineTo(17.8187f)
                lineTo(16.2797f, 10.7188f)
                horizontalLineTo(17.9097f)
                curveTo(19.3097f, 10.7188f, 19.6997f, 11.5787f, 18.7697f, 12.6287f)
                close()
            }
        }
        .build()
        return _flashslash!!
    }

private var _flashslash: ImageVector? = null
