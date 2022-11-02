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

public val BoldGroup.Home1: ImageVector
    get() {
        if (_home1 != null) {
            return _home1!!
        }
        _home1 = Builder(name = "Home1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.83f, 8.01f)
                lineTo(14.28f, 2.77f)
                curveTo(13.0f, 1.75f, 11.0f, 1.74f, 9.73f, 2.76f)
                lineTo(3.18f, 8.01f)
                curveTo(2.24f, 8.76f, 1.67f, 10.26f, 1.87f, 11.44f)
                lineTo(3.13f, 18.98f)
                curveTo(3.42f, 20.67f, 4.99f, 22.0f, 6.7f, 22.0f)
                horizontalLineTo(17.3f)
                curveTo(18.99f, 22.0f, 20.59f, 20.64f, 20.88f, 18.97f)
                lineTo(22.14f, 11.43f)
                curveTo(22.32f, 10.26f, 21.75f, 8.76f, 20.83f, 8.01f)
                close()
                moveTo(12.75f, 18.0f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12.0f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 14.59f, 11.59f, 14.25f, 12.0f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _home1!!
    }

private var _home1: ImageVector? = null
