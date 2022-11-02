package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Flashcircle1: ImageVector
    get() {
        if (_flashcircle1 != null) {
            return _flashcircle1!!
        }
        _flashcircle1 = Builder(name = "Flashcircle1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9707f, 2.0f)
                curveTo(6.4507f, 2.0f, 1.9707f, 6.48f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.52f, 6.4507f, 22.0f, 11.9707f, 22.0f)
                curveTo(17.4907f, 22.0f, 21.9707f, 17.52f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.48f, 17.5007f, 2.0f, 11.9707f, 2.0f)
                close()
                moveTo(15.7207f, 12.35f)
                lineTo(12.0007f, 16.58f)
                lineTo(11.5607f, 17.08f)
                curveTo(10.9507f, 17.77f, 10.4507f, 17.59f, 10.4507f, 16.66f)
                verticalLineTo(12.7f)
                horizontalLineTo(8.7507f)
                curveTo(7.9807f, 12.7f, 7.7707f, 12.23f, 8.2807f, 11.65f)
                lineTo(12.0007f, 7.42f)
                lineTo(12.4407f, 6.92f)
                curveTo(13.0507f, 6.23f, 13.5507f, 6.41f, 13.5507f, 7.34f)
                verticalLineTo(11.3f)
                horizontalLineTo(15.2507f)
                curveTo(16.0207f, 11.3f, 16.2307f, 11.77f, 15.7207f, 12.35f)
                close()
            }
        }
        .build()
        return _flashcircle1!!
    }

private var _flashcircle1: ImageVector? = null
