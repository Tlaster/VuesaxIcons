package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9983f, 8.3403f)
                verticalLineTo(15.6603f)
                curveTo(21.9983f, 17.1603f, 20.3683f, 18.1003f, 19.0683f, 17.3503f)
                lineTo(15.8983f, 15.5203f)
                lineTo(12.7283f, 13.6903f)
                lineTo(12.2383f, 13.4103f)
                verticalLineTo(10.5903f)
                lineTo(12.7283f, 10.3103f)
                lineTo(15.8983f, 8.4803f)
                lineTo(19.0683f, 6.6503f)
                curveTo(20.3683f, 5.9003f, 21.9983f, 6.8403f, 21.9983f, 8.3403f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2414f, 8.3403f)
                verticalLineTo(15.6603f)
                curveTo(12.2414f, 17.1603f, 10.6114f, 18.1003f, 9.3214f, 17.3503f)
                lineTo(6.1414f, 15.5203f)
                lineTo(2.9714f, 13.6903f)
                curveTo(1.6814f, 12.9403f, 1.6814f, 11.0603f, 2.9714f, 10.3103f)
                lineTo(6.1414f, 8.4803f)
                lineTo(9.3214f, 6.6503f)
                curveTo(10.6114f, 5.9003f, 12.2414f, 6.8403f, 12.2414f, 8.3403f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null
