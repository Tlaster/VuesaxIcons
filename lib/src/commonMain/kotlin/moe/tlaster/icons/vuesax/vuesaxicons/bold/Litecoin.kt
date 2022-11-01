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

public val BoldGroup.Litecoin: ImageVector
    get() {
        if (_litecoin != null) {
            return _litecoin!!
        }
        _litecoin = Builder(name = "Litecoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.82f, 16.32f)
                curveTo(15.73f, 16.8f, 15.32f, 17.14f, 14.84f, 17.14f)
                horizontalLineTo(9.3f)
                curveTo(8.64f, 17.14f, 8.16f, 16.5f, 8.34f, 15.87f)
                lineTo(9.18f, 12.92f)
                lineTo(7.47f, 13.26f)
                curveTo(7.42f, 13.27f, 7.37f, 13.27f, 7.32f, 13.27f)
                curveTo(6.97f, 13.27f, 6.66f, 13.02f, 6.59f, 12.67f)
                curveTo(6.51f, 12.26f, 6.77f, 11.87f, 7.18f, 11.79f)
                lineTo(9.65f, 11.3f)
                lineTo(10.96f, 6.73f)
                curveTo(11.02f, 6.52f, 11.22f, 6.37f, 11.44f, 6.37f)
                horizontalLineTo(12.8f)
                curveTo(13.46f, 6.37f, 13.94f, 6.99f, 13.77f, 7.63f)
                lineTo(12.96f, 10.64f)
                lineTo(14.89f, 10.25f)
                curveTo(15.29f, 10.17f, 15.69f, 10.43f, 15.77f, 10.84f)
                curveTo(15.85f, 11.25f, 15.59f, 11.64f, 15.18f, 11.72f)
                lineTo(12.52f, 12.25f)
                lineTo(11.97f, 14.3f)
                horizontalLineTo(15.0f)
                curveTo(15.62f, 14.3f, 16.09f, 14.86f, 15.98f, 15.48f)
                lineTo(15.82f, 16.32f)
                close()
            }
        }
        .build()
        return _litecoin!!
    }

private var _litecoin: ImageVector? = null
