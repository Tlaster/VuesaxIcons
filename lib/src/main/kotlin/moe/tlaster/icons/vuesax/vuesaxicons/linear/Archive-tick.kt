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

public val LinearGroup.`Archive-tick`: ImageVector
    get() {
        if (`_archive-tick` != null) {
            return `_archive-tick`!!
        }
        `_archive-tick` = Builder(name = "Archive-tick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8199f, 2.0f)
                horizontalLineTo(7.18f)
                curveTo(5.05f, 2.0f, 3.32f, 3.74f, 3.32f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.32f, 21.75f, 4.61f, 22.51f, 6.1899f, 21.64f)
                lineTo(11.0699f, 18.93f)
                curveTo(11.5899f, 18.64f, 12.4299f, 18.64f, 12.9399f, 18.93f)
                lineTo(17.8199f, 21.64f)
                curveTo(19.3999f, 22.52f, 20.6899f, 21.76f, 20.6899f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.6799f, 3.74f, 18.9499f, 2.0f, 16.8199f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.59f, 11.0f)
                lineTo(11.09f, 12.5f)
                lineTo(15.09f, 8.5f)
            }
        }
        .build()
        return `_archive-tick`!!
    }

private var `_archive-tick`: ImageVector? = null
