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

public val BoldGroup.`Direct-left`: ImageVector
    get() {
        if (`_direct-left` != null) {
            return `_direct-left`!!
        }
        `_direct-left` = Builder(name = "Direct-left", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2916f, 17.0218f)
                lineTo(19.5516f, 13.5418f)
                curveTo(19.0716f, 12.5718f, 19.0716f, 11.4418f, 19.5516f, 10.4718f)
                lineTo(21.2916f, 6.9918f)
                curveTo(22.7816f, 4.0018f, 19.5716f, 0.8618f, 16.6216f, 2.4218f)
                lineTo(15.0816f, 3.2418f)
                curveTo(14.8716f, 3.3518f, 14.7016f, 3.5318f, 14.6016f, 3.7518f)
                lineTo(8.9016f, 16.3918f)
                curveTo(8.6716f, 16.9118f, 8.8816f, 17.5218f, 9.3816f, 17.7818f)
                lineTo(16.6216f, 21.5918f)
                curveTo(19.5716f, 23.1518f, 22.7816f, 20.0018f, 21.2916f, 17.0218f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6895f, 15.6004f)
                lineTo(11.4195f, 7.3204f)
                curveTo(11.8395f, 6.3905f, 10.8395f, 5.4504f, 9.9395f, 5.9304f)
                lineTo(4.1695f, 8.9605f)
                curveTo(1.7195f, 10.2504f, 1.7195f, 13.7504f, 4.1695f, 15.0404f)
                lineTo(6.2095f, 16.1104f)
                curveTo(6.7595f, 16.4004f, 7.4295f, 16.1704f, 7.6895f, 15.6004f)
                close()
            }
        }
        .build()
        return `_direct-left`!!
    }

private var `_direct-left`: ImageVector? = null
