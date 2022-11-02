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

public val BulkGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(15.7279f, 15.0f, 18.75f, 12.0899f, 18.75f, 8.5f)
                curveTo(18.75f, 4.9102f, 15.7279f, 2.0f, 12.0f, 2.0f)
                curveTo(8.2721f, 2.0f, 5.25f, 4.9102f, 5.25f, 8.5f)
                curveTo(5.25f, 12.0899f, 8.2721f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5197f, 13.5201f)
                lineTo(7.5098f, 20.9001f)
                curveTo(7.5098f, 21.8001f, 8.1398f, 22.2401f, 8.9198f, 21.8701f)
                lineTo(11.5998f, 20.6001f)
                curveTo(11.8198f, 20.4901f, 12.1898f, 20.4901f, 12.4098f, 20.6001f)
                lineTo(15.0998f, 21.8701f)
                curveTo(15.8698f, 22.2301f, 16.5098f, 21.8001f, 16.5098f, 20.9001f)
                verticalLineTo(13.3401f)
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
