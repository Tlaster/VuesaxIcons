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

public val BoldGroup.Addcircle: ImageVector
    get() {
        if (_addcircle != null) {
            return _addcircle!!
        }
        _addcircle = Builder(name = "Addcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.0f, 12.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.41f, 12.41f, 16.75f, 12.0f, 16.75f)
                curveTo(11.59f, 16.75f, 11.25f, 16.41f, 11.25f, 16.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12.0f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12.0f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12.0f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16.0f, 12.75f)
                close()
            }
        }
        .build()
        return _addcircle!!
    }

private var _addcircle: ImageVector? = null
