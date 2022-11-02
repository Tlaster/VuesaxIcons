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

public val BulkGroup.Heartcircle: ImageVector
    get() {
        if (_heartcircle != null) {
            return _heartcircle!!
        }
        _heartcircle = Builder(name = "Heartcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3296f, 16.9999f)
                curveTo(12.1496f, 17.0599f, 11.8396f, 17.0599f, 11.6596f, 16.9999f)
                curveTo(10.0996f, 16.4699f, 6.5996f, 14.2399f, 6.5996f, 10.4599f)
                curveTo(6.5996f, 8.7899f, 7.9396f, 7.4399f, 9.5996f, 7.4399f)
                curveTo(10.5796f, 7.4399f, 11.4496f, 7.9099f, 11.9996f, 8.6499f)
                curveTo(12.5396f, 7.9199f, 13.4196f, 7.4399f, 14.3996f, 7.4399f)
                curveTo(16.0596f, 7.4399f, 17.3996f, 8.7899f, 17.3996f, 10.4599f)
                curveTo(17.3996f, 14.2399f, 13.8996f, 16.4699f, 12.3296f, 16.9999f)
                close()
            }
        }
        .build()
        return _heartcircle!!
    }

private var _heartcircle: ImageVector? = null
