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

public val BulkGroup.`Tether-(usdt)`: ImageVector
    get() {
        if (`_tether-(usdt)` != null) {
            return `_tether-(usdt)`!!
        }
        `_tether-(usdt)` = Builder(name = "Tether-(usdt)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4702f, 3.3501f)
                horizontalLineTo(16.5302f)
                curveTo(17.5902f, 3.3501f, 18.8402f, 4.1201f, 19.3102f, 5.0701f)
                lineTo(21.7102f, 9.8901f)
                curveTo(22.2902f, 11.0501f, 21.9702f, 12.7001f, 21.0202f, 13.5701f)
                lineTo(14.0902f, 19.8601f)
                curveTo(12.9402f, 20.9001f, 11.0702f, 20.9001f, 9.9202f, 19.8601f)
                lineTo(2.9902f, 13.5701f)
                curveTo(2.0302f, 12.7001f, 1.7202f, 11.0501f, 2.3002f, 9.8901f)
                lineTo(4.7002f, 5.0701f)
                curveTo(5.1602f, 4.1201f, 6.4102f, 3.3501f, 7.4702f, 3.3501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 7.75f, 7.25f, 8.09f, 7.25f, 8.5f)
                curveTo(7.25f, 8.91f, 7.59f, 9.25f, 8.0f, 9.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.5f)
                curveTo(11.25f, 14.91f, 11.59f, 15.25f, 12.0f, 15.25f)
                curveTo(12.41f, 15.25f, 12.75f, 14.91f, 12.75f, 14.5f)
                verticalLineTo(9.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 9.25f, 16.75f, 8.91f, 16.75f, 8.5f)
                curveTo(16.75f, 8.09f, 16.41f, 7.75f, 16.0f, 7.75f)
                close()
            }
        }
        .build()
        return `_tether-(usdt)`!!
    }

private var `_tether-(usdt)`: ImageVector? = null
