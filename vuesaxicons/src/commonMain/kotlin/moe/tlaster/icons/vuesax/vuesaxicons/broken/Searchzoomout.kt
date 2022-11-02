package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Searchzoomout: ImageVector
    get() {
        if (_searchzoomout != null) {
            return _searchzoomout!!
        }
        _searchzoomout = Builder(name = "Searchzoomout", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 11.0f)
                horizontalLineTo(13.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(15.97f, 2.0f, 20.0f, 6.03f, 20.0f, 11.0f)
                curveTo(20.0f, 15.97f, 15.97f, 20.0f, 11.0f, 20.0f)
                curveTo(6.03f, 20.0f, 2.0f, 15.97f, 2.0f, 11.0f)
                curveTo(2.0f, 7.5f, 4.0f, 4.46f, 6.93f, 2.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.071f, 20.97f)
                curveTo(19.601f, 22.57f, 20.811f, 22.73f, 21.741f, 21.33f)
                curveTo(22.601f, 20.05f, 22.041f, 19.0f, 20.501f, 19.0f)
                curveTo(19.351f, 19.0f, 18.711f, 19.89f, 19.071f, 20.97f)
                close()
            }
        }
        .build()
        return _searchzoomout!!
    }

private var _searchzoomout: ImageVector? = null
