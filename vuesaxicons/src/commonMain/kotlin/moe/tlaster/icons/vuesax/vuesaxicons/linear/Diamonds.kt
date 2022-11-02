package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Diamonds: ImageVector
    get() {
        if (_diamonds != null) {
            return _diamonds!!
        }
        _diamonds = Builder(name = "Diamonds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.29f, 2.15f)
                horizontalLineTo(7.7f)
                curveTo(5.9999f, 2.15f, 5.2499f, 3.0f, 4.7899f, 4.04f)
                lineTo(2.2299f, 9.8f)
                curveTo(1.77f, 10.84f, 2.0199f, 12.39f, 2.7899f, 13.23f)
                lineTo(9.65f, 20.77f)
                curveTo(10.95f, 22.19f, 13.07f, 22.19f, 14.36f, 20.77f)
                lineTo(21.21f, 13.22f)
                curveTo(21.98f, 12.37f, 22.23f, 10.83f, 21.76f, 9.79f)
                lineTo(19.2f, 4.03f)
                curveTo(18.74f, 3.0f, 17.99f, 2.15f, 16.29f, 2.15f)
                close()
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
