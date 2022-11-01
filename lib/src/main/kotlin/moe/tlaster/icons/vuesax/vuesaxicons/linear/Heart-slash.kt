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

public val LinearGroup.`Heart-slash`: ImageVector
    get() {
        if (`_heart-slash` != null) {
            return `_heart-slash`!!
        }
        `_heart-slash` = Builder(name = "Heart-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.11f, 17.5f)
                curveTo(3.9f, 15.43f, 2.0f, 12.48f, 2.0f, 8.68f)
                curveTo(2.0f, 5.59f, 4.49f, 3.09f, 7.56f, 3.09f)
                curveTo(9.38f, 3.09f, 10.99f, 3.97f, 12.0f, 5.33f)
                curveTo(13.01f, 3.97f, 14.63f, 3.09f, 16.44f, 3.09f)
                curveTo(17.59f, 3.09f, 18.66f, 3.44f, 19.55f, 4.05f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.74f, 7.0f)
                curveTo(21.91f, 7.53f, 22.0f, 8.1f, 22.0f, 8.69f)
                curveTo(22.0f, 15.69f, 15.52f, 19.82f, 12.62f, 20.82f)
                curveTo(12.28f, 20.94f, 11.72f, 20.94f, 11.38f, 20.82f)
                curveTo(10.73f, 20.6f, 9.91f, 20.22f, 9.02f, 19.69f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return `_heart-slash`!!
    }

private var `_heart-slash`: ImageVector? = null
