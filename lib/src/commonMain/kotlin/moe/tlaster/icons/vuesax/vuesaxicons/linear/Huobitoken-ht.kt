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

public val LinearGroup.`Huobitoken-ht`: ImageVector
    get() {
        if (`_huobitoken-ht` != null) {
            return `_huobitoken-ht`!!
        }
        `_huobitoken-ht` = Builder(name = "Huobitoken-ht", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1999f, 10.0f)
                curveTo(16.1999f, 10.0f, 15.9999f, 11.0f, 12.9999f, 15.0f)
                curveTo(10.0999f, 18.8f, 14.2999f, 21.6f, 14.7999f, 22.0f)
                horizontalLineTo(14.8999f)
                curveTo(15.4999f, 21.5f, 23.0999f, 16.7f, 16.1999f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.7998f, 7.8001f)
                curveTo(13.7998f, 5.5001f, 12.8998f, 3.4001f, 11.9998f, 2.2001f)
                curveTo(11.6998f, 1.9001f, 11.1998f, 2.0001f, 11.0998f, 2.4001f)
                curveTo(10.6998f, 3.9001f, 9.4998f, 7.1001f, 6.5998f, 10.9001f)
                curveTo(2.8998f, 15.7001f, 6.2998f, 20.9001f, 9.7998f, 21.9001f)
                curveTo(11.6998f, 22.4001f, 9.2998f, 20.9001f, 8.9998f, 17.8001f)
                curveTo(8.6998f, 13.9001f, 13.7998f, 11.0001f, 13.7998f, 7.8001f)
                close()
            }
        }
        .build()
        return `_huobitoken-ht`!!
    }

private var `_huobitoken-ht`: ImageVector? = null
