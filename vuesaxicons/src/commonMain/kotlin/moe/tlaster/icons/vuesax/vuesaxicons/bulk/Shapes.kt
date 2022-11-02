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

public val BulkGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4303f, 15.0f)
                horizontalLineTo(4.4003f)
                curveTo(2.5803f, 15.0f, 1.4203f, 13.05f, 2.3003f, 11.45f)
                lineTo(4.6303f, 7.2099f)
                lineTo(6.8103f, 3.2399f)
                curveTo(7.7203f, 1.5899f, 10.1003f, 1.5899f, 11.0103f, 3.2399f)
                lineTo(13.2003f, 7.2099f)
                lineTo(14.2503f, 9.12f)
                lineTo(15.5303f, 11.45f)
                curveTo(16.4103f, 13.05f, 15.2503f, 15.0f, 13.4303f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.5f)
                curveTo(22.0f, 19.09f, 19.09f, 22.0f, 15.5f, 22.0f)
                curveTo(11.91f, 22.0f, 9.0f, 19.09f, 9.0f, 15.5f)
                curveTo(9.0f, 15.33f, 9.01f, 15.17f, 9.02f, 15.0f)
                horizontalLineTo(13.43f)
                curveTo(15.25f, 15.0f, 16.41f, 13.05f, 15.53f, 11.45f)
                lineTo(14.25f, 9.12f)
                curveTo(14.65f, 9.04f, 15.07f, 9.0f, 15.5f, 9.0f)
                curveTo(19.09f, 9.0f, 22.0f, 11.91f, 22.0f, 15.5f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null
