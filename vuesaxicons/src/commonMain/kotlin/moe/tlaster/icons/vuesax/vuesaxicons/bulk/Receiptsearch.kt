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

public val BulkGroup.Receiptsearch: ImageVector
    get() {
        if (_receiptsearch != null) {
            return _receiptsearch!!
        }
        _receiptsearch = Builder(name = "Receiptsearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7303f, 19.6998f)
                curveTo(7.5503f, 18.8198f, 8.8002f, 18.8898f, 9.5202f, 19.8498f)
                lineTo(10.5302f, 21.1998f)
                curveTo(11.3402f, 22.2698f, 12.6502f, 22.2698f, 13.4602f, 21.1998f)
                lineTo(14.4702f, 19.8498f)
                curveTo(15.1902f, 18.8898f, 16.4403f, 18.8198f, 17.2603f, 19.6998f)
                curveTo(19.0403f, 21.5998f, 20.4902f, 20.9698f, 20.4902f, 18.3098f)
                verticalLineTo(7.0497f)
                curveTo(20.4902f, 3.0197f, 19.5502f, 2.0098f, 15.7702f, 2.0098f)
                horizontalLineTo(8.2102f)
                curveTo(4.4302f, 2.0098f, 3.4902f, 3.0197f, 3.4902f, 7.0497f)
                verticalLineTo(18.3098f)
                curveTo(3.5002f, 20.9698f, 4.9603f, 21.5898f, 6.7303f, 19.6998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6609f, 13.47f)
                lineTo(14.9209f, 12.73f)
                curveTo(15.3009f, 12.15f, 15.5309f, 11.45f, 15.5309f, 10.7f)
                curveTo(15.5309f, 8.66f, 13.8708f, 7.0f, 11.8308f, 7.0f)
                curveTo(9.7908f, 7.0f, 8.1309f, 8.66f, 8.1309f, 10.7f)
                curveTo(8.1309f, 12.74f, 9.7908f, 14.4f, 11.8308f, 14.4f)
                curveTo(12.5808f, 14.4f, 13.2808f, 14.17f, 13.8608f, 13.79f)
                lineTo(14.6009f, 14.53f)
                curveTo(14.7509f, 14.68f, 14.9409f, 14.75f, 15.1309f, 14.75f)
                curveTo(15.3209f, 14.75f, 15.5109f, 14.68f, 15.6609f, 14.53f)
                curveTo(15.9509f, 14.24f, 15.9509f, 13.76f, 15.6609f, 13.47f)
                close()
            }
        }
        .build()
        return _receiptsearch!!
    }

private var _receiptsearch: ImageVector? = null
