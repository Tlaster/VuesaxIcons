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

public val BrokenGroup.Buycrypto: ImageVector
    get() {
        if (_buycrypto != null) {
            return _buycrypto!!
        }
        _buycrypto = Builder(name = "Buycrypto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                curveTo(22.0f, 12.09f, 19.09f, 15.0f, 15.5f, 15.0f)
                curveTo(15.33f, 15.0f, 15.15f, 14.99f, 14.98f, 14.98f)
                curveTo(14.73f, 11.81f, 12.19f, 9.27f, 9.02f, 9.02f)
                curveTo(9.01f, 8.85f, 9.0f, 8.67f, 9.0f, 8.5f)
                curveTo(9.0f, 4.91f, 11.91f, 2.0f, 15.5f, 2.0f)
                curveTo(19.09f, 2.0f, 22.0f, 4.91f, 22.0f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.68f, 20.76f)
                curveTo(3.06f, 19.58f, 2.0f, 17.66f, 2.0f, 15.5f)
                curveTo(2.0f, 11.91f, 4.91f, 9.0f, 8.5f, 9.0f)
                curveTo(8.67f, 9.0f, 8.85f, 9.01f, 9.02f, 9.02f)
                curveTo(12.19f, 9.27f, 14.73f, 11.81f, 14.98f, 14.98f)
                curveTo(14.99f, 15.15f, 15.0f, 15.33f, 15.0f, 15.5f)
                curveTo(15.0f, 19.09f, 12.09f, 22.0f, 8.5f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.62f, 14.62f)
                lineTo(8.5f, 13.0f)
                lineTo(9.38f, 14.62f)
                lineTo(11.0f, 15.5f)
                lineTo(9.38f, 16.38f)
                lineTo(8.5f, 18.0f)
                lineTo(7.62f, 16.38f)
                lineTo(6.0f, 15.5f)
                lineTo(7.62f, 14.62f)
                close()
            }
        }
        .build()
        return _buycrypto!!
    }

private var _buycrypto: ImageVector? = null
