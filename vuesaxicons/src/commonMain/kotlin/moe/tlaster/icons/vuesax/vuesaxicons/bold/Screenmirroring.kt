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

public val BoldGroup.Screenmirroring: ImageVector
    get() {
        if (_screenmirroring != null) {
            return _screenmirroring!!
        }
        _screenmirroring = Builder(name = "Screenmirroring", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(18.5f, 16.4f)
                curveTo(18.5f, 17.9f, 17.9f, 18.5f, 16.4f, 18.5f)
                horizontalLineTo(12.6f)
                curveTo(11.1f, 18.5f, 10.5f, 17.9f, 10.5f, 16.4f)
                verticalLineTo(14.6f)
                curveTo(10.5f, 13.1f, 11.1f, 12.5f, 12.6f, 12.5f)
                horizontalLineTo(16.4f)
                curveTo(17.9f, 12.5f, 18.5f, 13.1f, 18.5f, 14.6f)
                verticalLineTo(16.4f)
                close()
            }
        }
        .build()
        return _screenmirroring!!
    }

private var _screenmirroring: ImageVector? = null
