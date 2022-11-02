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

public val BulkGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5996f, 4.1001f)
                verticalLineTo(6.3001f)
                curveTo(20.5996f, 7.1001f, 20.0996f, 8.1001f, 19.5996f, 8.6001f)
                lineTo(15.2996f, 12.4001f)
                curveTo(14.6996f, 12.9001f, 14.2996f, 13.9001f, 14.2996f, 14.7001f)
                verticalLineTo(19.0001f)
                curveTo(14.2996f, 19.6001f, 13.8996f, 20.4001f, 13.3996f, 20.7001f)
                lineTo(11.9996f, 21.6001f)
                curveTo(10.6996f, 22.4001f, 8.8996f, 21.5001f, 8.8996f, 19.9001f)
                verticalLineTo(14.6001f)
                curveTo(8.8996f, 13.9001f, 8.4996f, 13.0001f, 8.0996f, 12.5001f)
                lineTo(7.0996f, 11.4501f)
                lineTo(12.9196f, 2.1001f)
                horizontalLineTo(18.5996f)
                curveTo(19.6996f, 2.1001f, 20.5996f, 3.0001f, 20.5996f, 4.1001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3004f, 2.1001f)
                lineTo(6.1204f, 10.4101f)
                lineTo(4.3004f, 8.5001f)
                curveTo(3.8004f, 8.0001f, 3.4004f, 7.1001f, 3.4004f, 6.5001f)
                verticalLineTo(4.2001f)
                curveTo(3.4004f, 3.0001f, 4.3004f, 2.1001f, 5.4004f, 2.1001f)
                horizontalLineTo(11.3004f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
