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

public val BoldGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5885f, 7.41f)
                lineTo(6.3085f, 17.69f)
                curveTo(5.8285f, 18.17f, 5.0085f, 18.06f, 4.7185f, 17.45f)
                curveTo(4.1985f, 16.38f, 3.8985f, 15.17f, 3.8985f, 13.9f)
                curveTo(3.8785f, 8.38f, 9.4785f, 3.66f, 11.3785f, 2.21f)
                curveTo(11.7485f, 1.93f, 12.2485f, 1.93f, 12.6085f, 2.21f)
                curveTo(13.4785f, 2.87f, 15.1085f, 4.24f, 16.6385f, 6.04f)
                curveTo(16.9785f, 6.44f, 16.9585f, 7.04f, 16.5885f, 7.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1f, 13.9103f)
                curveTo(20.1f, 18.3703f, 16.47f, 22.0003f, 12.0f, 22.0003f)
                curveTo(10.21f, 22.0003f, 8.54f, 21.4203f, 7.19f, 20.4203f)
                curveTo(6.7f, 20.0603f, 6.66f, 19.3403f, 7.09f, 18.9103f)
                lineTo(17.16f, 8.8403f)
                curveTo(17.63f, 8.3703f, 18.42f, 8.4703f, 18.74f, 9.0503f)
                curveTo(19.56f, 10.5603f, 20.11f, 12.2003f, 20.1f, 13.9103f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
