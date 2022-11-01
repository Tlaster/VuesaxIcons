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

public val LinearGroup.`Backward-item-1`: ImageVector
    get() {
        if (`_backward-item-1` != null) {
            return `_backward-item-1`!!
        }
        `_backward-item-1` = Builder(name = "Backward-item-1", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 5.15f)
                verticalLineTo(7.85f)
                curveTo(22.0f, 10.1f, 21.1f, 11.0f, 18.85f, 11.0f)
                horizontalLineTo(16.15f)
                curveTo(13.9f, 11.0f, 13.0f, 10.1f, 13.0f, 7.85f)
                verticalLineTo(5.15f)
                curveTo(13.0f, 2.9f, 13.9f, 2.0f, 16.15f, 2.0f)
                horizontalLineTo(18.85f)
                curveTo(21.1f, 2.0f, 22.0f, 2.9f, 22.0f, 5.15f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(11.0f, 21.1f, 10.1f, 22.0f, 7.85f, 22.0f)
                horizontalLineTo(5.15f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(2.0f, 13.9f, 2.9f, 13.0f, 5.15f, 13.0f)
                horizontalLineTo(7.85f)
                curveTo(10.1f, 13.0f, 11.0f, 13.9f, 11.0f, 16.15f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.38f, 11.0001f)
                verticalLineTo(13.6201f)
                curveTo(17.38f, 16.3101f, 16.31f, 17.3801f, 13.62f, 17.3801f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.1501f)
                curveTo(11.0f, 13.9001f, 10.1f, 13.0001f, 7.85f, 13.0001f)
                horizontalLineTo(6.62f)
                verticalLineTo(10.3801f)
                curveTo(6.62f, 7.6901f, 7.69f, 6.6201f, 10.38f, 6.6201f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.8501f)
                curveTo(13.0f, 10.1001f, 13.9f, 11.0001f, 16.15f, 11.0001f)
                horizontalLineTo(17.38f)
                close()
            }
        }
        .build()
        return `_backward-item-1`!!
    }

private var `_backward-item-1`: ImageVector? = null
