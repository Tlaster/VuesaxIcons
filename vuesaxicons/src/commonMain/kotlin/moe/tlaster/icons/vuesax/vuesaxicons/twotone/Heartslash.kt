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

public val TwotoneGroup.Heartslash: ImageVector
    get() {
        if (_heartslash != null) {
            return _heartslash!!
        }
        _heartslash = Builder(name = "Heartslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.11f, 17.4998f)
                curveTo(3.9f, 15.4298f, 2.0f, 12.4798f, 2.0f, 8.6798f)
                curveTo(2.0f, 5.5898f, 4.49f, 3.0898f, 7.56f, 3.0898f)
                curveTo(9.38f, 3.0898f, 10.99f, 3.9698f, 12.0f, 5.3298f)
                curveTo(13.01f, 3.9698f, 14.63f, 3.0898f, 16.44f, 3.0898f)
                curveTo(17.59f, 3.0898f, 18.66f, 3.4398f, 19.55f, 4.0498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7395f, 7.0f)
                curveTo(21.9095f, 7.53f, 21.9995f, 8.1f, 21.9995f, 8.69f)
                curveTo(21.9995f, 15.69f, 15.5195f, 19.82f, 12.6195f, 20.82f)
                curveTo(12.2795f, 20.94f, 11.7195f, 20.94f, 11.3795f, 20.82f)
                curveTo(10.7295f, 20.6f, 9.9095f, 20.22f, 9.0195f, 19.69f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _heartslash!!
    }

private var _heartslash: ImageVector? = null
