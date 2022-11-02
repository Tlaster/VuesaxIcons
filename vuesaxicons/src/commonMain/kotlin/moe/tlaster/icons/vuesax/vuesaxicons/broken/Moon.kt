package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1807f, 5.38f)
                curveTo(2.6707f, 7.3f, 1.8407f, 9.76f, 2.0307f, 12.42f)
                curveTo(2.3907f, 17.57f, 6.7607f, 21.76f, 11.9907f, 21.99f)
                curveTo(15.6807f, 22.15f, 18.9807f, 20.43f, 20.9607f, 17.72f)
                curveTo(21.7807f, 16.61f, 21.3407f, 15.87f, 19.9707f, 16.12f)
                curveTo(19.3007f, 16.24f, 18.6107f, 16.29f, 17.8907f, 16.26f)
                curveTo(13.0007f, 16.06f, 9.0007f, 11.97f, 8.9807f, 7.14f)
                curveTo(8.9707f, 5.84f, 9.2407f, 4.61f, 9.7307f, 3.49f)
                curveTo(10.2707f, 2.25f, 9.6207f, 1.66f, 8.3707f, 2.19f)
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
