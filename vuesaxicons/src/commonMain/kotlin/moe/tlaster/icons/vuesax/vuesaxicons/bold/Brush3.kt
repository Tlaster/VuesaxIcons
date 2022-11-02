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

public val BoldGroup.Brush3: ImageVector
    get() {
        if (_brush3 != null) {
            return _brush3!!
        }
        _brush3 = Builder(name = "Brush3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.49f, 16.72f)
                curveTo(10.15f, 17.06f, 9.7f, 17.29f, 9.15f, 17.36f)
                lineTo(7.8f, 17.51f)
                curveTo(7.06f, 17.59f, 6.43f, 16.96f, 6.51f, 16.21f)
                lineTo(6.66f, 14.85f)
                curveTo(6.79f, 13.64f, 7.8f, 12.87f, 8.87f, 12.85f)
                curveTo(8.97f, 12.84f, 9.09f, 12.85f, 9.2f, 12.86f)
                curveTo(9.67f, 12.92f, 10.12f, 13.14f, 10.5f, 13.51f)
                curveTo(10.87f, 13.88f, 11.08f, 14.32f, 11.14f, 14.77f)
                curveTo(11.15f, 14.88f, 11.16f, 14.99f, 11.16f, 15.09f)
                curveTo(11.16f, 15.71f, 10.93f, 16.28f, 10.49f, 16.72f)
                close()
                moveTo(17.44f, 7.55f)
                curveTo(16.72f, 9.35f, 15.07f, 11.71f, 13.5f, 13.25f)
                curveTo(13.27f, 11.83f, 12.14f, 10.71f, 10.7f, 10.51f)
                curveTo(12.24f, 8.93f, 14.62f, 7.26f, 16.43f, 6.53f)
                curveTo(16.75f, 6.41f, 17.07f, 6.5f, 17.27f, 6.7f)
                curveTo(17.47f, 6.92f, 17.57f, 7.23f, 17.44f, 7.55f)
                close()
            }
        }
        .build()
        return _brush3!!
    }

private var _brush3: ImageVector? = null
