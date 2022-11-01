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

public val BoldGroup.Message: ImageVector
    get() {
        if (_message != null) {
            return _message!!
        }
        _message = Builder(name = "Message", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(8.0f, 12.0f)
                curveTo(7.44f, 12.0f, 7.0f, 11.55f, 7.0f, 11.0f)
                curveTo(7.0f, 10.45f, 7.45f, 10.0f, 8.0f, 10.0f)
                curveTo(8.55f, 10.0f, 9.0f, 10.45f, 9.0f, 11.0f)
                curveTo(9.0f, 11.55f, 8.56f, 12.0f, 8.0f, 12.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(11.44f, 12.0f, 11.0f, 11.55f, 11.0f, 11.0f)
                curveTo(11.0f, 10.45f, 11.45f, 10.0f, 12.0f, 10.0f)
                curveTo(12.55f, 10.0f, 13.0f, 10.45f, 13.0f, 11.0f)
                curveTo(13.0f, 11.55f, 12.56f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(15.44f, 12.0f, 15.0f, 11.55f, 15.0f, 11.0f)
                curveTo(15.0f, 10.45f, 15.45f, 10.0f, 16.0f, 10.0f)
                curveTo(16.55f, 10.0f, 17.0f, 10.45f, 17.0f, 11.0f)
                curveTo(17.0f, 11.55f, 16.56f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _message!!
    }

private var _message: ImageVector? = null
