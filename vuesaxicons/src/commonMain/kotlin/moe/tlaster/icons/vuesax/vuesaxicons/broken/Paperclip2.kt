package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Paperclip2: ImageVector
    get() {
        if (_paperclip2 != null) {
            return _paperclip2!!
        }
        _paperclip2 = Builder(name = "Paperclip2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.7599f, 8.8101f)
                lineTo(4.5499f, 10.0201f)
                curveTo(2.2099f, 12.3601f, 2.2099f, 16.1601f, 4.5499f, 18.5101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.3308f, 12.1499f)
                lineTo(9.8608f, 14.6199f)
                curveTo(8.4908f, 15.9899f, 8.4908f, 18.1999f, 9.8608f, 19.5699f)
                curveTo(11.2308f, 20.9399f, 13.4408f, 20.9399f, 14.8108f, 19.5699f)
                lineTo(18.7008f, 15.6799f)
                curveTo(21.4308f, 12.9499f, 21.4308f, 8.5099f, 18.7008f, 5.7799f)
                curveTo(15.9708f, 3.0499f, 11.5308f, 3.0499f, 8.8008f, 5.7799f)
            }
        }
        .build()
        return _paperclip2!!
    }

private var _paperclip2: ImageVector? = null
