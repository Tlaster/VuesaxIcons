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

public val LinearGroup.`Ethereum-(eth)`: ImageVector
    get() {
        if (`_ethereum-(eth)` != null) {
            return `_ethereum-(eth)`!!
        }
        `_ethereum-(eth)` = Builder(name = "Ethereum-(eth)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4499f, 3.0501f)
                lineTo(6.7099f, 7.7101f)
                curveTo(5.8599f, 8.7701f, 6.1599f, 10.1301f, 7.3699f, 10.7301f)
                lineTo(11.0999f, 12.6001f)
                curveTo(11.5899f, 12.8401f, 12.3899f, 12.8401f, 12.8799f, 12.6001f)
                lineTo(16.6099f, 10.7301f)
                curveTo(17.8199f, 10.1201f, 18.1199f, 8.7601f, 17.2699f, 7.7101f)
                lineTo(13.5399f, 3.0501f)
                curveTo(12.6999f, 1.9801f, 11.2999f, 1.9801f, 10.4499f, 3.0501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.3001f)
                verticalLineTo(7.5601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.7998f, 10.7101f)
                lineTo(11.9998f, 7.5601f)
                lineTo(16.1998f, 10.7101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.7699f, 14.4301f)
                lineTo(10.3799f, 15.1501f)
                curveTo(11.4099f, 15.6101f, 12.5899f, 15.6101f, 13.6299f, 15.1501f)
                lineTo(15.2399f, 14.4301f)
                curveTo(16.6799f, 13.7901f, 18.0099f, 15.5301f, 17.0099f, 16.7501f)
                lineTo(13.5499f, 20.9801f)
                curveTo(12.6999f, 22.0201f, 11.3099f, 22.0201f, 10.4499f, 20.9801f)
                lineTo(6.9999f, 16.7501f)
                curveTo(5.9899f, 15.5301f, 7.3199f, 13.7901f, 8.7699f, 14.4301f)
                close()
            }
        }
        .build()
        return `_ethereum-(eth)`!!
    }

private var `_ethereum-(eth)`: ImageVector? = null
