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

public val LinearGroup.`Radar-2`: ImageVector
    get() {
        if (`_radar-2` != null) {
            return `_radar-2`!!
        }
        `_radar-2` = Builder(name = "Radar-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                curveTo(7.67f, 2.75f, 9.75f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 10.19f, 2.48f, 8.49f, 3.33f, 7.02f)
                lineTo(12.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.83f, 8.96f)
                curveTo(6.3f, 9.85f, 6.0f, 10.89f, 6.0f, 12.0f)
                curveTo(6.0f, 15.31f, 8.69f, 18.0f, 12.0f, 18.0f)
                curveTo(15.31f, 18.0f, 18.0f, 15.31f, 18.0f, 12.0f)
                curveTo(18.0f, 8.69f, 15.31f, 6.0f, 12.0f, 6.0f)
                curveTo(11.09f, 6.0f, 10.22f, 6.2f, 9.45f, 6.57f)
            }
        }
        .build()
        return `_radar-2`!!
    }

private var `_radar-2`: ImageVector? = null
