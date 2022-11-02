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

public val BulkGroup.Heartedit: ImageVector
    get() {
        if (_heartedit != null) {
            return _heartedit!!
        }
        _heartedit = Builder(name = "Heartedit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.8392f, 9.16f)
                curveTo(13.9392f, 8.26f, 13.2292f, 8.55f, 12.6192f, 9.16f)
                lineTo(9.0792f, 12.7f)
                curveTo(8.9392f, 12.84f, 8.8092f, 13.1f, 8.7792f, 13.29f)
                lineTo(8.5892f, 14.64f)
                curveTo(8.5192f, 15.13f, 8.8592f, 15.47f, 9.3492f, 15.4f)
                lineTo(10.6992f, 15.21f)
                curveTo(10.8892f, 15.18f, 11.1592f, 15.05f, 11.2892f, 14.91f)
                lineTo(14.8292f, 11.37f)
                curveTo(15.4492f, 10.77f, 15.7392f, 10.06f, 14.8392f, 9.16f)
                close()
            }
        }
        .build()
        return _heartedit!!
    }

private var _heartedit: ImageVector? = null
