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

public val BoldGroup.Closecircle: ImageVector
    get() {
        if (_closecircle != null) {
            return _closecircle!!
        }
        _closecircle = Builder(name = "Closecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f)
                curveTo(17.51f, 22.0f, 22.0f, 17.51f, 22.0f, 12.0f)
                curveTo(22.0f, 6.49f, 17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.36f, 14.3f)
                curveTo(15.65f, 14.59f, 15.65f, 15.07f, 15.36f, 15.36f)
                curveTo(15.21f, 15.51f, 15.02f, 15.58f, 14.83f, 15.58f)
                curveTo(14.64f, 15.58f, 14.45f, 15.51f, 14.3f, 15.36f)
                lineTo(12.0f, 13.06f)
                lineTo(9.7f, 15.36f)
                curveTo(9.55f, 15.51f, 9.36f, 15.58f, 9.17f, 15.58f)
                curveTo(8.98f, 15.58f, 8.79f, 15.51f, 8.64f, 15.36f)
                curveTo(8.35f, 15.07f, 8.35f, 14.59f, 8.64f, 14.3f)
                lineTo(10.94f, 12.0f)
                lineTo(8.64f, 9.7f)
                curveTo(8.35f, 9.41f, 8.35f, 8.93f, 8.64f, 8.64f)
                curveTo(8.93f, 8.35f, 9.41f, 8.35f, 9.7f, 8.64f)
                lineTo(12.0f, 10.94f)
                lineTo(14.3f, 8.64f)
                curveTo(14.59f, 8.35f, 15.07f, 8.35f, 15.36f, 8.64f)
                curveTo(15.65f, 8.93f, 15.65f, 9.41f, 15.36f, 9.7f)
                lineTo(13.06f, 12.0f)
                lineTo(15.36f, 14.3f)
                close()
            }
        }
        .build()
        return _closecircle!!
    }

private var _closecircle: ImageVector? = null
