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

public val BulkGroup.Receiptedit: ImageVector
    get() {
        if (_receiptedit != null) {
            return _receiptedit!!
        }
        _receiptedit = Builder(name = "Receiptedit", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.8409f, 9.9902f)
                lineTo(14.3409f, 10.5002f)
                horizontalLineTo(14.3309f)
                lineTo(11.3009f, 13.5302f)
                curveTo(11.1709f, 13.6602f, 10.9009f, 13.8002f, 10.7109f, 13.8202f)
                lineTo(9.3609f, 14.0202f)
                curveTo(8.8709f, 14.0902f, 8.5309f, 13.7402f, 8.6009f, 13.2602f)
                lineTo(8.7909f, 11.9002f)
                curveTo(8.8209f, 11.7102f, 8.9509f, 11.4502f, 9.0809f, 11.3102f)
                lineTo(12.1209f, 8.2802f)
                lineTo(12.6209f, 7.7702f)
                curveTo(12.9509f, 7.4402f, 13.3209f, 7.2002f, 13.7209f, 7.2002f)
                curveTo(14.0609f, 7.2002f, 14.4309f, 7.3602f, 14.8409f, 7.7702f)
                curveTo(15.7409f, 8.6702f, 15.4509f, 9.3802f, 14.8409f, 9.9902f)
                close()
            }
        }
        .build()
        return _receiptedit!!
    }

private var _receiptedit: ImageVector? = null
