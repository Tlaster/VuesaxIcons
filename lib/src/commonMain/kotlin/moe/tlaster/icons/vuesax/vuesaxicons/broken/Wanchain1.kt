package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Wanchain1: ImageVector
    get() {
        if (_wanchain1 != null) {
            return _wanchain1!!
        }
        _wanchain1 = Builder(name = "Wanchain1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.7702f, 4.32f)
                lineTo(16.1402f, 3.25f)
                curveTo(16.0502f, 3.1f, 15.8902f, 3.0f, 15.7102f, 3.0f)
                horizontalLineTo(8.8702f)
                curveTo(8.4802f, 3.0f, 8.2402f, 3.42f, 8.4402f, 3.75f)
                lineTo(11.5002f, 9.0f)
                horizontalLineTo(5.2702f)
                curveTo(5.1002f, 9.0f, 4.9502f, 9.08f, 4.8502f, 9.22f)
                lineTo(1.1802f, 14.72f)
                curveTo(1.0702f, 14.89f, 1.0702f, 15.11f, 1.1802f, 15.27f)
                lineTo(4.5501f, 20.33f)
                curveTo(4.7601f, 20.64f, 5.2102f, 20.62f, 5.4002f, 20.3f)
                lineTo(7.8601f, 16.08f)
                curveTo(8.0501f, 15.76f, 8.5002f, 15.75f, 8.7102f, 16.05f)
                lineTo(11.8502f, 20.76f)
                curveTo(11.9402f, 20.9f, 12.1002f, 20.98f, 12.2702f, 20.98f)
                horizontalLineTo(18.7302f)
                curveTo(18.9002f, 20.98f, 19.0502f, 20.9f, 19.1502f, 20.76f)
                lineTo(22.8302f, 15.24f)
                curveTo(22.9402f, 15.08f, 22.9402f, 14.88f, 22.8502f, 14.71f)
                lineTo(19.2702f, 8.57f)
                lineTo(16.7702f, 4.32f)
                close()
                moveTo(8.5002f, 15.0f)
                lineTo(11.7502f, 9.43f)
                lineTo(14.5602f, 14.25f)
                curveTo(14.7502f, 14.58f, 14.5102f, 15.0f, 14.1302f, 15.0f)
                horizontalLineTo(8.5002f)
                close()
            }
        }
        .build()
        return _wanchain1!!
    }

private var _wanchain1: ImageVector? = null
