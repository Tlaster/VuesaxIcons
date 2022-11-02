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

public val BulkGroup.Folderopen: ImageVector
    get() {
        if (_folderopen != null) {
            return _folderopen!!
        }
        _folderopen = Builder(name = "Folderopen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0602f, 11.8201f)
                lineTo(20.9002f, 11.6001f)
                curveTo(20.6202f, 11.2601f, 20.2902f, 10.9901f, 19.9102f, 10.7901f)
                curveTo(19.4002f, 10.5001f, 18.8202f, 10.3501f, 18.2202f, 10.3501f)
                horizontalLineTo(5.7702f)
                curveTo(5.1702f, 10.3501f, 4.6002f, 10.5001f, 4.0802f, 10.7901f)
                curveTo(3.6902f, 11.0001f, 3.3402f, 11.2901f, 3.0502f, 11.6501f)
                curveTo(2.4802f, 12.3801f, 2.2102f, 13.2801f, 2.3002f, 14.1801f)
                lineTo(2.6702f, 18.8501f)
                curveTo(2.8002f, 20.2601f, 2.9702f, 22.0001f, 6.1402f, 22.0001f)
                horizontalLineTo(17.8602f)
                curveTo(21.0302f, 22.0001f, 21.1902f, 20.2601f, 21.3302f, 18.8401f)
                lineTo(21.7002f, 14.1901f)
                curveTo(21.7902f, 13.3501f, 21.5702f, 12.5101f, 21.0602f, 11.8201f)
                close()
                moveTo(14.3902f, 17.3401f)
                horizontalLineTo(9.6002f)
                curveTo(9.2102f, 17.3401f, 8.9002f, 17.0201f, 8.9002f, 16.6401f)
                curveTo(8.9002f, 16.2601f, 9.2102f, 15.9401f, 9.6002f, 15.9401f)
                horizontalLineTo(14.3902f)
                curveTo(14.7802f, 15.9401f, 15.0902f, 16.2601f, 15.0902f, 16.6401f)
                curveTo(15.0902f, 17.0301f, 14.7802f, 17.3401f, 14.3902f, 17.3401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.3809f, 11.31f)
                curveTo(3.6009f, 11.11f, 3.8209f, 10.93f, 4.0809f, 10.79f)
                curveTo(4.5909f, 10.5f, 5.1709f, 10.35f, 5.7709f, 10.35f)
                horizontalLineTo(18.2309f)
                curveTo(18.8309f, 10.35f, 19.4009f, 10.5f, 19.9209f, 10.79f)
                curveTo(20.1809f, 10.93f, 20.4109f, 11.11f, 20.6209f, 11.32f)
                verticalLineTo(10.79f)
                verticalLineTo(9.82f)
                curveTo(20.6209f, 6.25f, 19.5309f, 5.16f, 15.9609f, 5.16f)
                horizontalLineTo(13.5809f)
                curveTo(13.1409f, 5.16f, 13.1309f, 5.15f, 12.8709f, 4.81f)
                lineTo(11.6709f, 3.2f)
                curveTo(11.1009f, 2.46f, 10.6509f, 2.0f, 9.2209f, 2.0f)
                horizontalLineTo(8.0409f)
                curveTo(4.4709f, 2.0f, 3.3809f, 3.09f, 3.3809f, 6.66f)
                verticalLineTo(10.8f)
                verticalLineTo(11.31f)
                close()
            }
        }
        .build()
        return _folderopen!!
    }

private var _folderopen: ImageVector? = null
