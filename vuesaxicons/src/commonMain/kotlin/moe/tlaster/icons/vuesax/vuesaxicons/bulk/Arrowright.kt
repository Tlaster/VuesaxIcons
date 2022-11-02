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

public val BulkGroup.Arrowright: ImageVector
    get() {
        if (_arrowright != null) {
            return _arrowright!!
        }
        _arrowright = Builder(name = "Arrowright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.03f, 11.4699f)
                lineTo(13.03f, 8.4699f)
                curveTo(12.74f, 8.1799f, 12.26f, 8.1799f, 11.97f, 8.4699f)
                curveTo(11.68f, 8.7599f, 11.68f, 9.2399f, 11.97f, 9.5299f)
                lineTo(13.69f, 11.2499f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.2499f, 7.75f, 11.5899f, 7.75f, 11.9999f)
                curveTo(7.75f, 12.4099f, 8.09f, 12.7499f, 8.5f, 12.7499f)
                horizontalLineTo(13.69f)
                lineTo(11.97f, 14.4699f)
                curveTo(11.68f, 14.7599f, 11.68f, 15.2399f, 11.97f, 15.5299f)
                curveTo(12.12f, 15.6799f, 12.31f, 15.7499f, 12.5f, 15.7499f)
                curveTo(12.69f, 15.7499f, 12.88f, 15.6799f, 13.03f, 15.5299f)
                lineTo(16.03f, 12.5299f)
                curveTo(16.32f, 12.2399f, 16.32f, 11.7599f, 16.03f, 11.4699f)
                close()
            }
        }
        .build()
        return _arrowright!!
    }

private var _arrowright: ImageVector? = null
