package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Securitysafe: ImageVector
    get() {
        if (_securitysafe != null) {
            return _securitysafe!!
        }
        _securitysafe = Builder(name = "Securitysafe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9099f, 11.12f)
                curveTo(20.9099f, 16.01f, 17.3599f, 20.59f, 12.5099f, 21.93f)
                curveTo(12.1799f, 22.02f, 11.8198f, 22.02f, 11.4898f, 21.93f)
                curveTo(6.6398f, 20.59f, 3.0898f, 16.01f, 3.0898f, 11.12f)
                verticalLineTo(6.7301f)
                curveTo(3.0898f, 5.9101f, 3.7099f, 4.9801f, 4.4799f, 4.6701f)
                lineTo(10.0498f, 2.3901f)
                curveTo(11.2998f, 1.8801f, 12.7098f, 1.8801f, 13.9598f, 2.3901f)
                lineTo(19.5298f, 4.6701f)
                curveTo(20.2898f, 4.9801f, 20.9199f, 5.9101f, 20.9199f, 6.7301f)
                lineTo(20.9099f, 11.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 10.5f)
                curveTo(14.5f, 9.12f, 13.38f, 8.0f, 12.0f, 8.0f)
                curveTo(10.62f, 8.0f, 9.5f, 9.12f, 9.5f, 10.5f)
                curveTo(9.5f, 11.62f, 10.24f, 12.55f, 11.25f, 12.87f)
                verticalLineTo(15.5f)
                curveTo(11.25f, 15.91f, 11.59f, 16.25f, 12.0f, 16.25f)
                curveTo(12.41f, 16.25f, 12.75f, 15.91f, 12.75f, 15.5f)
                verticalLineTo(12.87f)
                curveTo(13.76f, 12.55f, 14.5f, 11.62f, 14.5f, 10.5f)
                close()
            }
        }
        .build()
        return _securitysafe!!
    }

private var _securitysafe: ImageVector? = null
