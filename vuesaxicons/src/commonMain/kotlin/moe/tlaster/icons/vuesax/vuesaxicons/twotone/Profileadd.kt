package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Profileadd: ImageVector
    get() {
        if (_profileadd != null) {
            return _profileadd!!
        }
        _profileadd = Builder(name = "Profileadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 19.5f)
                horizontalLineTo(14.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 21.5f)
                verticalLineTo(17.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1606f, 10.87f)
                curveTo(12.0606f, 10.86f, 11.9406f, 10.86f, 11.8306f, 10.87f)
                curveTo(9.4506f, 10.79f, 7.5606f, 8.84f, 7.5606f, 6.44f)
                curveTo(7.5506f, 3.99f, 9.5406f, 2.0f, 11.9906f, 2.0f)
                curveTo(14.4406f, 2.0f, 16.4306f, 3.99f, 16.4306f, 6.44f)
                curveTo(16.4306f, 8.84f, 14.5306f, 10.79f, 12.1606f, 10.87f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9891f, 21.8102f)
                curveTo(10.1691f, 21.8102f, 8.3591f, 21.3502f, 6.9791f, 20.4302f)
                curveTo(4.5591f, 18.8102f, 4.5591f, 16.1702f, 6.9791f, 14.5602f)
                curveTo(9.7291f, 12.7202f, 14.2391f, 12.7202f, 16.9891f, 14.5602f)
            }
        }
        .build()
        return _profileadd!!
    }

private var _profileadd: ImageVector? = null
