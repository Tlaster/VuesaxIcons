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

public val LinearGroup.`Smart-home`: ImageVector
    get() {
        if (`_smart-home` != null) {
            return `_smart-home`!!
        }
        `_smart-home` = Builder(name = "Smart-home", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4f, 21.8101f)
                horizontalLineTo(17.6f)
                curveTo(19.03f, 21.8101f, 20.4f, 20.65f, 20.64f, 19.24f)
                lineTo(21.97f, 11.28f)
                curveTo(22.13f, 10.3f, 21.63f, 8.99f, 20.86f, 8.37f)
                lineTo(13.93f, 2.83f)
                curveTo(12.86f, 1.97f, 11.13f, 1.97f, 10.07f, 2.82f)
                lineTo(3.14f, 8.37f)
                curveTo(2.36f, 8.99f, 1.86f, 10.3f, 2.03f, 11.28f)
                lineTo(2.31f, 12.96f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                curveTo(3.76f, 19.04f, 4.96f, 20.24f, 5.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                curveTo(7.99f, 21.24f, 7.86f, 20.53f, 7.63f, 19.88f)
                curveTo(7.04f, 18.21f, 5.78f, 16.96f, 4.12f, 16.37f)
                curveTo(3.47f, 16.14f, 2.76f, 16.01f, 2.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9955f, 22.0f)
                horizontalLineTo(2.0045f)
            }
        }
        .build()
        return `_smart-home`!!
    }

private var `_smart-home`: ImageVector? = null
