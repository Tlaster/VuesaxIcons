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

public val BulkGroup.Magicstar: ImageVector
    get() {
        if (_magicstar != null) {
            return _magicstar!!
        }
        _magicstar = Builder(name = "Magicstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2902f, 4.14f)
                lineTo(17.2202f, 7.93f)
                curveTo(17.2102f, 8.45f, 17.5403f, 9.14f, 17.9603f, 9.45f)
                lineTo(20.4403f, 11.33f)
                curveTo(22.0303f, 12.53f, 21.7703f, 14.0f, 19.8703f, 14.6f)
                lineTo(16.6403f, 15.61f)
                curveTo(16.1003f, 15.78f, 15.5303f, 16.37f, 15.3903f, 16.92f)
                lineTo(14.6203f, 19.86f)
                curveTo(14.0103f, 22.18f, 12.4902f, 22.41f, 11.2302f, 20.37f)
                lineTo(9.4702f, 17.52f)
                curveTo(9.1502f, 17.0f, 8.3902f, 16.61f, 7.7902f, 16.64f)
                lineTo(4.4503f, 16.81f)
                curveTo(2.0603f, 16.93f, 1.3803f, 15.55f, 2.9403f, 13.73f)
                lineTo(4.9202f, 11.43f)
                curveTo(5.2902f, 11.0f, 5.4602f, 10.2f, 5.2902f, 9.66f)
                lineTo(4.2803f, 6.43f)
                curveTo(3.6903f, 4.53f, 4.7503f, 3.48f, 6.6403f, 4.1f)
                lineTo(9.5903f, 5.07f)
                curveTo(10.0903f, 5.23f, 10.8403f, 5.12f, 11.2603f, 4.81f)
                lineTo(14.3403f, 2.59f)
                curveTo(16.0003f, 1.39f, 17.3302f, 2.09f, 17.2902f, 4.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4403f, 20.4699f)
                lineTo(18.4103f, 17.4399f)
                curveTo(18.1203f, 17.1499f, 17.6403f, 17.1499f, 17.3503f, 17.4399f)
                curveTo(17.0603f, 17.7299f, 17.0603f, 18.2099f, 17.3503f, 18.4999f)
                lineTo(20.3803f, 21.5299f)
                curveTo(20.5303f, 21.6799f, 20.7203f, 21.7499f, 20.9103f, 21.7499f)
                curveTo(21.1003f, 21.7499f, 21.2903f, 21.6799f, 21.4403f, 21.5299f)
                curveTo(21.7303f, 21.2399f, 21.7303f, 20.7599f, 21.4403f, 20.4699f)
                close()
            }
        }
        .build()
        return _magicstar!!
    }

private var _magicstar: ImageVector? = null
