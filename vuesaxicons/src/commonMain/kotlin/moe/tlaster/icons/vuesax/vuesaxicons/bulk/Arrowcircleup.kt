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

public val BulkGroup.Arrowcircleup: ImageVector
    get() {
        if (_arrowcircleup != null) {
            return _arrowcircleup!!
        }
        _arrowcircleup = Builder(name = "Arrowcircleup", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.5302f, 14.0099f)
                curveTo(15.3402f, 14.0099f, 15.1502f, 13.9399f, 15.0002f, 13.7899f)
                lineTo(12.0002f, 10.7899f)
                lineTo(9.0002f, 13.7899f)
                curveTo(8.7102f, 14.0799f, 8.2302f, 14.0799f, 7.9402f, 13.7899f)
                curveTo(7.6502f, 13.4999f, 7.6502f, 13.0199f, 7.9402f, 12.7299f)
                lineTo(11.4702f, 9.1999f)
                curveTo(11.7602f, 8.9099f, 12.2402f, 8.9099f, 12.5302f, 9.1999f)
                lineTo(16.0602f, 12.7299f)
                curveTo(16.3502f, 13.0199f, 16.3502f, 13.4999f, 16.0602f, 13.7899f)
                curveTo(15.9102f, 13.9399f, 15.7202f, 14.0099f, 15.5302f, 14.0099f)
                close()
            }
        }
        .build()
        return _arrowcircleup!!
    }

private var _arrowcircleup: ImageVector? = null
