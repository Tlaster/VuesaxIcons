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

public val BoldGroup.Messagetext1: ImageVector
    get() {
        if (_messagetext1 != null) {
            return _messagetext1!!
        }
        _messagetext1 = Builder(name = "Messagetext1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 8.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.55f, 2.45f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(14.0f, 15.25f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 15.25f, 6.25f, 14.91f, 6.25f, 14.5f)
                curveTo(6.25f, 14.09f, 6.59f, 13.75f, 7.0f, 13.75f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 13.75f, 14.75f, 14.09f, 14.75f, 14.5f)
                curveTo(14.75f, 14.91f, 14.41f, 15.25f, 14.0f, 15.25f)
                close()
                moveTo(17.0f, 10.25f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 10.25f, 6.25f, 9.91f, 6.25f, 9.5f)
                curveTo(6.25f, 9.09f, 6.59f, 8.75f, 7.0f, 8.75f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 8.75f, 17.75f, 9.09f, 17.75f, 9.5f)
                curveTo(17.75f, 9.91f, 17.41f, 10.25f, 17.0f, 10.25f)
                close()
            }
        }
        .build()
        return _messagetext1!!
    }

private var _messagetext1: ImageVector? = null
