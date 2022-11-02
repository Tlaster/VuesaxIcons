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

public val BrokenGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.59f, 4.97f)
                curveTo(21.47f, 5.96f, 22.0f, 7.26f, 22.0f, 8.69f)
                curveTo(22.0f, 15.69f, 15.52f, 19.82f, 12.62f, 20.82f)
                curveTo(12.28f, 20.94f, 11.72f, 20.94f, 11.38f, 20.82f)
                curveTo(8.48f, 19.82f, 2.0f, 15.69f, 2.0f, 8.69f)
                curveTo(2.0f, 5.6f, 4.49f, 3.1f, 7.56f, 3.1f)
                curveTo(9.38f, 3.1f, 10.99f, 3.98f, 12.0f, 5.34f)
                curveTo(13.01f, 3.98f, 14.63f, 3.1f, 16.44f, 3.1f)
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
