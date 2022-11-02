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

public val TwotoneGroup.Forward10seconds: ImageVector
    get() {
        if (_forward10seconds != null) {
            return _forward10seconds!!
        }
        _forward10seconds = Builder(name = "Forward10seconds", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.98f, 4.47f)
                lineTo(12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0894f, 7.7997f)
                curveTo(20.1994f, 9.2797f, 20.8894f, 11.1097f, 20.8894f, 13.1097f)
                curveTo(20.8894f, 18.0197f, 16.9094f, 21.9998f, 11.9994f, 21.9998f)
                curveTo(7.0894f, 21.9998f, 3.1094f, 18.0197f, 3.1094f, 13.1097f)
                curveTo(3.1094f, 8.1997f, 7.0894f, 4.2197f, 11.9994f, 4.2197f)
                curveTo(12.6794f, 4.2197f, 13.3394f, 4.3098f, 13.9794f, 4.4598f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5391f, 15.92f)
                verticalLineTo(10.5801f)
                lineTo(8.0391f, 12.2501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.5801f)
                curveTo(15.1f, 10.5801f, 16.0f, 11.4801f, 16.0f, 12.5801f)
                verticalLineTo(13.9301f)
                curveTo(16.0f, 15.0301f, 15.1f, 15.9301f, 14.0f, 15.9301f)
                curveTo(12.9f, 15.9301f, 12.0f, 15.0301f, 12.0f, 13.9301f)
                verticalLineTo(12.5801f)
                curveTo(12.0f, 11.4701f, 12.9f, 10.5801f, 14.0f, 10.5801f)
                close()
            }
        }
        .build()
        return _forward10seconds!!
    }

private var _forward10seconds: ImageVector? = null
