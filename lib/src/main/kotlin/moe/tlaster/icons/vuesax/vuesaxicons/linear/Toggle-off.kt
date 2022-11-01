package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Toggle-off`: ImageVector
    get() {
        if (`_toggle-off` != null) {
            return `_toggle-off`!!
        }
        `_toggle-off` = Builder(name = "Toggle-off", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3f, 16.0f)
                horizontalLineTo(10.7f)
                curveTo(12.7f, 16.0f, 13.5f, 15.2f, 13.5f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(13.5f, 8.8f, 12.7f, 8.0f, 10.7f, 8.0f)
                horizontalLineTo(8.3f)
                curveTo(6.3f, 8.0f, 5.5f, 8.8f, 5.5f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(5.5f, 15.2f, 6.3f, 16.0f, 8.3f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 20.0f, 2.0f, 19.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 5.0f, 3.0f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 4.0f, 22.0f, 5.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 19.0f, 21.0f, 20.0f, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_toggle-off`!!
    }

private var `_toggle-off`: ImageVector? = null
