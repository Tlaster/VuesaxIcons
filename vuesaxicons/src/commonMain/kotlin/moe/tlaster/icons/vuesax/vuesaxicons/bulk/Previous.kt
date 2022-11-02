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

public val BulkGroup.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = Builder(name = "Previous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.2409f, 7.22f)
                verticalLineTo(16.7901f)
                curveTo(20.2409f, 18.7501f, 18.111f, 19.98f, 16.411f, 19.0f)
                lineTo(12.261f, 16.61f)
                lineTo(8.1109f, 14.21f)
                curveTo(6.4109f, 13.23f, 6.4109f, 10.78f, 8.1109f, 9.8f)
                lineTo(12.261f, 7.4f)
                lineTo(16.411f, 5.0101f)
                curveTo(18.111f, 4.0301f, 20.2409f, 5.2501f, 20.2409f, 7.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7598f, 18.9298f)
                curveTo(3.3498f, 18.9298f, 3.0098f, 18.5898f, 3.0098f, 18.1798f)
                verticalLineTo(5.8198f)
                curveTo(3.0098f, 5.4098f, 3.3498f, 5.0698f, 3.7598f, 5.0698f)
                curveTo(4.1698f, 5.0698f, 4.5098f, 5.4098f, 4.5098f, 5.8198f)
                verticalLineTo(18.1798f)
                curveTo(4.5098f, 18.5898f, 4.1698f, 18.9298f, 3.7598f, 18.9298f)
                close()
            }
        }
        .build()
        return _previous!!
    }

private var _previous: ImageVector? = null
