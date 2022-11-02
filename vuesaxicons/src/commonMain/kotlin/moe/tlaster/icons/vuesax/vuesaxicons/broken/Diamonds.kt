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

public val BrokenGroup.Diamonds: ImageVector
    get() {
        if (_diamonds != null) {
            return _diamonds!!
        }
        _diamonds = Builder(name = "Diamonds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.2105f, 13.2299f)
                curveTo(21.9805f, 12.3799f, 22.2304f, 10.8399f, 21.7604f, 9.7999f)
                lineTo(19.2004f, 4.0399f)
                curveTo(18.7404f, 2.9999f, 17.9904f, 2.1499f, 16.2904f, 2.1499f)
                horizontalLineTo(7.7004f)
                curveTo(6.0004f, 2.1499f, 5.2504f, 2.9999f, 4.7904f, 4.0399f)
                lineTo(2.2304f, 9.7999f)
                curveTo(1.7704f, 10.8399f, 2.0204f, 12.3899f, 2.7904f, 13.2299f)
                lineTo(9.6504f, 20.7699f)
                curveTo(10.9504f, 22.1899f, 13.0704f, 22.1899f, 14.3604f, 20.7699f)
                lineTo(18.3904f, 16.3299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 8.0f)
                horizontalLineTo(20.5f)
            }
        }
        .build()
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
