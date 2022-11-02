package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.62f, 20.8101f)
                curveTo(12.28f, 20.9301f, 11.72f, 20.9301f, 11.38f, 20.8101f)
                curveTo(8.48f, 19.8201f, 2.0f, 15.6901f, 2.0f, 8.6901f)
                curveTo(2.0f, 5.6001f, 4.49f, 3.1001f, 7.56f, 3.1001f)
                curveTo(9.38f, 3.1001f, 10.99f, 3.9801f, 12.0f, 5.3401f)
                curveTo(13.01f, 3.9801f, 14.63f, 3.1001f, 16.44f, 3.1001f)
                curveTo(19.51f, 3.1001f, 22.0f, 5.6001f, 22.0f, 8.6901f)
                curveTo(22.0f, 15.6901f, 15.52f, 19.8201f, 12.62f, 20.8101f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
