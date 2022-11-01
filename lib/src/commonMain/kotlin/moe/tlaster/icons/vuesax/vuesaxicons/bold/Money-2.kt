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

public val BoldGroup.`Money-2`: ImageVector
    get() {
        if (`_money-2` != null) {
            return `_money-2`!!
        }
        `_money-2` = Builder(name = "Money-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 3.5f, 2.0f, 5.0f, 2.0f, 8.5f)
                verticalLineTo(9.0f)
                verticalLineTo(15.0f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 19.0f, 4.0f, 20.5f, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 20.5f, 22.0f, 19.0f, 22.0f, 15.5f)
                verticalLineTo(15.0f)
                verticalLineTo(9.0f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 5.0f, 20.0f, 3.5f, 17.0f, 3.5f)
                close()
                moveTo(7.0f, 19.0f)
                curveTo(7.0f, 16.18f, 6.09f, 15.14f, 3.5f, 15.02f)
                verticalLineTo(15.0f)
                verticalLineTo(9.0f)
                verticalLineTo(8.98f)
                curveTo(6.09f, 8.86f, 7.0f, 7.82f, 7.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 7.82f, 17.91f, 8.86f, 20.5f, 8.98f)
                verticalLineTo(9.0f)
                verticalLineTo(15.0f)
                verticalLineTo(15.02f)
                curveTo(17.91f, 15.14f, 17.0f, 16.18f, 17.0f, 19.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_money-2`!!
    }

private var `_money-2`: ImageVector? = null
