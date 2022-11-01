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

public val BoldGroup.`Document-normal`: ImageVector
    get() {
        if (`_document-normal` != null) {
            return `_document-normal`!!
        }
        `_document-normal` = Builder(name = "Document-normal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7091f, 8.1195f)
                verticalLineTo(17.5295f)
                curveTo(20.7091f, 19.9895f, 18.6991f, 21.9995f, 16.2391f, 21.9995f)
                horizontalLineTo(7.7591f)
                curveTo(5.2991f, 21.9995f, 3.2891f, 19.9895f, 3.2891f, 17.5295f)
                verticalLineTo(8.1195f)
                curveTo(3.2891f, 6.4095f, 4.2491f, 4.9195f, 5.6591f, 4.1695f)
                curveTo(6.1491f, 3.9095f, 6.7591f, 4.2595f, 6.7591f, 4.8195f)
                curveTo(6.7591f, 6.4095f, 8.0591f, 7.7095f, 9.6491f, 7.7095f)
                horizontalLineTo(14.3491f)
                curveTo(15.9391f, 7.7095f, 17.2391f, 6.4095f, 17.2391f, 4.8195f)
                curveTo(17.2391f, 4.2595f, 17.8391f, 3.9095f, 18.3391f, 4.1695f)
                curveTo(19.7491f, 4.9195f, 20.7091f, 6.4095f, 20.7091f, 8.1195f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3498f, 2.0f)
                horizontalLineTo(9.6498f)
                curveTo(8.6098f, 2.0f, 7.7598f, 2.84f, 7.7598f, 3.88f)
                verticalLineTo(4.82f)
                curveTo(7.7598f, 5.86f, 8.5998f, 6.7f, 9.6398f, 6.7f)
                horizontalLineTo(14.3498f)
                curveTo(15.3898f, 6.7f, 16.2298f, 5.86f, 16.2298f, 4.82f)
                verticalLineTo(3.88f)
                curveTo(16.2398f, 2.84f, 15.3898f, 2.0f, 14.3498f, 2.0f)
                close()
            }
        }
        .build()
        return `_document-normal`!!
    }

private var `_document-normal`: ImageVector? = null
