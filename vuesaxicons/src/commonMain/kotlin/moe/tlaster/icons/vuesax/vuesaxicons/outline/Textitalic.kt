package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Textitalic: ImageVector
    get() {
        if (_textitalic != null) {
            return _textitalic!!
        }
        _textitalic = Builder(name = "Textitalic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8809f, 3.75f)
                horizontalLineTo(9.6209f)
                curveTo(9.2109f, 3.75f, 8.8809f, 3.41f, 8.8809f, 3.0f)
                curveTo(8.8809f, 2.59f, 9.2209f, 2.25f, 9.6309f, 2.25f)
                horizontalLineTo(18.8809f)
                curveTo(19.2909f, 2.25f, 19.6309f, 2.59f, 19.6309f, 3.0f)
                curveTo(19.6309f, 3.41f, 19.2909f, 3.75f, 18.8809f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3791f, 21.75f)
                horizontalLineTo(5.1191f)
                curveTo(4.7091f, 21.75f, 4.3691f, 21.41f, 4.3691f, 21.0f)
                curveTo(4.3691f, 20.59f, 4.7091f, 20.25f, 5.1191f, 20.25f)
                horizontalLineTo(14.3691f)
                curveTo(14.7791f, 20.25f, 15.1191f, 20.59f, 15.1191f, 21.0f)
                curveTo(15.1191f, 21.41f, 14.7891f, 21.75f, 14.3791f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7501f, 21.7501f)
                curveTo(9.6901f, 21.7501f, 9.6301f, 21.7401f, 9.5701f, 21.7301f)
                curveTo(9.1701f, 21.6301f, 8.9201f, 21.2201f, 9.0201f, 20.8201f)
                lineTo(13.5201f, 2.8201f)
                curveTo(13.6201f, 2.4201f, 14.0201f, 2.1701f, 14.4301f, 2.2701f)
                curveTo(14.8301f, 2.3701f, 15.0801f, 2.7801f, 14.9801f, 3.1801f)
                lineTo(10.4801f, 21.1801f)
                curveTo(10.3901f, 21.5201f, 10.0901f, 21.7501f, 9.7501f, 21.7501f)
                close()
            }
        }
        .build()
        return _textitalic!!
    }

private var _textitalic: ImageVector? = null
