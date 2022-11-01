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

public val LinearGroup.`Triangle-1`: ImageVector
    get() {
        if (`_triangle-1` != null) {
            return `_triangle-1`!!
        }
        `_triangle-1` = Builder(name = "Triangle-1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.41f)
                horizontalLineTo(5.94f)
                curveTo(2.47f, 21.41f, 1.02f, 18.93f, 2.7f, 15.9f)
                lineTo(5.82f, 10.28f)
                lineTo(8.76f, 5.0f)
                curveTo(10.54f, 1.79f, 13.46f, 1.79f, 15.24f, 5.0f)
                lineTo(18.18f, 10.29f)
                lineTo(21.3f, 15.91f)
                curveTo(22.98f, 18.94f, 21.52f, 21.42f, 18.06f, 21.42f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.41f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.44f, 20.0f)
                lineTo(12.0f, 13.39f)
                lineTo(2.56f, 20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                verticalLineTo(13.39f)
            }
        }
        .build()
        return `_triangle-1`!!
    }

private var `_triangle-1`: ImageVector? = null
