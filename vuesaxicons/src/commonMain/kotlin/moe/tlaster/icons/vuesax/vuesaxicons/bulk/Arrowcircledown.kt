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

public val BulkGroup.Arrowcircledown: ImageVector
    get() {
        if (_arrowcircledown != null) {
            return _arrowcircledown!!
        }
        _arrowcircledown = Builder(name = "Arrowcircledown", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0002f, 15.0099f)
                curveTo(11.8102f, 15.0099f, 11.6202f, 14.9399f, 11.4702f, 14.7899f)
                lineTo(7.9402f, 11.2599f)
                curveTo(7.6502f, 10.9699f, 7.6502f, 10.4899f, 7.9402f, 10.1999f)
                curveTo(8.2302f, 9.9099f, 8.7102f, 9.9099f, 9.0002f, 10.1999f)
                lineTo(12.0002f, 13.1999f)
                lineTo(15.0002f, 10.1999f)
                curveTo(15.2902f, 9.9099f, 15.7702f, 9.9099f, 16.0602f, 10.1999f)
                curveTo(16.3502f, 10.4899f, 16.3502f, 10.9699f, 16.0602f, 11.2599f)
                lineTo(12.5302f, 14.7899f)
                curveTo(12.3802f, 14.9399f, 12.1902f, 15.0099f, 12.0002f, 15.0099f)
                close()
            }
        }
        .build()
        return _arrowcircledown!!
    }

private var _arrowcircledown: ImageVector? = null
