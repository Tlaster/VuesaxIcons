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

public val LinearGroup.Arrowup2: ImageVector
    get() {
        if (_arrowup2 != null) {
            return _arrowup2!!
        }
        _arrowup2 = Builder(name = "Arrowup2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9201f, 15.0499f)
                lineTo(13.4001f, 8.5299f)
                curveTo(12.6301f, 7.7599f, 11.3701f, 7.7599f, 10.6001f, 8.5299f)
                lineTo(4.0801f, 15.0499f)
            }
        }
        .build()
        return _arrowup2!!
    }

private var _arrowup2: ImageVector? = null
