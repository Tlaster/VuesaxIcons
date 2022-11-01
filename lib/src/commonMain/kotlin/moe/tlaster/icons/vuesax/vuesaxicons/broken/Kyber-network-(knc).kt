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

public val BrokenGroup.`Kyber-network-(knc)`: ImageVector
    get() {
        if (`_kyber-network-(knc)` != null) {
            return `_kyber-network-(knc)`!!
        }
        `_kyber-network-(knc)` = Builder(name = "Kyber-network-(knc)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 11.7001f)
                verticalLineTo(15.9701f)
                curveTo(5.0f, 16.6201f, 5.31f, 17.2201f, 5.84f, 17.6001f)
                lineTo(10.84f, 21.1701f)
                curveTo(11.54f, 21.6701f, 12.47f, 21.6701f, 13.16f, 21.1701f)
                lineTo(18.16f, 17.6001f)
                curveTo(18.69f, 17.2201f, 19.0f, 16.6201f, 19.0f, 15.9701f)
                verticalLineTo(7.1601f)
                curveTo(19.0f, 6.4401f, 18.62f, 5.7801f, 17.99f, 5.4201f)
                lineTo(12.99f, 2.5601f)
                curveTo(12.38f, 2.2101f, 11.62f, 2.2101f, 11.01f, 2.5601f)
                lineTo(6.01f, 5.4201f)
                curveTo(5.39f, 5.7801f, 5.0f, 6.4401f, 5.0f, 7.1601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(10.0f, 12.0f)
                lineTo(11.85f, 21.23f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.16f, 16.91f)
                lineTo(10.0f, 12.0f)
                lineTo(18.54f, 7.26f)
            }
        }
        .build()
        return `_kyber-network-(knc)`!!
    }

private var `_kyber-network-(knc)`: ImageVector? = null
