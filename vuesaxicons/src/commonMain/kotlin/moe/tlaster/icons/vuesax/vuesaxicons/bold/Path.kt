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

public val BoldGroup.Path: ImageVector
    get() {
        if (_path != null) {
            return _path!!
        }
        _path = Builder(name = "Path", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0199f, 10.7004f)
                lineTo(17.8999f, 12.0404f)
                curveTo(17.4999f, 12.2904f, 16.9899f, 12.2304f, 16.6599f, 11.9004f)
                lineTo(12.1299f, 7.3704f)
                curveTo(11.7999f, 7.0404f, 11.7399f, 6.5304f, 11.9899f, 6.1304f)
                lineTo(13.3299f, 4.0104f)
                curveTo(14.1499f, 2.7204f, 15.7899f, 2.6604f, 16.9999f, 3.8604f)
                lineTo(20.1799f, 7.0404f)
                curveTo(21.2999f, 8.1704f, 21.2299f, 9.9304f, 20.0199f, 10.7004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7106f, 19.9498f)
                lineTo(5.9906f, 20.9698f)
                curveTo(5.913f, 20.9801f, 5.8363f, 20.9874f, 5.7607f, 20.9919f)
                curveTo(5.0756f, 21.0323f, 4.9057f, 20.2247f, 5.391f, 19.7394f)
                lineTo(7.9806f, 17.1498f)
                curveTo(8.3006f, 16.8398f, 8.3006f, 16.3498f, 7.9806f, 16.0398f)
                curveTo(7.6806f, 15.7298f, 7.1906f, 15.7298f, 6.8706f, 16.0398f)
                lineTo(4.281f, 18.6294f)
                curveTo(3.7957f, 19.1147f, 2.9956f, 18.9441f, 3.032f, 18.2588f)
                curveTo(3.0358f, 18.1868f, 3.042f, 18.1138f, 3.0506f, 18.0398f)
                lineTo(4.0806f, 9.3197f)
                curveTo(4.3406f, 7.1398f, 5.1406f, 6.4198f, 7.4406f, 6.5598f)
                lineTo(8.9406f, 6.6498f)
                curveTo(9.4306f, 6.6797f, 9.8906f, 6.8898f, 10.2406f, 7.2397f)
                lineTo(16.7906f, 13.7898f)
                curveTo(17.1406f, 14.1398f, 17.3506f, 14.5998f, 17.3706f, 15.0898f)
                lineTo(17.4606f, 16.5898f)
                curveTo(17.6906f, 18.8998f, 16.9006f, 19.6998f, 14.7106f, 19.9498f)
                close()
            }
        }
        .build()
        return _path!!
    }

private var _path: ImageVector? = null
