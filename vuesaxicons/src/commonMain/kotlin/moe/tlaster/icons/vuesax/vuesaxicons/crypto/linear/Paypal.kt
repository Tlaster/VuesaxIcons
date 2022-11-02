package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0001f, 7.0f)
                curveTo(19.0001f, 7.2f, 19.0001f, 7.3f, 19.0001f, 7.5f)
                curveTo(18.9001f, 9.0f, 18.2001f, 10.3f, 17.3001f, 11.2f)
                curveTo(16.2001f, 12.3f, 14.7001f, 13.0f, 13.0001f, 13.0f)
                horizontalLineTo(9.9001f)
                curveTo(9.4001f, 13.0f, 9.0001f, 13.4f, 8.9001f, 13.9f)
                lineTo(8.1001f, 19.2f)
                curveTo(8.0001f, 19.6f, 7.8001f, 19.9f, 7.4001f, 20.0f)
                curveTo(7.3001f, 20.0f, 7.2001f, 20.0f, 7.1001f, 20.0f)
                horizontalLineTo(5.2001f)
                curveTo(4.6001f, 20.0f, 4.1001f, 19.5f, 4.2001f, 18.8f)
                lineTo(6.6001f, 4.5f)
                curveTo(6.8001f, 3.1f, 8.1001f, 2.0f, 9.5001f, 2.0f)
                horizontalLineTo(14.0001f)
                curveTo(16.8001f, 2.0f, 19.0001f, 4.2f, 19.0001f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0001f, 11.0f)
                curveTo(21.0001f, 12.4f, 20.4001f, 13.6f, 19.5001f, 14.5f)
                curveTo(18.6001f, 15.4f, 17.4001f, 16.0f, 16.0001f, 16.0f)
                horizontalLineTo(13.9001f)
                curveTo(13.4001f, 16.0f, 13.0001f, 16.3f, 12.9001f, 16.8f)
                lineTo(12.2001f, 21.1f)
                curveTo(12.1001f, 21.6f, 11.7001f, 21.9f, 11.2001f, 21.9f)
                horizontalLineTo(8.2001f)
                curveTo(7.6001f, 21.9f, 7.1001f, 21.3f, 7.2001f, 20.7f)
                lineTo(7.4001f, 20.0f)
                curveTo(7.8001f, 19.9f, 8.1001f, 19.6f, 8.1001f, 19.2f)
                lineTo(8.9001f, 13.9f)
                curveTo(9.0001f, 13.4f, 9.4001f, 13.0f, 9.9001f, 13.0f)
                horizontalLineTo(13.0001f)
                curveTo(14.7001f, 13.0f, 16.2001f, 12.3f, 17.2001f, 11.2f)
                curveTo(18.2001f, 10.2f, 18.8001f, 8.9f, 18.9001f, 7.5f)
                curveTo(20.2001f, 8.2f, 21.0001f, 9.5f, 21.0001f, 11.0f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
