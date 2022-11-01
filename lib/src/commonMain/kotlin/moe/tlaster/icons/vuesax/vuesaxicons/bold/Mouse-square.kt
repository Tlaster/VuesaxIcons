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

public val BoldGroup.`Mouse-square`: ImageVector
    get() {
        if (`_mouse-square` != null) {
            return `_mouse-square`!!
        }
        `_mouse-square` = Builder(name = "Mouse-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.52f)
                verticalLineTo(13.4f)
                curveTo(21.0f, 13.74f, 20.67f, 13.98f, 20.35f, 13.88f)
                lineTo(16.42f, 12.66f)
                curveTo(15.34f, 12.33f, 14.18f, 12.61f, 13.39f, 13.4f)
                curveTo(12.59f, 14.2f, 12.3f, 15.37f, 12.64f, 16.45f)
                lineTo(13.85f, 20.35f)
                curveTo(13.95f, 20.67f, 13.71f, 21.0f, 13.37f, 21.0f)
                horizontalLineTo(7.52f)
                curveTo(4.07f, 21.0f, 2.0f, 18.94f, 2.0f, 15.48f)
                verticalLineTo(7.52f)
                curveTo(2.0f, 4.06f, 4.07f, 2.0f, 7.52f, 2.0f)
                horizontalLineTo(15.48f)
                curveTo(18.93f, 2.0f, 21.0f, 4.06f, 21.0f, 7.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9597f, 18.8385f)
                lineTo(20.3297f, 19.3885f)
                curveTo(19.8797f, 19.5385f, 19.5197f, 19.8885f, 19.3697f, 20.3485f)
                lineTo(18.8197f, 21.9785f)
                curveTo(18.3497f, 23.3885f, 16.3697f, 23.3585f, 15.9297f, 21.9485f)
                lineTo(14.0797f, 15.9985f)
                curveTo(13.7197f, 14.8185f, 14.8097f, 13.7185f, 15.9797f, 14.0885f)
                lineTo(21.9397f, 15.9385f)
                curveTo(23.3397f, 16.3785f, 23.3597f, 18.3685f, 21.9597f, 18.8385f)
                close()
            }
        }
        .build()
        return `_mouse-square`!!
    }

private var `_mouse-square`: ImageVector? = null
