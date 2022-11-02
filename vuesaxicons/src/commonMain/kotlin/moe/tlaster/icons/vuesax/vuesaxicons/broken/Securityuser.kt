package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Securityuser: ImageVector
    get() {
        if (_securityuser != null) {
            return _securityuser!!
        }
        _securityuser = Builder(name = "Securityuser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.8699f, 18.0f)
                curveTo(19.8199f, 17.29f, 20.5999f, 15.74f, 20.5999f, 14.56f)
                verticalLineTo(7.13f)
                curveTo(20.5999f, 5.9f, 19.6599f, 4.5399f, 18.5099f, 4.1099f)
                lineTo(13.5199f, 2.2399f)
                curveTo(12.6899f, 1.9299f, 11.3299f, 1.9299f, 10.4999f, 2.2399f)
                lineTo(5.5099f, 4.1099f)
                curveTo(4.3599f, 4.5399f, 3.4199f, 5.9f, 3.4199f, 7.13f)
                verticalLineTo(14.56f)
                curveTo(3.4199f, 15.74f, 4.1999f, 17.29f, 5.1499f, 18.0f)
                lineTo(9.4499f, 21.2099f)
                curveTo(10.8599f, 22.2699f, 13.1799f, 22.2699f, 14.5899f, 21.2099f)
                lineTo(15.3299f, 20.65f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9997f, 10.92f)
                curveTo(11.9597f, 10.92f, 11.9097f, 10.92f, 11.8697f, 10.92f)
                curveTo(10.9297f, 10.89f, 10.1797f, 10.11f, 10.1797f, 9.16f)
                curveTo(10.1797f, 8.19f, 10.9697f, 7.4f, 11.9397f, 7.4f)
                curveTo(12.9097f, 7.4f, 13.6997f, 8.19f, 13.6997f, 9.16f)
                curveTo(13.6897f, 10.12f, 12.9397f, 10.89f, 11.9997f, 10.92f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0091f, 13.7201f)
                curveTo(9.0491f, 14.3601f, 9.0491f, 15.4101f, 10.0091f, 16.0501f)
                curveTo(11.0991f, 16.7801f, 12.8891f, 16.7801f, 13.9791f, 16.0501f)
                curveTo(14.9391f, 15.4101f, 14.9391f, 14.3601f, 13.9791f, 13.7201f)
                curveTo(12.8991f, 12.9901f, 11.1091f, 12.9901f, 10.0091f, 13.7201f)
                close()
            }
        }
        .build()
        return _securityuser!!
    }

private var _securityuser: ImageVector? = null
