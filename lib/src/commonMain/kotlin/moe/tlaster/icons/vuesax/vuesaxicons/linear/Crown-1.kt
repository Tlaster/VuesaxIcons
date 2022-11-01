package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Crown-1`: ImageVector
    get() {
        if (`_crown-1` != null) {
            return `_crown-1`!!
        }
        `_crown-1` = Builder(name = "Crown-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.29f)
                verticalLineTo(5.71f)
                curveTo(2.0f, 4.38f, 2.77f, 4.06f, 3.71f, 5.0f)
                lineTo(6.3f, 7.59f)
                curveTo(6.69f, 7.98f, 7.33f, 7.98f, 7.71f, 7.59f)
                lineTo(11.29f, 4.0f)
                curveTo(11.68f, 3.61f, 12.32f, 3.61f, 12.7f, 4.0f)
                lineTo(16.29f, 7.59f)
                curveTo(16.68f, 7.98f, 17.32f, 7.98f, 17.7f, 7.59f)
                lineTo(20.29f, 5.0f)
                curveTo(21.23f, 4.06f, 22.0f, 4.38f, 22.0f, 5.71f)
                verticalLineTo(15.3f)
                curveTo(22.0f, 18.3f, 20.0f, 20.3f, 17.0f, 20.3f)
                horizontalLineTo(7.0f)
                curveTo(4.24f, 20.29f, 2.0f, 18.05f, 2.0f, 15.29f)
                close()
            }
        }
        .build()
        return `_crown-1`!!
    }

private var `_crown-1`: ImageVector? = null
