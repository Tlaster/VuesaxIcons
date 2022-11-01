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

public val LinearGroup.Shieldtick: ImageVector
    get() {
        if (_shieldtick != null) {
            return _shieldtick!!
        }
        _shieldtick = Builder(name = "Shieldtick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.49f, 2.2301f)
                lineTo(5.5f, 4.1101f)
                curveTo(4.35f, 4.5401f, 3.41f, 5.9001f, 3.41f, 7.1201f)
                verticalLineTo(14.5501f)
                curveTo(3.41f, 15.7301f, 4.19f, 17.2801f, 5.14f, 17.9901f)
                lineTo(9.44f, 21.2001f)
                curveTo(10.85f, 22.2601f, 13.17f, 22.2601f, 14.58f, 21.2001f)
                lineTo(18.88f, 17.9901f)
                curveTo(19.83f, 17.2801f, 20.61f, 15.7301f, 20.61f, 14.5501f)
                verticalLineTo(7.1201f)
                curveTo(20.61f, 5.8901f, 19.67f, 4.5301f, 18.52f, 4.1001f)
                lineTo(13.53f, 2.2301f)
                curveTo(12.68f, 1.9201f, 11.32f, 1.9201f, 10.49f, 2.2301f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.05f, 11.8701f)
                lineTo(10.66f, 13.4801f)
                lineTo(14.96f, 9.18f)
            }
        }
        .build()
        return _shieldtick!!
    }

private var _shieldtick: ImageVector? = null
