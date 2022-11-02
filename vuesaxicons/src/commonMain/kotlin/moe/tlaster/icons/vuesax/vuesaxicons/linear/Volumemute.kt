package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Volumemute: ImageVector
    get() {
        if (_volumemute != null) {
            return _volumemute!!
        }
        _volumemute = Builder(name = "Volumemute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(5.5f, 16.0f, 6.5f, 17.0f, 8.5f, 17.0f)
                horizontalLineTo(9.93f)
                curveTo(10.3f, 17.0f, 10.67f, 17.11f, 10.99f, 17.3f)
                lineTo(13.91f, 19.13f)
                curveTo(16.43f, 20.71f, 18.5f, 19.56f, 18.5f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(18.5f, 4.43f, 16.43f, 3.29f, 13.91f, 4.87f)
                lineTo(10.99f, 6.7f)
                curveTo(10.67f, 6.89f, 10.3f, 7.0f, 9.93f, 7.0f)
                horizontalLineTo(8.5f)
                curveTo(6.5f, 7.0f, 5.5f, 8.0f, 5.5f, 10.0f)
                close()
            }
        }
        .build()
        return _volumemute!!
    }

private var _volumemute: ImageVector? = null
