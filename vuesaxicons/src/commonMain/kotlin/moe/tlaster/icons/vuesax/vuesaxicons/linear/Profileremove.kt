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

public val LinearGroup.Profileremove: ImageVector
    get() {
        if (_profileremove != null) {
            return _profileremove!!
        }
        _profileremove = Builder(name = "Profileremove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 19.0f)
                horizontalLineTo(15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.15f, 10.87f)
                curveTo(12.05f, 10.86f, 11.93f, 10.86f, 11.82f, 10.87f)
                curveTo(9.4401f, 10.79f, 7.55f, 8.84f, 7.55f, 6.44f)
                curveTo(7.55f, 3.99f, 9.5301f, 2.0f, 11.99f, 2.0f)
                curveTo(14.44f, 2.0f, 16.43f, 3.99f, 16.43f, 6.44f)
                curveTo(16.42f, 8.84f, 14.53f, 10.79f, 12.15f, 10.87f)
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
        return _profileremove!!
    }

private var _profileremove: ImageVector? = null
