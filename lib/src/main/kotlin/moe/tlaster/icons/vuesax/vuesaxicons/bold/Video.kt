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

public val BoldGroup.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.15f, 6.17f)
                curveTo(20.74f, 5.95f, 19.88f, 5.72f, 18.71f, 6.54f)
                lineTo(17.24f, 7.58f)
                curveTo(17.13f, 4.47f, 15.78f, 3.25f, 12.5f, 3.25f)
                horizontalLineTo(6.5f)
                curveTo(3.08f, 3.25f, 1.75f, 4.58f, 1.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(1.75f, 18.3f, 3.0f, 20.75f, 6.5f, 20.75f)
                horizontalLineTo(12.5f)
                curveTo(15.78f, 20.75f, 17.13f, 19.53f, 17.24f, 16.42f)
                lineTo(18.71f, 17.46f)
                curveTo(19.33f, 17.9f, 19.87f, 18.04f, 20.3f, 18.04f)
                curveTo(20.67f, 18.04f, 20.96f, 17.93f, 21.15f, 17.83f)
                curveTo(21.56f, 17.62f, 22.25f, 17.05f, 22.25f, 15.62f)
                verticalLineTo(8.38f)
                curveTo(22.25f, 6.95f, 21.56f, 6.38f, 21.15f, 6.17f)
                close()
                moveTo(11.0f, 11.38f)
                curveTo(9.97f, 11.38f, 9.12f, 10.54f, 9.12f, 9.5f)
                curveTo(9.12f, 8.46f, 9.97f, 7.62f, 11.0f, 7.62f)
                curveTo(12.03f, 7.62f, 12.88f, 8.46f, 12.88f, 9.5f)
                curveTo(12.88f, 10.54f, 12.03f, 11.38f, 11.0f, 11.38f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null
