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

public val TwotoneGroup.Box1: ImageVector
    get() {
        if (_box1 != null) {
            return _box1!!
        }
        _box1 = Builder(name = "Box1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1699f, 7.4404f)
                lineTo(11.9999f, 12.5504f)
                lineTo(20.7699f, 7.4704f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.9306f, 2.4798f)
                lineTo(4.5906f, 5.4398f)
                curveTo(3.3806f, 6.1098f, 2.3906f, 7.7898f, 2.3906f, 9.1698f)
                verticalLineTo(14.8198f)
                curveTo(2.3906f, 16.1998f, 3.3806f, 17.8798f, 4.5906f, 18.5498f)
                lineTo(9.9306f, 21.5198f)
                curveTo(11.0706f, 22.1498f, 12.9406f, 22.1498f, 14.0806f, 21.5198f)
                lineTo(19.4206f, 18.5498f)
                curveTo(20.6306f, 17.8798f, 21.6206f, 16.1998f, 21.6206f, 14.8198f)
                verticalLineTo(9.1698f)
                curveTo(21.6206f, 7.7898f, 20.6306f, 6.1098f, 19.4206f, 5.4398f)
                lineTo(14.0806f, 2.4698f)
                curveTo(12.9306f, 1.8398f, 11.0706f, 1.8398f, 9.9306f, 2.4798f)
                close()
            }
        }
        .build()
        return _box1!!
    }

private var _box1: ImageVector? = null
