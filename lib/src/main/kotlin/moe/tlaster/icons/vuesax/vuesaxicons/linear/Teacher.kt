package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Teacher: ImageVector
    get() {
        if (_teacher != null) {
            return _teacher!!
        }
        _teacher = Builder(name = "Teacher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.05f, 2.53f)
                lineTo(4.03f, 6.46f)
                curveTo(2.1f, 7.72f, 2.1f, 10.54f, 4.03f, 11.8f)
                lineTo(10.05f, 15.73f)
                curveTo(11.13f, 16.44f, 12.91f, 16.44f, 13.99f, 15.73f)
                lineTo(19.98f, 11.8f)
                curveTo(21.9f, 10.54f, 21.9f, 7.73f, 19.98f, 6.47f)
                lineTo(13.99f, 2.54f)
                curveTo(12.91f, 1.82f, 11.13f, 1.82f, 10.05f, 2.53f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.63f, 13.08f)
                lineTo(5.62f, 17.77f)
                curveTo(5.62f, 19.04f, 6.6f, 20.4f, 7.8f, 20.8f)
                lineTo(10.99f, 21.86f)
                curveTo(11.54f, 22.04f, 12.45f, 22.04f, 13.01f, 21.86f)
                lineTo(16.2f, 20.8f)
                curveTo(17.4f, 20.4f, 18.38f, 19.04f, 18.38f, 17.77f)
                verticalLineTo(13.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4f, 15.0f)
                verticalLineTo(9.0f)
            }
        }
        .build()
        return _teacher!!
    }

private var _teacher: ImageVector? = null
