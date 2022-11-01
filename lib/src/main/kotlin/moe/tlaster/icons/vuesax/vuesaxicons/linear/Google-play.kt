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

public val LinearGroup.`Google-play`: ImageVector
    get() {
        if (`_google-play` != null) {
            return `_google-play`!!
        }
        `_google-play` = Builder(name = "Google-play", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4f, 12.9f)
                lineTo(16.9f, 15.2f)
                lineTo(13.7f, 12.0f)
                lineTo(16.9f, 8.8f)
                lineTo(21.4f, 11.0f)
                curveTo(22.2f, 11.4f, 22.2f, 12.6f, 21.4f, 12.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9f, 8.8f)
                lineTo(13.7f, 12.0f)
                lineTo(4.1f, 21.6f)
                lineTo(3.5f, 21.9f)
                curveTo(2.8f, 22.3f, 2.0f, 21.7f, 2.0f, 20.9f)
                verticalLineTo(3.1f)
                curveTo(2.0f, 2.3f, 2.8f, 1.8f, 3.5f, 2.1f)
                lineTo(16.9f, 8.8f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9001f, 15.2f)
                lineTo(4.1001f, 21.6f)
                lineTo(13.7001f, 12.0f)
                lineTo(16.9001f, 15.2f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.7001f, 11.9999f)
                lineTo(4.1001f, 2.3999f)
            }
        }
        .build()
        return `_google-play`!!
    }

private var `_google-play`: ImageVector? = null
