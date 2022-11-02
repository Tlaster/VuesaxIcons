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

public val OutlineGroup.Arrowleft1: ImageVector
    get() {
        if (_arrowleft1 != null) {
            return _arrowleft1!!
        }
        _arrowleft1 = Builder(name = "Arrowleft1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1f, 19.1498f)
                curveTo(14.26f, 19.1498f, 13.34f, 18.8798f, 12.41f, 18.3398f)
                lineTo(7.78f, 15.6698f)
                curveTo(6.15f, 14.7198f, 5.25f, 13.4198f, 5.25f, 11.9998f)
                curveTo(5.25f, 10.5798f, 6.15f, 9.2798f, 7.78f, 8.3398f)
                lineTo(12.41f, 5.6698f)
                curveTo(14.04f, 4.7298f, 15.61f, 4.5998f, 16.85f, 5.3098f)
                curveTo(18.08f, 6.0198f, 18.76f, 7.4498f, 18.76f, 9.3298f)
                verticalLineTo(14.6698f)
                curveTo(18.76f, 16.5498f, 18.08f, 17.9798f, 16.85f, 18.6898f)
                curveTo(16.32f, 18.9998f, 15.73f, 19.1498f, 15.1f, 19.1498f)
                close()
                moveTo(15.1f, 6.3598f)
                curveTo(14.52f, 6.3598f, 13.86f, 6.5598f, 13.16f, 6.9698f)
                lineTo(8.53f, 9.6398f)
                curveTo(7.38f, 10.2998f, 6.75f, 11.1398f, 6.75f, 11.9998f)
                curveTo(6.75f, 12.8598f, 7.38f, 13.6998f, 8.53f, 14.3598f)
                lineTo(13.16f, 17.0298f)
                curveTo(14.31f, 17.6898f, 15.35f, 17.8198f, 16.1f, 17.3898f)
                curveTo(16.85f, 16.9598f, 17.26f, 15.9898f, 17.26f, 14.6698f)
                verticalLineTo(9.3298f)
                curveTo(17.26f, 8.0098f, 16.85f, 7.0398f, 16.1f, 6.6098f)
                curveTo(15.8f, 6.4398f, 15.46f, 6.3598f, 15.1f, 6.3598f)
                close()
            }
        }
        .build()
        return _arrowleft1!!
    }

private var _arrowleft1: ImageVector? = null
