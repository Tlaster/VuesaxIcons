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

public val TwotoneGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0008f, 22.0f)
                horizontalLineTo(16.0008f)
                curveTo(20.0208f, 22.0f, 20.7408f, 20.39f, 20.9508f, 18.43f)
                lineTo(21.7008f, 10.43f)
                curveTo(21.9708f, 7.99f, 21.2708f, 6.0f, 17.0008f, 6.0f)
                horizontalLineTo(7.0008f)
                curveTo(2.7308f, 6.0f, 2.0308f, 7.99f, 2.3008f, 10.43f)
                lineTo(3.0508f, 18.43f)
                curveTo(3.2608f, 20.39f, 3.9808f, 22.0f, 8.0008f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                verticalLineTo(5.2f)
                curveTo(8.0f, 3.43f, 8.0f, 2.0f, 11.2f, 2.0f)
                horizontalLineTo(12.8f)
                curveTo(16.0f, 2.0f, 16.0f, 3.43f, 16.0f, 5.2f)
                verticalLineTo(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                verticalLineTo(14.0f)
                curveTo(14.0f, 14.01f, 14.0f, 14.01f, 14.0f, 14.02f)
                curveTo(14.0f, 15.11f, 13.99f, 16.0f, 12.0f, 16.0f)
                curveTo(10.02f, 16.0f, 10.0f, 15.12f, 10.0f, 14.03f)
                verticalLineTo(13.0f)
                curveTo(10.0f, 12.0f, 10.0f, 12.0f, 11.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(14.0f, 12.0f, 14.0f, 12.0f, 14.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.65f, 11.0f)
                curveTo(19.34f, 12.68f, 16.7f, 13.68f, 14.0f, 14.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6191f, 11.2695f)
                curveTo(4.8691f, 12.8095f, 7.4091f, 13.7395f, 9.9991f, 14.0295f)
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
