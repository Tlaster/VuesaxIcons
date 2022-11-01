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

public val LinearGroup.Directleft: ImageVector
    get() {
        if (_directleft != null) {
            return _directleft!!
        }
        _directleft = Builder(name = "Directleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.71f, 9.17f)
                lineTo(16.3f, 3.0701f)
                curveTo(19.05f, 1.62f, 22.04f, 4.55f, 20.65f, 7.33f)
                lineTo(19.03f, 10.57f)
                curveTo(18.58f, 11.47f, 18.58f, 12.53f, 19.03f, 13.43f)
                lineTo(20.65f, 16.67f)
                curveTo(22.04f, 19.45f, 19.05f, 22.37f, 16.3f, 20.93f)
                lineTo(4.71f, 14.83f)
                curveTo(2.43f, 13.63f, 2.43f, 10.37f, 4.71f, 9.17f)
                close()
            }
        }
        .build()
        return _directleft!!
    }

private var _directleft: ImageVector? = null
