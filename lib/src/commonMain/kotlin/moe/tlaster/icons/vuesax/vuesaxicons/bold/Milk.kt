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

public val BoldGroup.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = Builder(name = "Milk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.9983f)
                verticalLineTo(18.9983f)
                curveTo(18.0f, 20.6483f, 16.65f, 21.9983f, 15.0f, 21.9983f)
                horizontalLineTo(9.0f)
                curveTo(7.35f, 21.9983f, 6.0f, 20.6483f, 6.0f, 18.9983f)
                verticalLineTo(14.9883f)
                curveTo(6.0f, 14.4383f, 6.45f, 13.9883f, 7.01f, 13.9883f)
                lineTo(9.89f, 13.9983f)
                curveTo(10.58f, 13.9983f, 11.26f, 14.1483f, 11.89f, 14.4483f)
                curveTo(12.58f, 14.7683f, 13.31f, 14.9983f, 14.08f, 14.9983f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 14.9983f, 18.0f, 15.4483f, 18.0f, 15.9983f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.41f, 9.41f)
                lineTo(15.29f, 7.29f)
                curveTo(15.1f, 7.1f, 15.0f, 6.85f, 15.0f, 6.59f)
                verticalLineTo(4.91f)
                curveTo(15.58f, 4.71f, 16.0f, 4.15f, 16.0f, 3.5f)
                curveTo(16.0f, 2.67f, 15.33f, 2.0f, 14.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 2.0f, 8.0f, 2.67f, 8.0f, 3.5f)
                curveTo(8.0f, 4.15f, 8.42f, 4.71f, 9.0f, 4.91f)
                verticalLineTo(6.59f)
                curveTo(9.0f, 6.85f, 8.9f, 7.1f, 8.71f, 7.29f)
                lineTo(6.59f, 9.41f)
                curveTo(6.27f, 9.73f, 6.0f, 10.38f, 6.0f, 10.83f)
                verticalLineTo(11.48f)
                curveTo(6.0f, 12.03f, 6.44f, 12.48f, 6.99f, 12.48f)
                lineTo(9.9f, 12.5f)
                curveTo(10.88f, 12.5f, 11.87f, 12.74f, 12.75f, 13.2f)
                curveTo(13.17f, 13.42f, 13.65f, 13.5f, 14.12f, 13.5f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 13.5f, 18.0f, 13.05f, 18.0f, 12.5f)
                verticalLineTo(10.83f)
                curveTo(18.0f, 10.38f, 17.73f, 9.73f, 17.41f, 9.41f)
                close()
            }
        }
        .build()
        return _milk!!
    }

private var _milk: ImageVector? = null
