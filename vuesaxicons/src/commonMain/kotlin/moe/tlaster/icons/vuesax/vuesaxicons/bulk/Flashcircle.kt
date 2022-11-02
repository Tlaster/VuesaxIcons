package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Flashcircle: ImageVector
    get() {
        if (_flashcircle != null) {
            return _flashcircle!!
        }
        _flashcircle = Builder(name = "Flashcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 22.0f)
                curveTo(17.4936f, 22.0f, 21.9707f, 17.5228f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.4771f, 17.4936f, 2.0f, 11.9707f, 2.0f)
                curveTo(6.4479f, 2.0f, 1.9707f, 6.4771f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.5228f, 6.4479f, 22.0f, 11.9707f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2505f, 11.2999f)
                horizontalLineTo(13.5505f)
                verticalLineTo(7.3399f)
                curveTo(13.5505f, 6.4199f, 13.0505f, 6.2299f, 12.4405f, 6.9199f)
                lineTo(12.0005f, 7.4199f)
                lineTo(8.2804f, 11.6499f)
                curveTo(7.7705f, 12.2299f, 7.9805f, 12.6999f, 8.7505f, 12.6999f)
                horizontalLineTo(10.4505f)
                verticalLineTo(16.6599f)
                curveTo(10.4505f, 17.5799f, 10.9505f, 17.7699f, 11.5605f, 17.0799f)
                lineTo(12.0005f, 16.5799f)
                lineTo(15.7205f, 12.3499f)
                curveTo(16.2305f, 11.7699f, 16.0205f, 11.2999f, 15.2505f, 11.2999f)
                close()
            }
        }
        .build()
        return _flashcircle!!
    }

private var _flashcircle: ImageVector? = null
