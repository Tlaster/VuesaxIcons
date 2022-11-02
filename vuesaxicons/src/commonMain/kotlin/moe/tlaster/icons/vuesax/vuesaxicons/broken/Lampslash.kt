package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Lampslash: ImageVector
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
                moveTo(13.5996f, 2.1699f)
                curveTo(15.0596f, 2.4899f, 16.3596f, 3.2699f, 17.3596f, 4.3499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.2501f, 12.9998f)
                curveTo(4.8301f, 12.0298f, 4.5801f, 10.9798f, 4.5801f, 9.8998f)
                curveTo(4.5801f, 6.5198f, 6.5701f, 3.6398f, 9.3801f, 2.5098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 22.0f)
                curveTo(10.79f, 21.35f, 13.21f, 21.35f, 15.5f, 22.0f)
            }
        }
        .build()
        return _lampslash!!
    }

private var _lampslash: ImageVector? = null
