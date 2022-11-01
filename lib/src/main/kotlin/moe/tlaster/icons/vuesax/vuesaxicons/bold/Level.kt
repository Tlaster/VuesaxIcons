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

public val BoldGroup.Level: ImageVector
    get() {
        if (_level != null) {
            return _level!!
        }
        _level = Builder(name = "Level", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.0f, 12.75f)
                horizontalLineTo(5.0f)
                curveTo(4.59f, 12.75f, 4.25f, 12.41f, 4.25f, 12.0f)
                curveTo(4.25f, 11.59f, 4.59f, 11.25f, 5.0f, 11.25f)
                horizontalLineTo(7.0f)
                curveTo(7.41f, 11.25f, 7.75f, 11.59f, 7.75f, 12.0f)
                curveTo(7.75f, 12.41f, 7.41f, 12.75f, 7.0f, 12.75f)
                close()
                moveTo(12.0f, 14.25f)
                curveTo(10.76f, 14.25f, 9.75f, 13.24f, 9.75f, 12.0f)
                curveTo(9.75f, 10.76f, 10.76f, 9.75f, 12.0f, 9.75f)
                curveTo(13.24f, 9.75f, 14.25f, 10.76f, 14.25f, 12.0f)
                curveTo(14.25f, 13.24f, 13.24f, 14.25f, 12.0f, 14.25f)
                close()
                moveTo(19.0f, 12.75f)
                horizontalLineTo(17.0f)
                curveTo(16.59f, 12.75f, 16.25f, 12.41f, 16.25f, 12.0f)
                curveTo(16.25f, 11.59f, 16.59f, 11.25f, 17.0f, 11.25f)
                horizontalLineTo(19.0f)
                curveTo(19.41f, 11.25f, 19.75f, 11.59f, 19.75f, 12.0f)
                curveTo(19.75f, 12.41f, 19.41f, 12.75f, 19.0f, 12.75f)
                close()
            }
        }
        .build()
        return _level!!
    }

private var _level: ImageVector? = null
