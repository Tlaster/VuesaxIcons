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

public val BoldGroup.Stacks: ImageVector
    get() {
        if (_stacks != null) {
            return _stacks!!
        }
        _stacks = Builder(name = "Stacks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.5f, 14.25f)
                horizontalLineTo(13.45f)
                lineTo(15.44f, 17.07f)
                curveTo(15.68f, 17.41f, 15.6f, 17.88f, 15.26f, 18.11f)
                curveTo(15.13f, 18.2f, 14.98f, 18.25f, 14.83f, 18.25f)
                curveTo(14.59f, 18.25f, 14.36f, 18.14f, 14.22f, 17.93f)
                lineTo(11.92f, 14.67f)
                lineTo(9.62f, 17.93f)
                curveTo(9.47f, 18.14f, 9.24f, 18.25f, 9.01f, 18.25f)
                curveTo(8.86f, 18.25f, 8.71f, 18.21f, 8.58f, 18.11f)
                curveTo(8.24f, 17.87f, 8.16f, 17.4f, 8.4f, 17.07f)
                lineTo(10.39f, 14.25f)
                horizontalLineTo(7.52f)
                curveTo(7.11f, 14.25f, 6.77f, 13.91f, 6.77f, 13.5f)
                curveTo(6.77f, 13.09f, 7.11f, 12.75f, 7.52f, 12.75f)
                horizontalLineTo(16.52f)
                curveTo(16.93f, 12.75f, 17.27f, 13.09f, 17.27f, 13.5f)
                curveTo(17.27f, 13.91f, 16.91f, 14.25f, 16.5f, 14.25f)
                close()
                moveTo(16.5f, 11.25f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 11.25f, 6.75f, 10.91f, 6.75f, 10.5f)
                curveTo(6.75f, 10.09f, 7.09f, 9.75f, 7.5f, 9.75f)
                horizontalLineTo(10.37f)
                lineTo(8.38f, 6.93f)
                curveTo(8.14f, 6.59f, 8.22f, 6.12f, 8.56f, 5.89f)
                curveTo(8.9f, 5.65f, 9.37f, 5.73f, 9.6f, 6.07f)
                lineTo(11.9f, 9.33f)
                lineTo(14.2f, 6.07f)
                curveTo(14.44f, 5.73f, 14.91f, 5.65f, 15.24f, 5.89f)
                curveTo(15.58f, 6.13f, 15.66f, 6.6f, 15.42f, 6.93f)
                lineTo(13.43f, 9.75f)
                horizontalLineTo(16.48f)
                curveTo(16.89f, 9.75f, 17.23f, 10.09f, 17.23f, 10.5f)
                curveTo(17.23f, 10.91f, 16.91f, 11.25f, 16.5f, 11.25f)
                close()
            }
        }
        .build()
        return _stacks!!
    }

private var _stacks: ImageVector? = null
