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

public val TwotoneGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.2598f, 11.0199f)
                verticalLineTo(15.9899f)
                curveTo(4.2598f, 17.8099f, 4.2598f, 17.8099f, 5.9798f, 18.9699f)
                lineTo(10.7098f, 21.6999f)
                curveTo(11.4198f, 22.1099f, 12.5798f, 22.1099f, 13.2898f, 21.6999f)
                lineTo(18.0198f, 18.9699f)
                curveTo(19.7398f, 17.8099f, 19.7398f, 17.8099f, 19.7398f, 15.9899f)
                verticalLineTo(11.0199f)
                curveTo(19.7398f, 9.1999f, 19.7398f, 9.1999f, 18.0198f, 8.0399f)
                lineTo(13.2898f, 5.3099f)
                curveTo(12.5798f, 4.8999f, 11.4198f, 4.8999f, 10.7098f, 5.3099f)
                lineTo(5.9798f, 8.0399f)
                curveTo(4.2598f, 9.1999f, 4.2598f, 9.1999f, 4.2598f, 11.0199f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 7.63f)
                verticalLineTo(5.0f)
                curveTo(17.5f, 3.0f, 16.5f, 2.0f, 14.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(7.5f, 2.0f, 6.5f, 3.0f, 6.5f, 5.0f)
                verticalLineTo(7.56f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6298f, 10.99f)
                lineTo(13.1998f, 11.88f)
                curveTo(13.2898f, 12.02f, 13.4898f, 12.16f, 13.6398f, 12.2f)
                lineTo(14.6598f, 12.46f)
                curveTo(15.2898f, 12.62f, 15.4598f, 13.16f, 15.0498f, 13.66f)
                lineTo(14.3798f, 14.47f)
                curveTo(14.2798f, 14.6f, 14.1998f, 14.83f, 14.2098f, 14.99f)
                lineTo(14.2698f, 16.04f)
                curveTo(14.3098f, 16.69f, 13.8498f, 17.02f, 13.2498f, 16.78f)
                lineTo(12.2698f, 16.39f)
                curveTo(12.1198f, 16.33f, 11.8698f, 16.33f, 11.7198f, 16.39f)
                lineTo(10.7398f, 16.78f)
                curveTo(10.1398f, 17.02f, 9.6798f, 16.68f, 9.7198f, 16.04f)
                lineTo(9.7798f, 14.99f)
                curveTo(9.7898f, 14.83f, 9.7098f, 14.59f, 9.6098f, 14.47f)
                lineTo(8.9398f, 13.66f)
                curveTo(8.5298f, 13.16f, 8.6998f, 12.62f, 9.3298f, 12.46f)
                lineTo(10.3498f, 12.2f)
                curveTo(10.5098f, 12.16f, 10.7098f, 12.01f, 10.7898f, 11.88f)
                lineTo(11.3598f, 10.99f)
                curveTo(11.7198f, 10.45f, 12.2798f, 10.45f, 12.6298f, 10.99f)
                close()
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
