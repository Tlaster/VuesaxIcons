package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Heartsearch: ImageVector
    get() {
        if (_heartsearch != null) {
            return _heartsearch!!
        }
        _heartsearch = Builder(name = "Heartsearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.44f, 3.1001f)
                curveTo(14.63f, 3.1001f, 13.01f, 3.9801f, 12.0f, 5.3301f)
                curveTo(10.99f, 3.9801f, 9.37f, 3.1001f, 7.56f, 3.1001f)
                curveTo(4.49f, 3.1001f, 2.0f, 5.6001f, 2.0f, 8.6901f)
                curveTo(2.0f, 9.8801f, 2.19f, 10.9801f, 2.52f, 12.0001f)
                curveTo(4.1f, 17.0001f, 8.97f, 19.9901f, 11.38f, 20.8101f)
                curveTo(11.72f, 20.9301f, 12.28f, 20.9301f, 12.62f, 20.8101f)
                curveTo(15.03f, 19.9901f, 19.9f, 17.0001f, 21.48f, 12.0001f)
                curveTo(21.81f, 10.9801f, 22.0f, 9.8801f, 22.0f, 8.6901f)
                curveTo(22.0f, 5.6001f, 19.51f, 3.1001f, 16.44f, 3.1001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.77f, 20.68f)
                lineTo(21.01f, 19.92f)
                curveTo(21.41f, 19.32f, 21.64f, 18.6f, 21.64f, 17.83f)
                curveTo(21.64f, 15.72f, 19.93f, 14.01f, 17.82f, 14.01f)
                curveTo(15.71f, 14.01f, 14.0f, 15.72f, 14.0f, 17.83f)
                curveTo(14.0f, 19.94f, 15.71f, 21.65f, 17.82f, 21.65f)
                curveTo(18.59f, 21.65f, 19.31f, 21.42f, 19.91f, 21.02f)
                lineTo(20.67f, 21.78f)
                curveTo(20.82f, 21.93f, 21.02f, 22.01f, 21.22f, 22.01f)
                curveTo(21.42f, 22.01f, 21.62f, 21.93f, 21.77f, 21.78f)
                curveTo(22.08f, 21.47f, 22.08f, 20.98f, 21.77f, 20.68f)
                close()
            }
        }
        .build()
        return _heartsearch!!
    }

private var _heartsearch: ImageVector? = null
