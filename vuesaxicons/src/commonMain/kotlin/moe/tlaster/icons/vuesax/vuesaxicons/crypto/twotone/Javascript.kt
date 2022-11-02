package moe.tlaster.icons.vuesax.vuesaxicons.crypto.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.TwotoneGroup

public val TwotoneGroup.Javascript: ImageVector
    get() {
        if (_javascript != null) {
            return _javascript!!
        }
        _javascript = Builder(name = "Javascript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1201f, 2.0f)
                horizontalLineTo(19.8901f)
                curveTo(20.4901f, 2.0f, 20.9501f, 2.52f, 20.8801f, 3.11f)
                lineTo(19.0801f, 19.33f)
                curveTo(19.0401f, 19.73f, 18.7501f, 20.07f, 18.3601f, 20.18f)
                lineTo(12.2801f, 21.92f)
                curveTo(12.1001f, 21.97f, 11.9101f, 21.97f, 11.7301f, 21.92f)
                lineTo(5.6501f, 20.18f)
                curveTo(5.2601f, 20.07f, 4.9801f, 19.73f, 4.9301f, 19.33f)
                lineTo(3.1301f, 3.11f)
                curveTo(3.0601f, 2.52f, 3.5201f, 2.0f, 4.1201f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.62f, 7.0098f)
                verticalLineTo(15.9898f)
                lineTo(7.5f, 15.0898f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5004f, 7.0f)
                lineTo(13.3503f, 7.45f)
                verticalLineTo(12.4f)
                lineTo(16.5004f, 11.95f)
                verticalLineTo(15.1f)
                lineTo(12.9004f, 16.0f)
            }
        }
        .build()
        return _javascript!!
    }

private var _javascript: ImageVector? = null
