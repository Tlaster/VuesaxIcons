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

public val BulkGroup.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9401f, 5.4199f)
                lineTo(13.7701f, 2.4299f)
                curveTo(12.7801f, 1.8599f, 11.2301f, 1.8599f, 10.2401f, 2.4299f)
                lineTo(5.0201f, 5.4399f)
                curveTo(2.9501f, 6.8399f, 2.8301f, 7.0499f, 2.8301f, 9.2799f)
                verticalLineTo(14.7099f)
                curveTo(2.8301f, 16.9399f, 2.9501f, 17.1599f, 5.0601f, 18.5799f)
                lineTo(10.2301f, 21.5699f)
                curveTo(10.7301f, 21.8599f, 11.3701f, 21.9999f, 12.0001f, 21.9999f)
                curveTo(12.6301f, 21.9999f, 13.2701f, 21.8599f, 13.7601f, 21.5699f)
                lineTo(18.9801f, 18.5599f)
                curveTo(21.0501f, 17.1599f, 21.1701f, 16.9499f, 21.1701f, 14.7199f)
                verticalLineTo(9.2799f)
                curveTo(21.1701f, 7.0499f, 21.0501f, 6.8399f, 18.9401f, 5.4199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.25f)
                curveTo(13.7949f, 15.25f, 15.25f, 13.7949f, 15.25f, 12.0f)
                curveTo(15.25f, 10.2051f, 13.7949f, 8.75f, 12.0f, 8.75f)
                curveTo(10.2051f, 8.75f, 8.75f, 10.2051f, 8.75f, 12.0f)
                curveTo(8.75f, 13.7949f, 10.2051f, 15.25f, 12.0f, 15.25f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null
