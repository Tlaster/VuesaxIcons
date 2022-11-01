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

public val LinearGroup.Profiletick: ImageVector
    get() {
        if (_profiletick != null) {
            return _profiletick!!
        }
        _profiletick = Builder(name = "Profiletick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.4399f, 19.05f)
                lineTo(15.9599f, 20.57f)
                lineTo(18.9999f, 17.53f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.16f, 10.87f)
                curveTo(12.06f, 10.86f, 11.94f, 10.86f, 11.83f, 10.87f)
                curveTo(9.45f, 10.79f, 7.56f, 8.84f, 7.56f, 6.44f)
                curveTo(7.55f, 3.99f, 9.54f, 2.0f, 11.99f, 2.0f)
                curveTo(14.44f, 2.0f, 16.43f, 3.99f, 16.43f, 6.44f)
                curveTo(16.43f, 8.84f, 14.53f, 10.79f, 12.16f, 10.87f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.99f, 21.8101f)
                curveTo(10.17f, 21.8101f, 8.36f, 21.3501f, 6.98f, 20.4301f)
                curveTo(4.56f, 18.8101f, 4.56f, 16.1701f, 6.98f, 14.5601f)
                curveTo(9.73f, 12.7201f, 14.24f, 12.7201f, 16.99f, 14.5601f)
            }
        }
        .build()
        return _profiletick!!
    }

private var _profiletick: ImageVector? = null
