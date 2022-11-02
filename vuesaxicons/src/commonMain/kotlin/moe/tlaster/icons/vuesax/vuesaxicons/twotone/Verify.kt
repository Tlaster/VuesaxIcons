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

public val TwotoneGroup.Verify: ImageVector
    get() {
        if (_verify != null) {
            return _verify!!
        }
        _verify = Builder(name = "Verify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3809f, 12.0001f)
                lineTo(10.7909f, 14.4201f)
                lineTo(15.6209f, 9.5801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7509f, 2.4498f)
                curveTo(11.4409f, 1.8598f, 12.5709f, 1.8598f, 13.2709f, 2.4498f)
                lineTo(14.8509f, 3.8098f)
                curveTo(15.1509f, 4.0698f, 15.7109f, 4.2798f, 16.1109f, 4.2798f)
                horizontalLineTo(17.8109f)
                curveTo(18.8709f, 4.2798f, 19.7409f, 5.1498f, 19.7409f, 6.2098f)
                verticalLineTo(7.9098f)
                curveTo(19.7409f, 8.2998f, 19.9509f, 8.8698f, 20.2109f, 9.1698f)
                lineTo(21.5709f, 10.7498f)
                curveTo(22.1609f, 11.4398f, 22.1609f, 12.5698f, 21.5709f, 13.2698f)
                lineTo(20.2109f, 14.8498f)
                curveTo(19.9509f, 15.1498f, 19.7409f, 15.7098f, 19.7409f, 16.1098f)
                verticalLineTo(17.8098f)
                curveTo(19.7409f, 18.8698f, 18.8709f, 19.7398f, 17.8109f, 19.7398f)
                horizontalLineTo(16.1109f)
                curveTo(15.7209f, 19.7398f, 15.1509f, 19.9498f, 14.8509f, 20.2098f)
                lineTo(13.2709f, 21.5698f)
                curveTo(12.5809f, 22.1598f, 11.4509f, 22.1598f, 10.7509f, 21.5698f)
                lineTo(9.1709f, 20.2098f)
                curveTo(8.8709f, 19.9498f, 8.3109f, 19.7398f, 7.9109f, 19.7398f)
                horizontalLineTo(6.1809f)
                curveTo(5.1209f, 19.7398f, 4.2509f, 18.8698f, 4.2509f, 17.8098f)
                verticalLineTo(16.0998f)
                curveTo(4.2509f, 15.7098f, 4.0409f, 15.1498f, 3.7909f, 14.8498f)
                lineTo(2.4409f, 13.2598f)
                curveTo(1.8609f, 12.5698f, 1.8609f, 11.4498f, 2.4409f, 10.7598f)
                lineTo(3.7909f, 9.1698f)
                curveTo(4.0409f, 8.8698f, 4.2509f, 8.3098f, 4.2509f, 7.9198f)
                verticalLineTo(6.1998f)
                curveTo(4.2509f, 5.1398f, 5.1209f, 4.2698f, 6.1809f, 4.2698f)
                horizontalLineTo(7.9109f)
                curveTo(8.3009f, 4.2698f, 8.8709f, 4.0598f, 9.1709f, 3.7998f)
                lineTo(10.7509f, 2.4498f)
                close()
            }
        }
        .build()
        return _verify!!
    }

private var _verify: ImageVector? = null
