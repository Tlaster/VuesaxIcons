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

public val TwotoneGroup.`Ethereum-classic-(etc)`: ImageVector
    get() {
        if (`_ethereum-classic-(etc)` != null) {
            return `_ethereum-classic-(etc)`!!
        }
        `_ethereum-classic-(etc)` = Builder(name = "Ethereum-classic-(etc)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9001f, 9.1001f)
                lineTo(11.6701f, 6.9801f)
                curveTo(11.8801f, 6.8901f, 12.1201f, 6.8901f, 12.3201f, 6.9801f)
                lineTo(17.0901f, 9.1001f)
                curveTo(17.5101f, 9.2901f, 17.9001f, 8.7801f, 17.6101f, 8.4201f)
                lineTo(12.6101f, 2.3101f)
                curveTo(12.2701f, 1.8901f, 11.7101f, 1.8901f, 11.3701f, 2.3101f)
                lineTo(6.3701f, 8.4201f)
                curveTo(6.0901f, 8.7801f, 6.4801f, 9.2901f, 6.9001f, 9.1001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8996f, 14.9f)
                lineTo(11.6795f, 17.02f)
                curveTo(11.8895f, 17.11f, 12.1296f, 17.11f, 12.3296f, 17.02f)
                lineTo(17.1095f, 14.9f)
                curveTo(17.5295f, 14.71f, 17.9196f, 15.22f, 17.6296f, 15.58f)
                lineTo(12.6296f, 21.69f)
                curveTo(12.2896f, 22.11f, 11.7296f, 22.11f, 11.3896f, 21.69f)
                lineTo(6.3896f, 15.58f)
                curveTo(6.0896f, 15.22f, 6.4696f, 14.71f, 6.8996f, 14.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 9.3799f)
                lineTo(6.7598f, 11.9999f)
                lineTo(11.9998f, 14.6199f)
                lineTo(17.2397f, 11.9999f)
                lineTo(11.9998f, 9.3799f)
                close()
            }
        }
        .build()
        return `_ethereum-classic-(etc)`!!
    }

private var `_ethereum-classic-(etc)`: ImageVector? = null
