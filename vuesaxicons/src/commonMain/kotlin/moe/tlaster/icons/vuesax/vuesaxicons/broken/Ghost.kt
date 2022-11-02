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

public val BrokenGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.07f)
                verticalLineTo(20.08f)
                curveTo(2.0f, 21.34f, 2.75f, 21.68f, 3.67f, 20.84f)
                lineTo(4.67f, 19.93f)
                curveTo(5.04f, 19.59f, 5.64f, 19.59f, 6.01f, 19.93f)
                lineTo(8.01f, 21.76f)
                curveTo(8.38f, 22.1f, 8.98f, 22.1f, 9.35f, 21.76f)
                lineTo(11.35f, 19.93f)
                curveTo(11.72f, 19.59f, 12.32f, 19.59f, 12.69f, 19.93f)
                lineTo(14.69f, 21.76f)
                curveTo(15.06f, 22.1f, 15.66f, 22.1f, 16.03f, 21.76f)
                lineTo(18.03f, 19.93f)
                curveTo(18.4f, 19.59f, 19.0f, 19.59f, 19.37f, 19.93f)
                lineTo(20.37f, 20.84f)
                curveTo(21.29f, 21.68f, 22.04f, 21.34f, 22.04f, 20.08f)
                verticalLineTo(12.19f)
                curveTo(22.04f, 6.59f, 17.54f, 2.01f, 12.04f, 2.01f)
                curveTo(6.54f, 2.01f, 2.04f, 6.59f, 2.04f, 12.19f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                curveTo(10.37f, 15.78f, 13.63f, 15.78f, 16.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveTo(13.1046f, 11.0f, 14.0f, 10.1046f, 14.0f, 9.0f)
                curveTo(14.0f, 7.8954f, 13.1046f, 7.0f, 12.0f, 7.0f)
                curveTo(10.8954f, 7.0f, 10.0f, 7.8954f, 10.0f, 9.0f)
                curveTo(10.0f, 10.1046f, 10.8954f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
