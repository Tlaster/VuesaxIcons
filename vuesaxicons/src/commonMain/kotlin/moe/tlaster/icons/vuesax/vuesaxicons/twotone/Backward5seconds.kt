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

public val TwotoneGroup.Backward5seconds: ImageVector
    get() {
        if (_backward5seconds != null) {
            return _backward5seconds!!
        }
        _backward5seconds = Builder(name = "Backward5seconds", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9099f, 10.8301f)
                horizontalLineTo(10.8499f)
                lineTo(10.0898f, 13.1201f)
                horizontalLineTo(12.3799f)
                curveTo(13.2199f, 13.1201f, 13.9099f, 13.8001f, 13.9099f, 14.6501f)
                curveTo(13.9099f, 15.4901f, 13.2299f, 16.1801f, 12.3799f, 16.1801f)
                horizontalLineTo(10.0898f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0195f, 4.47f)
                lineTo(11.9995f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9094f, 7.7997f)
                curveTo(3.7994f, 9.2797f, 3.1094f, 11.1097f, 3.1094f, 13.1097f)
                curveTo(3.1094f, 18.0197f, 7.0894f, 21.9998f, 11.9994f, 21.9998f)
                curveTo(16.9094f, 21.9998f, 20.8894f, 18.0197f, 20.8894f, 13.1097f)
                curveTo(20.8894f, 8.1997f, 16.9094f, 4.2197f, 11.9994f, 4.2197f)
                curveTo(11.3194f, 4.2197f, 10.6594f, 4.3098f, 10.0194f, 4.4598f)
            }
        }
        .build()
        return _backward5seconds!!
    }

private var _backward5seconds: ImageVector? = null