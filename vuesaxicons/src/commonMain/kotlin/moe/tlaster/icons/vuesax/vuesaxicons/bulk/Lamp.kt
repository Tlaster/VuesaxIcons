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

public val BulkGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.2106f, 14.69f)
                horizontalLineTo(5.7906f)
                curveTo(4.1306f, 14.69f, 3.1306f, 13.38f, 3.5706f, 11.78f)
                lineTo(5.7706f, 3.7f)
                curveTo(6.0206f, 2.77f, 7.0306f, 2.0f, 7.9906f, 2.0f)
                horizontalLineTo(16.0106f)
                curveTo(16.9706f, 2.0f, 17.9806f, 2.77f, 18.2306f, 3.7f)
                lineTo(20.4306f, 11.78f)
                curveTo(20.8706f, 13.38f, 19.8706f, 14.69f, 18.2106f, 14.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 21.2499f)
                curveTo(16.75f, 21.6599f, 16.41f, 21.9999f, 16.0f, 21.9999f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 21.9999f, 7.25f, 21.6599f, 7.25f, 21.2499f)
                curveTo(7.25f, 20.8399f, 7.59f, 20.4999f, 8.0f, 20.4999f)
                horizontalLineTo(11.25f)
                verticalLineTo(14.6899f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.4999f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 20.4999f, 16.75f, 20.8399f, 16.75f, 21.2499f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
