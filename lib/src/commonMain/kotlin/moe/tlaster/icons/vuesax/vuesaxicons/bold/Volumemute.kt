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

public val BoldGroup.Volumemute: ImageVector
    get() {
        if (_volumemute != null) {
            return _volumemute!!
        }
        _volumemute = Builder(name = "Volumemute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.52f, 3.7817f)
                curveTo(16.4f, 3.1617f, 14.97f, 3.3217f, 13.51f, 4.2317f)
                lineTo(10.59f, 6.0617f)
                curveTo(10.39f, 6.1817f, 10.16f, 6.2517f, 9.93f, 6.2517f)
                horizontalLineTo(9.0f)
                horizontalLineTo(8.5f)
                curveTo(6.08f, 6.2517f, 4.75f, 7.5817f, 4.75f, 10.0017f)
                verticalLineTo(14.0017f)
                curveTo(4.75f, 16.4217f, 6.08f, 17.7517f, 8.5f, 17.7517f)
                horizontalLineTo(9.0f)
                horizontalLineTo(9.93f)
                curveTo(10.16f, 17.7517f, 10.39f, 17.8217f, 10.59f, 17.9417f)
                lineTo(13.51f, 19.7717f)
                curveTo(14.39f, 20.3217f, 15.25f, 20.5917f, 16.05f, 20.5917f)
                curveTo(16.57f, 20.5917f, 17.07f, 20.4717f, 17.52f, 20.2217f)
                curveTo(18.63f, 19.6017f, 19.25f, 18.3117f, 19.25f, 16.5917f)
                verticalLineTo(7.4117f)
                curveTo(19.25f, 5.6917f, 18.63f, 4.4017f, 17.52f, 3.7817f)
                close()
            }
        }
        .build()
        return _volumemute!!
    }

private var _volumemute: ImageVector? = null
