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

public val BrokenGroup.Alignvertically: ImageVector
    get() {
        if (_alignvertically != null) {
            return _alignvertically!!
        }
        _alignvertically = Builder(name = "Alignvertically", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.4f, 19.25f)
                horizontalLineTo(6.6f)
                curveTo(5.1f, 19.25f, 4.5f, 18.61f, 4.5f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(4.5f, 14.39f, 5.1f, 13.75f, 6.6f, 13.75f)
                horizontalLineTo(17.4f)
                curveTo(18.9f, 13.75f, 19.5f, 14.39f, 19.5f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(19.5f, 18.61f, 18.9f, 19.25f, 17.4f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.4f, 5.25f)
                horizontalLineTo(8.6f)
                curveTo(7.1f, 5.25f, 6.5f, 5.89f, 6.5f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(6.5f, 10.11f, 7.1f, 10.75f, 8.6f, 10.75f)
                horizontalLineTo(15.4f)
                curveTo(16.9f, 10.75f, 17.5f, 10.11f, 17.5f, 8.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0001f)
                verticalLineTo(19.6001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.69f)
            }
        }
        .build()
        return _alignvertically!!
    }

private var _alignvertically: ImageVector? = null
