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

public val BoldGroup.Dislike: ImageVector
    get() {
        if (_dislike != null) {
            return _dislike!!
        }
        _dislike = Builder(name = "Dislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.609f, 5.4995f)
                verticalLineTo(15.6595f)
                curveTo(15.609f, 16.0595f, 15.489f, 16.4495f, 15.269f, 16.7795f)
                lineTo(12.539f, 20.8395f)
                curveTo(12.109f, 21.4895f, 11.039f, 21.9495f, 10.129f, 21.6095f)
                curveTo(9.149f, 21.2795f, 8.499f, 20.1795f, 8.709f, 19.1995f)
                lineTo(9.229f, 15.9295f)
                curveTo(9.269f, 15.6295f, 9.189f, 15.3595f, 9.019f, 15.1495f)
                curveTo(8.849f, 14.9595f, 8.599f, 14.8395f, 8.329f, 14.8395f)
                horizontalLineTo(4.219f)
                curveTo(3.429f, 14.8395f, 2.749f, 14.5195f, 2.349f, 13.9595f)
                curveTo(1.969f, 13.4195f, 1.899f, 12.7195f, 2.149f, 12.0095f)
                lineTo(4.609f, 4.5195f)
                curveTo(4.919f, 3.2795f, 6.269f, 2.2695f, 7.609f, 2.2695f)
                horizontalLineTo(11.509f)
                curveTo(12.179f, 2.2695f, 13.119f, 2.4995f, 13.549f, 2.9295f)
                lineTo(14.829f, 3.9195f)
                curveTo(15.319f, 4.2995f, 15.609f, 4.8795f, 15.609f, 5.4995f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7894f, 17.6084f)
                horizontalLineTo(19.8194f)
                curveTo(21.3694f, 17.6084f, 21.9994f, 17.0084f, 21.9994f, 15.5284f)
                verticalLineTo(5.4784f)
                curveTo(21.9994f, 3.9984f, 21.3694f, 3.3984f, 19.8194f, 3.3984f)
                horizontalLineTo(18.7894f)
                curveTo(17.2394f, 3.3984f, 16.6094f, 3.9984f, 16.6094f, 5.4784f)
                verticalLineTo(15.5384f)
                curveTo(16.6094f, 17.0084f, 17.2394f, 17.6084f, 18.7894f, 17.6084f)
                close()
            }
        }
        .build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null
