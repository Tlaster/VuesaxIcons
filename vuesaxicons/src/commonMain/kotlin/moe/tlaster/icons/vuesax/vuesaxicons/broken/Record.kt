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

public val BrokenGroup.Record: ImageVector
    get() {
        if (_record != null) {
            return _record!!
        }
        _record = Builder(name = "Record", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 6.04f)
                curveTo(3.85f, 7.63f, 3.0f, 9.72f, 3.0f, 12.0f)
                curveTo(3.0f, 16.97f, 7.03f, 21.0f, 12.0f, 21.0f)
                curveTo(16.97f, 21.0f, 21.0f, 16.97f, 21.0f, 12.0f)
                curveTo(21.0f, 7.03f, 16.97f, 3.0f, 12.0f, 3.0f)
                curveTo(11.29f, 3.0f, 10.6f, 3.08f, 9.94f, 3.24f)
            }
        }
        .build()
        return _record!!
    }

private var _record: ImageVector? = null
