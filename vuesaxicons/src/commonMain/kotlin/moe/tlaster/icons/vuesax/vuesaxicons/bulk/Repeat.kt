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

public val BulkGroup.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4201f, 4.4099f)
                horizontalLineTo(5.3901f)
                lineTo(7.2701f, 2.53f)
                curveTo(7.5601f, 2.24f, 7.5601f, 1.7599f, 7.2701f, 1.4699f)
                curveTo(6.9801f, 1.1799f, 6.5001f, 1.1799f, 6.2101f, 1.4699f)
                lineTo(3.0501f, 4.63f)
                curveTo(2.9801f, 4.7f, 2.9301f, 4.78f, 2.8901f, 4.87f)
                curveTo(2.8501f, 4.96f, 2.8301f, 5.0599f, 2.8301f, 5.1599f)
                curveTo(2.8301f, 5.2599f, 2.8501f, 5.36f, 2.8901f, 5.45f)
                curveTo(2.9301f, 5.54f, 2.9801f, 5.62f, 3.0501f, 5.69f)
                lineTo(6.2101f, 8.8499f)
                curveTo(6.3601f, 9.0f, 6.5501f, 9.07f, 6.7401f, 9.07f)
                curveTo(6.9301f, 9.07f, 7.1201f, 9.0f, 7.2701f, 8.8499f)
                curveTo(7.5601f, 8.5599f, 7.5601f, 8.08f, 7.2701f, 7.7899f)
                lineTo(5.3901f, 5.9099f)
                horizontalLineTo(17.4201f)
                curveTo(18.6601f, 5.9099f, 19.6701f, 6.9199f, 19.6701f, 8.1599f)
                verticalLineTo(11.48f)
                curveTo(19.6701f, 11.89f, 20.0101f, 12.23f, 20.4201f, 12.23f)
                curveTo(20.8301f, 12.23f, 21.1701f, 11.89f, 21.1701f, 11.48f)
                verticalLineTo(8.1599f)
                curveTo(21.1701f, 6.0899f, 19.4901f, 4.4099f, 17.4201f, 4.4099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.1701f, 18.84f)
                curveTo(21.1701f, 18.74f, 21.1501f, 18.64f, 21.1101f, 18.55f)
                curveTo(21.0701f, 18.46f, 21.0201f, 18.38f, 20.9501f, 18.31f)
                lineTo(17.7901f, 15.15f)
                curveTo(17.5001f, 14.86f, 17.0201f, 14.86f, 16.7301f, 15.15f)
                curveTo(16.4401f, 15.44f, 16.4401f, 15.92f, 16.7301f, 16.21f)
                lineTo(18.6101f, 18.09f)
                horizontalLineTo(6.5801f)
                curveTo(5.3401f, 18.09f, 4.3301f, 17.08f, 4.3301f, 15.84f)
                verticalLineTo(12.52f)
                curveTo(4.3301f, 12.11f, 3.9901f, 11.77f, 3.5801f, 11.77f)
                curveTo(3.1701f, 11.77f, 2.8301f, 12.11f, 2.8301f, 12.52f)
                verticalLineTo(15.84f)
                curveTo(2.8301f, 17.91f, 4.5101f, 19.59f, 6.5801f, 19.59f)
                horizontalLineTo(18.6101f)
                lineTo(16.7301f, 21.47f)
                curveTo(16.4401f, 21.76f, 16.4401f, 22.24f, 16.7301f, 22.53f)
                curveTo(16.8801f, 22.68f, 17.0701f, 22.75f, 17.2601f, 22.75f)
                curveTo(17.4501f, 22.75f, 17.6401f, 22.68f, 17.7901f, 22.53f)
                lineTo(20.9501f, 19.37f)
                curveTo(21.0201f, 19.3f, 21.0701f, 19.22f, 21.1101f, 19.13f)
                curveTo(21.1501f, 19.04f, 21.1701f, 18.94f, 21.1701f, 18.84f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
