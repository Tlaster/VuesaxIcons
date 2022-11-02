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

public val TwotoneGroup.Wind2: ImageVector
    get() {
        if (_wind2 != null) {
            return _wind2!!
        }
        _wind2 = Builder(name = "Wind2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 13.1002f)
                lineTo(4.5f, 11.6002f)
                curveTo(6.04f, 10.6802f, 7.96f, 10.6802f, 9.5f, 11.6002f)
                curveTo(11.04f, 12.5202f, 12.96f, 12.5202f, 14.5f, 11.6002f)
                curveTo(16.04f, 10.6802f, 17.96f, 10.6802f, 19.5f, 11.6002f)
                lineTo(22.0f, 13.1002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.8999f)
                lineTo(4.5f, 5.3999f)
                curveTo(6.04f, 6.3199f, 7.96f, 6.3199f, 9.5f, 5.3999f)
                curveTo(11.04f, 4.4799f, 12.96f, 4.4799f, 14.5f, 5.3999f)
                curveTo(16.04f, 6.3199f, 17.96f, 6.3199f, 19.5f, 5.3999f)
                lineTo(22.0f, 3.8999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.1002f)
                lineTo(4.5f, 18.6002f)
                curveTo(6.04f, 17.6802f, 7.96f, 17.6802f, 9.5f, 18.6002f)
                curveTo(11.04f, 19.5202f, 12.96f, 19.5202f, 14.5f, 18.6002f)
                curveTo(16.04f, 17.6802f, 17.96f, 17.6802f, 19.5f, 18.6002f)
                lineTo(22.0f, 20.1002f)
            }
        }
        .build()
        return _wind2!!
    }

private var _wind2: ImageVector? = null
