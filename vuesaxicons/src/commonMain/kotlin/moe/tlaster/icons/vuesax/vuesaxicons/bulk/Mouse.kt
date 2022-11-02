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

public val BulkGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(19.5f, 18.63f, 16.13f, 22.0f, 12.0f, 22.0f)
                curveTo(7.87f, 22.0f, 4.5f, 18.63f, 4.5f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(4.5f, 7.44f, 5.34f, 5.56f, 6.7f, 4.2f)
                curveTo(7.89f, 3.01f, 9.48f, 2.22f, 11.25f, 2.04f)
                curveTo(11.49f, 2.01f, 11.75f, 2.0f, 12.0f, 2.0f)
                curveTo(12.25f, 2.0f, 12.51f, 2.01f, 12.75f, 2.04f)
                curveTo(16.53f, 2.42f, 19.5f, 5.62f, 19.5f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8691f, 7.5f)
                verticalLineTo(9.5f)
                curveTo(13.8691f, 10.53f, 13.0291f, 11.38f, 11.9991f, 11.38f)
                curveTo(10.9591f, 11.38f, 10.1191f, 10.53f, 10.1191f, 9.5f)
                verticalLineTo(7.5f)
                curveTo(10.1191f, 6.73f, 10.5891f, 6.07f, 11.2491f, 5.78f)
                verticalLineTo(2.04f)
                curveTo(11.4891f, 2.01f, 11.7491f, 2.0f, 11.9991f, 2.0f)
                curveTo(12.2491f, 2.0f, 12.5091f, 2.01f, 12.7491f, 2.04f)
                verticalLineTo(5.78f)
                curveTo(13.4091f, 6.07f, 13.8691f, 6.73f, 13.8691f, 7.5f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
