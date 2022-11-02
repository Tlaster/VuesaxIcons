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

public val BulkGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0002f, 8.3398f)
                verticalLineTo(15.6598f)
                curveTo(22.0002f, 17.1598f, 20.3703f, 18.0998f, 19.0703f, 17.3498f)
                lineTo(15.9002f, 15.5198f)
                lineTo(12.7303f, 13.6898f)
                lineTo(12.2402f, 13.4098f)
                verticalLineTo(10.5898f)
                lineTo(12.7303f, 10.3098f)
                lineTo(15.9002f, 8.4798f)
                lineTo(19.0703f, 6.6498f)
                curveTo(20.3703f, 5.8998f, 22.0002f, 6.8398f, 22.0002f, 8.3398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2394f, 8.3398f)
                verticalLineTo(15.6598f)
                curveTo(12.2394f, 17.1598f, 10.6095f, 18.0998f, 9.3195f, 17.3498f)
                lineTo(6.1395f, 15.5198f)
                lineTo(2.9694f, 13.6898f)
                curveTo(1.6795f, 12.9398f, 1.6795f, 11.0598f, 2.9694f, 10.3098f)
                lineTo(6.1395f, 8.4798f)
                lineTo(9.3195f, 6.6498f)
                curveTo(10.6095f, 5.8998f, 12.2394f, 6.8398f, 12.2394f, 8.3398f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null
