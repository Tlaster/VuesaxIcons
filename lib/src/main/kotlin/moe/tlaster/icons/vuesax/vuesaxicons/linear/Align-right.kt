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

public val LinearGroup.`Align-right`: ImageVector
    get() {
        if (`_align-right` != null) {
            return `_align-right`!!
        }
        `_align-right` = Builder(name = "Align-right", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9f, 19.25f)
                horizontalLineTo(7.1f)
                curveTo(5.6f, 19.25f, 5.0f, 18.61f, 5.0f, 17.02f)
                verticalLineTo(15.98f)
                curveTo(5.0f, 14.39f, 5.6f, 13.75f, 7.1f, 13.75f)
                horizontalLineTo(18.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9f, 5.25f)
                horizontalLineTo(12.1f)
                curveTo(10.6f, 5.25f, 10.0f, 5.89f, 10.0f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(10.0f, 10.11f, 10.6f, 10.75f, 12.1f, 10.75f)
                horizontalLineTo(18.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 1.99f)
                verticalLineTo(21.99f)
            }
        }
        .build()
        return `_align-right`!!
    }

private var `_align-right`: ImageVector? = null
