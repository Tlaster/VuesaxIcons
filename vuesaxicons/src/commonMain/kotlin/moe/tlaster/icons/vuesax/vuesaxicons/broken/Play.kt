package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.13f, 7.9799f)
                curveTo(20.96f, 10.1899f, 20.96f, 13.8099f, 17.13f, 16.0199f)
                lineTo(14.04f, 17.7999f)
                lineTo(10.95f, 19.5799f)
                curveTo(7.13f, 21.7899f, 4.0f, 19.9799f, 4.0f, 15.5599f)
                verticalLineTo(11.9999f)
                verticalLineTo(8.4399f)
                curveTo(4.0f, 4.0199f, 7.13f, 2.2099f, 10.96f, 4.4199f)
                lineTo(13.21f, 5.7199f)
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
