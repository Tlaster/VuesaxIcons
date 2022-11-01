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

public val LinearGroup.`Celsius-(cel)-`: ImageVector
    get() {
        if (`_celsius-(cel)-` != null) {
            return `_celsius-(cel)-`!!
        }
        `_celsius-(cel)-` = Builder(name = "Celsius-(cel)-", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3001f, 15.3001f)
                curveTo(15.3001f, 16.6001f, 13.7001f, 17.5001f, 12.0001f, 17.5001f)
                curveTo(9.0001f, 17.5001f, 6.6001f, 15.1001f, 6.6001f, 12.1001f)
                curveTo(6.6001f, 9.1001f, 9.0001f, 6.6001f, 12.0001f, 6.6001f)
                curveTo(13.2001f, 6.6001f, 14.4001f, 7.0001f, 15.3001f, 7.7001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.4f, 11.4f)
                curveTo(18.0627f, 11.4f, 18.6f, 10.8627f, 18.6f, 10.2f)
                curveTo(18.6f, 9.5373f, 18.0627f, 9.0f, 17.4f, 9.0f)
                curveTo(16.7372f, 9.0f, 16.2f, 9.5373f, 16.2f, 10.2f)
                curveTo(16.2f, 10.8627f, 16.7372f, 11.4f, 17.4f, 11.4f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_celsius-(cel)-`!!
    }

private var `_celsius-(cel)-`: ImageVector? = null
