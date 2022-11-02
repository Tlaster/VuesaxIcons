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

public val TwotoneGroup.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.9f, 20.0f, 4.0f)
                verticalLineTo(8.32f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.9f, 2.0f, 6.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.3198f)
                verticalLineTo(11.8798f)
                curveTo(4.0f, 12.9598f, 4.58f, 13.9598f, 5.53f, 14.4898f)
                lineTo(8.49f, 16.1598f)
                curveTo(9.12f, 16.5098f, 9.51f, 17.1798f, 9.51f, 17.8998f)
                verticalLineTo(19.9998f)
                curveTo(9.51f, 21.0998f, 10.41f, 21.9998f, 11.51f, 21.9998f)
                horizontalLineTo(12.51f)
                curveTo(13.61f, 21.9998f, 14.51f, 21.0998f, 14.51f, 19.9998f)
                verticalLineTo(17.8998f)
                curveTo(14.51f, 17.1798f, 14.9f, 16.5098f, 15.53f, 16.1598f)
                lineTo(18.49f, 14.4898f)
                curveTo(19.43f, 13.9598f, 20.02f, 12.9598f, 20.02f, 11.8798f)
                verticalLineTo(8.3198f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
