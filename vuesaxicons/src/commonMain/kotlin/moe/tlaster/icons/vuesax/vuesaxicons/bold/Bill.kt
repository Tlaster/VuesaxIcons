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

public val BoldGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 3.25f, 1.25f, 2.91f, 1.25f, 2.5f)
                curveTo(1.25f, 2.09f, 1.59f, 1.75f, 2.0f, 1.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 1.75f, 22.75f, 2.09f, 22.75f, 2.5f)
                curveTo(22.75f, 2.91f, 22.41f, 3.25f, 22.0f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6699f, 2.5f)
                verticalLineTo(14.47f)
                curveTo(3.6699f, 15.45f, 4.1299f, 16.38f, 4.9199f, 16.97f)
                lineTo(10.1299f, 20.87f)
                curveTo(11.2399f, 21.7f, 12.7699f, 21.7f, 13.8799f, 20.87f)
                lineTo(19.0899f, 16.97f)
                curveTo(19.8799f, 16.38f, 20.3399f, 15.45f, 20.3399f, 14.47f)
                verticalLineTo(2.5f)
                horizontalLineTo(3.6699f)
                close()
                moveTo(15.9999f, 13.75f)
                horizontalLineTo(7.9999f)
                curveTo(7.5899f, 13.75f, 7.2499f, 13.41f, 7.2499f, 13.0f)
                curveTo(7.2499f, 12.59f, 7.5899f, 12.25f, 7.9999f, 12.25f)
                horizontalLineTo(15.9999f)
                curveTo(16.4099f, 12.25f, 16.7499f, 12.59f, 16.7499f, 13.0f)
                curveTo(16.7499f, 13.41f, 16.4099f, 13.75f, 15.9999f, 13.75f)
                close()
                moveTo(15.9999f, 8.75f)
                horizontalLineTo(7.9999f)
                curveTo(7.5899f, 8.75f, 7.2499f, 8.41f, 7.2499f, 8.0f)
                curveTo(7.2499f, 7.59f, 7.5899f, 7.25f, 7.9999f, 7.25f)
                horizontalLineTo(15.9999f)
                curveTo(16.4099f, 7.25f, 16.7499f, 7.59f, 16.7499f, 8.0f)
                curveTo(16.7499f, 8.41f, 16.4099f, 8.75f, 15.9999f, 8.75f)
                close()
            }
        }
        .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
