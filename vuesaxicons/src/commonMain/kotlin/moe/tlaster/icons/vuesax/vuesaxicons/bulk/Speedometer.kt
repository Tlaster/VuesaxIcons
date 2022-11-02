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

public val BulkGroup.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0992f, 20.2999f)
                curveTo(18.8992f, 20.2999f, 18.6992f, 20.2f, 18.5992f, 20.1f)
                curveTo(18.2992f, 19.8f, 18.2992f, 19.2999f, 18.5992f, 19.0f)
                curveTo(20.2992f, 17.3f, 21.1992f, 15.0f, 21.1992f, 12.5f)
                curveTo(21.1992f, 7.4f, 17.0992f, 3.2999f, 11.9992f, 3.2999f)
                curveTo(6.8992f, 3.2999f, 2.7992f, 7.4f, 2.7992f, 12.5f)
                curveTo(2.7992f, 14.9f, 3.6992f, 17.2f, 5.3992f, 19.0f)
                curveTo(5.6992f, 19.2999f, 5.6992f, 19.8f, 5.3992f, 20.1f)
                curveTo(5.0992f, 20.4f, 4.5992f, 20.4f, 4.2992f, 20.1f)
                curveTo(2.2992f, 18.1f, 1.1992f, 15.4f, 1.1992f, 12.6f)
                curveTo(1.1992f, 6.5999f, 6.0992f, 1.6999f, 11.9992f, 1.6999f)
                curveTo(17.8992f, 1.6999f, 22.7992f, 6.4999f, 22.7992f, 12.5f)
                curveTo(22.7992f, 15.3f, 21.6992f, 18.0f, 19.6992f, 20.0f)
                curveTo(19.4992f, 20.2f, 19.2992f, 20.2999f, 19.0992f, 20.2999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9996f, 22.0f)
                curveTo(14.1535f, 22.0f, 15.8996f, 20.2539f, 15.8996f, 18.1f)
                curveTo(15.8996f, 15.946f, 14.1535f, 14.2f, 11.9996f, 14.2f)
                curveTo(9.8457f, 14.2f, 8.0996f, 15.946f, 8.0996f, 18.1f)
                curveTo(8.0996f, 20.2539f, 9.8457f, 22.0f, 11.9996f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.5f)
                curveTo(14.9f, 8.5f, 14.0f, 9.4f, 14.0f, 10.5f)
                verticalLineTo(11.3f)
                curveTo(14.0f, 12.0f, 14.6f, 12.5f, 15.2f, 12.5f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 12.5f, 18.0f, 11.6f, 18.0f, 10.5f)
                curveTo(18.0f, 9.4f, 17.1f, 8.5f, 16.0f, 8.5f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
