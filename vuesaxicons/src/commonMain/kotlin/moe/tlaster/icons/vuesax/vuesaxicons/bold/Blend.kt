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

public val BoldGroup.Blend: ImageVector
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
                curveTo(15.2262f, 18.0f, 14.51f, 17.8643f, 13.8518f, 17.6141f)
                curveTo(13.5331f, 17.4929f, 13.4737f, 17.0851f, 13.6955f, 16.8262f)
                curveTo(14.8375f, 15.4938f, 15.4707f, 13.786f, 15.4707f, 12.0f)
                curveTo(15.4707f, 10.2082f, 14.8319f, 8.4943f, 13.6986f, 7.1747f)
                curveTo(13.4759f, 6.9154f, 13.5349f, 6.5062f, 13.8544f, 6.3849f)
                curveTo(14.5118f, 6.1354f, 15.2272f, 6.0f, 15.9707f, 6.0f)
                curveTo(19.2807f, 6.0f, 21.9707f, 8.69f, 21.9707f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
