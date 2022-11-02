package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Messagesearch: ImageVector
    get() {
        if (_messagesearch != null) {
            return _messagesearch!!
        }
        _messagesearch = Builder(name = "Messagesearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2f, 21.37f)
                curveTo(12.54f, 22.25f, 11.46f, 22.25f, 10.8f, 21.37f)
                lineTo(9.3f, 19.37f)
                curveTo(9.13f, 19.15f, 8.77f, 18.97f, 8.5f, 18.97f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 18.97f, 2.0f, 17.97f, 2.0f, 12.97f)
                verticalLineTo(7.97f)
                curveTo(2.0f, 3.97f, 4.0f, 1.97f, 8.0f, 1.97f)
                horizontalLineTo(16.0f)
                curveTo(20.0f, 1.97f, 22.0f, 3.97f, 22.0f, 7.97f)
                verticalLineTo(12.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4f, 18.2f)
                curveTo(21.4f, 19.97f, 19.97f, 21.4f, 18.2f, 21.4f)
                curveTo(16.43f, 21.4f, 15.0f, 19.97f, 15.0f, 18.2f)
                curveTo(15.0f, 16.43f, 16.43f, 15.0f, 18.2f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
