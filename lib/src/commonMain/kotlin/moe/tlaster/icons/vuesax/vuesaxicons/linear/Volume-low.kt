package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Volume-low`: ImageVector
    get() {
        if (`_volume-low` != null) {
            return `_volume-low`!!
        }
        `_volume-low` = Builder(name = "Volume-low", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.33f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.33f, 16.0f, 4.33f, 17.0f, 6.33f, 17.0f)
                horizontalLineTo(7.76f)
                curveTo(8.13f, 17.0f, 8.5f, 17.11f, 8.82f, 17.3f)
                lineTo(11.74f, 19.13f)
                curveTo(14.26f, 20.71f, 16.33f, 19.56f, 16.33f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(16.33f, 4.43f, 14.26f, 3.29f, 11.74f, 4.87f)
                lineTo(8.82f, 6.7f)
                curveTo(8.5f, 6.89f, 8.13f, 7.0f, 7.76f, 7.0f)
                horizontalLineTo(6.33f)
                curveTo(4.33f, 7.0f, 3.33f, 8.0f, 3.33f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.33f, 8.0f)
                curveTo(21.11f, 10.37f, 21.11f, 13.63f, 19.33f, 16.0f)
            }
        }
        .build()
        return `_volume-low`!!
    }

private var `_volume-low`: ImageVector? = null
