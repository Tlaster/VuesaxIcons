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

public val BulkGroup.Maker: ImageVector
    get() {
        if (_maker != null) {
            return _maker!!
        }
        _maker = Builder(name = "Maker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7501f, 15.2502f)
                curveTo(10.3401f, 15.2502f, 10.0001f, 14.9102f, 10.0001f, 14.5002f)
                verticalLineTo(12.4202f)
                lineTo(7.3301f, 10.8202f)
                verticalLineTo(14.5002f)
                curveTo(7.3301f, 14.9102f, 6.9901f, 15.2502f, 6.5801f, 15.2502f)
                curveTo(6.1701f, 15.2502f, 5.8301f, 14.9102f, 5.8301f, 14.5002f)
                verticalLineTo(9.5002f)
                curveTo(5.8301f, 9.2302f, 5.9801f, 8.9802f, 6.2101f, 8.8502f)
                curveTo(6.4401f, 8.7202f, 6.7301f, 8.7202f, 6.9601f, 8.8602f)
                lineTo(11.1301f, 11.3602f)
                curveTo(11.3601f, 11.5002f, 11.4901f, 11.7402f, 11.4901f, 12.0002f)
                verticalLineTo(14.5002f)
                curveTo(11.5001f, 14.9102f, 11.1601f, 15.2502f, 10.7501f, 15.2502f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 15.2502f)
                curveTo(17.01f, 15.2502f, 16.67f, 14.9102f, 16.67f, 14.5002f)
                verticalLineTo(10.8202f)
                lineTo(14.0f, 12.4202f)
                verticalLineTo(14.5002f)
                curveTo(14.0f, 14.9102f, 13.66f, 15.2502f, 13.25f, 15.2502f)
                curveTo(12.84f, 15.2502f, 12.5f, 14.9102f, 12.5f, 14.5002f)
                verticalLineTo(12.0002f)
                curveTo(12.5f, 11.7402f, 12.64f, 11.4902f, 12.86f, 11.3602f)
                lineTo(17.03f, 8.8602f)
                curveTo(17.26f, 8.7202f, 17.55f, 8.7202f, 17.78f, 8.8502f)
                curveTo(18.02f, 8.9802f, 18.16f, 9.2302f, 18.16f, 9.5002f)
                verticalLineTo(14.5002f)
                curveTo(18.17f, 14.9102f, 17.83f, 15.2502f, 17.42f, 15.2502f)
                close()
            }
        }
        .build()
        return _maker!!
    }

private var _maker: ImageVector? = null
