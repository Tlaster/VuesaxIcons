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

public val LinearGroup.Judge: ImageVector
    get() {
        if (_judge != null) {
            return _judge!!
        }
        _judge = Builder(name = "Judge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0101f, 18.5101f)
                lineTo(15.0601f, 13.5601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.06f, 13.56f)
                lineTo(11.52f, 17.1f)
                curveTo(10.74f, 17.88f, 9.47f, 17.88f, 8.69f, 17.1f)
                lineTo(4.45f, 12.86f)
                curveTo(3.67f, 12.08f, 3.67f, 10.81f, 4.45f, 10.03f)
                lineTo(11.52f, 2.96f)
                curveTo(12.3f, 2.18f, 13.57f, 2.18f, 14.35f, 2.96f)
                lineTo(18.59f, 7.2f)
                curveTo(19.37f, 7.98f, 19.37f, 9.25f, 18.59f, 10.03f)
                lineTo(15.06f, 13.56f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                horizontalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5601f, 7.92f)
                lineTo(13.6301f, 14.99f)
            }
        }
        .build()
        return _judge!!
    }

private var _judge: ImageVector? = null
