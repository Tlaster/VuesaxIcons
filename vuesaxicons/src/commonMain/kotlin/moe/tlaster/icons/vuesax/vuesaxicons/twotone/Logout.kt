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

public val TwotoneGroup.Logout: ImageVector
    get() {
        if (_logout != null) {
            return _logout!!
        }
        _logout = Builder(name = "Logout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9004f, 7.5602f)
                curveTo(9.2104f, 3.9602f, 11.0604f, 2.4902f, 15.1104f, 2.4902f)
                horizontalLineTo(15.2404f)
                curveTo(19.7104f, 2.4902f, 21.5004f, 4.2802f, 21.5004f, 8.7502f)
                verticalLineTo(15.2702f)
                curveTo(21.5004f, 19.7402f, 19.7104f, 21.5302f, 15.2404f, 21.5302f)
                horizontalLineTo(15.1104f)
                curveTo(11.0904f, 21.5302f, 9.2404f, 20.0802f, 8.9104f, 16.5402f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9991f, 12.0f)
                horizontalLineTo(3.6191f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.85f, 8.6504f)
                lineTo(2.5f, 12.0004f)
                lineTo(5.85f, 15.3504f)
            }
        }
        .build()
        return _logout!!
    }

private var _logout: ImageVector? = null
