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

public val BoldGroup.Medal: ImageVector
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
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.79f, 15.6091f)
                curveTo(16.12f, 15.4391f, 16.5f, 15.6891f, 16.5f, 16.0591f)
                verticalLineTo(20.9091f)
                curveTo(16.5f, 21.8091f, 15.87f, 22.2491f, 15.09f, 21.8791f)
                lineTo(12.41f, 20.6091f)
                curveTo(12.18f, 20.5091f, 11.82f, 20.5091f, 11.59f, 20.6091f)
                lineTo(8.91f, 21.8791f)
                curveTo(8.13f, 22.2391f, 7.5f, 21.7991f, 7.5f, 20.8991f)
                lineTo(7.52f, 16.0591f)
                curveTo(7.52f, 15.6891f, 7.91f, 15.4491f, 8.23f, 15.6091f)
                curveTo(9.36f, 16.1791f, 10.64f, 16.4991f, 12.0f, 16.4991f)
                curveTo(13.36f, 16.4991f, 14.65f, 16.1791f, 15.79f, 15.6091f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
