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

public val BoldGroup.`Money-3`: ImageVector
    get() {
        if (`_money-3` != null) {
            return `_money-3`!!
        }
        `_money-3` = Builder(name = "Money-3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(8.0f, 17.75f)
                horizontalLineTo(5.0f)
                curveTo(4.59f, 17.75f, 4.25f, 17.41f, 4.25f, 17.0f)
                curveTo(4.25f, 16.59f, 4.59f, 16.25f, 5.0f, 16.25f)
                horizontalLineTo(8.0f)
                curveTo(8.41f, 16.25f, 8.75f, 16.59f, 8.75f, 17.0f)
                curveTo(8.75f, 17.41f, 8.41f, 17.75f, 8.0f, 17.75f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(10.34f, 15.0f, 9.0f, 13.66f, 9.0f, 12.0f)
                curveTo(9.0f, 10.34f, 10.34f, 9.0f, 12.0f, 9.0f)
                curveTo(13.66f, 9.0f, 15.0f, 10.34f, 15.0f, 12.0f)
                curveTo(15.0f, 13.66f, 13.66f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(19.0f, 7.75f)
                horizontalLineTo(16.0f)
                curveTo(15.59f, 7.75f, 15.25f, 7.41f, 15.25f, 7.0f)
                curveTo(15.25f, 6.59f, 15.59f, 6.25f, 16.0f, 6.25f)
                horizontalLineTo(19.0f)
                curveTo(19.41f, 6.25f, 19.75f, 6.59f, 19.75f, 7.0f)
                curveTo(19.75f, 7.41f, 19.41f, 7.75f, 19.0f, 7.75f)
                close()
            }
        }
        .build()
        return `_money-3`!!
    }

private var `_money-3`: ImageVector? = null
