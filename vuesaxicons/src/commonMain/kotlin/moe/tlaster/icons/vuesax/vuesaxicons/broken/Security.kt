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

public val BrokenGroup.Security: ImageVector
    get() {
        if (_security != null) {
            return _security!!
        }
        _security = Builder(name = "Security", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0898f, 6.6099f)
                curveTo(3.0898f, 5.7899f, 3.7099f, 4.8599f, 4.4799f, 4.5499f)
                lineTo(10.0498f, 2.2699f)
                curveTo(11.2998f, 1.76f, 12.7098f, 1.76f, 13.9598f, 2.2699f)
                lineTo(19.5298f, 4.5499f)
                curveTo(20.2898f, 4.8599f, 20.9199f, 5.7899f, 20.9199f, 6.6099f)
                verticalLineTo(10.9999f)
                curveTo(20.9199f, 15.8899f, 17.3698f, 20.4699f, 12.5198f, 21.8099f)
                curveTo(12.1898f, 21.8999f, 11.8298f, 21.8999f, 11.4998f, 21.8099f)
                curveTo(6.6498f, 20.4699f, 3.0998f, 15.8899f, 3.0998f, 10.9999f)
            }
        }
        .build()
        return _security!!
    }

private var _security: ImageVector? = null
