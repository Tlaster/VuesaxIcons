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

public val LinearGroup.`Lock-circle`: ImageVector
    get() {
        if (`_lock-circle` != null) {
            return `_lock-circle`!!
        }
        `_lock-circle` = Builder(name = "Lock-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 8.34f, 9.5f, 7.0f, 12.0f, 7.0f)
                curveTo(14.5f, 7.0f, 15.0f, 8.34f, 15.0f, 10.0f)
                verticalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.6f)
                curveTo(12.3314f, 14.6f, 12.6f, 14.3314f, 12.6f, 14.0f)
                curveTo(12.6f, 13.6687f, 12.3314f, 13.4f, 12.0f, 13.4f)
                curveTo(11.6686f, 13.4f, 11.4f, 13.6687f, 11.4f, 14.0f)
                curveTo(11.4f, 14.3314f, 11.6686f, 14.6f, 12.0f, 14.6f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 17.0f)
                horizontalLineTo(9.5f)
                curveTo(7.5f, 17.0f, 7.0f, 16.5f, 7.0f, 14.5f)
                verticalLineTo(13.5f)
                curveTo(7.0f, 11.5f, 7.5f, 11.0f, 9.5f, 11.0f)
                horizontalLineTo(14.5f)
                curveTo(16.5f, 11.0f, 17.0f, 11.5f, 17.0f, 13.5f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 16.5f, 16.5f, 17.0f, 14.5f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_lock-circle`!!
    }

private var `_lock-circle`: ImageVector? = null
