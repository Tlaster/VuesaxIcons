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

public val BulkGroup.Archivetick: ImageVector
    get() {
        if (_archivetick != null) {
            return _archivetick!!
        }
        _archivetick = Builder(name = "Archivetick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8203f, 1.9102f)
                horizontalLineTo(7.1803f)
                curveTo(5.0603f, 1.9102f, 3.3203f, 3.6502f, 3.3203f, 5.7702f)
                verticalLineTo(19.8602f)
                curveTo(3.3203f, 21.6602f, 4.6103f, 22.4202f, 6.1903f, 21.5502f)
                lineTo(11.0703f, 18.8402f)
                curveTo(11.5903f, 18.5502f, 12.4303f, 18.5502f, 12.9403f, 18.8402f)
                lineTo(17.8203f, 21.5502f)
                curveTo(19.4003f, 22.4302f, 20.6903f, 21.6702f, 20.6903f, 19.8602f)
                verticalLineTo(5.7702f)
                curveTo(20.6803f, 3.6502f, 18.9503f, 1.9102f, 16.8203f, 1.9102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0893f, 13.2499f)
                curveTo(10.8993f, 13.2499f, 10.7093f, 13.1799f, 10.5593f, 13.0299f)
                lineTo(9.0593f, 11.5299f)
                curveTo(8.7693f, 11.2399f, 8.7693f, 10.7599f, 9.0593f, 10.4699f)
                curveTo(9.3493f, 10.1799f, 9.8293f, 10.1799f, 10.1193f, 10.4699f)
                lineTo(11.0893f, 11.4399f)
                lineTo(14.5593f, 7.9699f)
                curveTo(14.8493f, 7.6799f, 15.3293f, 7.6799f, 15.6193f, 7.9699f)
                curveTo(15.9093f, 8.2599f, 15.9093f, 8.7399f, 15.6193f, 9.0299f)
                lineTo(11.6193f, 13.0299f)
                curveTo(11.4693f, 13.1799f, 11.2793f, 13.2499f, 11.0893f, 13.2499f)
                close()
            }
        }
        .build()
        return _archivetick!!
    }

private var _archivetick: ImageVector? = null
