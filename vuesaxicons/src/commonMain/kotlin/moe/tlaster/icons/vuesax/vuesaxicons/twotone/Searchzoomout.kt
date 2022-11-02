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

public val TwotoneGroup.Searchzoomout: ImageVector
    get() {
        if (_searchzoomout != null) {
            return _searchzoomout!!
        }
        _searchzoomout = Builder(name = "Searchzoomout", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                curveTo(15.9706f, 20.0f, 20.0f, 15.9706f, 20.0f, 11.0f)
                curveTo(20.0f, 6.0294f, 15.9706f, 2.0f, 11.0f, 2.0f)
                curveTo(6.0294f, 2.0f, 2.0f, 6.0294f, 2.0f, 11.0f)
                curveTo(2.0f, 15.9706f, 6.0294f, 20.0f, 11.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 11.0f)
                horizontalLineTo(13.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9304f, 20.6898f)
                curveTo(19.4604f, 22.2898f, 20.6704f, 22.4498f, 21.6004f, 21.0498f)
                curveTo(22.4504f, 19.7698f, 21.8904f, 18.7198f, 20.3504f, 18.7198f)
                curveTo(19.2104f, 18.7098f, 18.5704f, 19.5998f, 18.9304f, 20.6898f)
                close()
            }
        }
        .build()
        return _searchzoomout!!
    }

private var _searchzoomout: ImageVector? = null
