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

public val BoldGroup.Huobitoken: ImageVector
    get() {
        if (_huobitoken != null) {
            return _huobitoken!!
        }
        _huobitoken = Builder(name = "Huobitoken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1594f, 10.0f)
                curveTo(16.1594f, 10.0f, 16.0094f, 11.0f, 12.9094f, 15.0f)
                curveTo(9.9994f, 18.77f, 14.2095f, 21.64f, 14.7095f, 21.97f)
                curveTo(14.7395f, 21.99f, 14.7694f, 21.99f, 14.8094f, 21.97f)
                curveTo(15.4894f, 21.55f, 23.0594f, 16.68f, 16.1594f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7598f, 7.7901f)
                curveTo(13.7598f, 5.4901f, 12.8598f, 3.3901f, 11.9598f, 2.1901f)
                curveTo(11.6598f, 1.8901f, 11.1598f, 1.9901f, 11.0598f, 2.3901f)
                curveTo(10.6598f, 3.8901f, 9.4598f, 7.0901f, 6.5598f, 10.8901f)
                curveTo(2.8598f, 15.6901f, 6.2598f, 20.8901f, 9.7598f, 21.8901f)
                curveTo(11.6598f, 22.3901f, 9.2598f, 20.8901f, 8.9598f, 17.7901f)
                curveTo(8.6598f, 13.8901f, 13.7598f, 10.9901f, 13.7598f, 7.7901f)
                close()
            }
        }
        .build()
        return _huobitoken!!
    }

private var _huobitoken: ImageVector? = null
