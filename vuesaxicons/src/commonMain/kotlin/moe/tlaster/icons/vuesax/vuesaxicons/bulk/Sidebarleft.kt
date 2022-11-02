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

public val BulkGroup.Sidebarleft: ImageVector
    get() {
        if (_sidebarleft != null) {
            return _sidebarleft!!
        }
        _sidebarleft = Builder(name = "Sidebarleft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(22.0f, 19.83f, 19.83f, 22.0f, 16.19f, 22.0f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 22.0f, 7.41f, 21.99f, 7.22f, 21.98f)
                curveTo(5.99f, 21.9f, 4.95f, 21.55f, 4.13f, 20.95f)
                curveTo(3.71f, 20.66f, 3.34f, 20.29f, 3.05f, 19.87f)
                curveTo(2.36f, 18.92f, 2.0f, 17.68f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.37f, 3.94f, 2.24f, 7.22f, 2.03f)
                curveTo(7.41f, 2.01f, 7.61f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(17.68f, 2.0f, 18.92f, 2.36f, 19.87f, 3.05f)
                curveTo(20.29f, 3.34f, 20.66f, 3.71f, 20.95f, 4.13f)
                curveTo(21.64f, 5.08f, 22.0f, 6.32f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7207f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.8107f)
                curveTo(7.6107f, 22.0f, 7.4107f, 21.99f, 7.2207f, 21.98f)
                verticalLineTo(2.03f)
                curveTo(7.4107f, 2.01f, 7.6107f, 2.0f, 7.8107f, 2.0f)
                horizontalLineTo(8.7207f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9696f, 15.3099f)
                curveTo(14.7796f, 15.3099f, 14.5896f, 15.2399f, 14.4396f, 15.0899f)
                lineTo(11.8796f, 12.5299f)
                curveTo(11.5896f, 12.2399f, 11.5896f, 11.7599f, 11.8796f, 11.4699f)
                lineTo(14.4396f, 8.9099f)
                curveTo(14.7296f, 8.6199f, 15.2096f, 8.6199f, 15.4996f, 8.9099f)
                curveTo(15.7896f, 9.1999f, 15.7896f, 9.6799f, 15.4996f, 9.9699f)
                lineTo(13.4796f, 11.9999f)
                lineTo(15.5096f, 14.0299f)
                curveTo(15.7996f, 14.3199f, 15.7996f, 14.7999f, 15.5096f, 15.0899f)
                curveTo(15.3596f, 15.2399f, 15.1696f, 15.3099f, 14.9696f, 15.3099f)
                close()
            }
        }
        .build()
        return _sidebarleft!!
    }

private var _sidebarleft: ImageVector? = null
