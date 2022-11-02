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

public val BulkGroup.Tagright: ImageVector
    get() {
        if (_tagright != null) {
            return _tagright!!
        }
        _tagright = Builder(name = "Tagright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8794f, 6.1201f)
                lineTo(3.9294f, 20.0701f)
                curveTo(3.4994f, 20.5001f, 2.7794f, 20.4601f, 2.4294f, 19.9701f)
                curveTo(1.9294f, 19.2801f, 1.8294f, 18.3201f, 2.3494f, 17.4901f)
                lineTo(5.1094f, 13.0601f)
                curveTo(5.4794f, 12.4701f, 5.4794f, 11.5101f, 5.1094f, 10.9201f)
                lineTo(2.3494f, 6.4901f)
                curveTo(1.4194f, 5.0101f, 2.4894f, 3.0901f, 4.2294f, 3.0901f)
                horizontalLineTo(15.6794f)
                curveTo(16.3594f, 3.0901f, 17.1994f, 3.5601f, 17.5594f, 4.1301f)
                lineTo(18.0294f, 4.8701f)
                curveTo(18.2594f, 5.2801f, 18.2094f, 5.7901f, 17.8794f, 6.1201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6299f, 13.11f)
                lineTo(16.4499f, 20.01f)
                curveTo(16.0899f, 20.5f, 15.2899f, 20.9f, 14.6699f, 20.9f)
                horizontalLineTo(7.5099f)
                curveTo(6.6199f, 20.9f, 6.1699f, 19.82f, 6.7999f, 19.19f)
                lineTo(18.3099f, 7.68f)
                curveTo(18.7599f, 7.23f, 19.5299f, 7.31f, 19.8699f, 7.86f)
                lineTo(21.7199f, 10.83f)
                curveTo(22.1299f, 11.47f, 22.0899f, 12.5f, 21.6299f, 13.11f)
                close()
            }
        }
        .build()
        return _tagright!!
    }

private var _tagright: ImageVector? = null
