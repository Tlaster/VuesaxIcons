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

public val BoldGroup.Playcircle: ImageVector
    get() {
        if (_playcircle != null) {
            return _playcircle!!
        }
        _playcircle = Builder(name = "Playcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9688f, 2.0f)
                curveTo(6.4488f, 2.0f, 1.9688f, 6.48f, 1.9688f, 12.0f)
                curveTo(1.9688f, 17.52f, 6.4488f, 22.0f, 11.9688f, 22.0f)
                curveTo(17.4888f, 22.0f, 21.9688f, 17.52f, 21.9688f, 12.0f)
                curveTo(21.9688f, 6.48f, 17.4988f, 2.0f, 11.9688f, 2.0f)
                close()
                moveTo(14.9688f, 14.23f)
                lineTo(12.0687f, 15.9f)
                curveTo(11.7087f, 16.11f, 11.3088f, 16.21f, 10.9187f, 16.21f)
                curveTo(10.5188f, 16.21f, 10.1287f, 16.11f, 9.7688f, 15.9f)
                curveTo(9.0487f, 15.48f, 8.6187f, 14.74f, 8.6187f, 13.9f)
                verticalLineTo(10.55f)
                curveTo(8.6187f, 9.72f, 9.0487f, 8.97f, 9.7688f, 8.55f)
                curveTo(10.4888f, 8.13f, 11.3487f, 8.13f, 12.0787f, 8.55f)
                lineTo(14.9787f, 10.22f)
                curveTo(15.6987f, 10.64f, 16.1287f, 11.38f, 16.1287f, 12.22f)
                curveTo(16.1287f, 13.06f, 15.6987f, 13.81f, 14.9688f, 14.23f)
                close()
            }
        }
        .build()
        return _playcircle!!
    }

private var _playcircle: ImageVector? = null
