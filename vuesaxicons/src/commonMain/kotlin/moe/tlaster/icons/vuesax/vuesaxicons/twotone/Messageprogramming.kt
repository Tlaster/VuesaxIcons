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

public val TwotoneGroup.Messageprogramming: ImageVector
    get() {
        if (_messageprogramming != null) {
            return _messageprogramming!!
        }
        _messageprogramming = Builder(name = "Messageprogramming", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 18.9697f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 18.9697f, 2.0f, 17.9697f, 2.0f, 12.9697f)
                verticalLineTo(7.9697f)
                curveTo(2.0f, 3.9697f, 4.0f, 1.9697f, 8.0f, 1.9697f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 1.9697f, 22.0f, 3.9697f, 22.0f, 7.9697f)
                verticalLineTo(12.9697f)
                curveTo(22.0f, 16.9697f, 20.0f, 18.9697f, 16.0f, 18.9697f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 18.9697f, 14.89f, 19.1198f, 14.7f, 19.3698f)
                lineTo(13.2f, 21.3698f)
                curveTo(12.54f, 22.2498f, 11.46f, 22.2498f, 10.8f, 21.3698f)
                lineTo(9.3f, 19.3698f)
                curveTo(9.14f, 19.1498f, 8.78f, 18.9697f, 8.5f, 18.9697f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.7002f)
                lineTo(6.0f, 10.7002f)
                lineTo(8.0f, 12.7002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.7002f)
                lineTo(18.0f, 10.7002f)
                lineTo(16.0f, 12.7002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.3701f)
                lineTo(11.0f, 13.0302f)
            }
        }
        .build()
        return _messageprogramming!!
    }

private var _messageprogramming: ImageVector? = null
