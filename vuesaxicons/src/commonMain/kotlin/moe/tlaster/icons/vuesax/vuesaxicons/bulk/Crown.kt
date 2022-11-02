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

public val BulkGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.7702f, 18.98f)
                horizontalLineTo(7.2302f)
                curveTo(6.8102f, 18.98f, 6.4302f, 18.71f, 6.2902f, 18.32f)
                lineTo(2.1302f, 6.67f)
                curveTo(1.8002f, 5.74f, 2.8602f, 4.95f, 3.6502f, 5.52f)
                lineTo(7.6502f, 8.38f)
                curveTo(8.1802f, 8.76f, 8.9402f, 8.53f, 9.1702f, 7.92f)
                lineTo(11.0602f, 2.88f)
                curveTo(11.3802f, 2.01f, 12.6102f, 2.01f, 12.9302f, 2.88f)
                lineTo(14.8202f, 7.92f)
                curveTo(15.0502f, 8.54f, 15.8002f, 8.76f, 16.3402f, 8.38f)
                lineTo(20.3402f, 5.52f)
                curveTo(21.1402f, 4.95f, 22.1902f, 5.75f, 21.8602f, 6.67f)
                lineTo(17.7002f, 18.32f)
                curveTo(17.5702f, 18.71f, 17.1902f, 18.98f, 16.7702f, 18.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 22.0f, 6.25f, 21.66f, 6.25f, 21.25f)
                curveTo(6.25f, 20.84f, 6.59f, 20.5f, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 20.5f, 17.75f, 20.84f, 17.75f, 21.25f)
                curveTo(17.75f, 21.66f, 17.41f, 22.0f, 17.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 14.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 14.75f, 8.75f, 14.41f, 8.75f, 14.0f)
                curveTo(8.75f, 13.59f, 9.09f, 13.25f, 9.5f, 13.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 13.25f, 15.25f, 13.59f, 15.25f, 14.0f)
                curveTo(15.25f, 14.41f, 14.91f, 14.75f, 14.5f, 14.75f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
