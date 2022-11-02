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

public val BoldGroup.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f)
                curveTo(17.51f, 22.0f, 22.0f, 17.51f, 22.0f, 12.0f)
                curveTo(22.0f, 6.49f, 17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.35f, 15.57f)
                curveTo(16.21f, 15.81f, 15.96f, 15.94f, 15.7f, 15.94f)
                curveTo(15.57f, 15.94f, 15.44f, 15.91f, 15.32f, 15.83f)
                lineTo(12.22f, 13.98f)
                curveTo(11.45f, 13.52f, 10.88f, 12.51f, 10.88f, 11.62f)
                verticalLineTo(7.52f)
                curveTo(10.88f, 7.11f, 11.22f, 6.77f, 11.63f, 6.77f)
                curveTo(12.04f, 6.77f, 12.38f, 7.11f, 12.38f, 7.52f)
                verticalLineTo(11.62f)
                curveTo(12.38f, 11.98f, 12.68f, 12.51f, 12.99f, 12.69f)
                lineTo(16.09f, 14.54f)
                curveTo(16.45f, 14.75f, 16.57f, 15.21f, 16.35f, 15.57f)
                close()
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null
