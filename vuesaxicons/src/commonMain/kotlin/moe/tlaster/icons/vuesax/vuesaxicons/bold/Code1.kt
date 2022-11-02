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

public val BoldGroup.Code1: ImageVector
    get() {
        if (_code1 != null) {
            return _code1!!
        }
        _code1 = Builder(name = "Code1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.94f, 13.27f)
                curveTo(9.26f, 14.29f, 8.32f, 15.12f, 7.22f, 15.67f)
                curveTo(7.12f, 15.72f, 7.0f, 15.75f, 6.89f, 15.75f)
                curveTo(6.61f, 15.75f, 6.35f, 15.6f, 6.22f, 15.34f)
                curveTo(6.03f, 14.97f, 6.18f, 14.52f, 6.56f, 14.33f)
                curveTo(7.43f, 13.9f, 8.17f, 13.24f, 8.7f, 12.44f)
                curveTo(8.88f, 12.17f, 8.88f, 11.83f, 8.7f, 11.56f)
                curveTo(8.16f, 10.76f, 7.42f, 10.1f, 6.56f, 9.67f)
                curveTo(6.18f, 9.49f, 6.03f, 9.04f, 6.22f, 8.66f)
                curveTo(6.4f, 8.29f, 6.85f, 8.14f, 7.22f, 8.33f)
                curveTo(8.32f, 8.88f, 9.26f, 9.71f, 9.94f, 10.73f)
                curveTo(10.46f, 11.5f, 10.46f, 12.5f, 9.94f, 13.27f)
                close()
                moveTo(17.0f, 15.75f)
                horizontalLineTo(13.0f)
                curveTo(12.59f, 15.75f, 12.25f, 15.41f, 12.25f, 15.0f)
                curveTo(12.25f, 14.59f, 12.59f, 14.25f, 13.0f, 14.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15.0f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17.0f, 15.75f)
                close()
            }
        }
        .build()
        return _code1!!
    }

private var _code1: ImageVector? = null
