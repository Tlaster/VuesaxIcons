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

public val OutlineGroup.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.75f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 12.75f, 5.25f, 12.41f, 5.25f, 12.0f)
                curveTo(5.25f, 11.59f, 5.59f, 11.25f, 6.0f, 11.25f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 11.25f, 18.75f, 11.59f, 18.75f, 12.0f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 5.59f, 11.59f, 5.25f, 12.0f, 5.25f)
                curveTo(12.41f, 5.25f, 12.75f, 5.59f, 12.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12.0f, 18.75f)
                close()
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
