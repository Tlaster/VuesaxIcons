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

public val BoldGroup.Percentagesquare: ImageVector
    get() {
        if (_percentagesquare != null) {
            return _percentagesquare!!
        }
        _percentagesquare = Builder(name = "Percentagesquare", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(7.75f, 9.14f)
                curveTo(7.75f, 8.33f, 8.41f, 7.66f, 9.23f, 7.66f)
                curveTo(10.04f, 7.66f, 10.71f, 8.32f, 10.71f, 9.14f)
                curveTo(10.71f, 9.95f, 10.05f, 10.62f, 9.23f, 10.62f)
                curveTo(8.41f, 10.61f, 7.75f, 9.95f, 7.75f, 9.14f)
                close()
                moveTo(8.82f, 16.02f)
                curveTo(8.63f, 16.02f, 8.44f, 15.95f, 8.29f, 15.8f)
                curveTo(8.0f, 15.51f, 8.0f, 15.04f, 8.29f, 14.74f)
                lineTo(14.84f, 8.19f)
                curveTo(15.13f, 7.9f, 15.61f, 7.9f, 15.9f, 8.19f)
                curveTo(16.19f, 8.48f, 16.19f, 8.96f, 15.9f, 9.25f)
                lineTo(9.35f, 15.8f)
                curveTo(9.2f, 15.95f, 9.01f, 16.02f, 8.82f, 16.02f)
                close()
                moveTo(15.77f, 16.34f)
                curveTo(14.96f, 16.34f, 14.29f, 15.68f, 14.29f, 14.86f)
                curveTo(14.29f, 14.05f, 14.95f, 13.38f, 15.77f, 13.38f)
                curveTo(16.58f, 13.38f, 17.25f, 14.04f, 17.25f, 14.86f)
                curveTo(17.25f, 15.68f, 16.59f, 16.34f, 15.77f, 16.34f)
                close()
            }
        }
        .build()
        return _percentagesquare!!
    }

private var _percentagesquare: ImageVector? = null
