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

public val BoldGroup.Messagetext: ImageVector
    get() {
        if (_messagetext != null) {
            return _messagetext!!
        }
        _messagetext = Builder(name = "Messagetext", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(4.24f, 2.0f, 2.0f, 4.23f, 2.0f, 6.98f)
                verticalLineTo(12.96f)
                verticalLineTo(13.96f)
                curveTo(2.0f, 16.71f, 4.24f, 18.94f, 7.0f, 18.94f)
                horizontalLineTo(8.5f)
                curveTo(8.77f, 18.94f, 9.13f, 19.12f, 9.3f, 19.34f)
                lineTo(10.8f, 21.33f)
                curveTo(11.46f, 22.21f, 12.54f, 22.21f, 13.2f, 21.33f)
                lineTo(14.7f, 19.34f)
                curveTo(14.89f, 19.09f, 15.19f, 18.94f, 15.5f, 18.94f)
                horizontalLineTo(17.0f)
                curveTo(19.76f, 18.94f, 22.0f, 16.71f, 22.0f, 13.96f)
                verticalLineTo(6.98f)
                curveTo(22.0f, 4.23f, 19.76f, 2.0f, 17.0f, 2.0f)
                close()
                moveTo(13.0f, 13.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 13.75f, 6.25f, 13.41f, 6.25f, 13.0f)
                curveTo(6.25f, 12.59f, 6.59f, 12.25f, 7.0f, 12.25f)
                horizontalLineTo(13.0f)
                curveTo(13.41f, 12.25f, 13.75f, 12.59f, 13.75f, 13.0f)
                curveTo(13.75f, 13.41f, 13.41f, 13.75f, 13.0f, 13.75f)
                close()
                moveTo(17.0f, 8.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 8.75f, 6.25f, 8.41f, 6.25f, 8.0f)
                curveTo(6.25f, 7.59f, 6.59f, 7.25f, 7.0f, 7.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 7.25f, 17.75f, 7.59f, 17.75f, 8.0f)
                curveTo(17.75f, 8.41f, 17.41f, 8.75f, 17.0f, 8.75f)
                close()
            }
        }
        .build()
        return _messagetext!!
    }

private var _messagetext: ImageVector? = null
