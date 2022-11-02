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

public val TwotoneGroup.Simcard: ImageVector
    get() {
        if (_simcard != null) {
            return _simcard!!
        }
        _simcard = Builder(name = "Simcard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.54f, 6.5397f)
                lineTo(16.47f, 3.4697f)
                curveTo(15.53f, 2.5297f, 14.26f, 2.0098f, 12.93f, 2.0098f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 2.0098f, 3.0f, 4.0098f, 3.0f, 7.0098f)
                verticalLineTo(17.0098f)
                curveTo(3.0f, 20.0098f, 5.0f, 22.0098f, 8.0f, 22.0098f)
                horizontalLineTo(16.0f)
                curveTo(19.0f, 22.0098f, 21.0f, 20.0098f, 21.0f, 17.0098f)
                verticalLineTo(10.0798f)
                curveTo(21.0f, 8.7398f, 20.47f, 7.4697f, 19.54f, 6.5397f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 14.0f)
                lineTo(7.5f, 16.0f)
                lineTo(9.5f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 14.0f)
                lineTo(16.5f, 16.0f)
                lineTo(14.5f, 18.0f)
            }
        }
        .build()
        return _simcard!!
    }

private var _simcard: ImageVector? = null
