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

public val BrokenGroup.Personalcard: ImageVector
    get() {
        if (_personalcard != null) {
            return _personalcard!!
        }
        _personalcard = Builder(name = "Personalcard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                curveTo(2.0f, 4.0f, 3.0f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 3.0f, 22.0f, 4.0f, 22.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 20.0f, 21.0f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 21.0f, 2.0f, 20.0f, 2.0f, 16.0f)
                verticalLineTo(12.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.4994f, 11.2899f)
                curveTo(9.4991f, 11.2899f, 10.3095f, 10.4796f, 10.3095f, 9.4799f)
                curveTo(10.3095f, 8.4803f, 9.4991f, 7.6699f, 8.4994f, 7.6699f)
                curveTo(7.4998f, 7.6699f, 6.6894f, 8.4803f, 6.6894f, 9.4799f)
                curveTo(6.6894f, 10.4796f, 7.4998f, 11.2899f, 8.4994f, 11.2899f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.33f)
                curveTo(11.86f, 14.88f, 10.71f, 13.74f, 9.26f, 13.61f)
                curveTo(8.76f, 13.56f, 8.25f, 13.56f, 7.74f, 13.61f)
                curveTo(6.29f, 13.75f, 5.14f, 14.88f, 5.0f, 16.33f)
            }
        }
        .build()
        return _personalcard!!
    }

private var _personalcard: ImageVector? = null
