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

public val TwotoneGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5799f, 11.9999f)
                curveTo(15.5799f, 13.9799f, 13.9799f, 15.5799f, 11.9999f, 15.5799f)
                curveTo(10.0199f, 15.5799f, 8.4199f, 13.9799f, 8.4199f, 11.9999f)
                curveTo(8.4199f, 10.0199f, 10.0199f, 8.4199f, 11.9999f, 8.4199f)
                curveTo(13.9799f, 8.4199f, 15.5799f, 10.0199f, 15.5799f, 11.9999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9998f, 20.2702f)
                curveTo(15.5298f, 20.2702f, 18.8198f, 18.1902f, 21.1098f, 14.5902f)
                curveTo(22.0098f, 13.1802f, 22.0098f, 10.8102f, 21.1098f, 9.4002f)
                curveTo(18.8198f, 5.8002f, 15.5298f, 3.7202f, 11.9998f, 3.7202f)
                curveTo(8.4698f, 3.7202f, 5.1798f, 5.8002f, 2.8898f, 9.4002f)
                curveTo(1.9898f, 10.8102f, 1.9898f, 13.1802f, 2.8898f, 14.5902f)
                curveTo(5.1798f, 18.1902f, 8.4698f, 20.2702f, 11.9998f, 20.2702f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
