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

public val BulkGroup.Searchnormal1: ImageVector
    get() {
        if (_searchnormal1 != null) {
            return _searchnormal1!!
        }
        _searchnormal1 = Builder(name = "Searchnormal1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 21.0f)
                curveTo(16.7467f, 21.0f, 21.0f, 16.7467f, 21.0f, 11.5f)
                curveTo(21.0f, 6.2533f, 16.7467f, 2.0f, 11.5f, 2.0f)
                curveTo(6.2533f, 2.0f, 2.0f, 6.2533f, 2.0f, 11.5f)
                curveTo(2.0f, 16.7467f, 6.2533f, 21.0f, 11.5f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3005f, 22.0001f)
                curveTo(21.1205f, 22.0001f, 20.9405f, 21.9301f, 20.8105f, 21.8001f)
                lineTo(18.9505f, 19.9401f)
                curveTo(18.6805f, 19.6701f, 18.6805f, 19.2301f, 18.9505f, 18.9501f)
                curveTo(19.2205f, 18.6801f, 19.6605f, 18.6801f, 19.9405f, 18.9501f)
                lineTo(21.8005f, 20.8101f)
                curveTo(22.0705f, 21.0801f, 22.0705f, 21.5201f, 21.8005f, 21.8001f)
                curveTo(21.6605f, 21.9301f, 21.4805f, 22.0001f, 21.3005f, 22.0001f)
                close()
            }
        }
        .build()
        return _searchnormal1!!
    }

private var _searchnormal1: ImageVector? = null
