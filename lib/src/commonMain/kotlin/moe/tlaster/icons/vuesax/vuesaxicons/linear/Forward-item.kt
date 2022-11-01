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

public val LinearGroup.`Forward-item`: ImageVector
    get() {
        if (`_forward-item` != null) {
            return `_forward-item`!!
        }
        `_forward-item` = Builder(name = "Forward-item", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.38f, 10.3799f)
                verticalLineTo(13.6099f)
                curveTo(17.38f, 16.2999f, 16.3f, 17.3799f, 13.61f, 17.3799f)
                horizontalLineTo(10.38f)
                curveTo(7.69f, 17.3799f, 6.61f, 16.2999f, 6.61f, 13.6099f)
                verticalLineTo(10.3799f)
                curveTo(6.61f, 7.6899f, 7.69f, 6.6099f, 10.38f, 6.6099f)
                horizontalLineTo(13.61f)
                curveTo(16.31f, 6.6199f, 17.38f, 7.6899f, 17.38f, 10.3799f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 5.77f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 11.69f, 20.92f, 12.77f, 18.23f, 12.77f)
                horizontalLineTo(17.38f)
                verticalLineTo(10.39f)
                curveTo(17.38f, 7.7f, 16.3f, 6.62f, 13.61f, 6.62f)
                horizontalLineTo(11.23f)
                verticalLineTo(5.77f)
                curveTo(11.23f, 3.08f, 12.31f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(18.23f)
                curveTo(20.92f, 2.0f, 22.0f, 3.08f, 22.0f, 5.77f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 18.23f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 12.31f, 3.08f, 11.23f, 5.77f, 11.23f)
                horizontalLineTo(6.62f)
                verticalLineTo(13.61f)
                curveTo(6.62f, 16.3f, 7.7f, 17.38f, 10.39f, 17.38f)
                horizontalLineTo(12.77f)
                verticalLineTo(18.23f)
                curveTo(12.77f, 20.92f, 11.69f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(5.77f)
                curveTo(3.08f, 22.0f, 2.0f, 20.92f, 2.0f, 18.23f)
                close()
            }
        }
        .build()
        return `_forward-item`!!
    }

private var `_forward-item`: ImageVector? = null
