package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Information: ImageVector
    get() {
        if (_information != null) {
            return _information!!
        }
        _information = Builder(name = "Information", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7509f, 2.4498f)
                curveTo(11.4509f, 1.8598f, 12.5809f, 1.8598f, 13.2609f, 2.4498f)
                lineTo(14.8409f, 3.7998f)
                curveTo(15.1409f, 4.0498f, 15.7109f, 4.2598f, 16.1109f, 4.2598f)
                horizontalLineTo(17.8109f)
                curveTo(18.8709f, 4.2598f, 19.7409f, 5.1298f, 19.7409f, 6.1898f)
                verticalLineTo(7.8898f)
                curveTo(19.7409f, 8.2898f, 19.9509f, 8.8498f, 20.2009f, 9.1498f)
                lineTo(21.5509f, 10.7298f)
                curveTo(22.1409f, 11.4298f, 22.1409f, 12.5598f, 21.5509f, 13.2398f)
                lineTo(20.2009f, 14.8198f)
                curveTo(19.9509f, 15.1198f, 19.7409f, 15.6798f, 19.7409f, 16.0798f)
                verticalLineTo(17.7798f)
                curveTo(19.7409f, 18.8398f, 18.8709f, 19.7098f, 17.8109f, 19.7098f)
                horizontalLineTo(16.1109f)
                curveTo(15.7109f, 19.7098f, 15.1509f, 19.9198f, 14.8509f, 20.1698f)
                lineTo(13.2709f, 21.5198f)
                curveTo(12.5709f, 22.1098f, 11.4409f, 22.1098f, 10.7609f, 21.5198f)
                lineTo(9.1809f, 20.1698f)
                curveTo(8.8809f, 19.9198f, 8.3109f, 19.7098f, 7.9209f, 19.7098f)
                horizontalLineTo(6.1709f)
                curveTo(5.1109f, 19.7098f, 4.2409f, 18.8398f, 4.2409f, 17.7798f)
                verticalLineTo(16.0698f)
                curveTo(4.2409f, 15.6798f, 4.0409f, 15.1098f, 3.7909f, 14.8198f)
                lineTo(2.4409f, 13.2298f)
                curveTo(1.8609f, 12.5398f, 1.8609f, 11.4198f, 2.4409f, 10.7298f)
                lineTo(3.7909f, 9.1398f)
                curveTo(4.0409f, 8.8398f, 4.2409f, 8.2798f, 4.2409f, 7.8898f)
                verticalLineTo(6.1998f)
                curveTo(4.2409f, 5.1398f, 5.1109f, 4.2698f, 6.1709f, 4.2698f)
                horizontalLineTo(7.9009f)
                curveTo(8.3009f, 4.2698f, 8.8609f, 4.0598f, 9.1609f, 3.8098f)
                lineTo(10.7509f, 2.4498f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.1299f)
                verticalLineTo(12.9599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9941f, 16.0f)
                horizontalLineTo(12.0031f)
            }
        }
        .build()
        return _information!!
    }

private var _information: ImageVector? = null
