package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Notificationbing: ImageVector
    get() {
        if (_notificationbing != null) {
            return _notificationbing!!
        }
        _notificationbing = Builder(name = "Notificationbing", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.4399f)
                verticalLineTo(9.7699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0199f, 2.0f)
                curveTo(8.3399f, 2.0f, 5.3599f, 4.98f, 5.3599f, 8.66f)
                verticalLineTo(10.76f)
                curveTo(5.3599f, 11.44f, 5.0799f, 12.46f, 4.7299f, 13.04f)
                lineTo(3.4599f, 15.16f)
                curveTo(2.6799f, 16.47f, 3.2199f, 17.93f, 4.6599f, 18.41f)
                curveTo(9.4399f, 20.0f, 14.6099f, 20.0f, 19.3899f, 18.41f)
                curveTo(20.7399f, 17.96f, 21.3199f, 16.38f, 20.5899f, 15.16f)
                lineTo(19.3199f, 13.04f)
                curveTo(18.9699f, 12.46f, 18.6899f, 11.43f, 18.6899f, 10.76f)
                verticalLineTo(8.66f)
                curveTo(18.6799f, 5.0f, 15.6799f, 2.0f, 12.0199f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.3299f, 18.8198f)
                curveTo(15.3299f, 20.6498f, 13.8299f, 22.1498f, 11.9999f, 22.1498f)
                curveTo(11.0899f, 22.1498f, 10.2499f, 21.7698f, 9.6499f, 21.1698f)
                curveTo(9.0499f, 20.5698f, 8.6699f, 19.7298f, 8.6699f, 18.8198f)
            }
        }
        .build()
        return _notificationbing!!
    }

private var _notificationbing: ImageVector? = null
