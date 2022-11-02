package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BoldGroup

public val BoldGroup.Zoom: ImageVector
    get() {
        if (_zoom != null) {
            return _zoom!!
        }
        _zoom = Builder(name = "Zoom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(13.63f, 14.29f)
                curveTo(13.63f, 14.8f, 13.22f, 15.21f, 12.71f, 15.21f)
                lineTo(9.03f, 15.24f)
                curveTo(7.49f, 15.25f, 6.24f, 14.01f, 6.24f, 12.47f)
                verticalLineTo(9.67f)
                curveTo(6.24f, 9.16f, 6.65f, 8.75f, 7.16f, 8.75f)
                horizontalLineTo(10.85f)
                curveTo(12.38f, 8.75f, 13.62f, 9.99f, 13.62f, 11.52f)
                verticalLineTo(14.29f)
                horizontalLineTo(13.63f)
                close()
                moveTo(17.75f, 14.0f)
                curveTo(17.75f, 14.43f, 17.27f, 14.69f, 16.91f, 14.45f)
                lineTo(14.99f, 13.17f)
                curveTo(14.84f, 13.07f, 14.75f, 12.9f, 14.75f, 12.72f)
                verticalLineTo(11.3f)
                curveTo(14.75f, 11.12f, 14.84f, 10.95f, 14.99f, 10.85f)
                lineTo(16.91f, 9.57f)
                curveTo(17.27f, 9.33f, 17.75f, 9.59f, 17.75f, 10.02f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _zoom!!
    }

private var _zoom: ImageVector? = null
