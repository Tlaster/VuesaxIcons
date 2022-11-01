package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Grid-7`: ImageVector
    get() {
        if (`_grid-7` != null) {
            return `_grid-7`!!
        }
        `_grid-7` = Builder(name = "Grid-7", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 10.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22.0f, 2.0f, 19.83f, 2.0f, 16.19f)
                verticalLineTo(10.5f)
                horizontalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.5f)
                verticalLineTo(16.19f)
                curveTo(22.0f, 19.83f, 19.83f, 22.0f, 16.19f, 22.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.5f)
                horizontalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                close()
            }
        }
        .build()
        return `_grid-7`!!
    }

private var `_grid-7`: ImageVector? = null
