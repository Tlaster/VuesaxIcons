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

public val TwotoneGroup.Lampslash: ImageVector
    get() {
        if (_lampslash != null) {
            return _lampslash!!
        }
        _lampslash = Builder(name = "Lampslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0297f, 2.48f)
                lineTo(4.1797f, 18.33f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.2501f, 13.0002f)
                curveTo(4.8301f, 12.0302f, 4.5801f, 10.9802f, 4.5801f, 9.9002f)
                curveTo(4.5801f, 4.9902f, 8.8001f, 1.1202f, 13.6001f, 2.1702f)
                curveTo(15.0601f, 2.4902f, 16.3601f, 3.2702f, 17.3601f, 4.3502f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0602f, 7.2998f)
                curveTo(20.2802f, 11.1798f, 18.3102f, 15.0798f, 15.5202f, 16.8698f)
                verticalLineTo(18.0298f)
                curveTo(15.5202f, 18.3198f, 15.6202f, 18.9898f, 14.6202f, 18.9898f)
                horizontalLineTo(9.4202f)
                curveTo(8.3902f, 18.9898f, 8.5202f, 18.5598f, 8.5202f, 18.0298f)
                verticalLineTo(16.8698f)
                curveTo(8.0402f, 16.5698f, 7.5902f, 16.1998f, 7.1602f, 15.7698f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 22.0002f)
                curveTo(10.79f, 21.3502f, 13.21f, 21.3502f, 15.5f, 22.0002f)
            }
        }
        .build()
        return _lampslash!!
    }

private var _lampslash: ImageVector? = null
