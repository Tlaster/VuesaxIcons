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

public val TwotoneGroup.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0291f, 10.7702f)
                lineTo(20.6891f, 6.9802f)
                curveTo(21.2591f, 6.6002f, 21.4091f, 5.8202f, 21.0291f, 5.2602f)
                lineTo(19.2091f, 2.5502f)
                curveTo(18.8291f, 1.9802f, 18.0491f, 1.8302f, 17.4891f, 2.2102f)
                lineTo(11.8291f, 6.0002f)
                lineTo(15.0291f, 10.7702f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1732f, 6.4793f)
                lineTo(7.3955f, 9.6792f)
                lineTo(9.9554f, 13.5013f)
                lineTo(14.7331f, 10.3015f)
                lineTo(12.1732f, 6.4793f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8295f, 15.9004f)
                lineTo(9.7795f, 13.2604f)
                lineTo(7.5395f, 9.9204f)
                lineTo(3.5896f, 12.5604f)
                curveTo(3.1295f, 12.8704f, 3.0096f, 13.4904f, 3.3196f, 13.9504f)
                lineTo(4.4496f, 15.6304f)
                curveTo(4.7495f, 16.0804f, 5.3696f, 16.2004f, 5.8295f, 15.9004f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0496f, 12.2002f)
                lineTo(7.5596f, 22.0002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.2002f)
                lineTo(16.44f, 22.0002f)
            }
        }
        .build()
        return _microscope!!
    }

private var _microscope: ImageVector? = null
