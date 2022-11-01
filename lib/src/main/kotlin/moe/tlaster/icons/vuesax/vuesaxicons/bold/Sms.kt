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

public val BoldGroup.Sms: ImageVector
    get() {
        if (_sms != null) {
            return _sms!!
        }
        _sms = Builder(name = "Sms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 3.5f, 2.0f, 5.0f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 19.0f, 4.0f, 20.5f, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 20.5f, 22.0f, 19.0f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 5.0f, 20.0f, 3.5f, 17.0f, 3.5f)
                close()
                moveTo(17.47f, 9.59f)
                lineTo(14.34f, 12.09f)
                curveTo(13.68f, 12.62f, 12.84f, 12.88f, 12.0f, 12.88f)
                curveTo(11.16f, 12.88f, 10.31f, 12.62f, 9.66f, 12.09f)
                lineTo(6.53f, 9.59f)
                curveTo(6.21f, 9.33f, 6.16f, 8.85f, 6.41f, 8.53f)
                curveTo(6.67f, 8.21f, 7.14f, 8.15f, 7.46f, 8.41f)
                lineTo(10.59f, 10.91f)
                curveTo(11.35f, 11.52f, 12.64f, 11.52f, 13.4f, 10.91f)
                lineTo(16.53f, 8.41f)
                curveTo(16.85f, 8.15f, 17.33f, 8.2f, 17.58f, 8.53f)
                curveTo(17.84f, 8.85f, 17.79f, 9.33f, 17.47f, 9.59f)
                close()
            }
        }
        .build()
        return _sms!!
    }

private var _sms: ImageVector? = null
