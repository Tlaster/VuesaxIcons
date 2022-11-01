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

public val LinearGroup.`Frame-2`: ImageVector
    get() {
        if (`_frame-2` != null) {
            return `_frame-2`!!
        }
        `_frame-2` = Builder(name = "Frame-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.26f, 18.9f)
                verticalLineTo(7.1f)
                curveTo(19.26f, 5.6f, 18.62f, 5.0f, 17.03f, 5.0f)
                horizontalLineTo(15.99f)
                curveTo(14.4f, 5.0f, 13.76f, 5.6f, 13.76f, 7.1f)
                verticalLineTo(18.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.26f, 18.9f)
                verticalLineTo(12.1f)
                curveTo(5.26f, 10.6f, 5.9f, 10.0f, 7.49f, 10.0f)
                horizontalLineTo(8.53f)
                curveTo(10.12f, 10.0f, 10.76f, 10.6f, 10.76f, 12.1f)
                verticalLineTo(18.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return `_frame-2`!!
    }

private var `_frame-2`: ImageVector? = null
