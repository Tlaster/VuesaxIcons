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

public val TwotoneGroup.Quoteup: ImageVector
    get() {
        if (_quoteup != null) {
            return _quoteup!!
        }
        _quoteup = Builder(name = "Quoteup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.3501f)
                horizontalLineTo(7.8f)
                curveTo(9.33f, 12.3501f, 10.38f, 13.5101f, 10.38f, 14.9301f)
                verticalLineTo(18.1501f)
                curveTo(10.38f, 19.5701f, 9.33f, 20.7301f, 7.8f, 20.7301f)
                horizontalLineTo(4.58f)
                curveTo(3.16f, 20.7301f, 2.0f, 19.5701f, 2.0f, 18.1501f)
                verticalLineTo(12.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.3502f)
                curveTo(2.0f, 6.3002f, 3.13f, 5.3003f, 6.53f, 3.2803f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6309f, 12.3501f)
                horizontalLineTo(19.4308f)
                curveTo(20.9608f, 12.3501f, 22.0109f, 13.5101f, 22.0109f, 14.9301f)
                verticalLineTo(18.1501f)
                curveTo(22.0109f, 19.5701f, 20.9608f, 20.7301f, 19.4308f, 20.7301f)
                horizontalLineTo(16.2109f)
                curveTo(14.7909f, 20.7301f, 13.6309f, 19.5701f, 13.6309f, 18.1501f)
                verticalLineTo(12.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6309f, 12.3502f)
                curveTo(13.6309f, 6.3002f, 14.7608f, 5.3003f, 18.1608f, 3.2803f)
            }
        }
        .build()
        return _quoteup!!
    }

private var _quoteup: ImageVector? = null
