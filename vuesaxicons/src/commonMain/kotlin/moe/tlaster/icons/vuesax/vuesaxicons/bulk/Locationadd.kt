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

public val BulkGroup.Locationadd: ImageVector
    get() {
        if (_locationadd != null) {
            return _locationadd!!
        }
        _locationadd = Builder(name = "Locationadd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6207f, 8.7f)
                curveTo(19.5807f, 4.07f, 15.5407f, 2.0f, 12.0007f, 2.0f)
                curveTo(12.0007f, 2.0f, 12.0007f, 2.0f, 11.9907f, 2.0f)
                curveTo(8.4607f, 2.0f, 4.4307f, 4.07f, 3.3807f, 8.69f)
                curveTo(2.2007f, 13.85f, 5.3607f, 18.22f, 8.2207f, 20.98f)
                curveTo(9.2807f, 22.0f, 10.6407f, 22.51f, 12.0007f, 22.51f)
                curveTo(13.3607f, 22.51f, 14.7207f, 22.0f, 15.7707f, 20.98f)
                curveTo(18.6307f, 18.22f, 21.7907f, 13.86f, 20.6207f, 8.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 10.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.25f)
                curveTo(12.75f, 7.84f, 12.41f, 7.5f, 12.0f, 7.5f)
                curveTo(11.59f, 7.5f, 11.25f, 7.84f, 11.25f, 8.25f)
                verticalLineTo(10.25f)
                horizontalLineTo(9.25f)
                curveTo(8.84f, 10.25f, 8.5f, 10.59f, 8.5f, 11.0f)
                curveTo(8.5f, 11.41f, 8.84f, 11.75f, 9.25f, 11.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.75f)
                curveTo(11.25f, 14.16f, 11.59f, 14.5f, 12.0f, 14.5f)
                curveTo(12.41f, 14.5f, 12.75f, 14.16f, 12.75f, 13.75f)
                verticalLineTo(11.75f)
                horizontalLineTo(14.75f)
                curveTo(15.16f, 11.75f, 15.5f, 11.41f, 15.5f, 11.0f)
                curveTo(15.5f, 10.59f, 15.16f, 10.25f, 14.75f, 10.25f)
                close()
            }
        }
        .build()
        return _locationadd!!
    }

private var _locationadd: ImageVector? = null
