package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Lovely: ImageVector
    get() {
        if (_lovely != null) {
            return _lovely!!
        }
        _lovely = Builder(name = "Lovely", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.86f, 8.09f)
                curveTo(19.86f, 8.51f, 19.83f, 8.92f, 19.78f, 9.31f)
                curveTo(19.32f, 9.11f, 18.82f, 9.0f, 18.29f, 9.0f)
                curveTo(17.07f, 9.0f, 15.99f, 9.59f, 15.32f, 10.49f)
                curveTo(14.64f, 9.59f, 13.56f, 9.0f, 12.34f, 9.0f)
                curveTo(10.29f, 9.0f, 8.63f, 10.67f, 8.63f, 12.74f)
                curveTo(8.63f, 15.42f, 10.05f, 17.47f, 11.63f, 18.86f)
                curveTo(11.58f, 18.89f, 11.53f, 18.9f, 11.48f, 18.92f)
                curveTo(11.18f, 19.03f, 10.68f, 19.03f, 10.38f, 18.92f)
                curveTo(7.79f, 18.03f, 2.0f, 14.35f, 2.0f, 8.09f)
                curveTo(2.0f, 5.33f, 4.22f, 3.1f, 6.96f, 3.1f)
                curveTo(8.59f, 3.1f, 10.03f, 3.88f, 10.93f, 5.09f)
                curveTo(11.84f, 3.88f, 13.28f, 3.1f, 14.9f, 3.1f)
                curveTo(17.64f, 3.1f, 19.86f, 5.33f, 19.86f, 8.09f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.74f)
                curveTo(22.0f, 17.42f, 17.67f, 20.18f, 15.73f, 20.84f)
                curveTo(15.5f, 20.92f, 15.13f, 20.92f, 14.9f, 20.84f)
                curveTo(14.07f, 20.56f, 12.8f, 19.89f, 11.63f, 18.86f)
                curveTo(10.05f, 17.47f, 8.63f, 15.42f, 8.63f, 12.74f)
                curveTo(8.63f, 10.67f, 10.29f, 9.0f, 12.34f, 9.0f)
                curveTo(13.56f, 9.0f, 14.64f, 9.59f, 15.32f, 10.49f)
                curveTo(15.99f, 9.59f, 17.07f, 9.0f, 18.29f, 9.0f)
                curveTo(18.82f, 9.0f, 19.32f, 9.11f, 19.78f, 9.31f)
                curveTo(21.09f, 9.89f, 22.0f, 11.2f, 22.0f, 12.74f)
                close()
            }
        }
        .build()
        return _lovely!!
    }

private var _lovely: ImageVector? = null
