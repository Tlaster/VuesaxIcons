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

public val BrokenGroup.Home2: ImageVector
    get() {
        if (_home2 != null) {
            return _home2!!
        }
        _home2 = Builder(name = "Home2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.4999f)
                curveTo(22.0f, 9.2899f, 21.19f, 7.7399f, 20.2f, 7.0499f)
                lineTo(14.02f, 2.7199f)
                curveTo(12.62f, 1.7399f, 10.37f, 1.7899f, 9.02f, 2.8399f)
                lineTo(3.63f, 7.0399f)
                curveTo(2.73f, 7.7399f, 2.0f, 9.2299f, 2.0f, 10.3599f)
                verticalLineTo(17.7699f)
                curveTo(2.0f, 20.0899f, 3.89f, 21.9899f, 6.21f, 21.9899f)
                horizontalLineTo(17.79f)
                curveTo(20.11f, 21.9899f, 22.0f, 20.0899f, 22.0f, 17.7799f)
                verticalLineTo(14.6799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.99f)
                verticalLineTo(14.99f)
            }
        }
        .build()
        return _home2!!
    }

private var _home2: ImageVector? = null
