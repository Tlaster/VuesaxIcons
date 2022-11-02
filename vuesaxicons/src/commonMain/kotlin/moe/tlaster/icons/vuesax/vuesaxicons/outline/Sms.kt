package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Sms: ImageVector
    get() {
        if (_sms != null) {
            return _sms!!
        }
        _sms = Builder(name = "Sms", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.25f)
                horizontalLineTo(7.0f)
                curveTo(3.35f, 21.25f, 1.25f, 19.15f, 1.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 4.85f, 3.35f, 2.75f, 7.0f, 2.75f)
                horizontalLineTo(17.0f)
                curveTo(20.65f, 2.75f, 22.75f, 4.85f, 22.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(22.75f, 19.15f, 20.65f, 21.25f, 17.0f, 21.25f)
                close()
                moveTo(7.0f, 4.25f)
                curveTo(4.14f, 4.25f, 2.75f, 5.64f, 2.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.75f, 18.36f, 4.14f, 19.75f, 7.0f, 19.75f)
                horizontalLineTo(17.0f)
                curveTo(19.86f, 19.75f, 21.25f, 18.36f, 21.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(21.25f, 5.64f, 19.86f, 4.25f, 17.0f, 4.25f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9988f, 12.87f)
                curveTo(11.1588f, 12.87f, 10.3088f, 12.61f, 9.6588f, 12.08f)
                lineTo(6.5288f, 9.58f)
                curveTo(6.2088f, 9.32f, 6.1488f, 8.85f, 6.4088f, 8.53f)
                curveTo(6.6688f, 8.21f, 7.1388f, 8.15f, 7.4588f, 8.41f)
                lineTo(10.5888f, 10.91f)
                curveTo(11.3488f, 11.52f, 12.6388f, 11.52f, 13.3988f, 10.91f)
                lineTo(16.5288f, 8.41f)
                curveTo(16.8488f, 8.15f, 17.3288f, 8.2f, 17.5788f, 8.53f)
                curveTo(17.8388f, 8.85f, 17.7888f, 9.33f, 17.4588f, 9.58f)
                lineTo(14.3288f, 12.08f)
                curveTo(13.6888f, 12.61f, 12.8388f, 12.87f, 11.9988f, 12.87f)
                close()
            }
        }
        .build()
        return _sms!!
    }

private var _sms: ImageVector? = null
