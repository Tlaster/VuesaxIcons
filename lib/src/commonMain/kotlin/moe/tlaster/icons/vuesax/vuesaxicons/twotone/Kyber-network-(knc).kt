package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.`Kyber-network-(knc)`: ImageVector
    get() {
        if (`_kyber-network-(knc)` != null) {
            return `_kyber-network-(knc)`!!
        }
        `_kyber-network-(knc)` = Builder(name = "Kyber-network-(knc)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.01f, 2.5701f)
                lineTo(6.01f, 5.4301f)
                curveTo(5.39f, 5.7901f, 5.0f, 6.4501f, 5.0f, 7.1701f)
                verticalLineTo(15.9801f)
                curveTo(5.0f, 16.6301f, 5.31f, 17.2301f, 5.84f, 17.6101f)
                lineTo(10.84f, 21.1801f)
                curveTo(11.54f, 21.6801f, 12.47f, 21.6801f, 13.16f, 21.1801f)
                lineTo(18.16f, 17.6101f)
                curveTo(18.69f, 17.2301f, 19.0f, 16.6301f, 19.0f, 15.9801f)
                verticalLineTo(7.1701f)
                curveTo(19.0f, 6.4501f, 18.62f, 5.7901f, 17.99f, 5.4301f)
                lineTo(12.99f, 2.5701f)
                curveTo(12.38f, 2.2201f, 11.62f, 2.2201f, 11.01f, 2.5701f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(10.0f, 12.0f)
                lineTo(11.85f, 21.23f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.16f, 16.9098f)
                lineTo(10.0f, 11.9998f)
                lineTo(18.54f, 7.2598f)
            }
        }
        .build()
        return `_kyber-network-(knc)`!!
    }

private var `_kyber-network-(knc)`: ImageVector? = null
