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

public val BoldGroup.Wanchain: ImageVector
    get() {
        if (_wanchain != null) {
            return _wanchain!!
        }
        _wanchain = Builder(name = "Wanchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(14.67f, 16.43f)
                lineTo(12.42f, 17.93f)
                curveTo(12.29f, 18.01f, 12.15f, 18.06f, 12.0f, 18.06f)
                curveTo(11.85f, 18.06f, 11.71f, 18.02f, 11.58f, 17.93f)
                lineTo(9.33f, 16.43f)
                curveTo(8.99f, 16.2f, 8.89f, 15.73f, 9.12f, 15.39f)
                curveTo(9.35f, 15.04f, 9.82f, 14.95f, 10.16f, 15.18f)
                lineTo(11.99f, 16.4f)
                lineTo(13.82f, 15.18f)
                curveTo(14.16f, 14.95f, 14.63f, 15.04f, 14.86f, 15.39f)
                curveTo(15.1f, 15.74f, 15.01f, 16.2f, 14.67f, 16.43f)
                close()
                moveTo(16.5f, 12.99f)
                curveTo(16.5f, 13.77f, 15.65f, 14.25f, 14.99f, 13.85f)
                lineTo(12.52f, 12.37f)
                curveTo(12.2f, 12.18f, 11.81f, 12.18f, 11.49f, 12.37f)
                lineTo(9.02f, 13.85f)
                curveTo(8.35f, 14.25f, 7.51f, 13.77f, 7.51f, 12.99f)
                verticalLineTo(9.16f)
                curveTo(7.51f, 8.82f, 7.69f, 8.5f, 7.97f, 8.32f)
                lineTo(11.47f, 6.1f)
                curveTo(11.8f, 5.89f, 12.21f, 5.89f, 12.54f, 6.1f)
                lineTo(16.04f, 8.32f)
                curveTo(16.33f, 8.5f, 16.5f, 8.82f, 16.5f, 9.16f)
                verticalLineTo(12.99f)
                verticalLineTo(12.99f)
                close()
            }
        }
        .build()
        return _wanchain!!
    }

private var _wanchain: ImageVector? = null
