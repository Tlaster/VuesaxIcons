package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Wanchain: ImageVector
    get() {
        if (_wanchain != null) {
            return _wanchain!!
        }
        _wanchain = Builder(name = "Wanchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.7f, 3.0f)
                horizontalLineTo(8.9f)
                curveTo(8.5f, 3.0f, 8.2f, 3.4f, 8.4f, 3.8f)
                lineTo(11.5f, 9.0f)
                horizontalLineTo(5.3f)
                curveTo(5.1f, 9.0f, 4.9f, 9.1f, 4.9f, 9.2f)
                lineTo(1.2f, 14.7f)
                curveTo(1.1f, 14.9f, 1.1f, 15.1f, 1.2f, 15.3f)
                lineTo(4.6f, 20.4f)
                curveTo(4.8f, 20.7f, 5.3f, 20.7f, 5.4f, 20.4f)
                lineTo(7.9f, 16.2f)
                curveTo(8.1f, 15.9f, 8.5f, 15.9f, 8.7f, 16.2f)
                lineTo(11.8f, 20.9f)
                curveTo(11.9f, 21.0f, 12.0f, 21.1f, 12.2f, 21.1f)
                horizontalLineTo(18.7f)
                curveTo(18.9f, 21.1f, 19.0f, 21.0f, 19.1f, 20.9f)
                lineTo(22.8f, 15.4f)
                curveTo(22.9f, 15.2f, 22.9f, 15.0f, 22.8f, 14.9f)
                lineTo(16.1f, 3.2f)
                curveTo(16.1f, 3.1f, 15.9f, 3.0f, 15.7f, 3.0f)
                close()
                moveTo(8.5f, 15.0f)
                lineTo(11.7f, 9.4f)
                lineTo(14.5f, 14.2f)
                curveTo(14.7f, 14.5f, 14.5f, 15.0f, 14.1f, 15.0f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _wanchain!!
    }

private var _wanchain: ImageVector? = null
