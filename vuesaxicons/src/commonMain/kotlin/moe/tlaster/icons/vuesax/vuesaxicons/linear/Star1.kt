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

public val LinearGroup.Star1: ImageVector
    get() {
        if (_star1 != null) {
            return _star1!!
        }
        _star1 = Builder(name = "Star1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.73f, 3.51f)
                lineTo(15.49f, 7.03f)
                curveTo(15.73f, 7.52f, 16.37f, 7.99f, 16.91f, 8.08f)
                lineTo(20.1f, 8.61f)
                curveTo(22.14f, 8.95f, 22.62f, 10.43f, 21.15f, 11.89f)
                lineTo(18.67f, 14.37f)
                curveTo(18.25f, 14.79f, 18.02f, 15.6f, 18.15f, 16.18f)
                lineTo(18.86f, 19.25f)
                curveTo(19.42f, 21.68f, 18.13f, 22.62f, 15.98f, 21.35f)
                lineTo(12.99f, 19.58f)
                curveTo(12.45f, 19.26f, 11.56f, 19.26f, 11.01f, 19.58f)
                lineTo(8.02f, 21.35f)
                curveTo(5.88f, 22.62f, 4.58f, 21.67f, 5.14f, 19.25f)
                lineTo(5.85f, 16.18f)
                curveTo(5.98f, 15.6f, 5.75f, 14.79f, 5.33f, 14.37f)
                lineTo(2.85f, 11.89f)
                curveTo(1.39f, 10.43f, 1.86f, 8.95f, 3.9f, 8.61f)
                lineTo(7.09f, 8.08f)
                curveTo(7.62f, 7.99f, 8.26f, 7.52f, 8.5f, 7.03f)
                lineTo(10.26f, 3.51f)
                curveTo(11.22f, 1.6f, 12.78f, 1.6f, 13.73f, 3.51f)
                close()
            }
        }
        .build()
        return _star1!!
    }

private var _star1: ImageVector? = null
