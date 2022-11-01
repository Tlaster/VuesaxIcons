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

public val LinearGroup.`Eye-slash`: ImageVector
    get() {
        if (`_eye-slash` != null) {
            return `_eye-slash`!!
        }
        `_eye-slash` = Builder(name = "Eye-slash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.53f, 9.47f)
                lineTo(9.47f, 14.53f)
                curveTo(8.82f, 13.88f, 8.42f, 12.99f, 8.42f, 12.0f)
                curveTo(8.42f, 10.02f, 10.02f, 8.42f, 12.0f, 8.42f)
                curveTo(12.99f, 8.42f, 13.88f, 8.82f, 14.53f, 9.47f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.82f, 5.77f)
                curveTo(16.07f, 4.45f, 14.07f, 3.73f, 12.0f, 3.73f)
                curveTo(8.47f, 3.73f, 5.18f, 5.81f, 2.89f, 9.41f)
                curveTo(1.99f, 10.82f, 1.99f, 13.19f, 2.89f, 14.6f)
                curveTo(3.68f, 15.84f, 4.6f, 16.91f, 5.6f, 17.77f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.42f, 19.5301f)
                curveTo(9.56f, 20.0101f, 10.77f, 20.2701f, 12.0f, 20.2701f)
                curveTo(15.53f, 20.2701f, 18.82f, 18.1901f, 21.11f, 14.5901f)
                curveTo(22.01f, 13.1801f, 22.01f, 10.8101f, 21.11f, 9.4001f)
                curveTo(20.78f, 8.88f, 20.42f, 8.39f, 20.05f, 7.93f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5099f, 12.7f)
                curveTo(15.2499f, 14.11f, 14.0999f, 15.26f, 12.6899f, 15.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.47f, 14.53f)
                lineTo(2.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(14.53f, 9.47f)
            }
        }
        .build()
        return `_eye-slash`!!
    }

private var `_eye-slash`: ImageVector? = null
