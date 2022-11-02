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

public val BulkGroup.Autobrightness: ImageVector
    get() {
        if (_autobrightness != null) {
            return _autobrightness!!
        }
        _autobrightness = Builder(name = "Autobrightness", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7509f, 2.4501f)
                curveTo(11.4509f, 1.8601f, 12.5809f, 1.8601f, 13.2609f, 2.4501f)
                lineTo(14.8409f, 3.8001f)
                curveTo(15.1409f, 4.0501f, 15.7109f, 4.2601f, 16.1109f, 4.2601f)
                horizontalLineTo(17.8109f)
                curveTo(18.8709f, 4.2601f, 19.7409f, 5.1301f, 19.7409f, 6.1901f)
                verticalLineTo(7.8901f)
                curveTo(19.7409f, 8.2901f, 19.9509f, 8.8501f, 20.2009f, 9.1501f)
                lineTo(21.5509f, 10.7301f)
                curveTo(22.1409f, 11.4301f, 22.1409f, 12.5601f, 21.5509f, 13.2401f)
                lineTo(20.2009f, 14.8201f)
                curveTo(19.9509f, 15.1201f, 19.7409f, 15.6801f, 19.7409f, 16.0801f)
                verticalLineTo(17.7801f)
                curveTo(19.7409f, 18.8401f, 18.8709f, 19.7101f, 17.8109f, 19.7101f)
                horizontalLineTo(16.1109f)
                curveTo(15.7109f, 19.7101f, 15.1509f, 19.9201f, 14.8509f, 20.1701f)
                lineTo(13.2709f, 21.5201f)
                curveTo(12.5709f, 22.1101f, 11.4409f, 22.1101f, 10.7609f, 21.5201f)
                lineTo(9.1809f, 20.1701f)
                curveTo(8.8809f, 19.9201f, 8.3109f, 19.7101f, 7.9209f, 19.7101f)
                horizontalLineTo(6.1709f)
                curveTo(5.1109f, 19.7101f, 4.2409f, 18.8401f, 4.2409f, 17.7801f)
                verticalLineTo(16.0701f)
                curveTo(4.2409f, 15.6801f, 4.0409f, 15.1101f, 3.7909f, 14.8201f)
                lineTo(2.4409f, 13.2301f)
                curveTo(1.8609f, 12.5401f, 1.8609f, 11.4201f, 2.4409f, 10.7301f)
                lineTo(3.7909f, 9.1401f)
                curveTo(4.0409f, 8.8401f, 4.2409f, 8.2801f, 4.2409f, 7.8901f)
                verticalLineTo(6.2001f)
                curveTo(4.2409f, 5.1401f, 5.1109f, 4.2701f, 6.1709f, 4.2701f)
                horizontalLineTo(7.9009f)
                curveTo(8.3009f, 4.2701f, 8.8609f, 4.0601f, 9.1609f, 3.8101f)
                lineTo(10.7509f, 2.4501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8105f, 16.24f)
                lineTo(12.0005f, 9.91f)
                lineTo(9.1905f, 16.24f)
                lineTo(7.8106f, 15.63f)
                lineTo(11.3105f, 7.76f)
                horizontalLineTo(12.6905f)
                lineTo(16.1905f, 15.63f)
                lineTo(14.8105f, 16.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 14.0601f)
                horizontalLineTo(10.25f)
                curveTo(9.84f, 14.0601f, 9.5f, 13.7201f, 9.5f, 13.3101f)
                curveTo(9.5f, 12.9001f, 9.84f, 12.5601f, 10.25f, 12.5601f)
                horizontalLineTo(13.75f)
                curveTo(14.16f, 12.5601f, 14.5f, 12.9001f, 14.5f, 13.3101f)
                curveTo(14.5f, 13.7201f, 14.16f, 14.0601f, 13.75f, 14.0601f)
                close()
            }
        }
        .build()
        return _autobrightness!!
    }

private var _autobrightness: ImageVector? = null
