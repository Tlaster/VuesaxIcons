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

public val BulkGroup.Export1: ImageVector
    get() {
        if (_export1 != null) {
            return _export1!!
        }
        _export1 = Builder(name = "Export1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.7599f)
                curveTo(22.0f, 10.2899f, 21.62f, 9.8999f, 21.14f, 9.8999f)
                horizontalLineTo(2.86f)
                curveTo(2.38f, 9.8999f, 2.0f, 10.2799f, 2.0f, 10.7599f)
                curveTo(2.0f, 16.6499f, 6.11f, 20.7599f, 12.0f, 20.7599f)
                curveTo(17.89f, 20.7599f, 22.0f, 16.6399f, 22.0f, 10.7599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5304f, 3.4599f)
                lineTo(15.3804f, 6.2999f)
                curveTo(15.6704f, 6.5899f, 15.6704f, 7.0699f, 15.3804f, 7.3599f)
                curveTo(15.0904f, 7.6499f, 14.6104f, 7.6499f, 14.3204f, 7.3599f)
                lineTo(12.7504f, 5.7999f)
                verticalLineTo(15.3699f)
                curveTo(12.7504f, 15.7799f, 12.4104f, 16.1199f, 12.0004f, 16.1199f)
                curveTo(11.5904f, 16.1199f, 11.2504f, 15.7799f, 11.2504f, 15.3699f)
                verticalLineTo(5.7999f)
                lineTo(9.6904f, 7.3699f)
                curveTo(9.4004f, 7.6599f, 8.9204f, 7.6599f, 8.6304f, 7.3699f)
                curveTo(8.4804f, 7.2199f, 8.4004f, 7.0299f, 8.4004f, 6.8399f)
                curveTo(8.4004f, 6.6499f, 8.4704f, 6.4599f, 8.6204f, 6.3099f)
                lineTo(11.4704f, 3.4699f)
                curveTo(11.7604f, 3.1699f, 12.2404f, 3.1699f, 12.5304f, 3.4599f)
                close()
            }
        }
        .build()
        return _export1!!
    }

private var _export1: ImageVector? = null
