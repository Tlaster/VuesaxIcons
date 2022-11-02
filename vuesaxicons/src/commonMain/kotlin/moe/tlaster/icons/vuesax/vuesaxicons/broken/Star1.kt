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

public val BrokenGroup.Star1: ImageVector
    get() {
        if (_star1 != null) {
            return _star1!!
        }
        _star1 = Builder(name = "Star1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.1009f, 8.61f)
                curveTo(22.1409f, 8.95f, 22.6209f, 10.43f, 21.1509f, 11.89f)
                lineTo(18.6709f, 14.37f)
                curveTo(18.2509f, 14.79f, 18.0209f, 15.6f, 18.1509f, 16.18f)
                lineTo(18.8609f, 19.25f)
                curveTo(19.4209f, 21.68f, 18.1309f, 22.62f, 15.9809f, 21.35f)
                lineTo(12.9909f, 19.58f)
                curveTo(12.4509f, 19.26f, 11.5609f, 19.26f, 11.0109f, 19.58f)
                lineTo(8.0209f, 21.35f)
                curveTo(5.8809f, 22.62f, 4.5809f, 21.67f, 5.1409f, 19.25f)
                lineTo(5.8509f, 16.18f)
                curveTo(5.9809f, 15.6f, 5.7509f, 14.79f, 5.3309f, 14.37f)
                lineTo(2.8509f, 11.89f)
                curveTo(1.3909f, 10.43f, 1.8609f, 8.95f, 3.9009f, 8.61f)
                lineTo(7.0909f, 8.08f)
                curveTo(7.6209f, 7.99f, 8.2609f, 7.52f, 8.5009f, 7.03f)
                lineTo(10.2609f, 3.51f)
                curveTo(11.2109f, 1.6f, 12.7709f, 1.6f, 13.7309f, 3.51f)
                lineTo(15.4909f, 7.03f)
                curveTo(15.5909f, 7.24f, 15.7709f, 7.45f, 15.9809f, 7.62f)
            }
        }
        .build()
        return _star1!!
    }

private var _star1: ImageVector? = null
