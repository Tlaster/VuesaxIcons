package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Buycrypto: ImageVector
    get() {
        if (_buycrypto != null) {
            return _buycrypto!!
        }
        _buycrypto = Builder(name = "Buycrypto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0001f, 8.5f)
                curveTo(22.0001f, 11.76f, 19.6001f, 14.45f, 16.4801f, 14.92f)
                verticalLineTo(14.86f)
                curveTo(16.1701f, 10.98f, 13.0201f, 7.83f, 9.1101f, 7.52f)
                horizontalLineTo(9.0801f)
                curveTo(9.5501f, 4.4f, 12.2401f, 2.0f, 15.5001f, 2.0f)
                curveTo(19.0901f, 2.0f, 22.0001f, 4.91f, 22.0001f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.98f, 14.98f)
                curveTo(14.73f, 11.81f, 12.19f, 9.27f, 9.02f, 9.02f)
                curveTo(8.85f, 9.01f, 8.67f, 9.0f, 8.5f, 9.0f)
                curveTo(4.91f, 9.0f, 2.0f, 11.91f, 2.0f, 15.5f)
                curveTo(2.0f, 19.09f, 4.91f, 22.0f, 8.5f, 22.0f)
                curveTo(12.09f, 22.0f, 15.0f, 19.09f, 15.0f, 15.5f)
                curveTo(15.0f, 15.33f, 14.99f, 15.15f, 14.98f, 14.98f)
                close()
                moveTo(9.38f, 16.38f)
                lineTo(8.5f, 18.0f)
                lineTo(7.62f, 16.38f)
                lineTo(6.0f, 15.5f)
                lineTo(7.62f, 14.62f)
                lineTo(8.5f, 13.0f)
                lineTo(9.38f, 14.62f)
                lineTo(11.0f, 15.5f)
                lineTo(9.38f, 16.38f)
                close()
            }
        }
        .build()
        return _buycrypto!!
    }

private var _buycrypto: ImageVector? = null
