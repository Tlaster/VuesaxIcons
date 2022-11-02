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

public val BulkGroup.Mousecircle: ImageVector
    get() {
        if (_mousecircle != null) {
            return _mousecircle!!
        }
        _mousecircle = Builder(name = "Mousecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9597f, 17.84f)
                lineTo(19.3297f, 18.39f)
                curveTo(18.8797f, 18.54f, 18.5197f, 18.89f, 18.3697f, 19.35f)
                lineTo(17.8197f, 20.98f)
                curveTo(17.3497f, 22.39f, 15.3697f, 22.36f, 14.9297f, 20.95f)
                lineTo(13.0797f, 15.0f)
                curveTo(12.7197f, 13.82f, 13.8097f, 12.72f, 14.9797f, 13.09f)
                lineTo(20.9397f, 14.94f)
                curveTo(22.3397f, 15.38f, 22.3597f, 17.37f, 20.9597f, 17.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 21.0f)
                curveTo(16.7467f, 21.0f, 21.0f, 16.7467f, 21.0f, 11.5f)
                curveTo(21.0f, 6.2533f, 16.7467f, 2.0f, 11.5f, 2.0f)
                curveTo(6.2533f, 2.0f, 2.0f, 6.2533f, 2.0f, 11.5f)
                curveTo(2.0f, 16.7467f, 6.2533f, 21.0f, 11.5f, 21.0f)
                close()
            }
        }
        .build()
        return _mousecircle!!
    }

private var _mousecircle: ImageVector? = null
