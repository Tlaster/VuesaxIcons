package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Security: ImageVector
    get() {
        if (_security != null) {
            return _security!!
        }
        _security = Builder(name = "Security", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.91f, 11.12f)
                curveTo(20.91f, 16.01f, 17.36f, 20.59f, 12.51f, 21.93f)
                curveTo(12.18f, 22.02f, 11.82f, 22.02f, 11.49f, 21.93f)
                curveTo(6.64f, 20.59f, 3.09f, 16.01f, 3.09f, 11.12f)
                verticalLineTo(6.73f)
                curveTo(3.09f, 5.91f, 3.71f, 4.98f, 4.48f, 4.67f)
                lineTo(10.05f, 2.39f)
                curveTo(11.3f, 1.88f, 12.71f, 1.88f, 13.96f, 2.39f)
                lineTo(19.53f, 4.67f)
                curveTo(20.29f, 4.98f, 20.92f, 5.91f, 20.92f, 6.73f)
                lineTo(20.91f, 11.12f)
                close()
            }
        }
        .build()
        return _security!!
    }

private var _security: ImageVector? = null
