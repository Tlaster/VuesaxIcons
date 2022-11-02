package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Autobrightness: ImageVector
    get() {
        if (_autobrightness != null) {
            return _autobrightness!!
        }
        _autobrightness = Builder(name = "Autobrightness", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.2409f, 6.2001f)
                curveTo(4.2409f, 5.1401f, 5.1109f, 4.2701f, 6.1709f, 4.2701f)
                horizontalLineTo(7.9009f)
                curveTo(8.3009f, 4.2701f, 8.8609f, 4.0601f, 9.1609f, 3.8101f)
                lineTo(10.7409f, 2.4601f)
                curveTo(11.4409f, 1.8701f, 12.5709f, 1.8701f, 13.2509f, 2.4601f)
                lineTo(14.8309f, 3.8101f)
                curveTo(15.1309f, 4.0601f, 15.7009f, 4.2701f, 16.1009f, 4.2701f)
                horizontalLineTo(17.8009f)
                curveTo(18.8609f, 4.2701f, 19.7309f, 5.1401f, 19.7309f, 6.2001f)
                verticalLineTo(7.9001f)
                curveTo(19.7309f, 8.3001f, 19.9409f, 8.8601f, 20.1909f, 9.1601f)
                lineTo(21.5409f, 10.7401f)
                curveTo(22.1309f, 11.4401f, 22.1309f, 12.5701f, 21.5409f, 13.2501f)
                lineTo(20.1909f, 14.8301f)
                curveTo(19.9409f, 15.1301f, 19.7309f, 15.6901f, 19.7309f, 16.0901f)
                verticalLineTo(17.7901f)
                curveTo(19.7309f, 18.8501f, 18.8609f, 19.7201f, 17.8009f, 19.7201f)
                horizontalLineTo(16.1009f)
                curveTo(15.7009f, 19.7201f, 15.1409f, 19.9301f, 14.8409f, 20.1801f)
                lineTo(13.2609f, 21.5301f)
                curveTo(12.5609f, 22.1201f, 11.4309f, 22.1201f, 10.7509f, 21.5301f)
                lineTo(9.1709f, 20.1801f)
                curveTo(8.8709f, 19.9301f, 8.3009f, 19.7201f, 7.9109f, 19.7201f)
                horizontalLineTo(6.1709f)
                curveTo(5.1109f, 19.7201f, 4.2409f, 18.8501f, 4.2409f, 17.7901f)
                verticalLineTo(16.0801f)
                curveTo(4.2409f, 15.6901f, 4.0409f, 15.1201f, 3.7909f, 14.8301f)
                lineTo(2.4409f, 13.2401f)
                curveTo(1.8609f, 12.5501f, 1.8609f, 11.4301f, 2.4409f, 10.7401f)
                lineTo(3.0009f, 10.0801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 15.9401f)
                lineTo(12.0f, 8.0601f)
                lineTo(15.5f, 15.9401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.75f, 13.3101f)
                horizontalLineTo(10.25f)
            }
        }
        .build()
        return _autobrightness!!
    }

private var _autobrightness: ImageVector? = null
