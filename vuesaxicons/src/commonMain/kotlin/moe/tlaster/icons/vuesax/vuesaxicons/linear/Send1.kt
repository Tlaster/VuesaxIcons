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

public val LinearGroup.Send1: ImageVector
    get() {
        if (_send1 != null) {
            return _send1!!
        }
        _send1 = Builder(name = "Send1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.51f, 4.23f)
                lineTo(18.07f, 8.51f)
                curveTo(21.91f, 10.43f, 21.91f, 13.57f, 18.07f, 15.49f)
                lineTo(9.51f, 19.77f)
                curveTo(3.75f, 22.65f, 1.4f, 20.29f, 4.28f, 14.54f)
                lineTo(5.15f, 12.81f)
                curveTo(5.37f, 12.37f, 5.37f, 11.64f, 5.15f, 11.2f)
                lineTo(4.28f, 9.46f)
                curveTo(1.4f, 3.71f, 3.76f, 1.35f, 9.51f, 4.23f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.44f, 12.0f)
                horizontalLineTo(10.84f)
            }
        }
        .build()
        return _send1!!
    }

private var _send1: ImageVector? = null
