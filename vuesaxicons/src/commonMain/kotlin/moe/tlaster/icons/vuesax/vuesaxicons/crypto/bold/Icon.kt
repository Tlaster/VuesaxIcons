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

public val BoldGroup.Icon: ImageVector
    get() {
        if (_icon != null) {
            return _icon!!
        }
        _icon = Builder(name = "Icon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 7.12f)
                curveTo(13.31f, 7.12f, 14.38f, 8.19f, 14.38f, 9.5f)
                curveTo(14.38f, 10.81f, 13.31f, 11.88f, 12.0f, 11.88f)
                curveTo(10.69f, 11.88f, 9.62f, 10.81f, 9.62f, 9.5f)
                curveTo(9.62f, 8.19f, 10.69f, 7.12f, 12.0f, 7.12f)
                close()
                moveTo(14.47f, 17.09f)
                curveTo(14.33f, 17.2f, 14.17f, 17.25f, 14.01f, 17.25f)
                curveTo(13.79f, 17.25f, 13.57f, 17.15f, 13.42f, 16.97f)
                lineTo(12.01f, 15.19f)
                lineTo(10.6f, 16.97f)
                curveTo(10.35f, 17.29f, 9.87f, 17.35f, 9.55f, 17.09f)
                curveTo(9.23f, 16.83f, 9.17f, 16.36f, 9.43f, 16.04f)
                lineTo(10.62f, 14.53f)
                curveTo(10.3f, 14.44f, 9.98f, 14.33f, 9.68f, 14.18f)
                curveTo(9.31f, 13.99f, 9.16f, 13.54f, 9.35f, 13.17f)
                curveTo(9.53f, 12.8f, 9.98f, 12.65f, 10.36f, 12.84f)
                curveTo(11.4f, 13.36f, 12.64f, 13.36f, 13.68f, 12.84f)
                curveTo(14.04f, 12.66f, 14.5f, 12.8f, 14.68f, 13.16f)
                curveTo(14.87f, 13.52f, 14.74f, 13.97f, 14.38f, 14.16f)
                curveTo(14.07f, 14.32f, 13.74f, 14.43f, 13.41f, 14.52f)
                lineTo(14.61f, 16.03f)
                curveTo(14.84f, 16.36f, 14.79f, 16.83f, 14.47f, 17.09f)
                close()
            }
        }
        .build()
        return _icon!!
    }

private var _icon: ImageVector? = null
