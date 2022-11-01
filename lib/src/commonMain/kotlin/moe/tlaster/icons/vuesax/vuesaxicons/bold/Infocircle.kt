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

public val BoldGroup.Infocircle: ImageVector
    get() {
        if (_infocircle != null) {
            return _infocircle!!
        }
        _infocircle = Builder(name = "Infocircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f)
                curveTo(17.51f, 22.0f, 22.0f, 17.51f, 22.0f, 12.0f)
                curveTo(22.0f, 6.49f, 17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.25f, 8.0f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12.0f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(12.92f, 16.38f)
                curveTo(12.87f, 16.51f, 12.8f, 16.61f, 12.71f, 16.71f)
                curveTo(12.61f, 16.8f, 12.5f, 16.87f, 12.38f, 16.92f)
                curveTo(12.26f, 16.97f, 12.13f, 17.0f, 12.0f, 17.0f)
                curveTo(11.87f, 17.0f, 11.74f, 16.97f, 11.62f, 16.92f)
                curveTo(11.5f, 16.87f, 11.39f, 16.8f, 11.29f, 16.71f)
                curveTo(11.2f, 16.61f, 11.13f, 16.51f, 11.08f, 16.38f)
                curveTo(11.03f, 16.26f, 11.0f, 16.13f, 11.0f, 16.0f)
                curveTo(11.0f, 15.87f, 11.03f, 15.74f, 11.08f, 15.62f)
                curveTo(11.13f, 15.5f, 11.2f, 15.39f, 11.29f, 15.29f)
                curveTo(11.39f, 15.2f, 11.5f, 15.13f, 11.62f, 15.08f)
                curveTo(11.86f, 14.98f, 12.14f, 14.98f, 12.38f, 15.08f)
                curveTo(12.5f, 15.13f, 12.61f, 15.2f, 12.71f, 15.29f)
                curveTo(12.8f, 15.39f, 12.87f, 15.5f, 12.92f, 15.62f)
                curveTo(12.97f, 15.74f, 13.0f, 15.87f, 13.0f, 16.0f)
                curveTo(13.0f, 16.13f, 12.97f, 16.26f, 12.92f, 16.38f)
                close()
            }
        }
        .build()
        return _infocircle!!
    }

private var _infocircle: ImageVector? = null
