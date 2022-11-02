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

public val BulkGroup.Next: ImageVector
    get() {
        if (_next != null) {
            return _next!!
        }
        _next = Builder(name = "Next", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7598f, 7.22f)
                verticalLineTo(16.7901f)
                curveTo(3.7598f, 18.7501f, 5.8898f, 19.98f, 7.5897f, 19.0f)
                lineTo(11.7397f, 16.61f)
                lineTo(15.8898f, 14.21f)
                curveTo(17.5898f, 13.23f, 17.5898f, 10.78f, 15.8898f, 9.8f)
                lineTo(11.7397f, 7.4f)
                lineTo(7.5897f, 5.0101f)
                curveTo(5.8898f, 4.0301f, 3.7598f, 5.2501f, 3.7598f, 7.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2402f, 18.9298f)
                curveTo(19.8302f, 18.9298f, 19.4902f, 18.5898f, 19.4902f, 18.1798f)
                verticalLineTo(5.8198f)
                curveTo(19.4902f, 5.4098f, 19.8302f, 5.0698f, 20.2402f, 5.0698f)
                curveTo(20.6502f, 5.0698f, 20.9902f, 5.4098f, 20.9902f, 5.8198f)
                verticalLineTo(18.1798f)
                curveTo(20.9902f, 18.5898f, 20.6602f, 18.9298f, 20.2402f, 18.9298f)
                close()
            }
        }
        .build()
        return _next!!
    }

private var _next: ImageVector? = null
