package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Record: ImageVector
    get() {
        if (_record != null) {
            return _record!!
        }
        _record = Builder(name = "Record", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.75f)
                curveTo(6.62f, 21.75f, 2.25f, 17.38f, 2.25f, 12.0f)
                curveTo(2.25f, 6.62f, 6.62f, 2.25f, 12.0f, 2.25f)
                curveTo(17.38f, 2.25f, 21.75f, 6.62f, 21.75f, 12.0f)
                curveTo(21.75f, 17.38f, 17.38f, 21.75f, 12.0f, 21.75f)
                close()
                moveTo(12.0f, 3.75f)
                curveTo(7.45f, 3.75f, 3.75f, 7.45f, 3.75f, 12.0f)
                curveTo(3.75f, 16.55f, 7.45f, 20.25f, 12.0f, 20.25f)
                curveTo(16.55f, 20.25f, 20.25f, 16.55f, 20.25f, 12.0f)
                curveTo(20.25f, 7.45f, 16.55f, 3.75f, 12.0f, 3.75f)
                close()
            }
        }
        .build()
        return _record!!
    }

private var _record: ImageVector? = null
