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

public val LinearGroup.`Lock-slash`: ImageVector
    get() {
        if (`_lock-slash` != null) {
            return `_lock-slash`!!
        }
        `_lock-slash` = Builder(name = "Lock-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.02f, 17.52f)
                curveTo(10.48f, 18.11f, 11.2f, 18.5f, 12.0f, 18.5f)
                curveTo(13.38f, 18.5f, 14.5f, 17.38f, 14.5f, 16.0f)
                curveTo(14.5f, 15.43f, 14.31f, 14.9f, 13.99f, 14.48f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.82f, 20.8f)
                curveTo(2.21f, 20.04f, 2.0f, 18.83f, 2.0f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 11.0f, 3.0f, 10.0f, 7.0f, 10.0f)
                horizontalLineTo(17.0f)
                curveTo(17.36f, 10.0f, 17.69f, 10.01f, 18.0f, 10.03f)
                curveTo(21.17f, 10.21f, 22.0f, 11.36f, 22.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 21.0f, 21.0f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.64f, 22.0f, 6.31f, 21.99f, 6.0f, 21.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 4.69f, 7.0f, 2.0f, 12.0f, 2.0f)
                curveTo(16.15f, 2.0f, 17.54f, 3.38f, 17.9f, 5.56f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return `_lock-slash`!!
    }

private var `_lock-slash`: ImageVector? = null
