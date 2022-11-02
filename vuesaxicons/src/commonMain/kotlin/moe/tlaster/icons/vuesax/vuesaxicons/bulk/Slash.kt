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

public val BulkGroup.Slash: ImageVector
    get() {
        if (_slash != null) {
            return _slash!!
        }
        _slash = Builder(name = "Slash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.53f, 5.53f)
                lineTo(5.53f, 19.53f)
                curveTo(5.51f, 19.55f, 5.5f, 19.56f, 5.48f, 19.57f)
                curveTo(5.1f, 19.25f, 4.75f, 18.9f, 4.43f, 18.52f)
                curveTo(2.91f, 16.77f, 2.0f, 14.49f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(14.49f, 2.0f, 16.77f, 2.91f, 18.52f, 4.43f)
                curveTo(18.9f, 4.75f, 19.25f, 5.1f, 19.57f, 5.48f)
                curveTo(19.56f, 5.5f, 19.55f, 5.51f, 19.53f, 5.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9996f, 12.0001f)
                curveTo(21.9996f, 17.5201f, 17.5196f, 22.0001f, 11.9996f, 22.0001f)
                curveTo(10.0096f, 22.0001f, 8.1596f, 21.4201f, 6.5996f, 20.4001f)
                lineTo(20.3996f, 6.6001f)
                curveTo(21.4196f, 8.1601f, 21.9996f, 10.0101f, 21.9996f, 12.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7709f, 2.2299f)
                curveTo(21.4709f, 1.9299f, 20.9809f, 1.9299f, 20.6809f, 2.2299f)
                lineTo(2.2309f, 20.6899f)
                curveTo(1.9309f, 20.9899f, 1.9309f, 21.4799f, 2.2309f, 21.7799f)
                curveTo(2.3809f, 21.9199f, 2.5709f, 21.9999f, 2.7709f, 21.9999f)
                curveTo(2.9709f, 21.9999f, 3.1609f, 21.9199f, 3.3109f, 21.7699f)
                lineTo(21.7709f, 3.3099f)
                curveTo(22.0809f, 3.0099f, 22.0809f, 2.5299f, 21.7709f, 2.2299f)
                close()
            }
        }
        .build()
        return _slash!!
    }

private var _slash: ImageVector? = null
