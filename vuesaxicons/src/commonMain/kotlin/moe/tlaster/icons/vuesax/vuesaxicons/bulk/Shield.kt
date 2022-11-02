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

public val BulkGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.4098f, 6.9599f)
                verticalLineTo(9.7999f)
                lineTo(7.3998f, 19.3399f)
                lineTo(4.7698f, 17.3699f)
                curveTo(4.1198f, 16.8799f, 3.5898f, 15.8299f, 3.5898f, 15.0199f)
                verticalLineTo(6.9599f)
                curveTo(3.5898f, 5.8399f, 4.4498f, 4.5999f, 5.4998f, 4.2099f)
                lineTo(10.9698f, 2.1599f)
                curveTo(11.5398f, 1.9499f, 12.4598f, 1.9499f, 13.0298f, 2.1599f)
                lineTo(18.4998f, 4.2099f)
                curveTo(19.5498f, 4.5999f, 20.4098f, 5.8399f, 20.4098f, 6.9599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4103f, 11.1699f)
                verticalLineTo(15.0199f)
                curveTo(20.4103f, 15.8299f, 19.8803f, 16.8799f, 19.2303f, 17.3699f)
                lineTo(13.7603f, 21.4599f)
                curveTo(13.2803f, 21.8199f, 12.6403f, 21.9999f, 12.0003f, 21.9999f)
                curveTo(11.3603f, 21.9999f, 10.7203f, 21.8199f, 10.2403f, 21.4599f)
                lineTo(8.3203f, 20.0299f)
                lineTo(20.4103f, 11.1699f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
