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

public val LinearGroup.Shieldslash: ImageVector
    get() {
        if (_shieldslash != null) {
            return _shieldslash!!
        }
        _shieldslash = Builder(name = "Shieldslash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.84f, 20.02f)
                lineTo(9.43f, 21.21f)
                curveTo(10.84f, 22.27f, 13.16f, 22.27f, 14.57f, 21.21f)
                lineTo(18.87f, 18.0f)
                curveTo(19.82f, 17.29f, 20.6f, 15.74f, 20.6f, 14.56f)
                verticalLineTo(7.12f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.98f, 4.3401f)
                curveTo(18.83f, 4.2501f, 18.67f, 4.1701f, 18.51f, 4.1001f)
                lineTo(13.52f, 2.2301f)
                curveTo(12.69f, 1.9201f, 11.33f, 1.9201f, 10.5f, 2.2301f)
                lineTo(5.5f, 4.1101f)
                curveTo(4.35f, 4.5401f, 3.41f, 5.9001f, 3.41f, 7.1201f)
                verticalLineTo(14.5501f)
                curveTo(3.41f, 15.7301f, 4.19f, 17.2801f, 5.14f, 17.9901f)
                lineTo(5.34f, 18.1401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _shieldslash!!
    }

private var _shieldslash: ImageVector? = null
