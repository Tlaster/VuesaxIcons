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

public val BulkGroup.Forwardsquare: ImageVector
    get() {
        if (_forwardsquare != null) {
            return _forwardsquare!!
        }
        _forwardsquare = Builder(name = "Forwardsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.82f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.82f, 4.17f, 21.99f, 7.81f, 21.99f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 21.99f, 21.99f, 19.82f, 21.99f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.53f, 8.6601f)
                lineTo(15.96f, 7.0901f)
                curveTo(15.67f, 6.8001f, 15.19f, 6.8001f, 14.9f, 7.0901f)
                curveTo(14.61f, 7.3801f, 14.61f, 7.8601f, 14.9f, 8.1501f)
                lineTo(15.23f, 8.4801f)
                horizontalLineTo(10.08f)
                curveTo(7.97f, 8.4801f, 6.25f, 10.2001f, 6.25f, 12.3101f)
                curveTo(6.25f, 14.4201f, 7.97f, 16.1401f, 10.08f, 16.1401f)
                horizontalLineTo(15.0f)
                curveTo(15.41f, 16.1401f, 15.75f, 15.8001f, 15.75f, 15.3901f)
                curveTo(15.75f, 14.9801f, 15.41f, 14.6401f, 15.0f, 14.6401f)
                horizontalLineTo(10.08f)
                curveTo(8.8f, 14.6401f, 7.75f, 13.6001f, 7.75f, 12.3101f)
                curveTo(7.75f, 11.0201f, 8.79f, 9.9801f, 10.08f, 9.9801f)
                horizontalLineTo(15.16f)
                lineTo(14.9f, 10.2401f)
                curveTo(14.61f, 10.5301f, 14.61f, 11.0101f, 14.9f, 11.3001f)
                curveTo(15.05f, 11.4501f, 15.24f, 11.5201f, 15.43f, 11.5201f)
                curveTo(15.62f, 11.5201f, 15.81f, 11.4501f, 15.96f, 11.3001f)
                lineTo(17.53f, 9.7301f)
                curveTo(17.82f, 9.4301f, 17.82f, 8.9601f, 17.53f, 8.6601f)
                close()
            }
        }
        .build()
        return _forwardsquare!!
    }

private var _forwardsquare: ImageVector? = null
