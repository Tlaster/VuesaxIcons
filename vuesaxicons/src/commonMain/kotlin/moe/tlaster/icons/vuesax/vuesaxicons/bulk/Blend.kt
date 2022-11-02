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

public val BulkGroup.Blend: ImageVector
    get() {
        if (_blend != null) {
            return _blend!!
        }
        _blend = Builder(name = "Blend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9707f, 12.0f)
                curveTo(21.9707f, 15.31f, 19.2807f, 18.0f, 15.9707f, 18.0f)
                curveTo(14.4307f, 18.0f, 13.0307f, 17.42f, 11.9707f, 16.46f)
                curveTo(13.2007f, 15.37f, 13.9707f, 13.77f, 13.9707f, 12.0f)
                curveTo(13.9707f, 10.23f, 13.2007f, 8.63f, 11.9707f, 7.54f)
                curveTo(13.0307f, 6.58f, 14.4307f, 6.0f, 15.9707f, 6.0f)
                curveTo(19.2807f, 6.0f, 21.9707f, 8.69f, 21.9707f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9707f, 12.0f)
                curveTo(13.9707f, 13.77f, 13.2007f, 15.37f, 11.9707f, 16.46f)
                curveTo(10.9107f, 17.42f, 9.5107f, 18.0f, 7.9707f, 18.0f)
                curveTo(4.6607f, 18.0f, 1.9707f, 15.31f, 1.9707f, 12.0f)
                curveTo(1.9707f, 8.69f, 4.6607f, 6.0f, 7.9707f, 6.0f)
                curveTo(9.5107f, 6.0f, 10.9107f, 6.58f, 11.9707f, 7.54f)
                curveTo(13.2007f, 8.63f, 13.9707f, 10.23f, 13.9707f, 12.0f)
                close()
            }
        }
        .build()
        return _blend!!
    }

private var _blend: ImageVector? = null
