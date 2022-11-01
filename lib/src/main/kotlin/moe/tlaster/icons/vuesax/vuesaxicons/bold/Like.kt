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

public val BoldGroup.Like: ImageVector
    get() {
        if (_like != null) {
            return _like!!
        }
        _like = Builder(name = "Like", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3906f, 18.4907f)
                verticalLineTo(8.3307f)
                curveTo(8.3906f, 7.9307f, 8.5106f, 7.5407f, 8.7306f, 7.2107f)
                lineTo(11.4606f, 3.1507f)
                curveTo(11.8906f, 2.5007f, 12.9606f, 2.0407f, 13.8706f, 2.3807f)
                curveTo(14.8506f, 2.7107f, 15.5006f, 3.8107f, 15.2906f, 4.7907f)
                lineTo(14.7706f, 8.0607f)
                curveTo(14.7306f, 8.3607f, 14.8106f, 8.6307f, 14.9806f, 8.8407f)
                curveTo(15.1506f, 9.0307f, 15.4006f, 9.1507f, 15.6706f, 9.1507f)
                horizontalLineTo(19.7806f)
                curveTo(20.5706f, 9.1507f, 21.2506f, 9.4707f, 21.6506f, 10.0307f)
                curveTo(22.0306f, 10.5707f, 22.1006f, 11.2707f, 21.8506f, 11.9807f)
                lineTo(19.3906f, 19.4707f)
                curveTo(19.0806f, 20.7107f, 17.7306f, 21.7207f, 16.3906f, 21.7207f)
                horizontalLineTo(12.4906f)
                curveTo(11.8206f, 21.7207f, 10.8806f, 21.4907f, 10.4506f, 21.0607f)
                lineTo(9.1706f, 20.0707f)
                curveTo(8.6806f, 19.7007f, 8.3906f, 19.1107f, 8.3906f, 18.4907f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.21f, 6.3789f)
                horizontalLineTo(4.18f)
                curveTo(2.63f, 6.3789f, 2.0f, 6.9789f, 2.0f, 8.4589f)
                verticalLineTo(18.5189f)
                curveTo(2.0f, 19.9989f, 2.63f, 20.5989f, 4.18f, 20.5989f)
                horizontalLineTo(5.21f)
                curveTo(6.76f, 20.5989f, 7.39f, 19.9989f, 7.39f, 18.5189f)
                verticalLineTo(8.4589f)
                curveTo(7.39f, 6.9789f, 6.76f, 6.3789f, 5.21f, 6.3789f)
                close()
            }
        }
        .build()
        return _like!!
    }

private var _like: ImageVector? = null
