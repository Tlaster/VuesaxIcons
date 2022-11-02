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

public val TwotoneGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1699f, 7.4399f)
                lineTo(11.9999f, 12.5499f)
                lineTo(20.7699f, 7.4699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9306f, 2.48f)
                lineTo(4.5906f, 5.45f)
                curveTo(3.3806f, 6.12f, 2.3906f, 7.8f, 2.3906f, 9.18f)
                verticalLineTo(14.83f)
                curveTo(2.3906f, 16.21f, 3.3806f, 17.89f, 4.5906f, 18.56f)
                lineTo(9.9306f, 21.53f)
                curveTo(11.0706f, 22.16f, 12.9406f, 22.16f, 14.0806f, 21.53f)
                lineTo(19.4206f, 18.56f)
                curveTo(20.6306f, 17.89f, 21.6206f, 16.21f, 21.6206f, 14.83f)
                verticalLineTo(9.18f)
                curveTo(21.6206f, 7.8f, 20.6306f, 6.12f, 19.4206f, 5.45f)
                lineTo(14.0806f, 2.48f)
                curveTo(12.9306f, 1.84f, 11.0706f, 1.84f, 9.9306f, 2.48f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9998f, 13.2401f)
                verticalLineTo(9.5801f)
                lineTo(7.5098f, 4.1001f)
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
