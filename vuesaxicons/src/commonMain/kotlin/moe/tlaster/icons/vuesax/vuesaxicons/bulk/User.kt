package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 14.5f)
                curveTo(6.9901f, 14.5f, 2.9102f, 17.86f, 2.9102f, 22.0f)
                curveTo(2.9102f, 22.28f, 3.1302f, 22.5f, 3.4102f, 22.5f)
                horizontalLineTo(20.5901f)
                curveTo(20.8701f, 22.5f, 21.0901f, 22.28f, 21.0901f, 22.0f)
                curveTo(21.0901f, 17.86f, 17.0102f, 14.5f, 12.0002f, 14.5f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
