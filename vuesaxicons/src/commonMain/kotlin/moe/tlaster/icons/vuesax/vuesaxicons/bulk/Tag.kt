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

public val BulkGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1704f, 15.2998f)
                lineTo(8.7004f, 19.8298f)
                curveTo(10.5604f, 21.6898f, 13.5804f, 21.6898f, 15.4504f, 19.8298f)
                lineTo(19.8404f, 15.4398f)
                curveTo(21.7004f, 13.5798f, 21.7004f, 10.5598f, 19.8404f, 8.6898f)
                lineTo(15.3004f, 4.1698f)
                curveTo(14.3504f, 3.2198f, 13.0404f, 2.7098f, 11.7004f, 2.7798f)
                lineTo(6.7004f, 3.0198f)
                curveTo(4.7004f, 3.1098f, 3.1104f, 4.6998f, 3.0104f, 6.6898f)
                lineTo(2.7704f, 11.6898f)
                curveTo(2.7104f, 13.0398f, 3.2204f, 14.3498f, 4.1704f, 15.2998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4991f, 12.3801f)
                curveTo(11.0897f, 12.3801f, 12.3791f, 11.0907f, 12.3791f, 9.5001f)
                curveTo(12.3791f, 7.9095f, 11.0897f, 6.6201f, 9.4991f, 6.6201f)
                curveTo(7.9086f, 6.6201f, 6.6191f, 7.9095f, 6.6191f, 9.5001f)
                curveTo(6.6191f, 11.0907f, 7.9086f, 12.3801f, 9.4991f, 12.3801f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
