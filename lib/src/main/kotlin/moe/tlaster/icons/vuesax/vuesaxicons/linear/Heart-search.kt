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

public val LinearGroup.`Heart-search`: ImageVector
    get() {
        if (`_heart-search` != null) {
            return `_heart-search`!!
        }
        `_heart-search` = Builder(name = "Heart-search", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.49f, 12.0f)
                curveTo(21.81f, 10.98f, 22.0f, 9.88f, 22.0f, 8.69f)
                curveTo(22.0f, 5.6f, 19.51f, 3.1f, 16.44f, 3.1f)
                curveTo(14.62f, 3.1f, 13.01f, 3.98f, 12.0f, 5.34f)
                curveTo(10.99f, 3.98f, 9.37f, 3.1f, 7.56f, 3.1f)
                curveTo(4.49f, 3.1f, 2.0f, 5.6f, 2.0f, 8.69f)
                curveTo(2.0f, 15.69f, 8.48f, 19.82f, 11.38f, 20.82f)
                curveTo(11.55f, 20.88f, 11.77f, 20.91f, 12.0f, 20.91f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.74f, 21.0f)
                curveTo(19.5073f, 21.0f, 20.94f, 19.5673f, 20.94f, 17.8f)
                curveTo(20.94f, 16.0327f, 19.5073f, 14.6f, 17.74f, 14.6f)
                curveTo(15.9727f, 14.6f, 14.54f, 16.0327f, 14.54f, 17.8f)
                curveTo(14.54f, 19.5673f, 15.9727f, 21.0f, 17.74f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.54f, 21.6f)
                lineTo(20.54f, 20.6f)
            }
        }
        .build()
        return `_heart-search`!!
    }

private var `_heart-search`: ImageVector? = null
