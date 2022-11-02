package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Arrowleft3: ImageVector
    get() {
        if (_arrowleft3 != null) {
            return _arrowleft3!!
        }
        _arrowleft3 = Builder(name = "Arrowleft3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.7803f, 6.3099f)
                curveTo(15.6503f, 4.6599f, 18.0003f, 6.0099f, 18.0003f, 9.3299f)
                verticalLineTo(11.9999f)
                verticalLineTo(14.6699f)
                curveTo(18.0003f, 17.9799f, 15.6503f, 19.3399f, 12.7803f, 17.6799f)
                lineTo(10.4703f, 16.3399f)
                lineTo(8.1603f, 14.9999f)
                curveTo(5.2903f, 13.3399f, 5.2903f, 10.6299f, 8.1603f, 8.9699f)
            }
        }
        .build()
        return _arrowleft3!!
    }

private var _arrowleft3: ImageVector? = null
