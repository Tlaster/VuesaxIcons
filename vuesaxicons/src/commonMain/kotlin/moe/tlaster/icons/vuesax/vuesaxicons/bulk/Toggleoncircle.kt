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

public val BulkGroup.Toggleoncircle: ImageVector
    get() {
        if (_toggleoncircle != null) {
            return _toggleoncircle!!
        }
        _toggleoncircle = Builder(name = "Toggleoncircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.14f, 3.8599f)
                horizontalLineTo(13.86f)
                curveTo(18.35f, 3.8599f, 22.0f, 7.5099f, 22.0f, 11.9999f)
                curveTo(22.0f, 16.4899f, 18.35f, 20.1399f, 13.86f, 20.1399f)
                horizontalLineTo(10.14f)
                curveTo(5.65f, 20.1399f, 2.0f, 16.4899f, 2.0f, 11.9999f)
                curveTo(2.0f, 7.5099f, 5.65f, 3.8599f, 10.14f, 3.8599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8595f, 16.4201f)
                curveTo(16.3006f, 16.4201f, 18.2795f, 14.4412f, 18.2795f, 12.0001f)
                curveTo(18.2795f, 9.559f, 16.3006f, 7.5801f, 13.8595f, 7.5801f)
                curveTo(11.4184f, 7.5801f, 9.4395f, 9.559f, 9.4395f, 12.0001f)
                curveTo(9.4395f, 14.4412f, 11.4184f, 16.4201f, 13.8595f, 16.4201f)
                close()
            }
        }
        .build()
        return _toggleoncircle!!
    }

private var _toggleoncircle: ImageVector? = null
