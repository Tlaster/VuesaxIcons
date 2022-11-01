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

public val LinearGroup.`Lamp-charge`: ImageVector
    get() {
        if (`_lamp-charge` != null) {
            return `_lamp-charge`!!
        }
        `_lamp-charge` = Builder(name = "Lamp-charge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 7.8899f)
                lineTo(10.9301f, 9.7499f)
                curveTo(10.6901f, 10.1599f, 10.8901f, 10.4999f, 11.3601f, 10.4999f)
                horizontalLineTo(12.6301f)
                curveTo(13.1101f, 10.4999f, 13.3001f, 10.8399f, 13.0601f, 11.2499f)
                lineTo(12.0001f, 13.1099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3001f, 18.0399f)
                verticalLineTo(16.8799f)
                curveTo(6.0001f, 15.4899f, 4.1101f, 12.7799f, 4.1101f, 9.8999f)
                curveTo(4.1101f, 4.9499f, 8.6601f, 1.0699f, 13.8001f, 2.1899f)
                curveTo(16.0601f, 2.6899f, 18.0401f, 4.1899f, 19.0701f, 6.2599f)
                curveTo(21.1601f, 10.4599f, 18.9601f, 14.9199f, 15.7301f, 16.8699f)
                verticalLineTo(18.0299f)
                curveTo(15.7301f, 18.3199f, 15.8401f, 18.9899f, 14.7701f, 18.9899f)
                horizontalLineTo(9.2601f)
                curveTo(8.1601f, 18.9999f, 8.3001f, 18.5699f, 8.3001f, 18.0399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 22.0f)
                curveTo(10.79f, 21.35f, 13.21f, 21.35f, 15.5f, 22.0f)
            }
        }
        .build()
        return `_lamp-charge`!!
    }

private var `_lamp-charge`: ImageVector? = null
