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

public val BrokenGroup.`Ethereum-(eth)`: ImageVector
    get() {
        if (`_ethereum-(eth)` != null) {
            return `_ethereum-(eth)`!!
        }
        `_ethereum-(eth)` = Builder(name = "Ethereum-(eth)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4504f, 3.0501f)
                lineTo(6.7204f, 7.7101f)
                curveTo(5.8704f, 8.7701f, 6.1704f, 10.1301f, 7.3804f, 10.7301f)
                lineTo(11.1104f, 12.6001f)
                curveTo(11.6004f, 12.8401f, 12.4004f, 12.8401f, 12.8904f, 12.6001f)
                lineTo(16.6204f, 10.7301f)
                curveTo(17.8304f, 10.1201f, 18.1304f, 8.7601f, 17.2804f, 7.7101f)
                lineTo(13.5504f, 3.0501f)
                curveTo(12.7004f, 1.9801f, 11.3004f, 1.9801f, 10.4504f, 3.0501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.3001f)
                verticalLineTo(7.5601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8008f, 10.7101f)
                lineTo(12.0008f, 7.5601f)
                lineTo(16.2008f, 10.7101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8004f, 17.7299f)
                lineTo(7.0005f, 16.7499f)
                curveTo(6.0005f, 15.5299f, 7.3304f, 13.7899f, 8.7704f, 14.4299f)
                lineTo(10.3804f, 15.1499f)
                curveTo(11.4104f, 15.6099f, 12.5904f, 15.6099f, 13.6304f, 15.1499f)
                lineTo(15.2404f, 14.4299f)
                curveTo(16.6804f, 13.7899f, 18.0104f, 15.5299f, 17.0104f, 16.7499f)
                lineTo(13.5504f, 20.9799f)
                curveTo(12.7004f, 22.0199f, 11.3104f, 22.0199f, 10.4504f, 20.9799f)
            }
        }
        .build()
        return `_ethereum-(eth)`!!
    }

private var `_ethereum-(eth)`: ImageVector? = null
