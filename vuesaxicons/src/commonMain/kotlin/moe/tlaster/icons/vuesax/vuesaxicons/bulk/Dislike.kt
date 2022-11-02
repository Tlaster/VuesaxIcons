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

public val BulkGroup.Dislike: ImageVector
    get() {
        if (_dislike != null) {
            return _dislike!!
        }
        _dislike = Builder(name = "Dislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.349f, 13.96f)
                curveTo(2.739f, 14.52f, 3.429f, 14.84f, 4.219f, 14.84f)
                horizontalLineTo(8.319f)
                curveTo(8.589f, 14.84f, 8.839f, 14.95f, 9.009f, 15.15f)
                curveTo(9.189f, 15.35f, 9.259f, 15.63f, 9.219f, 15.92f)
                lineTo(8.709f, 19.2f)
                curveTo(8.489f, 20.18f, 9.139f, 21.28f, 10.119f, 21.61f)
                curveTo(11.029f, 21.95f, 12.099f, 21.49f, 12.529f, 20.84f)
                lineTo(16.739f, 14.57f)
                lineTo(16.859f, 14.37f)
                verticalLineTo(5.53f)
                lineTo(16.709f, 5.38f)
                lineTo(13.539f, 2.93f)
                curveTo(13.119f, 2.51f, 12.169f, 2.28f, 11.499f, 2.28f)
                horizontalLineTo(7.599f)
                curveTo(6.259f, 2.28f, 4.909f, 3.29f, 4.609f, 4.52f)
                lineTo(2.149f, 12.01f)
                curveTo(1.899f, 12.72f, 1.969f, 13.42f, 2.349f, 13.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7894f, 17.6099f)
                horizontalLineTo(19.8194f)
                curveTo(21.3694f, 17.6099f, 21.9994f, 17.0099f, 21.9994f, 15.5299f)
                verticalLineTo(5.4799f)
                curveTo(21.9994f, 3.9999f, 21.3694f, 3.3999f, 19.8194f, 3.3999f)
                horizontalLineTo(18.7894f)
                curveTo(17.2394f, 3.3999f, 16.6094f, 3.9999f, 16.6094f, 5.4799f)
                verticalLineTo(15.5399f)
                curveTo(16.6094f, 17.0099f, 17.2394f, 17.6099f, 18.7894f, 17.6099f)
                close()
            }
        }
        .build()
        return _dislike!!
    }

private var _dislike: ImageVector? = null
