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

public val BulkGroup.Diamonds: ImageVector
    get() {
        if (_diamonds != null) {
            return _diamonds!!
        }
        _diamonds = Builder(name = "Diamonds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2105f, 13.24f)
                lineTo(14.3604f, 20.78f)
                curveTo(13.0604f, 22.21f, 10.9404f, 22.21f, 9.6404f, 20.78f)
                lineTo(2.7904f, 13.24f)
                curveTo(2.0204f, 12.39f, 1.7704f, 10.85f, 2.2304f, 9.8f)
                lineTo(3.0304f, 8.0f)
                horizontalLineTo(20.9704f)
                lineTo(21.7705f, 9.8f)
                curveTo(22.2304f, 10.85f, 21.9805f, 12.39f, 21.2105f, 13.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9693f, 7.9999f)
                horizontalLineTo(3.0293f)
                lineTo(4.7893f, 4.0399f)
                curveTo(5.2593f, 2.9999f, 5.9993f, 2.1499f, 7.6993f, 2.1499f)
                horizontalLineTo(16.2993f)
                curveTo(17.9993f, 2.1499f, 18.7393f, 2.9999f, 19.2093f, 4.0399f)
                lineTo(20.9693f, 7.9999f)
                close()
            }
        }
        .build()
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null
