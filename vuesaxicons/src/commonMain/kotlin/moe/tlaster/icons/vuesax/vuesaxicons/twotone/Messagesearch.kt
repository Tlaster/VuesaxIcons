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

public val TwotoneGroup.Messagesearch: ImageVector
    get() {
        if (_messagesearch != null) {
            return _messagesearch!!
        }
        _messagesearch = Builder(name = "Messagesearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2f, 21.3702f)
                curveTo(12.54f, 22.2502f, 11.46f, 22.2502f, 10.8f, 21.3702f)
                lineTo(9.3f, 19.3702f)
                curveTo(9.13f, 19.1502f, 8.77f, 18.9702f, 8.5f, 18.9702f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 18.9702f, 2.0f, 17.9702f, 2.0f, 12.9702f)
                verticalLineTo(7.9702f)
                curveTo(2.0f, 3.9702f, 4.0f, 1.9702f, 8.0f, 1.9702f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 1.9702f, 22.0f, 3.9702f, 22.0f, 7.9702f)
                verticalLineTo(12.9702f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2f, 21.4f)
                curveTo(19.9673f, 21.4f, 21.4f, 19.9673f, 21.4f, 18.2f)
                curveTo(21.4f, 16.4327f, 19.9673f, 15.0f, 18.2f, 15.0f)
                curveTo(16.4327f, 15.0f, 15.0f, 16.4327f, 15.0f, 18.2f)
                curveTo(15.0f, 19.9673f, 16.4327f, 21.4f, 18.2f, 21.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                lineTo(21.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9965f, 11.0f)
                horizontalLineTo(16.0054f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9945f, 11.0f)
                horizontalLineTo(12.0035f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9945f, 11.0f)
                horizontalLineTo(8.0035f)
            }
        }
        .build()
        return _messagesearch!!
    }

private var _messagesearch: ImageVector? = null
