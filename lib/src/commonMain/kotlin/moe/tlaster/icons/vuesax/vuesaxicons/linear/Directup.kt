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

public val LinearGroup.Directup: ImageVector
    get() {
        if (_directup != null) {
            return _directup!!
        }
        _directup = Builder(name = "Directup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.17f, 4.71f)
                lineTo(3.0701f, 16.3f)
                curveTo(1.62f, 19.05f, 4.55f, 22.04f, 7.33f, 20.65f)
                lineTo(10.57f, 19.03f)
                curveTo(11.47f, 18.58f, 12.53f, 18.58f, 13.43f, 19.03f)
                lineTo(16.67f, 20.65f)
                curveTo(19.45f, 22.04f, 22.37f, 19.05f, 20.93f, 16.3f)
                lineTo(14.83f, 4.71f)
                curveTo(13.63f, 2.43f, 10.37f, 2.43f, 9.17f, 4.71f)
                close()
            }
        }
        .build()
        return _directup!!
    }

private var _directup: ImageVector? = null
