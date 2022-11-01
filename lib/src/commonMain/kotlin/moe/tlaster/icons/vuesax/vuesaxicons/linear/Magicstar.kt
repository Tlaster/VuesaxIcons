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

public val LinearGroup.Magicstar: ImageVector
    get() {
        if (_magicstar != null) {
            return _magicstar!!
        }
        _magicstar = Builder(name = "Magicstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.29f, 4.14f)
                lineTo(17.22f, 7.93f)
                curveTo(17.21f, 8.45f, 17.54f, 9.14f, 17.96f, 9.45f)
                lineTo(20.44f, 11.33f)
                curveTo(22.03f, 12.53f, 21.77f, 14.0f, 19.87f, 14.6f)
                lineTo(16.64f, 15.61f)
                curveTo(16.1f, 15.78f, 15.53f, 16.37f, 15.39f, 16.92f)
                lineTo(14.62f, 19.86f)
                curveTo(14.01f, 22.18f, 12.49f, 22.41f, 11.23f, 20.37f)
                lineTo(9.47f, 17.52f)
                curveTo(9.15f, 17.0f, 8.39f, 16.61f, 7.79f, 16.64f)
                lineTo(4.45f, 16.81f)
                curveTo(2.06f, 16.93f, 1.38f, 15.55f, 2.94f, 13.73f)
                lineTo(4.92f, 11.43f)
                curveTo(5.29f, 11.0f, 5.46f, 10.2f, 5.29f, 9.66f)
                lineTo(4.28f, 6.43f)
                curveTo(3.69f, 4.53f, 4.75f, 3.48f, 6.64f, 4.1f)
                lineTo(9.59f, 5.07f)
                curveTo(10.09f, 5.23f, 10.84f, 5.12f, 11.26f, 4.81f)
                lineTo(14.34f, 2.59f)
                curveTo(16.0f, 1.39f, 17.33f, 2.09f, 17.29f, 4.14f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.91f, 22.0f)
                lineTo(18.88f, 18.97f)
            }
        }
        .build()
        return _magicstar!!
    }

private var _magicstar: ImageVector? = null
