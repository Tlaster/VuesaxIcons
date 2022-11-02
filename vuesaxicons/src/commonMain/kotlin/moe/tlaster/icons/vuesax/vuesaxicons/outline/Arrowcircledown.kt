package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Arrowcircledown: ImageVector
    get() {
        if (_arrowcircledown != null) {
            return _arrowcircledown!!
        }
        _arrowcircledown = Builder(name = "Arrowcircledown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
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
