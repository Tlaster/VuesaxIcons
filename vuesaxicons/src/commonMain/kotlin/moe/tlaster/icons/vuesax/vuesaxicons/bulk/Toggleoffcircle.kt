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

public val BulkGroup.Toggleoffcircle: ImageVector
    get() {
        if (_toggleoffcircle != null) {
            return _toggleoffcircle!!
        }
        _toggleoffcircle = Builder(name = "Toggleoffcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.86f, 3.8599f)
                horizontalLineTo(10.14f)
                curveTo(5.65f, 3.8599f, 2.0f, 7.5099f, 2.0f, 11.9999f)
                curveTo(2.0f, 16.4899f, 5.65f, 20.1399f, 10.14f, 20.1399f)
                horizontalLineTo(13.86f)
                curveTo(18.35f, 20.1399f, 22.0f, 16.4899f, 22.0f, 11.9999f)
                curveTo(22.0f, 7.5099f, 18.35f, 3.8599f, 13.86f, 3.8599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1407f, 16.4201f)
                curveTo(12.5818f, 16.4201f, 14.5607f, 14.4412f, 14.5607f, 12.0001f)
                curveTo(14.5607f, 9.559f, 12.5818f, 7.5801f, 10.1407f, 7.5801f)
                curveTo(7.6996f, 7.5801f, 5.7207f, 9.559f, 5.7207f, 12.0001f)
                curveTo(5.7207f, 14.4412f, 7.6996f, 16.4201f, 10.1407f, 16.4201f)
                close()
            }
        }
        .build()
        return _toggleoffcircle!!
    }

private var _toggleoffcircle: ImageVector? = null
