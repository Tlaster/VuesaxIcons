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

public val BulkGroup.Batteryempty: ImageVector
    get() {
        if (_batteryempty != null) {
            return _batteryempty!!
        }
        _batteryempty = Builder(name = "Batteryempty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.93f, 4.79f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 4.79f, 2.0f, 6.04f, 2.0f, 10.14f)
                verticalLineTo(13.86f)
                curveTo(2.0f, 17.96f, 3.25f, 19.21f, 7.35f, 19.21f)
                horizontalLineTo(12.93f)
                curveTo(17.03f, 19.21f, 18.28f, 17.96f, 18.28f, 13.86f)
                verticalLineTo(10.14f)
                curveTo(18.28f, 6.04f, 17.03f, 4.79f, 12.93f, 4.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4192f, 9.0f)
                curveTo(20.2792f, 8.99f, 20.0992f, 8.98f, 19.8992f, 8.98f)
                curveTo(19.5092f, 8.98f, 19.1992f, 9.29f, 19.1992f, 9.68f)
                verticalLineTo(14.33f)
                curveTo(19.1992f, 14.72f, 19.5092f, 15.03f, 19.8992f, 15.03f)
                curveTo(20.0992f, 15.03f, 20.2692f, 15.02f, 20.4392f, 15.01f)
                curveTo(21.9992f, 14.83f, 21.9992f, 13.73f, 21.9992f, 12.93f)
                verticalLineTo(11.07f)
                curveTo(21.9992f, 10.27f, 21.9992f, 9.17f, 20.4192f, 9.0f)
                close()
            }
        }
        .build()
        return _batteryempty!!
    }

private var _batteryempty: ImageVector? = null
