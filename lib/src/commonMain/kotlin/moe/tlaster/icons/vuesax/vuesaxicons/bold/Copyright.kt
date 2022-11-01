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

public val BoldGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.24f, 15.25f)
                curveTo(13.02f, 15.25f, 13.79f, 14.96f, 14.38f, 14.44f)
                curveTo(14.69f, 14.17f, 15.17f, 14.2f, 15.44f, 14.51f)
                curveTo(15.71f, 14.82f, 15.68f, 15.3f, 15.37f, 15.57f)
                curveTo(14.5f, 16.34f, 13.39f, 16.76f, 12.24f, 16.76f)
                curveTo(9.62f, 16.76f, 7.49f, 14.63f, 7.49f, 12.01f)
                curveTo(7.49f, 9.39f, 9.62f, 7.26f, 12.24f, 7.26f)
                curveTo(13.39f, 7.26f, 14.51f, 7.68f, 15.37f, 8.45f)
                curveTo(15.68f, 8.72f, 15.71f, 9.2f, 15.44f, 9.51f)
                curveTo(15.16f, 9.82f, 14.69f, 9.85f, 14.38f, 9.58f)
                curveTo(13.79f, 9.06f, 13.03f, 8.77f, 12.24f, 8.77f)
                curveTo(10.45f, 8.77f, 8.99f, 10.23f, 8.99f, 12.02f)
                curveTo(8.99f, 13.81f, 10.45f, 15.25f, 12.24f, 15.25f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
