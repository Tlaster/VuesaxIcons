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

public val BoldGroup.Emojihappy: ImageVector
    get() {
        if (_emojihappy != null) {
            return _emojihappy!!
        }
        _emojihappy = Builder(name = "Emojihappy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(8.5f, 6.38f)
                curveTo(9.53f, 6.38f, 10.38f, 7.22f, 10.38f, 8.26f)
                curveTo(10.38f, 9.3f, 9.54f, 10.14f, 8.5f, 10.14f)
                curveTo(7.46f, 10.14f, 6.62f, 9.28f, 6.62f, 8.25f)
                curveTo(6.62f, 7.22f, 7.47f, 6.38f, 8.5f, 6.38f)
                close()
                moveTo(12.0f, 19.08f)
                curveTo(9.31f, 19.08f, 7.12f, 16.89f, 7.12f, 14.2f)
                curveTo(7.12f, 13.5f, 7.69f, 12.92f, 8.39f, 12.92f)
                horizontalLineTo(15.59f)
                curveTo(16.29f, 12.92f, 16.86f, 13.49f, 16.86f, 14.2f)
                curveTo(16.88f, 16.89f, 14.69f, 19.08f, 12.0f, 19.08f)
                close()
                moveTo(15.5f, 10.12f)
                curveTo(14.47f, 10.12f, 13.62f, 9.28f, 13.62f, 8.24f)
                curveTo(13.62f, 7.2f, 14.46f, 6.36f, 15.5f, 6.36f)
                curveTo(16.54f, 6.36f, 17.38f, 7.2f, 17.38f, 8.24f)
                curveTo(17.38f, 9.28f, 16.53f, 10.12f, 15.5f, 10.12f)
                close()
            }
        }
        .build()
        return _emojihappy!!
    }

private var _emojihappy: ImageVector? = null
