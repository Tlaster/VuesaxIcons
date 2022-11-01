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

public val LinearGroup.`Flash-slash`: ImageVector
    get() {
        if (`_flash-slash` != null) {
            return `_flash-slash`!!
        }
        `_flash-slash` = Builder(name = "Flash-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.18f, 18.04f)
                verticalLineTo(20.48f)
                curveTo(9.18f, 22.16f, 10.0901f, 22.5f, 11.2001f, 21.24f)
                lineTo(18.7701f, 12.64f)
                curveTo(19.7001f, 11.59f, 19.3101f, 10.72f, 17.9001f, 10.72f)
                horizontalLineTo(16.9701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.82f, 8.84f)
                verticalLineTo(3.52f)
                curveTo(14.82f, 1.84f, 13.91f, 1.5f, 12.8f, 2.76f)
                lineTo(5.23f, 11.36f)
                curveTo(4.3f, 12.41f, 4.69f, 13.28f, 6.1f, 13.28f)
                horizontalLineTo(9.19f)
                verticalLineTo(14.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return `_flash-slash`!!
    }

private var `_flash-slash`: ImageVector? = null
