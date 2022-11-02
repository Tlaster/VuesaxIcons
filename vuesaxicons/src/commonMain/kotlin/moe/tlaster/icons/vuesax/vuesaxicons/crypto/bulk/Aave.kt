package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BulkGroup

public val BulkGroup.Aave: ImageVector
    get() {
        if (_aave != null) {
            return _aave!!
        }
        _aave = Builder(name = "Aave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.6901f, 15.6999f)
                lineTo(12.6901f, 6.6999f)
                curveTo(12.4501f, 6.1599f, 11.5601f, 6.1599f, 11.3201f, 6.6999f)
                lineTo(9.3001f, 11.2499f)
                horizontalLineTo(8.0001f)
                curveTo(7.5901f, 11.2499f, 7.2501f, 11.5899f, 7.2501f, 11.9999f)
                curveTo(7.2501f, 12.4099f, 7.5901f, 12.7499f, 8.0001f, 12.7499f)
                horizontalLineTo(8.6201f)
                lineTo(7.3101f, 15.6999f)
                curveTo(7.1401f, 16.0799f, 7.3101f, 16.5199f, 7.6901f, 16.6899f)
                curveTo(8.0701f, 16.8599f, 8.5101f, 16.6899f, 8.6801f, 16.3099f)
                lineTo(10.2601f, 12.7599f)
                horizontalLineTo(12.0001f)
                curveTo(12.4101f, 12.7599f, 12.7501f, 12.4199f, 12.7501f, 12.0099f)
                curveTo(12.7501f, 11.5999f, 12.4101f, 11.2599f, 12.0001f, 11.2599f)
                horizontalLineTo(10.9301f)
                lineTo(12.0001f, 8.8599f)
                lineTo(15.3101f, 16.3199f)
                curveTo(15.4301f, 16.5999f, 15.7101f, 16.7699f, 16.0001f, 16.7699f)
                curveTo(16.1001f, 16.7699f, 16.2101f, 16.7499f, 16.3001f, 16.7099f)
                curveTo(16.6801f, 16.5199f, 16.8501f, 16.0699f, 16.6901f, 15.6999f)
                close()
            }
        }
        .build()
        return _aave!!
    }

private var _aave: ImageVector? = null
