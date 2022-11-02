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

public val BrokenGroup.Arrowright1: ImageVector
    get() {
        if (_arrowright1 != null) {
            return _arrowright1!!
        }
        _arrowright1 = Builder(name = "Arrowright1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.85f, 8.9899f)
                curveTo(18.72f, 10.6499f, 18.72f, 13.3599f, 15.85f, 15.0199f)
                lineTo(13.54f, 16.3599f)
                lineTo(11.23f, 17.6999f)
                curveTo(8.35f, 19.3399f, 6.0f, 17.9899f, 6.0f, 14.6699f)
                verticalLineTo(11.9999f)
                verticalLineTo(9.3299f)
                curveTo(6.0f, 6.0199f, 8.35f, 4.6599f, 11.22f, 6.3199f)
            }
        }
        .build()
        return _arrowright1!!
    }

private var _arrowright1: ImageVector? = null
