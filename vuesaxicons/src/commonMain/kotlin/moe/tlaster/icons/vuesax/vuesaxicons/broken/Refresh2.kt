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

public val BrokenGroup.Refresh2: ImageVector
    get() {
        if (_refresh2 != null) {
            return _refresh2!!
        }
        _refresh2 = Builder(name = "Refresh2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.01f, 19.99f)
                curveTo(16.34f, 21.25f, 14.25f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 3.11f, 16.44f, 3.11f, 16.44f)
                moveTo(3.11f, 16.44f)
                horizontalLineTo(7.63f)
                moveTo(3.11f, 16.44f)
                verticalLineTo(21.44f)
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 13.82f, 21.51f, 15.53f, 20.66f, 17.0f)
                moveTo(6.03f, 3.97f)
                curveTo(7.69f, 2.73f, 9.75f, 2.0f, 12.0f, 2.0f)
                curveTo(18.67f, 2.0f, 22.0f, 7.56f, 22.0f, 7.56f)
                moveTo(22.0f, 7.56f)
                verticalLineTo(2.56f)
                moveTo(22.0f, 7.56f)
                horizontalLineTo(17.56f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 10.18f, 2.48f, 8.47f, 3.33f, 7.0f)
            }
        }
        .build()
        return _refresh2!!
    }

private var _refresh2: ImageVector? = null
