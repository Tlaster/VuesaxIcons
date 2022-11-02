package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Tag2: ImageVector
    get() {
        if (_tag2 != null) {
            return _tag2!!
        }
        _tag2 = Builder(name = "Tag2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.4048f, 15.5264f)
                lineTo(8.9348f, 20.0564f)
                curveTo(10.7948f, 21.9164f, 13.8148f, 21.9164f, 15.6848f, 20.0564f)
                lineTo(20.0748f, 15.6664f)
                curveTo(21.9348f, 13.8064f, 21.9348f, 10.7864f, 20.0748f, 8.9164f)
                lineTo(15.5348f, 4.3964f)
                curveTo(14.5848f, 3.4464f, 13.2748f, 2.9364f, 11.9348f, 3.0064f)
                lineTo(6.9348f, 3.2464f)
                curveTo(4.9348f, 3.3364f, 3.3448f, 4.9264f, 3.2448f, 6.9164f)
                lineTo(3.0048f, 11.9164f)
                curveTo(2.9448f, 13.2664f, 3.4548f, 14.5764f, 4.4048f, 15.5264f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.7344f, 12.2266f)
                curveTo(11.1151f, 12.2266f, 12.2344f, 11.1073f, 12.2344f, 9.7266f)
                curveTo(12.2344f, 8.3458f, 11.1151f, 7.2266f, 9.7344f, 7.2266f)
                curveTo(8.3537f, 7.2266f, 7.2344f, 8.3458f, 7.2344f, 9.7266f)
                curveTo(7.2344f, 11.1073f, 8.3537f, 12.2266f, 9.7344f, 12.2266f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2344f, 17.2266f)
                lineTo(17.2344f, 13.2266f)
            }
        }
        .build()
        return _tag2!!
    }

private var _tag2: ImageVector? = null
