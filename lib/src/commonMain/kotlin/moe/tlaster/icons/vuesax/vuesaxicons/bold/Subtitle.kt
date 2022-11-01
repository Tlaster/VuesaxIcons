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

public val BoldGroup.Subtitle: ImageVector
    get() {
        if (_subtitle != null) {
            return _subtitle!!
        }
        _subtitle = Builder(name = "Subtitle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(6.5f, 12.57f)
                horizontalLineTo(9.27f)
                curveTo(9.68f, 12.57f, 10.02f, 12.91f, 10.02f, 13.32f)
                curveTo(10.02f, 13.73f, 9.68f, 14.07f, 9.27f, 14.07f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 14.07f, 5.75f, 13.73f, 5.75f, 13.32f)
                curveTo(5.75f, 12.91f, 6.09f, 12.57f, 6.5f, 12.57f)
                close()
                moveTo(12.97f, 17.83f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 17.83f, 5.75f, 17.49f, 5.75f, 17.08f)
                curveTo(5.75f, 16.67f, 6.09f, 16.33f, 6.5f, 16.33f)
                horizontalLineTo(12.97f)
                curveTo(13.38f, 16.33f, 13.72f, 16.67f, 13.72f, 17.08f)
                curveTo(13.72f, 17.49f, 13.39f, 17.83f, 12.97f, 17.83f)
                close()
                moveTo(17.5f, 17.83f)
                horizontalLineTo(15.65f)
                curveTo(15.24f, 17.83f, 14.9f, 17.49f, 14.9f, 17.08f)
                curveTo(14.9f, 16.67f, 15.24f, 16.33f, 15.65f, 16.33f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 16.33f, 18.25f, 16.67f, 18.25f, 17.08f)
                curveTo(18.25f, 17.49f, 17.91f, 17.83f, 17.5f, 17.83f)
                close()
                moveTo(17.5f, 14.07f)
                horizontalLineTo(11.97f)
                curveTo(11.56f, 14.07f, 11.22f, 13.73f, 11.22f, 13.32f)
                curveTo(11.22f, 12.91f, 11.56f, 12.57f, 11.97f, 12.57f)
                horizontalLineTo(17.5f)
                curveTo(17.91f, 12.57f, 18.25f, 12.91f, 18.25f, 13.32f)
                curveTo(18.25f, 13.73f, 17.91f, 14.07f, 17.5f, 14.07f)
                close()
            }
        }
        .build()
        return _subtitle!!
    }

private var _subtitle: ImageVector? = null
