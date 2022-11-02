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

public val BoldGroup.Securitysafe: ImageVector
    get() {
        if (_securitysafe != null) {
            return _securitysafe!!
        }
        _securitysafe = Builder(name = "Securitysafe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9098f, 11.1203f)
                verticalLineTo(6.7303f)
                curveTo(20.9098f, 5.9103f, 20.2898f, 4.9803f, 19.5198f, 4.6703f)
                lineTo(13.9498f, 2.3903f)
                curveTo(12.6998f, 1.8803f, 11.2898f, 1.8803f, 10.0398f, 2.3903f)
                lineTo(4.4698f, 4.6703f)
                curveTo(3.7098f, 4.9803f, 3.0898f, 5.9103f, 3.0898f, 6.7303f)
                verticalLineTo(11.1203f)
                curveTo(3.0898f, 16.0103f, 6.6398f, 20.5903f, 11.4898f, 21.9303f)
                curveTo(11.8198f, 22.0203f, 12.1798f, 22.0203f, 12.5098f, 21.9303f)
                curveTo(17.3598f, 20.5903f, 20.9098f, 16.0103f, 20.9098f, 11.1203f)
                close()
                moveTo(12.7498f, 12.8703f)
                verticalLineTo(15.5003f)
                curveTo(12.7498f, 15.9103f, 12.4098f, 16.2503f, 11.9998f, 16.2503f)
                curveTo(11.5898f, 16.2503f, 11.2498f, 15.9103f, 11.2498f, 15.5003f)
                verticalLineTo(12.8703f)
                curveTo(10.2398f, 12.5503f, 9.4998f, 11.6103f, 9.4998f, 10.5003f)
                curveTo(9.4998f, 9.1203f, 10.6198f, 8.0003f, 11.9998f, 8.0003f)
                curveTo(13.3798f, 8.0003f, 14.4998f, 9.1203f, 14.4998f, 10.5003f)
                curveTo(14.4998f, 11.6203f, 13.7598f, 12.5503f, 12.7498f, 12.8703f)
                close()
            }
        }
        .build()
        return _securitysafe!!
    }

private var _securitysafe: ImageVector? = null
