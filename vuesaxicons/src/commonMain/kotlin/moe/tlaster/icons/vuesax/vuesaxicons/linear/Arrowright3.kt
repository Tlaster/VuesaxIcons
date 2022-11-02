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

public val LinearGroup.Arrowright3: ImageVector
    get() {
        if (_arrowright3 != null) {
            return _arrowright3!!
        }
        _arrowright3 = Builder(name = "Arrowright3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 11.9999f)
                verticalLineTo(9.3299f)
                curveTo(6.0f, 6.0199f, 8.35f, 4.6599f, 11.22f, 6.3199f)
                lineTo(13.53f, 7.6599f)
                lineTo(15.84f, 8.9999f)
                curveTo(18.71f, 10.6599f, 18.71f, 13.3699f, 15.84f, 15.0299f)
                lineTo(13.53f, 16.3699f)
                lineTo(11.22f, 17.7099f)
                curveTo(8.35f, 19.3399f, 6.0f, 17.9899f, 6.0f, 14.6699f)
                verticalLineTo(11.9999f)
                close()
            }
        }
        .build()
        return _arrowright3!!
    }

private var _arrowright3: ImageVector? = null
