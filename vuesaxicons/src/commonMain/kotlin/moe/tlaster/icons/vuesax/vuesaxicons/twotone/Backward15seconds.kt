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

public val TwotoneGroup.Backward15seconds: ImageVector
    get() {
        if (_backward15seconds != null) {
            return _backward15seconds!!
        }
        _backward15seconds = Builder(name = "Backward15seconds", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9606f, 10.8301f)
                horizontalLineTo(12.9006f)
                lineTo(12.1406f, 13.1201f)
                horizontalLineTo(14.4306f)
                curveTo(15.2706f, 13.1201f, 15.9606f, 13.8001f, 15.9606f, 14.6501f)
                curveTo(15.9606f, 15.4901f, 15.2806f, 16.1801f, 14.4306f, 16.1801f)
                horizontalLineTo(12.1406f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5391f, 16.17f)
                verticalLineTo(10.8301f)
                lineTo(8.0391f, 12.5001f)
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
        return _backward15seconds!!
    }

private var _backward15seconds: ImageVector? = null
