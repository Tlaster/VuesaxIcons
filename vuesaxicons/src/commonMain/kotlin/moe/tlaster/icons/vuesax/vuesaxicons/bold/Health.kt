package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(12.5f)
                horizontalLineTo(17.92f)
                curveTo(17.8f, 12.49f, 17.54f, 12.34f, 17.48f, 12.23f)
                lineTo(16.44f, 10.26f)
                curveTo(16.03f, 9.48f, 15.32f, 9.04f, 14.56f, 9.08f)
                curveTo(13.8f, 9.12f, 13.15f, 9.63f, 12.82f, 10.46f)
                lineTo(11.44f, 13.92f)
                lineTo(11.24f, 13.4f)
                curveTo(10.75f, 12.13f, 9.35f, 11.17f, 7.97f, 11.17f)
                lineTo(2.0f, 11.2f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.1887f)
                verticalLineTo(13.9987f)
                horizontalLineTo(17.92f)
                curveTo(17.25f, 13.9987f, 16.46f, 13.5187f, 16.15f, 12.9287f)
                lineTo(15.11f, 10.9587f)
                curveTo(14.83f, 10.4287f, 14.43f, 10.4587f, 14.21f, 11.0087f)
                lineTo(11.91f, 16.8187f)
                curveTo(11.66f, 17.4687f, 11.24f, 17.4687f, 10.98f, 16.8187f)
                lineTo(9.84f, 13.9387f)
                curveTo(9.57f, 13.2387f, 8.73f, 12.6687f, 7.98f, 12.6687f)
                lineTo(2.0f, 12.6987f)
                verticalLineTo(16.1887f)
                curveTo(2.0f, 19.7687f, 4.1f, 21.9287f, 7.63f, 21.9887f)
                curveTo(7.74f, 21.9987f, 7.86f, 21.9987f, 7.97f, 21.9987f)
                horizontalLineTo(15.97f)
                curveTo(16.12f, 21.9987f, 16.27f, 21.9987f, 16.41f, 21.9887f)
                curveTo(19.92f, 21.9087f, 22.0f, 19.7587f, 22.0f, 16.1887f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0007f, 12.6992f)
                verticalLineTo(16.0092f)
                curveTo(1.9807f, 15.6892f, 1.9707f, 15.3492f, 1.9707f, 14.9992f)
                verticalLineTo(12.6992f)
                horizontalLineTo(2.0007f)
                close()
            }
        }
        .build()
        return _health!!
    }

private var _health: ImageVector? = null
