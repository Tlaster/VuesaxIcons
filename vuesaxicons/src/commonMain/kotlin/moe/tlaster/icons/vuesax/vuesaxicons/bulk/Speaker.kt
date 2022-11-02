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

public val BulkGroup.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(13.6569f, 18.0f, 15.0f, 16.6569f, 15.0f, 15.0f)
                curveTo(15.0f, 13.3431f, 13.6569f, 12.0f, 12.0f, 12.0f)
                curveTo(10.3431f, 12.0f, 9.0f, 13.3431f, 9.0f, 15.0f)
                curveTo(9.0f, 16.6569f, 10.3431f, 18.0f, 12.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(12.8284f, 9.0f, 13.5f, 8.3284f, 13.5f, 7.5f)
                curveTo(13.5f, 6.6716f, 12.8284f, 6.0f, 12.0f, 6.0f)
                curveTo(11.1716f, 6.0f, 10.5f, 6.6716f, 10.5f, 7.5f)
                curveTo(10.5f, 8.3284f, 11.1716f, 9.0f, 12.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9991f, 1.6201f)
                horizontalLineTo(8.9991f)
                curveTo(5.8091f, 1.6201f, 4.6191f, 2.8101f, 4.6191f, 6.0001f)
                verticalLineTo(18.0001f)
                curveTo(4.6191f, 21.1901f, 5.8091f, 22.3801f, 8.9991f, 22.3801f)
                horizontalLineTo(14.9991f)
                curveTo(18.1891f, 22.3801f, 19.3791f, 21.1901f, 19.3791f, 18.0001f)
                verticalLineTo(6.0001f)
                curveTo(19.3791f, 2.8101f, 18.1891f, 1.6201f, 14.9991f, 1.6201f)
                close()
                moveTo(11.9991f, 6.0001f)
                curveTo(12.8291f, 6.0001f, 13.4991f, 6.6701f, 13.4991f, 7.5001f)
                curveTo(13.4991f, 8.3301f, 12.8291f, 9.0001f, 11.9991f, 9.0001f)
                curveTo(11.1691f, 9.0001f, 10.4991f, 8.3301f, 10.4991f, 7.5001f)
                curveTo(10.4991f, 6.6701f, 11.1691f, 6.0001f, 11.9991f, 6.0001f)
                close()
                moveTo(11.9991f, 18.0001f)
                curveTo(10.3391f, 18.0001f, 8.9991f, 16.6601f, 8.9991f, 15.0001f)
                curveTo(8.9991f, 13.3401f, 10.3391f, 12.0001f, 11.9991f, 12.0001f)
                curveTo(13.6591f, 12.0001f, 14.9991f, 13.3401f, 14.9991f, 15.0001f)
                curveTo(14.9991f, 16.6601f, 13.6591f, 18.0001f, 11.9991f, 18.0001f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
