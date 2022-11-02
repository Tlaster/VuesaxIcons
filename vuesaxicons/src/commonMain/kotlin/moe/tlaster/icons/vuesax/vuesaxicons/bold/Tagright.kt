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

public val BoldGroup.Tagright: ImageVector
    get() {
        if (_tagright != null) {
            return _tagright!!
        }
        _tagright = Builder(name = "Tagright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8796f, 6.1216f)
                lineTo(3.9196f, 20.0816f)
                curveTo(3.4896f, 20.5116f, 2.7696f, 20.4716f, 2.4196f, 19.9816f)
                curveTo(1.9196f, 19.2916f, 1.8196f, 18.3316f, 2.3396f, 17.5016f)
                lineTo(5.0996f, 13.0716f)
                curveTo(5.4696f, 12.4816f, 5.4696f, 11.5216f, 5.0996f, 10.9316f)
                lineTo(2.3396f, 6.5016f)
                curveTo(1.4096f, 5.0216f, 2.4796f, 3.1016f, 4.2196f, 3.1016f)
                horizontalLineTo(15.6696f)
                curveTo(16.3496f, 3.1016f, 17.1896f, 3.5716f, 17.5496f, 4.1416f)
                lineTo(18.0196f, 4.8816f)
                curveTo(18.2596f, 5.2816f, 18.2096f, 5.7916f, 17.8796f, 6.1216f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6299f, 13.1119f)
                lineTo(16.4499f, 20.0119f)
                curveTo(16.0899f, 20.5019f, 15.2899f, 20.9019f, 14.6699f, 20.9019f)
                horizontalLineTo(7.5099f)
                curveTo(6.6199f, 20.9019f, 6.1699f, 19.8219f, 6.7999f, 19.1919f)
                lineTo(18.3199f, 7.682f)
                curveTo(18.7699f, 7.2319f, 19.5399f, 7.312f, 19.8799f, 7.8619f)
                lineTo(21.7299f, 10.8319f)
                curveTo(22.1299f, 11.4719f, 22.0899f, 12.5019f, 21.6299f, 13.1119f)
                close()
            }
        }
        .build()
        return _tagright!!
    }

private var _tagright: ImageVector? = null
