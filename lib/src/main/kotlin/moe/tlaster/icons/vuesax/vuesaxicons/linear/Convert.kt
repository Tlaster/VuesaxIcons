package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Convert: ImageVector
    get() {
        if (_convert != null) {
            return _convert!!
        }
        _convert = Builder(name = "Convert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0051f, 21.9843f)
                curveTo(17.5165f, 21.9843f, 21.9843f, 17.5165f, 21.9843f, 12.0051f)
                curveTo(21.9843f, 6.4937f, 17.5165f, 2.0259f, 12.0051f, 2.0259f)
                curveTo(6.4937f, 2.0259f, 2.0259f, 6.4937f, 2.0259f, 12.0051f)
                curveTo(2.0259f, 17.5165f, 6.4937f, 21.9843f, 12.0051f, 21.9843f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.1372f, 4.0217f)
                lineTo(14.3002f, 12.2047f)
                lineTo(14.3202f, 7.6641f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8629f, 19.9784f)
                lineTo(9.6999f, 11.8054f)
                lineTo(9.6799f, 16.336f)
            }
        }
        .build()
        return _convert!!
    }

private var _convert: ImageVector? = null
