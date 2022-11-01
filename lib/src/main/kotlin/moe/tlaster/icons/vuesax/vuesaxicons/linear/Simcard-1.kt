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

public val LinearGroup.`Simcard-1`: ImageVector
    get() {
        if (`_simcard-1` != null) {
            return `_simcard-1`!!
        }
        `_simcard-1` = Builder(name = "Simcard-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.54f, 6.54f)
                lineTo(16.47f, 3.47f)
                curveTo(15.53f, 2.53f, 14.26f, 2.01f, 12.93f, 2.01f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 2.01f, 3.0f, 4.01f, 3.0f, 7.01f)
                verticalLineTo(17.01f)
                curveTo(3.0f, 20.01f, 5.0f, 22.01f, 8.0f, 22.01f)
                horizontalLineTo(16.0f)
                curveTo(19.0f, 22.01f, 21.0f, 20.01f, 21.0f, 17.01f)
                verticalLineTo(10.08f)
                curveTo(21.0f, 8.74f, 20.47f, 7.47f, 19.54f, 6.54f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 14.0f)
                lineTo(7.5f, 16.0f)
                lineTo(9.5f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 14.0f)
                lineTo(16.5f, 16.0f)
                lineTo(14.5f, 18.0f)
            }
        }
        .build()
        return `_simcard-1`!!
    }

private var `_simcard-1`: ImageVector? = null
