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

public val TwotoneGroup.Convert: ImageVector
    get() {
        if (_convert != null) {
            return _convert!!
        }
        _convert = Builder(name = "Convert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0046f, 21.9843f)
                curveTo(17.516f, 21.9843f, 21.9838f, 17.5165f, 21.9838f, 12.0051f)
                curveTo(21.9838f, 6.4937f, 17.516f, 2.0259f, 12.0046f, 2.0259f)
                curveTo(6.4932f, 2.0259f, 2.0254f, 6.4937f, 2.0254f, 12.0051f)
                curveTo(2.0254f, 17.5165f, 6.4932f, 21.9843f, 12.0046f, 21.9843f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1367f, 4.0215f)
                lineTo(14.2997f, 12.2044f)
                lineTo(14.3197f, 7.6639f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8626f, 19.9786f)
                lineTo(9.6996f, 11.8057f)
                lineTo(9.6797f, 16.3362f)
            }
        }
        .build()
        return _convert!!
    }

private var _convert: ImageVector? = null
