package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.`Google-play`: ImageVector
    get() {
        if (`_google-play` != null) {
            return `_google-play`!!
        }
        `_google-play` = Builder(name = "Google-play", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.3995f, 12.9501f)
                lineTo(16.8795f, 15.2101f)
                lineTo(13.6895f, 12.0201f)
                lineTo(16.9095f, 8.8f)
                lineTo(21.3995f, 11.05f)
                curveTo(22.1895f, 11.44f, 22.1895f, 12.5601f, 21.3995f, 12.9501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.06f)
                verticalLineTo(3.07f)
                curveTo(2.0f, 2.27f, 2.83f, 1.76f, 3.55f, 2.11f)
                lineTo(16.92f, 8.8f)
                lineTo(13.7f, 12.02f)
                lineTo(4.12f, 21.6f)
                lineTo(3.54f, 21.89f)
                curveTo(2.83f, 22.24f, 2.0f, 21.73f, 2.0f, 20.93f)
                verticalLineTo(13.57f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8891f, 15.21f)
                lineTo(4.1191f, 21.6f)
                lineTo(13.6991f, 12.02f)
                lineTo(16.8891f, 15.21f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6998f, 12.0199f)
                lineTo(4.0898f, 2.4099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9206f, 15.24f)
                lineTo(16.8906f, 15.21f)
            }
        }
        .build()
        return `_google-play`!!
    }

private var `_google-play`: ImageVector? = null
