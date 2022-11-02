package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Security: ImageVector
    get() {
        if (_security != null) {
            return _security!!
        }
        _security = Builder(name = "Security", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9099f, 11.1198f)
                curveTo(20.9099f, 16.0098f, 17.3599f, 20.5898f, 12.5099f, 21.9298f)
                curveTo(12.1799f, 22.0198f, 11.8198f, 22.0198f, 11.4898f, 21.9298f)
                curveTo(6.6398f, 20.5898f, 3.0898f, 16.0098f, 3.0898f, 11.1198f)
                verticalLineTo(6.7298f)
                curveTo(3.0898f, 5.9098f, 3.7099f, 4.9798f, 4.4799f, 4.6698f)
                lineTo(10.0498f, 2.3898f)
                curveTo(11.2998f, 1.8798f, 12.7098f, 1.8798f, 13.9598f, 2.3898f)
                lineTo(19.5298f, 4.6698f)
                curveTo(20.2898f, 4.9798f, 20.9199f, 5.9098f, 20.9199f, 6.7298f)
                lineTo(20.9099f, 11.1198f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0399f, 2.3898f)
                curveTo(11.2899f, 1.8798f, 12.6999f, 1.8798f, 13.9499f, 2.3898f)
                lineTo(19.5198f, 4.6698f)
                curveTo(20.2798f, 4.9798f, 20.9099f, 5.9098f, 20.9099f, 6.7298f)
                verticalLineTo(11.1198f)
                curveTo(20.9099f, 16.0098f, 17.3599f, 20.5898f, 12.5099f, 21.9298f)
                curveTo(12.1799f, 22.0198f, 11.8198f, 22.0198f, 11.4898f, 21.9298f)
                curveTo(6.6398f, 20.5898f, 3.0898f, 16.0098f, 3.0898f, 11.1198f)
            }
        }
        .build()
        return _security!!
    }

private var _security: ImageVector? = null
