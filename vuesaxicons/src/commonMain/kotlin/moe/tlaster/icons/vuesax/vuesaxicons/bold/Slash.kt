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

public val BoldGroup.Slash: ImageVector
    get() {
        if (_slash != null) {
            return _slash!!
        }
        _slash = Builder(name = "Slash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.53f, 5.53f)
                lineTo(5.53f, 19.53f)
                curveTo(5.51f, 19.55f, 5.5f, 19.56f, 5.48f, 19.57f)
                curveTo(5.1f, 19.25f, 4.75f, 18.9f, 4.43f, 18.52f)
                curveTo(2.91f, 16.77f, 2.0f, 14.49f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(14.49f, 2.0f, 16.77f, 2.91f, 18.52f, 4.43f)
                curveTo(18.9f, 4.75f, 19.25f, 5.1f, 19.57f, 5.48f)
                curveTo(19.56f, 5.5f, 19.55f, 5.51f, 19.53f, 5.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0008f, 12.0008f)
                curveTo(22.0008f, 17.4908f, 17.4908f, 22.0008f, 12.0008f, 22.0008f)
                curveTo(10.5008f, 22.0008f, 9.0808f, 21.6708f, 7.8008f, 21.0708f)
                curveTo(7.1808f, 20.7808f, 7.0608f, 19.9508f, 7.5408f, 19.4608f)
                lineTo(19.4608f, 7.5408f)
                curveTo(19.9408f, 7.0608f, 20.7808f, 7.1808f, 21.0708f, 7.8008f)
                curveTo(21.6708f, 9.0708f, 22.0008f, 10.5008f, 22.0008f, 12.0008f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7709f, 2.2289f)
                curveTo(21.4709f, 1.9289f, 20.9809f, 1.9289f, 20.6809f, 2.2289f)
                lineTo(2.2309f, 20.6889f)
                curveTo(1.9309f, 20.9889f, 1.9309f, 21.4789f, 2.2309f, 21.7789f)
                curveTo(2.3809f, 21.9189f, 2.5709f, 21.9989f, 2.7709f, 21.9989f)
                curveTo(2.9709f, 21.9989f, 3.1609f, 21.9189f, 3.3109f, 21.7689f)
                lineTo(21.7709f, 3.3089f)
                curveTo(22.0809f, 3.0089f, 22.0809f, 2.5289f, 21.7709f, 2.2289f)
                close()
            }
        }
        .build()
        return _slash!!
    }

private var _slash: ImageVector? = null
