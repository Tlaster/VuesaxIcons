package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Volumemute: ImageVector
    get() {
        if (_volumemute != null) {
            return _volumemute!!
        }
        _volumemute = Builder(name = "Volumemute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 9.9998f)
                verticalLineTo(13.9998f)
                curveTo(5.5f, 15.9998f, 6.5f, 16.9998f, 8.5f, 16.9998f)
                horizontalLineTo(9.93f)
                curveTo(10.3f, 16.9998f, 10.67f, 17.1098f, 10.99f, 17.2998f)
                lineTo(13.91f, 19.1298f)
                curveTo(16.43f, 20.7098f, 18.5f, 19.5598f, 18.5f, 16.5898f)
                verticalLineTo(7.4098f)
                curveTo(18.5f, 4.4298f, 16.43f, 3.2898f, 13.91f, 4.8698f)
                lineTo(10.99f, 6.6998f)
                curveTo(10.67f, 6.8898f, 10.3f, 6.9998f, 9.93f, 6.9998f)
                horizontalLineTo(8.5f)
                curveTo(6.5f, 6.9998f, 5.5f, 7.9998f, 5.5f, 9.9998f)
                close()
            }
        }
        .build()
        return _volumemute!!
    }

private var _volumemute: ImageVector? = null
