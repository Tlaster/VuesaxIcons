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

public val BulkGroup.Arrowsquaredown: ImageVector
    get() {
        if (_arrowsquaredown != null) {
            return _arrowsquaredown!!
        }
        _arrowsquaredown = Builder(name = "Arrowsquaredown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 14.9098f)
                curveTo(11.8102f, 14.9098f, 11.6202f, 14.8398f, 11.4702f, 14.6898f)
                lineTo(7.9402f, 11.1598f)
                curveTo(7.6502f, 10.8698f, 7.6502f, 10.3898f, 7.9402f, 10.0998f)
                curveTo(8.2302f, 9.8098f, 8.7102f, 9.8098f, 9.0002f, 10.0998f)
                lineTo(12.0002f, 13.0998f)
                lineTo(15.0002f, 10.0998f)
                curveTo(15.2902f, 9.8098f, 15.7702f, 9.8098f, 16.0602f, 10.0998f)
                curveTo(16.3502f, 10.3898f, 16.3502f, 10.8698f, 16.0602f, 11.1598f)
                lineTo(12.5302f, 14.6898f)
                curveTo(12.3802f, 14.8398f, 12.1902f, 14.9098f, 12.0002f, 14.9098f)
                close()
            }
        }
        .build()
        return _arrowsquaredown!!
    }

private var _arrowsquaredown: ImageVector? = null
