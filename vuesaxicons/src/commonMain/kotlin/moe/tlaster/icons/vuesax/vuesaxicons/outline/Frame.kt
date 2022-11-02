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

public val OutlineGroup.Frame: ImageVector
    get() {
        if (_frame != null) {
            return _frame!!
        }
        _frame = Builder(name = "Frame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2.0f)
                curveTo(12.75f, 2.41f, 12.41f, 2.75f, 12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 11.59f, 21.59f, 11.25f, 22.0f, 11.25f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8002f, 10.9499f)
                curveTo(13.6102f, 10.9499f, 13.4202f, 10.8799f, 13.2702f, 10.7299f)
                curveTo(12.9802f, 10.4399f, 12.9802f, 9.9599f, 13.2702f, 9.6699f)
                lineTo(21.4702f, 1.4699f)
                curveTo(21.7602f, 1.1799f, 22.2402f, 1.1799f, 22.5302f, 1.4699f)
                curveTo(22.8202f, 1.7599f, 22.8202f, 2.2399f, 22.5302f, 2.5299f)
                lineTo(14.3302f, 10.7299f)
                curveTo(14.1902f, 10.8699f, 14.0002f, 10.9499f, 13.8002f, 10.9499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.83f, 11.7499f)
                horizontalLineTo(13.0f)
                curveTo(12.59f, 11.7499f, 12.25f, 11.4099f, 12.25f, 10.9999f)
                verticalLineTo(6.1699f)
                curveTo(12.25f, 5.7599f, 12.59f, 5.4199f, 13.0f, 5.4199f)
                curveTo(13.41f, 5.4199f, 13.75f, 5.7599f, 13.75f, 6.1699f)
                verticalLineTo(10.2499f)
                horizontalLineTo(17.83f)
                curveTo(18.24f, 10.2499f, 18.58f, 10.5899f, 18.58f, 10.9999f)
                curveTo(18.58f, 11.4099f, 18.24f, 11.7499f, 17.83f, 11.7499f)
                close()
            }
        }
        .build()
        return _frame!!
    }

private var _frame: ImageVector? = null
