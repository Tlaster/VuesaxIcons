package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Arrowup: ImageVector
    get() {
        if (_arrowup != null) {
            return _arrowup!!
        }
        _arrowup = Builder(name = "Arrowup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6698f, 18.75f)
                horizontalLineTo(9.3298f)
                curveTo(7.4498f, 18.75f, 6.0198f, 18.07f, 5.3098f, 16.84f)
                curveTo(4.5998f, 15.61f, 4.7298f, 14.03f, 5.6698f, 12.4f)
                lineTo(8.3398f, 7.77f)
                curveTo(9.2798f, 6.15f, 10.5798f, 5.25f, 11.9998f, 5.25f)
                curveTo(13.4198f, 5.25f, 14.7198f, 6.15f, 15.6598f, 7.78f)
                lineTo(18.3298f, 12.41f)
                curveTo(19.2698f, 14.04f, 19.3998f, 15.62f, 18.6898f, 16.85f)
                curveTo(17.9798f, 18.07f, 16.5498f, 18.75f, 14.6698f, 18.75f)
                close()
                moveTo(11.9998f, 6.75f)
                curveTo(11.1398f, 6.75f, 10.2998f, 7.38f, 9.6398f, 8.53f)
                lineTo(6.9698f, 13.16f)
                curveTo(6.3098f, 14.31f, 6.1798f, 15.35f, 6.6098f, 16.1f)
                curveTo(7.0398f, 16.85f, 8.0098f, 17.26f, 9.3298f, 17.26f)
                horizontalLineTo(14.6698f)
                curveTo(15.9898f, 17.26f, 16.9598f, 16.85f, 17.3898f, 16.1f)
                curveTo(17.8198f, 15.35f, 17.6898f, 14.31f, 17.0298f, 13.16f)
                lineTo(14.3598f, 8.53f)
                curveTo(13.6998f, 7.38f, 12.8598f, 6.75f, 11.9998f, 6.75f)
                close()
            }
        }
        .build()
        return _arrowup!!
    }

private var _arrowup: ImageVector? = null
