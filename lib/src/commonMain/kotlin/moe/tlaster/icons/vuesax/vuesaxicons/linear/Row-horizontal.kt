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

public val LinearGroup.`Row-horizontal`: ImageVector
    get() {
        if (`_row-horizontal` != null) {
            return `_row-horizontal`!!
        }
        `_row-horizontal` = Builder(name = "Row-horizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(10.5f, 2.6f, 9.86f, 2.0f, 8.27f, 2.0f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 2.0f, 2.0f, 2.6f, 2.0f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.0f, 21.4f, 2.64f, 22.0f, 4.23f, 22.0f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 22.0f, 10.5f, 21.4f, 10.5f, 19.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(22.0f, 2.6f, 21.36f, 2.0f, 19.77f, 2.0f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 2.0f, 13.5f, 2.6f, 13.5f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(13.5f, 21.4f, 14.14f, 22.0f, 15.73f, 22.0f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 22.0f, 22.0f, 21.4f, 22.0f, 19.9f)
                close()
            }
        }
        .build()
        return `_row-horizontal`!!
    }

private var `_row-horizontal`: ImageVector? = null
