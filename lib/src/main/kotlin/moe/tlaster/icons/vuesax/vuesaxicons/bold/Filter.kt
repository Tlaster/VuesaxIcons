package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6009f, 4.1016f)
                verticalLineTo(6.3016f)
                curveTo(20.6009f, 7.1016f, 20.1009f, 8.1016f, 19.6009f, 8.6016f)
                lineTo(15.3009f, 12.4016f)
                curveTo(14.7009f, 12.9016f, 14.3009f, 13.9016f, 14.3009f, 14.7016f)
                verticalLineTo(19.0016f)
                curveTo(14.3009f, 19.6016f, 13.9009f, 20.4016f, 13.4009f, 20.7016f)
                lineTo(12.0009f, 21.6016f)
                curveTo(10.7009f, 22.4016f, 8.9009f, 21.5016f, 8.9009f, 19.9016f)
                verticalLineTo(14.6016f)
                curveTo(8.9009f, 13.9016f, 8.5009f, 13.0016f, 8.1009f, 12.5016f)
                lineTo(7.6309f, 12.0116f)
                curveTo(7.3209f, 11.6816f, 7.2609f, 11.1816f, 7.5109f, 10.7916f)
                lineTo(12.6309f, 2.5716f)
                curveTo(12.8109f, 2.2816f, 13.1309f, 2.1016f, 13.4809f, 2.1016f)
                horizontalLineTo(18.6009f)
                curveTo(19.7009f, 2.1016f, 20.6009f, 3.0016f, 20.6009f, 4.1016f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3504f, 3.6316f)
                lineTo(6.8004f, 9.3216f)
                curveTo(6.4604f, 9.8716f, 5.6804f, 9.9516f, 5.2304f, 9.4816f)
                lineTo(4.3004f, 8.5016f)
                curveTo(3.8004f, 8.0016f, 3.4004f, 7.1016f, 3.4004f, 6.5016f)
                verticalLineTo(4.2016f)
                curveTo(3.4004f, 3.0016f, 4.3004f, 2.1016f, 5.4004f, 2.1016f)
                horizontalLineTo(9.5004f)
                curveTo(10.2804f, 2.1016f, 10.7604f, 2.9616f, 10.3504f, 3.6316f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
