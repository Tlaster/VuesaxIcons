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

public val LinearGroup.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.1101f)
                verticalLineTo(14.8801f)
                curveTo(3.0f, 17.0001f, 3.0f, 17.0001f, 5.0f, 18.3501f)
                lineTo(10.5f, 21.5301f)
                curveTo(11.33f, 22.0101f, 12.68f, 22.0101f, 13.5f, 21.5301f)
                lineTo(19.0f, 18.3501f)
                curveTo(21.0f, 17.0001f, 21.0f, 17.0001f, 21.0f, 14.8901f)
                verticalLineTo(9.1101f)
                curveTo(21.0f, 7.0001f, 21.0f, 7.0001f, 19.0f, 5.6501f)
                lineTo(13.5f, 2.4701f)
                curveTo(12.68f, 1.9901f, 11.33f, 1.9901f, 10.5f, 2.4701f)
                lineTo(5.0f, 5.6501f)
                curveTo(3.0f, 7.0001f, 3.0f, 7.0001f, 3.0f, 9.1101f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null
