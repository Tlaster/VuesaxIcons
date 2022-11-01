package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Avalanche-(avax)`: ImageVector
    get() {
        if (`_avalanche-(avax)` != null) {
            return `_avalanche-(avax)`!!
        }
        `_avalanche-(avax)` = Builder(name = "Avalanche-(avax)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.1f, 15.5999f)
                lineTo(11.7f, 5.9999f)
                curveTo(11.9f, 5.6999f, 12.3f, 5.6999f, 12.5f, 5.9999f)
                lineTo(14.0f, 7.9999f)
                curveTo(14.4f, 8.5999f, 14.5f, 9.3999f, 14.1f, 9.9999f)
                lineTo(10.8f, 15.2999f)
                curveTo(10.5f, 15.7999f, 9.9f, 16.1999f, 9.3f, 16.1999f)
                horizontalLineTo(6.4f)
                curveTo(6.1f, 16.2999f, 5.9f, 15.8999f, 6.1f, 15.5999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2001f, 12.3998f)
                lineTo(13.3001f, 15.5998f)
                curveTo(13.1001f, 15.8998f, 13.3001f, 16.2998f, 13.7001f, 16.2998f)
                horizontalLineTo(17.5001f)
                curveTo(17.9001f, 16.2998f, 18.1001f, 15.8998f, 17.9001f, 15.5998f)
                lineTo(16.0001f, 12.3998f)
                curveTo(15.8001f, 12.0998f, 15.4001f, 12.0998f, 15.2001f, 12.3998f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_avalanche-(avax)`!!
    }

private var `_avalanche-(avax)`: ImageVector? = null
