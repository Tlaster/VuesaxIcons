package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BoldGroup

public val BoldGroup.Xrp: ImageVector
    get() {
        if (_xrp != null) {
            return _xrp!!
        }
        _xrp = Builder(name = "Xrp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4604f, 2.0f)
                horizontalLineTo(4.0504f)
                curveTo(3.1204f, 2.0f, 2.6504f, 3.13f, 3.3104f, 3.79f)
                lineTo(9.0404f, 9.52f)
                curveTo(10.6804f, 11.16f, 13.3304f, 11.16f, 14.9704f, 9.52f)
                lineTo(20.7004f, 3.79f)
                curveTo(21.3604f, 3.13f, 20.8904f, 2.0f, 19.9604f, 2.0f)
                horizontalLineTo(18.5504f)
                curveTo(17.7204f, 2.0f, 16.9204f, 2.33f, 16.3304f, 2.92f)
                lineTo(12.7504f, 6.5f)
                curveTo(12.3404f, 6.91f, 11.6804f, 6.91f, 11.2704f, 6.5f)
                lineTo(7.6904f, 2.92f)
                curveTo(7.0904f, 2.33f, 6.2904f, 2.0f, 5.4604f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4604f, 21.9687f)
                horizontalLineTo(4.0504f)
                curveTo(3.1204f, 21.9687f, 2.6504f, 20.8388f, 3.3104f, 20.1788f)
                lineTo(9.0404f, 14.4488f)
                curveTo(10.6804f, 12.8088f, 13.3304f, 12.8088f, 14.9704f, 14.4488f)
                lineTo(20.7004f, 20.1788f)
                curveTo(21.3604f, 20.8388f, 20.8904f, 21.9687f, 19.9604f, 21.9687f)
                horizontalLineTo(18.5504f)
                curveTo(17.7204f, 21.9687f, 16.9204f, 21.6387f, 16.3304f, 21.0487f)
                lineTo(12.7504f, 17.4687f)
                curveTo(12.3404f, 17.0587f, 11.6804f, 17.0587f, 11.2704f, 17.4687f)
                lineTo(7.6904f, 21.0487f)
                curveTo(7.0904f, 21.6387f, 6.2904f, 21.9687f, 5.4604f, 21.9687f)
                close()
            }
        }
        .build()
        return _xrp!!
    }

private var _xrp: ImageVector? = null
