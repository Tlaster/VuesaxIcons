package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Menu1: ImageVector
    get() {
        if (_menu1 != null) {
            return _menu1!!
        }
        _menu1 = Builder(name = "Menu1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.75f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 7.75f, 2.25f, 7.41f, 2.25f, 7.0f)
                curveTo(2.25f, 6.59f, 2.59f, 6.25f, 3.0f, 6.25f)
                horizontalLineTo(21.0f)
                curveTo(21.41f, 6.25f, 21.75f, 6.59f, 21.75f, 7.0f)
                curveTo(21.75f, 7.41f, 21.41f, 7.75f, 21.0f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.75f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 12.75f, 2.25f, 12.41f, 2.25f, 12.0f)
                curveTo(2.25f, 11.59f, 2.59f, 11.25f, 3.0f, 11.25f)
                horizontalLineTo(21.0f)
                curveTo(21.41f, 11.25f, 21.75f, 11.59f, 21.75f, 12.0f)
                curveTo(21.75f, 12.41f, 21.41f, 12.75f, 21.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.75f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 17.75f, 2.25f, 17.41f, 2.25f, 17.0f)
                curveTo(2.25f, 16.59f, 2.59f, 16.25f, 3.0f, 16.25f)
                horizontalLineTo(21.0f)
                curveTo(21.41f, 16.25f, 21.75f, 16.59f, 21.75f, 17.0f)
                curveTo(21.75f, 17.41f, 21.41f, 17.75f, 21.0f, 17.75f)
                close()
            }
        }
        .build()
        return _menu1!!
    }

private var _menu1: ImageVector? = null
