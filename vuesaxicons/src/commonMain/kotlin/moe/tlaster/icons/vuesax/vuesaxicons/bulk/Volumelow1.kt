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

public val BulkGroup.Volumelow1: ImageVector
    get() {
        if (_volumelow1 != null) {
            return _volumelow1!!
        }
        _volumelow1 = Builder(name = "Volumelow1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3304f, 16.7498f)
                curveTo(19.1704f, 16.7498f, 19.0204f, 16.6998f, 18.8804f, 16.5998f)
                curveTo(18.5504f, 16.3498f, 18.4804f, 15.8798f, 18.7304f, 15.5498f)
                curveTo(20.3004f, 13.4598f, 20.3004f, 10.5398f, 18.7304f, 8.4498f)
                curveTo(18.4804f, 8.1198f, 18.5504f, 7.6498f, 18.8804f, 7.3998f)
                curveTo(19.2104f, 7.1498f, 19.6804f, 7.2198f, 19.9304f, 7.5498f)
                curveTo(21.9004f, 10.1698f, 21.9004f, 13.8298f, 19.9304f, 16.4498f)
                curveTo(19.7904f, 16.6498f, 19.5604f, 16.7498f, 19.3304f, 16.7498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0801f, 7.4102f)
                verticalLineTo(16.5902f)
                curveTo(17.0801f, 18.3102f, 16.4601f, 19.6002f, 15.3501f, 20.2202f)
                curveTo(14.9001f, 20.4702f, 14.4001f, 20.5902f, 13.8801f, 20.5902f)
                curveTo(13.0801f, 20.5902f, 12.2201f, 20.3202f, 11.3401f, 19.7702f)
                lineTo(8.4201f, 17.9402f)
                curveTo(8.2201f, 17.8202f, 7.9901f, 17.7502f, 7.7601f, 17.7502f)
                horizontalLineTo(6.8301f)
                verticalLineTo(6.2502f)
                horizontalLineTo(7.7601f)
                curveTo(7.9901f, 6.2502f, 8.2201f, 6.1802f, 8.4201f, 6.0602f)
                lineTo(11.3401f, 4.2302f)
                curveTo(12.8001f, 3.3202f, 14.2301f, 3.1602f, 15.3501f, 3.7802f)
                curveTo(16.4601f, 4.4002f, 17.0801f, 5.6902f, 17.0801f, 7.4102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.8301f, 6.25f)
                verticalLineTo(17.75f)
                horizontalLineTo(6.3301f)
                curveTo(3.9101f, 17.75f, 2.5801f, 16.42f, 2.5801f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.5801f, 7.58f, 3.9101f, 6.25f, 6.3301f, 6.25f)
                horizontalLineTo(6.8301f)
                close()
            }
        }
        .build()
        return _volumelow1!!
    }

private var _volumelow1: ImageVector? = null
