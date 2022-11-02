package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Nebulas: ImageVector
    get() {
        if (_nebulas != null) {
            return _nebulas!!
        }
        _nebulas = Builder(name = "Nebulas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.5f, 14.75f)
                lineTo(13.19f, 14.65f)
                lineTo(13.0f, 15.25f)
                lineTo(12.0f, 18.25f)
                lineTo(9.5f, 13.57f)
                lineTo(9.4f, 13.38f)
                lineTo(6.0f, 12.25f)
                lineTo(8.18f, 11.16f)
                lineTo(10.0f, 10.25f)
                lineTo(10.47f, 10.04f)
                lineTo(12.0f, 5.25f)
                lineTo(13.55f, 8.65f)
                lineTo(14.5f, 10.75f)
                lineTo(14.09f, 10.96f)
                lineTo(18.0f, 12.25f)
                lineTo(13.5f, 14.75f)
                close()
            }
        }
        .build()
        return _nebulas!!
    }

private var _nebulas: ImageVector? = null
