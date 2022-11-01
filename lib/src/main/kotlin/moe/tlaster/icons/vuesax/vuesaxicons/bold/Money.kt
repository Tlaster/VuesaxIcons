package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 3.5f, 2.0f, 5.0f, 2.0f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 19.0f, 4.0f, 20.5f, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 20.5f, 22.0f, 19.0f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 5.0f, 20.0f, 3.5f, 17.0f, 3.5f)
                close()
                moveTo(6.25f, 14.5f)
                curveTo(6.25f, 14.91f, 5.91f, 15.25f, 5.5f, 15.25f)
                curveTo(5.09f, 15.25f, 4.75f, 14.91f, 4.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(4.75f, 9.09f, 5.09f, 8.75f, 5.5f, 8.75f)
                curveTo(5.91f, 8.75f, 6.25f, 9.09f, 6.25f, 9.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(10.34f, 15.0f, 9.0f, 13.66f, 9.0f, 12.0f)
                curveTo(9.0f, 10.34f, 10.34f, 9.0f, 12.0f, 9.0f)
                curveTo(13.66f, 9.0f, 15.0f, 10.34f, 15.0f, 12.0f)
                curveTo(15.0f, 13.66f, 13.66f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(19.25f, 14.5f)
                curveTo(19.25f, 14.91f, 18.91f, 15.25f, 18.5f, 15.25f)
                curveTo(18.09f, 15.25f, 17.75f, 14.91f, 17.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(17.75f, 9.09f, 18.09f, 8.75f, 18.5f, 8.75f)
                curveTo(18.91f, 8.75f, 19.25f, 9.09f, 19.25f, 9.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
