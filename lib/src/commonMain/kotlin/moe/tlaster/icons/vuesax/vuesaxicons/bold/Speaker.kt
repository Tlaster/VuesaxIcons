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

public val BoldGroup.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9991f, 1.6211f)
                horizontalLineTo(8.9991f)
                curveTo(5.8091f, 1.6211f, 4.6191f, 2.8111f, 4.6191f, 6.0011f)
                verticalLineTo(18.0011f)
                curveTo(4.6191f, 21.1911f, 5.8091f, 22.3811f, 8.9991f, 22.3811f)
                horizontalLineTo(14.9991f)
                curveTo(18.1891f, 22.3811f, 19.3791f, 21.1911f, 19.3791f, 18.0011f)
                verticalLineTo(6.0011f)
                curveTo(19.3791f, 2.8111f, 18.1891f, 1.6211f, 14.9991f, 1.6211f)
                close()
                moveTo(11.9991f, 6.0011f)
                curveTo(12.8291f, 6.0011f, 13.4991f, 6.6711f, 13.4991f, 7.5011f)
                curveTo(13.4991f, 8.3311f, 12.8291f, 9.0011f, 11.9991f, 9.0011f)
                curveTo(11.1691f, 9.0011f, 10.4991f, 8.3311f, 10.4991f, 7.5011f)
                curveTo(10.4991f, 6.6711f, 11.1691f, 6.0011f, 11.9991f, 6.0011f)
                close()
                moveTo(11.9991f, 18.0011f)
                curveTo(10.3391f, 18.0011f, 8.9991f, 16.6611f, 8.9991f, 15.0011f)
                curveTo(8.9991f, 13.3411f, 10.3391f, 12.0011f, 11.9991f, 12.0011f)
                curveTo(13.6591f, 12.0011f, 14.9991f, 13.3411f, 14.9991f, 15.0011f)
                curveTo(14.9991f, 16.6611f, 13.6591f, 18.0011f, 11.9991f, 18.0011f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
