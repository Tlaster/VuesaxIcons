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

public val BoldGroup.Woman: ImageVector
    get() {
        if (_woman != null) {
            return _woman!!
        }
        _woman = Builder(name = "Woman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 5.13f, 15.87f, 2.0f, 12.0f, 2.0f)
                curveTo(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f)
                curveTo(5.0f, 12.62f, 7.74f, 15.59f, 11.25f, 15.96f)
                verticalLineTo(18.25f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 18.25f, 8.25f, 18.59f, 8.25f, 19.0f)
                curveTo(8.25f, 19.41f, 8.59f, 19.75f, 9.0f, 19.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12.0f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(15.0f)
                curveTo(15.41f, 19.75f, 15.75f, 19.41f, 15.75f, 19.0f)
                curveTo(15.75f, 18.59f, 15.41f, 18.25f, 15.0f, 18.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.96f)
                curveTo(16.26f, 15.59f, 19.0f, 12.62f, 19.0f, 9.0f)
                close()
            }
        }
        .build()
        return _woman!!
    }

private var _woman: ImageVector? = null
