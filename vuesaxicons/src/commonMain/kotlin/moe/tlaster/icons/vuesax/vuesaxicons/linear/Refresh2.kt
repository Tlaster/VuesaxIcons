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

public val LinearGroup.Refresh2: ImageVector
    get() {
        if (_refresh2 != null) {
            return _refresh2!!
        }
        _refresh2 = Builder(name = "Refresh2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 3.11f, 16.44f, 3.11f, 16.44f)
                moveTo(3.11f, 16.44f)
                horizontalLineTo(7.63f)
                moveTo(3.11f, 16.44f)
                verticalLineTo(21.44f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.44f, 2.0f, 12.0f, 2.0f)
                curveTo(18.67f, 2.0f, 22.0f, 7.56f, 22.0f, 7.56f)
                moveTo(22.0f, 7.56f)
                verticalLineTo(2.56f)
                moveTo(22.0f, 7.56f)
                horizontalLineTo(17.56f)
            }
        }
        .build()
        return _refresh2!!
    }

private var _refresh2: ImageVector? = null
