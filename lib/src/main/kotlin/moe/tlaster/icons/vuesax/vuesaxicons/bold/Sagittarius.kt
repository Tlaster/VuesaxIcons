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

public val BoldGroup.Sagittarius: ImageVector
    get() {
        if (_sagittarius != null) {
            return _sagittarius!!
        }
        _sagittarius = Builder(name = "Sagittarius", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6895f, 2.71f)
                curveTo(21.6095f, 2.53f, 21.4695f, 2.38f, 21.2795f, 2.3f)
                curveTo(21.1895f, 2.27f, 21.0995f, 2.25f, 20.9995f, 2.25f)
                horizontalLineTo(11.9995f)
                curveTo(11.5895f, 2.25f, 11.2495f, 2.59f, 11.2495f, 3.0f)
                curveTo(11.2495f, 3.41f, 11.5895f, 3.75f, 11.9995f, 3.75f)
                horizontalLineTo(19.1895f)
                lineTo(2.4694f, 20.47f)
                curveTo(2.1795f, 20.76f, 2.1795f, 21.24f, 2.4694f, 21.53f)
                curveTo(2.6195f, 21.68f, 2.8094f, 21.75f, 2.9994f, 21.75f)
                curveTo(3.1895f, 21.75f, 3.3795f, 21.68f, 3.5294f, 21.53f)
                lineTo(20.2495f, 4.81f)
                verticalLineTo(12.0f)
                curveTo(20.2495f, 12.41f, 20.5895f, 12.75f, 20.9995f, 12.75f)
                curveTo(21.4095f, 12.75f, 21.7495f, 12.41f, 21.7495f, 12.0f)
                verticalLineTo(3.0f)
                curveTo(21.7495f, 2.9f, 21.7295f, 2.81f, 21.6895f, 2.71f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3991f, 18.1491f)
                curveTo(17.2091f, 18.1491f, 17.0191f, 18.0791f, 16.8691f, 17.9291f)
                lineTo(6.0691f, 7.1291f)
                curveTo(5.7791f, 6.8391f, 5.7791f, 6.3591f, 6.0691f, 6.0691f)
                curveTo(6.3591f, 5.7791f, 6.8391f, 5.7791f, 7.1291f, 6.0691f)
                lineTo(17.9291f, 16.8691f)
                curveTo(18.2191f, 17.1591f, 18.2191f, 17.6391f, 17.9291f, 17.9291f)
                curveTo(17.7791f, 18.0791f, 17.5891f, 18.1491f, 17.3991f, 18.1491f)
                close()
            }
        }
        .build()
        return _sagittarius!!
    }

private var _sagittarius: ImageVector? = null
