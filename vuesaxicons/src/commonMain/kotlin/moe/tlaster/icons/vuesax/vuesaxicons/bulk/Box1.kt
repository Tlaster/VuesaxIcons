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

public val BulkGroup.Box1: ImageVector
    get() {
        if (_box1 != null) {
            return _box1!!
        }
        _box1 = Builder(name = "Box1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0409f, 7.19f)
                lineTo(12.0009f, 12.42f)
                lineTo(2.9609f, 7.19f)
                curveTo(3.3609f, 6.45f, 3.9409f, 5.8f, 4.5909f, 5.44f)
                lineTo(9.9309f, 2.48f)
                curveTo(11.0709f, 1.84f, 12.9309f, 1.84f, 14.0709f, 2.48f)
                lineTo(19.4109f, 5.44f)
                curveTo(20.0609f, 5.8f, 20.6409f, 6.45f, 21.0409f, 7.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0006f, 12.4199f)
                verticalLineTo(21.9999f)
                curveTo(11.2506f, 21.9999f, 10.5006f, 21.8399f, 9.9306f, 21.5199f)
                lineTo(4.5906f, 18.5599f)
                curveTo(3.3806f, 17.8899f, 2.3906f, 16.2099f, 2.3906f, 14.8299f)
                verticalLineTo(9.1699f)
                curveTo(2.3906f, 8.5299f, 2.6106f, 7.8299f, 2.9606f, 7.1899f)
                lineTo(12.0006f, 12.4199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.61f, 9.1699f)
                verticalLineTo(14.8299f)
                curveTo(21.61f, 16.2099f, 20.62f, 17.8899f, 19.41f, 18.5599f)
                lineTo(14.07f, 21.5199f)
                curveTo(13.5f, 21.8399f, 12.75f, 21.9999f, 12.0f, 21.9999f)
                verticalLineTo(12.4199f)
                lineTo(21.04f, 7.1899f)
                curveTo(21.39f, 7.8299f, 21.61f, 8.5299f, 21.61f, 9.1699f)
                close()
            }
        }
        .build()
        return _box1!!
    }

private var _box1: ImageVector? = null
