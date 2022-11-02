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

public val BulkGroup.Arrowright1: ImageVector
    get() {
        if (_arrowright1 != null) {
            return _arrowright1!!
        }
        _arrowright1 = Builder(name = "Arrowright1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.3299f)
                verticalLineTo(14.6699f)
                curveTo(6.0f, 17.9899f, 8.35f, 19.3399f, 11.22f, 17.6899f)
                lineTo(12.5f, 16.9499f)
                curveTo(12.81f, 16.7699f, 13.0f, 16.4399f, 13.0f, 16.0799f)
                verticalLineTo(7.9199f)
                curveTo(13.0f, 7.5599f, 12.81f, 7.2299f, 12.5f, 7.0499f)
                lineTo(11.22f, 6.3099f)
                curveTo(8.35f, 4.6599f, 6.0f, 6.0099f, 6.0f, 9.3299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 8.7901f)
                verticalLineTo(15.2201f)
                curveTo(14.0f, 15.6101f, 14.42f, 15.8501f, 14.75f, 15.6501f)
                lineTo(15.85f, 15.0101f)
                curveTo(18.72f, 13.3601f, 18.72f, 10.6401f, 15.85f, 8.9901f)
                lineTo(14.75f, 8.3501f)
                curveTo(14.42f, 8.1601f, 14.0f, 8.4001f, 14.0f, 8.7901f)
                close()
            }
        }
        .build()
        return _arrowright1!!
    }

private var _arrowright1: ImageVector? = null
